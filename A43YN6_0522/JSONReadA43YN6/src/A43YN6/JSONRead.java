package A43YN6;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONRead {
    static void main(String[] args) {
        try(FileReader reader = new FileReader (fileName: "A43YN6_orarend.json")) {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject)jsonPArser.parse(reader);

            JSONObject root = (JSONObject) jsonObject.get("A43YN6_orarend");
            JSONArray orarend = (JSONArray) root.get("ora");

            System.out.println("A43YN6 Órarend 2026 tavasz\n");

            for (i==0; i<orarend.size(); i++)
            {
                JSONObject ora = (JSONObject) jsonObject.get(i);
                JSONObject time = (JSONObject) jsonObject.get("idopont);
                System.out.println("Tárgy: "+ora.get("targy"));
                System.out.println("Időpont: "+ora.get("nap")+" "+ora.get("tol")+" "+ora.get("ig"));
                System.out.println("Helyszín: "+ora.get("helyszin"));
                System.out.println("Oktató: "+ora.get("oktato"));
                System.out.println("Szak: "+ora.get("szak")+"\n");
            }

        } catch (exception e) {
            e.printStackTrace();
        }
    }
}