package org.example;

import com.alibaba.fastjson.JSON;
import org.example.bean.People;

public class GsonParser {
    public People parse() {

        People people = JSON.parseObject("test.json", People.class);
        int y = people.y;
        System.out.println(y);
        return people;
    }

//       Gson gson = new Gson();
//
//       try(FileReader reader = new FileReader("test.json")){
//          People people =  gson.fromJson(reader, People.class);
//
//           return people;
//       }catch (Exception e){
//           System.out.println("error" + e.toString());
//       }
//        return null;
//    }

//    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
//        ObjectMapper mapper = new ObjectMapper();
//       Data data = mapper.readValue(new File("src/main/java/org/example/Data1.json"), Data.class);
//
//        Data[] dataList = mapper.readValue(new File("src/main/java/org/example/DataList.json"),
//                Data[].class);
//
//        }
//        public static void main(String[] args) throws IOException {
//            ObjectMapper mapper = new ObjectMapper();
//            JsonNode jsonNode = mapper.readTree("src/main/java/org/example/DataList.json");
//            String name = jsonNode.get("name").asText();
//            System.out.println(name);
//        }

    }
