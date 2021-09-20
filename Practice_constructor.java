package com.company;

class MainEmployees
{
    private int id;
    private String name;
    private int salary;

    public MainEmployees(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public MainEmployees() {
        this.id = 1;
        this.name = "Rahul";
        this.salary = 10000;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
public class Practice_constructor {
    public static void main(String[] args) {
        MainEmployees m1=new MainEmployees();
        System.out.println(m1.getId());
        System.out.println(m1.getName());
        System.out.println(m1.getSalary());
    }
}
