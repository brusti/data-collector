import model.GoogleItem
import model.GoogleRequest
import model.GoogleResponse
import org.json.JSONObject
import transformer.GoogleResponseTransformer

/**
 * Created by brust on 3/31/2018.
 */
class Start {
    static void main(String[] args) throws Exception {
        String fileName = "C:\\Projects\\data-collector\\src\\main\\resources\\input_data.txt";
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        String result = "";
        while (input.hasNextLine()) {
            result = result + input.nextLine();
        }

        GoogleResponse googleResponse = GoogleResponseTransformer.toGoogleResponse(result)

        System.out.println(result);
    }
}