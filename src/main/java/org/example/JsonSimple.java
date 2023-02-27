package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonSimple {

    private static final String TAG_PEOPLE = "people";
    private static final String TAG_NAME = "name";
    private static final String TAG_PERCENTY = "percentY";
    private static final String TAG_MAIN = "main";
    private static final String TAG_Y = "y";
    private static final String TAG_Z = "z";

    public People parse() {
        People people = new People();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("test.json")){

            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);
            JSONArray peopleJsonArray = (JSONArray) rootJsonObject.get(TAG_PEOPLE);

            List<People> peopleList = new ArrayList<>();
            for(Object it : peopleJsonArray) {
                JSONObject peopleJsonObject = (JSONObject) it;

                String name = (String) peopleJsonObject.get(TAG_NAME);
                String percentY = (String) peopleJsonObject.get(TAG_PERCENTY);
                long main = (Long) peopleJsonObject.get(TAG_MAIN);
                long y = (Long) peopleJsonObject.get(TAG_Y);
                long z = (Long) peopleJsonObject.get(TAG_Z);

                people.toString();

            }

        }catch (Exception e){
            System.out.println("Error" + e.toString());
        }

        return null;
    }
}
