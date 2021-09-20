package com.company;

class Employees1
{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    int salary;
    public int getSalary() {
        return salary;
    }

}
public class oops_practice_1 {
    public static void main(String[] args) {
        Employees1 e1=new Employees1();
        e1.setName("Rahul");
        e1.setSalary(10000);
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
