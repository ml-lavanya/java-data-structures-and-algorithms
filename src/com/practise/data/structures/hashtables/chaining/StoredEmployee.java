package com.practise.data.structures.hashtables.chaining;

public class StoredEmployee {

    public String key;

    public String getKey() {
        return key;
    }

    public Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
