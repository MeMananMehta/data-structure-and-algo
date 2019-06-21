package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
/*
        //to print
        //employeeList.forEach(employee -> System.out.println(employee));

        for(int i=0;i < employeeList.size();i++){
            //to print
            System.out.println(employeeList.get(i));
        }

        //System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4568));

        employeeList.add(3, new Employee("John", "Doe", 4567));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.contains(new Employee("Marxy", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));*/



        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee i: employeeArray) {
            System.out.println(i);
        }


        Employee[] emp = {new Employee("hello","world",123),new Employee("this","cool",456)};
        System.out.println(emp[1]);

        //difference between array and arrayList
        //https://www.geeksforgeeks.org/array-vs-arraylist-in-java/

    }
}
