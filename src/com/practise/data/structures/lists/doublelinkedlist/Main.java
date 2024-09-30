package com.practise.data.structures.lists.doublelinkedlist;

import com.practise.data.structures.common.Employee;

public class Main {
    public static void main(String[] args) {
        Employee bob = new Employee("bob", "jacob", 123);
        Employee john = new Employee("john", "doe", 124);
        Employee mike = new Employee("mike", "steve", 125);
        Employee alex = new Employee("alex", "ocorner", 126);

        EmployeeDoublyLinkedList  linkedList = new EmployeeDoublyLinkedList();
        System.out.println("\nlinked list size is" + linkedList.getSize());

        linkedList.addToEnd(alex);
        linkedList.addToFront(bob);
        linkedList.addToFront(john);
        linkedList.addToFront(mike);

        System.out.println("\nlinked list size is" + linkedList.getSize());
        linkedList.printList();
        System.out.println("\n");
//
        System.out.println("\nremoved node is" + linkedList.removeFromFront());
        System.out.println("\nlinked list size is" + linkedList.getSize());
        linkedList.printList();

        System.out.println("\nremoved node is" + linkedList.removeFromEnd());
        System.out.println("\nlinked list size is" + linkedList.getSize());
        linkedList.printList();

        System.out.println("\nremoved node is" + linkedList.removeFromEnd());
        System.out.println("\nlinked list size is" + linkedList.getSize());
        linkedList.printList();

        System.out.println("\nremoved last node" + linkedList.removeFromEnd());
        System.out.println("\nlinked list size is" + linkedList.getSize());
        linkedList.printList();
    }
}
