package com.ss.proj.examples;

/**
 * Created by sreen on 12/28/2016.
 */
public class Child extends Parent {
    private String qualification;
    private Float salary;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Integer getAgeByName(String name,String gender){

        return super.getAgeByName(name,gender);
    }

}
