package com.practise.data.structures.hashtables.chaining;

import java.util.Iterator;
import java.util.LinkedList;

public class ChainedHashtable {
    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee){
        int hashedKey = getHashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    private int getHashKey(String key){
        return Math.abs(key.hashCode() % hashtable.length);
    }

    public Employee remove(String key){
        int hashedKey = getHashKey(key);
        int index = -1;
        StoredEmployee emp = null;
        Iterator<StoredEmployee> iterator = hashtable[hashedKey].iterator();
        while (iterator.hasNext()){
            emp = iterator.next();
            index++;
            if(emp.getKey().equals(key)) {
                break;
            }
        }
        if(emp == null){
            return null;
        }
        else{
            hashtable[hashedKey].remove(index);
            return  emp.getEmployee();
        }
    }

    public Employee get(String key){
        int hashedKey = getHashKey(key);
        for (StoredEmployee current : hashtable[hashedKey]) {
            if (current.getKey().equals(key)) {
                return current.getEmployee();
            }
        }
        return null;
    }

    public void printHashtable(){
        for(int i=0; i < hashtable.length; i++){
            System.out.println("********* elements at position ********" + i);
            for (StoredEmployee storedEmployee : hashtable[i]) {
                System.out.print(storedEmployee.employee);
                System.out.print(" ->");
            }
        }
    }
}
