package com.practise.data.structures.lists.linkedlist;

import com.practise.data.structures.common.Employee;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee emp){
        EmployeeNode employeeNode = new EmployeeNode(emp);
        employeeNode.setNext(head);
        head = employeeNode;
        size++;
    }

    public int getSize(){
        return size;
    }

    public void printList(){
        System.out.print("HEAD -> ");
        EmployeeNode current = head;
        while (current != null){
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }

    public void removeFromFront(){
        if(head == null){
            return;
        }
        head = head.getNext();
        size--;
    }

}
