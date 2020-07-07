package hangman;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.InputStreamReader;

public class ApiConnect {

    public static String randomWord() {
        HttpURLConnection connection = null;
        String word = null;

        try {
            URL url = new URL("https://random-word-api.herokuapp.com/word?number=1");
            connection = (HttpURLConnection) url.openConnection();
            JSONParser parser = new JSONParser();
            JSONArray words = (JSONArray) parser.parse(new InputStreamReader(connection.getInputStream()));
            word =  words.get(0).toString();

        } catch (IOException | ParseException error) {
            Menus.warning("Error parsing json file");
        } catch (Exception error) {
            Menus.warning("Error while trying to connect");
        }
        connection.disconnect();
        return word;
    }
}
