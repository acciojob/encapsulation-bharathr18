package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        /* name has private access in com.driver.RWOnly
        rwOnly.name = "Kumar";
        System.out.println(rwOnly.name); */

        rwOnly.setName("Kumar123");
        System.out.println(rwOnly.getName());
    }
}