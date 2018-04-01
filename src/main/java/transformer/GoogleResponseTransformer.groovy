package transformer

import model.GoogleItem
import model.GoogleResponse
import org.json.JSONObject

/**
 * Created by brust on 4/1/2018.
 */
class GoogleResponseTransformer {

    static GoogleResponse toGoogleResponse(String input) {

        JSONObject jsonResponse = new JSONObject(input);
        GoogleResponse googleResponse = new GoogleResponse()
        googleResponse.searchedItem = jsonResponse.queries.request[0].searchTerms
        googleResponse.startingIndex = jsonResponse.queries.request[0].startIndex
        googleResponse.nextRequestStartingIndex = jsonResponse.queries.nextPage[0].startIndex
        googleResponse.totalResults = jsonResponse.searchInformation.totalResults
        googleResponse.items = getGoogleItems(jsonResponse)

        return googleResponse
    }

    private static List<GoogleItem> getGoogleItems(JSONObject jsonReponse) {
        List<GoogleItem> googleItemList = new ArrayList<>()
        jsonReponse.items.each { it ->
            GoogleItem googleItem = new GoogleItem(it.title, it.link, it.displayLink, it.snippet)
            googleItemList.add(googleItem)
        }
        return googleItemList
    }
}
