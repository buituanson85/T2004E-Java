package Practical;

import java.util.Scanner;

public class Car implements Vehicle {
    String name;
    @Override
    public float moveMax() {
        return 250;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
