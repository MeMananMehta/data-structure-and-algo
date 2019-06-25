package com.company;

public class EmpNode {

    private Employee employee;
    private EmpNode next;

    public EmpNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmpNode getNext() {
        return next;
    }

    public void setNext(EmpNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();
    }

}
