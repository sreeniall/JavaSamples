package com.ss.proj.examples;

/**
 * Created by sreen on 12/28/2016.
 */
public class Parent
{
    private String name;
    private Integer age;
    private Double income;
    protected String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Integer getAgeByName(String name){
        //Some thing cal

        return  age;
    }
    public Integer getAgeByName(String name, String gender){
        //Some thing cal

        return  age;
    }



}
