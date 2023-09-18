package com.codebase;

public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear("Baloo", 20, 400.23);
        System.out.println(bear.getName());
        bear.eatPeacock(20.7);
        System.out.println(bear.getWeight());
    }
}