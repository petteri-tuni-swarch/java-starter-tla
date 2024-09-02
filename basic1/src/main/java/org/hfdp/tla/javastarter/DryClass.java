package org.hfdp.tla.javastarter;

public class DryClass {

    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void RegisterUser(String name, Integer age) {
        // TODO: add sanity check
        this.name = name;
        this.age = age;
    }

    public void updateAge(Integer age) {
        // TODO: add sanity check
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Age: " + this.age;
    }
}
