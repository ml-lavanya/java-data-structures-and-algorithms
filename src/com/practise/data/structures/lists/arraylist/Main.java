package com.practise.data.structures.lists.arraylist;

import com.practise.data.structures.common.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        System.out.println("\n************** Array list add method ***************");
        employeeList.add(new Employee("bob", "jacob", 123));
        employeeList.add(new Employee("john", "doe", 124));
        employeeList.add(new Employee("mike", "steve", 125));

        // To print all employees using normal for loop
        for (Employee emp: employeeList){
            System.out.println(emp);
        }

        System.out.println("\n************** Array list set method ***************");
        employeeList.set(1, new Employee("alex", "david", 126));
        // To print all employees using list.foreach and lambda function
        employeeList.forEach(System.out::println);

        System.out.println("Employee list size" + employeeList.size());

        // convert list to array
        System.out.println("\n************** Array list toArray method ***************");
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee emp: employeeArray){
            System.out.println(emp);
        }
        // look for a particular item in list
        System.out.println("\n************** Array list indexOf method ***************");
        System.out.println(employeeList.indexOf(new Employee("bob", "jacob", 123)));

        System.out.println("\n************** Array list remove method ***************");
        employeeList.remove(2);
        employeeList.forEach(System.out::println);
    }
}
