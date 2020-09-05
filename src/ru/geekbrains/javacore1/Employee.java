package ru.geekbrains.javacore1;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee (String name, String position, String email, String phone, int salary, int age ) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void intro() {

        System.out.println();
        System.out.println("СОТРУДНИКИ КОМПАНИИ");
        System.out.println();

    }

    public static void intro1() {

        System.out.println();
        System.out.println("СОТРУДНИКИ КОМПАНИИ СТАРШЕ 40 ЛЕТ");
        System.out.println();

    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
