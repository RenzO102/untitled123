package org.example.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter@Setter
public class Data {

    private List<Item> items = new ArrayList<>();

    @Override
    public String toString() {
        return "Data{" +
                "people=" + items +
                '}';
    }
}