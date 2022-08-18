package com.task17_1;

public class Main {
    public static void main(String[] args) {
        Farm farm1 = new Farm("Land",new Cow[]{new Cow(1,2,"3","4"),new Cow(1,2,"3","4"),new Cow(1,2,"3","4"),new Cow(1,2,"3","4"),new Cow(1,2,"3","4")},
                new Horse[]{new Horse(1,2,"3","4"),new Horse(1,2,"3","4")},
                new Sheep[]{new Sheep(1,2,"3","4","5"),new Sheep(1,2,"3","4","5"),new Sheep(1,2,"3","4","5")},"Owner1");
        System.out.println(farm1);
        Farm farm2 = new Farm("Local",new Cow[]{new Cow(1,2,"3","4")},new Horse[]{new Horse(1,2,"3","4")},new Sheep[]{new Sheep(1,2,"3","4","5")},"Owner2");
        System.out.println(farm2);
    }
}
