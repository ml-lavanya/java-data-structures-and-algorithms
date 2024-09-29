package com.practise.data.structures.lists.linkedlist;

import com.practise.data.structures.common.Employee;

public class Main {
    public static void main(String[] args) {
        Employee bob = new Employee("bob", "jacob", 123);
        Employee john = new Employee("john", "doe", 124);
        Employee mike = new Employee("mike", "steve", 125);

        EmployeeLinkedList linkedList = new EmployeeLinkedList();
        System.out.println("linked list size is" + linkedList.getSize());

        linkedList.addToFront(bob);
        linkedList.addToFront(john);
        linkedList.addToFront(mike);

        System.out.println("\nlinked list size is" + linkedList.getSize());
        linkedList.printList();
        System.out.println("\n");

        linkedList.removeFromFront();
        System.out.println("\nlinked list size is" + linkedList.getSize());
        linkedList.printList();
    }
}
