package com.kainos.ea.employee_stuff;

public class Consultant implements Payable {


    private String name;  // employee name
    protected int dailyRate;   // employee salary in pence
    private int daysWorked;

    public Consultant(String name, int dailyRate, int daysWorked) {
        this.name = name;
        this.dailyRate = dailyRate;
        this.daysWorked = daysWorked;
    }

    public int calcPay(){ // calculate monthly pay in pence
        return dailyRate * daysWorked;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
