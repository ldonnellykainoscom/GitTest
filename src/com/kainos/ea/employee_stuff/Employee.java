package com.kainos.ea.employee_stuff;

public class Employee implements Payable, Comparable<Employee> {
    public short number; // employee number
    protected int salary;   // employee salary in pence
    private String name;  // employee name

    public static final int MIN_SALARY = 7_000_00;

    public Employee() {};

    public Employee (short newNumber) {
        setNumber(newNumber);
    }

    public Employee (short newNumber, int newSalary) throws SalaryTooLowException {
        this(newNumber);      // good
        setSalary(newSalary);
    }


    public Employee (short newNumber, String name, int newSalary) throws SalaryTooLowException {
        this(newNumber, newSalary);
        setName(name);
    }


    public int calcPay(){ // calculate monthly pay in pence
        return getSalary() / 12;
    }

    public short getNumber() {
        return number;
    }

    /*public boolean setNumber(String thisNumber){
        short s = Short.parseShort(thisNumber);
        return setNumber(s);
    }*/


    public boolean setNumber(String thisNumber) {
        try{
            short s = Short.parseShort(thisNumber);
            return setNumber(s);
        } catch(NumberFormatException e){
            throw new BadNumber(e.getMessage());
        }
    }


    public boolean setNumber(short thisNumber){
        if (thisNumber > 0) {
            number = thisNumber;
            return true;
        } else {
            return false;
        }
    }




    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) throws SalaryTooLowException {
        if(salary >= MIN_SALARY) {
            this.salary = salary;
        } else {
            throw new SalaryTooLowException(
                    String.format("Salary £%,.2f is below the minimum salary £%,.2f.",
                            salary/100.0, MIN_SALARY/100.0));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            return this.getNumber() == emp.getNumber()
                    && this.getName().equals(emp.getName())
                    && this.getSalary() == emp.getSalary();
        } else return false;
    }


    @Override
    public String toString() {

        String message = String.format("Employee %d: %s, £%,.2f. "
                        + "Monthly gross pay: £%,.2f.",
                this.getNumber(), this.getName(), this.getSalary() /100.0, this.calcPay()/100.0);

        return message;
    }

    @Override
    public int compareTo(Employee o) {
        return Float.compare(this.getSalary(), o.getSalary());
    }
}

