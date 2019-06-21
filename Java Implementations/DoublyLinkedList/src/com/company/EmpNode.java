package com.company;

public class EmpNode {

    private Employee employee;
    private EmpNode next;
    private EmpNode previous;

    public EmpNode(Employee employee) {
        this.employee = employee;
    }

    public EmpNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmpNode previous) {
        this.previous = previous;
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
