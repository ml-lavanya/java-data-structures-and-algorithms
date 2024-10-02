package com.practise.data.structures.hashtables.challenge2;

import java.util.*;

/*
 remove employees with duplicate entries
 */
public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));
        System.out.println("List before removing duplicate items");
        employees.forEach(System.out::println);
        HashMap<Integer, Employee> map = new HashMap<>();
        List<Employee> removeList = new ArrayList<>();

        for (Employee current : employees) {
            if (map.containsKey(current.getId())) {
                removeList.add(current);
            } else {
                map.put(current.getId(), current);
            }
        }
        System.out.println("List after removing duplicate items");
        for(Employee emp: removeList){
            employees.remove(emp);
        }

        employees.forEach(System.out::println);
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
