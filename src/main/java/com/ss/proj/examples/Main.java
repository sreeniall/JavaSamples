package com.ss.proj.examples;

/**
 * Created by sreen on 12/28/2016.
 */
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.setName("Ramu");
        parent.setAge(35);
        parent.setIncome(100000d);


        Child child = new Child();
        child.setQualification("B.Tech");
        child.setSalary(200000f);
        child.setAge(20);
        child.setName("balu");
        child.setIncome(300000d);
        child.gender= "MALE";

        Parent obj = new Child();
        obj.setIncome(9393939d);
        obj.setAge(29);
        obj.setName("MyName");

        int age = obj.getAgeByName("sreeni","MALE");

    }
}
