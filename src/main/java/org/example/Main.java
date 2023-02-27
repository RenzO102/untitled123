package org.example;

public class Main {

    public static void main(String[] args){

        GsonParser parser = new GsonParser();
        People people = parser.parse();
//        JsonSimple parser = new JsonSimple();
//        Data data = parser.parse();

        System.out.println("Data" + people.toString());


    }
}
