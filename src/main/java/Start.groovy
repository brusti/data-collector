import com.google.gson.Gson
import org.json.JSONObject

import java.nio.file.Files
import java.nio.file.Paths

/**
 * Created by brust on 3/31/2018.
 */
public class Start {
    public static void main(String[] args) throws Exception {
        String fileName = "C:\\Projects\\data-collector\\src\\main\\resources\\input_data.txt";

        File file = new File(fileName);
        Scanner input = new Scanner(file);

        String result = "";

        while (input.hasNextLine()) {
            result = result + input.nextLine();
        }
        def x = new JSONObject(result);

        println(x);
        System.out.println(result);
    }
}