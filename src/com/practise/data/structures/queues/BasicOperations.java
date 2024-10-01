package com.practise.data.structures.queues;

import com.practise.data.structures.lists.doublelinkedlist.challenge1.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BasicOperations {

    public static void main(String[] args) {

    LinkedList<Employee> employeeQueue = new LinkedList<Employee>();

    Employee bob = new Employee("bob", "jacob", 123);
    Employee john = new Employee("john", "doe", 124);
    Employee mike = new Employee("mike", "steve", 125);
    Employee alex = new Employee("alex", "ocorner", 126);

    // In queue added bob first then john.
    employeeQueue.addLast(bob);
    employeeQueue.addLast(john);

    // print queue elements
    System.out.println("********** print queue elements ***********");
    Iterator<Employee> employeeIterator = employeeQueue.iterator();
    while (employeeIterator.hasNext()){
        System.out.println(employeeIterator.next().toString());
    }

    System.out.println("********** remove queue elements ***********");
    while (!employeeQueue.isEmpty()){
        // removes bob first and then john
        System.out.println(employeeQueue.removeFirst());
    }
    }
}
