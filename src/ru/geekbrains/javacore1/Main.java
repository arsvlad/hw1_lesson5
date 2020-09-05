package ru.geekbrains.javacore1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Employee[] emps = new Employee[5];


        emps[0] = new Employee("Ivanov Sergey", "Manager", "is@comp.com", "30120", 100000, 45);
        emps[1] = new Employee("Sergeev Ivan", "Engineer", "si@comp.com", "30125", 700000, 37);
        emps[2] = new Employee("Petrov Alex", "Driver", "pa@comp.com", "30135", 60000, 28);
        emps[3] = new Employee("Sidorov Vlad", "Courier", "sv@comp.com", "30138", 40000, 23);
        emps[4] = new Employee("Vekshin Gleb", "Guard", "vg@comp.com", "30141", 55000, 41);


        Employee.intro();


        for (int i = 0; i < emps.length; i++) {

            System.out.printf("%10s\n", emps[i]);
        }


        Employee.intro1();

        for (int i = 0; i < emps.length; i++) {

            if (emps[i].getAge() > 40) {

                System.out.printf("%10s\n", emps[i]);
            }


        }
    }

}






