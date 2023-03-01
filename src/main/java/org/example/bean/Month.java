package org.example.bean;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Month {

    private String name;
    private int value = 0;

    public Month(String name) {
        this.name = name;
    }

    public Month addValue() {
        value++;
        return this;
    }
}
