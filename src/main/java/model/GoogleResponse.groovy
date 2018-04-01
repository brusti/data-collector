package model

/**
 * Created by brust on 4/1/2018.
 */
class GoogleResponse {
    String searchedItem
    String startingIndex
    String nextRequestStartingIndex
    String totalResults
    List<GoogleItem> items

    GoogleResponse() {
    }

    GoogleResponse(String searchedItem, String startingIndex, String nextRequestStartingIndex, String totalResults, List<GoogleItem> items) {
        this.searchedItem = searchedItem
        this.startingIndex = startingIndex
        this.nextRequestStartingIndex = nextRequestStartingIndex
        this.totalResults = totalResults
        this.items = items
    }


}
