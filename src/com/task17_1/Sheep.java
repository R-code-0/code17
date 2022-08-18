package com.task17_1;

public class Sheep extends AbstractAnimals {
    private String color;

    public Sheep(int weight, int age,String color, String gender, String nickName) {
        super(weight, age, gender, nickName);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
