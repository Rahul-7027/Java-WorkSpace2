package com.company;

class MyMainEmployees1 {
    private int id;
    private String name;

    public MyMainEmployees1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public MyMainEmployees1(int id) {
        this.id = id;
    }

    public MyMainEmployees1(String name) {
        this.name = name;
    }

    public MyMainEmployees1() {
        this.id = 0;
        this.name = "Your-name-Here";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class overload_constructor {
    public static void main(String[] args) {
        MyMainEmployees1 m1=new MyMainEmployees1(12,"Rahul");
        System.out.println(m1.getId()+" "+m1.getName()+" "+m1.getClass());
    }
}
