package com.andy.entity;

public class User {
    private String no;
    private String name;
    private int age;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
