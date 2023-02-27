package org.example;

import java.util.List;

public class Data {


    private List<People> people;

    public List<People> getPeople(){
        return people;
    }
    public void setPeople(List<People> people){
        this.people = people;
    }

    @Override
    public String toString() {
        return "Data{" +
                "people=" + people +
                '}';
    }
}