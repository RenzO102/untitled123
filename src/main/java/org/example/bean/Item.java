package org.example.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter@Setter
@Accessors(chain = true)
public class Item {
    private String percentY;
    private String name;
    private int main;
    private int y;
    private int z;
}
