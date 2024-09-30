package com.practise.data.structures.lists.doublelinkedlist;

import com.practise.data.structures.common.Employee;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee emp){
        EmployeeNode employeeNode = new EmployeeNode(emp);
        employeeNode.setNext(head);
        if(head == null){
            tail = employeeNode;
        }
        else{
            head.setPrevious(employeeNode);
        }
        head = employeeNode;
        size++;
    }

    public void addToEnd(Employee emp){
        EmployeeNode employeeNode = new EmployeeNode(emp);
        employeeNode.setPrevious(tail);
        if(tail == null){
            head = employeeNode;
        }
        else{
            tail.setNext(employeeNode);
        }
        tail = employeeNode;
        size++;
    }

    public int getSize(){
        return size;
    }

    public void printList(){
        System.out.print("HEAD -> ");
        EmployeeNode current = head;
        while (current != null){
            System.out.print(current + " <=> ");
            current = current.getNext();
        }
        System.out.print("null");
    }

    public EmployeeNode removeFromFront(){
        if(head == null){
            return null;
        }
        EmployeeNode removedNode = head;
        if(head.getNext() == null){
            tail = null;
        }
        else{
            head.setPrevious(null);
        }
        head = head.getNext();

        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd(){
        if(tail == null){
            return null;
        }
        EmployeeNode removeNode = tail;
        if(tail.getPrevious() == null){
            head = null;
        }
        else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();

        size--;
        removeNode.setPrevious(null);
        return removeNode;
    }

    public boolean isEmpty(){
        return head == null;
    }

}
