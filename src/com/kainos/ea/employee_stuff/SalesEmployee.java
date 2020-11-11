package com.kainos.ea.employee_stuff;

public class SalesEmployee extends Employee {

    private float commissionRate;
    private int salesTotal;

    public SalesEmployee() {
    }

    public SalesEmployee(short newNumber) {
        super(newNumber);
    }

    public SalesEmployee(short newNumber, int newSalary) throws SalaryTooLowException {
        super(newNumber, newSalary);
    }

    public SalesEmployee(short newNumber, String name, int newSalary) throws SalaryTooLowException {
        super(newNumber, name, newSalary);
    }

    //new constructor for commissionRate
    public SalesEmployee(short newNumber, String name, int newSalary, float commissionRate) throws SalaryTooLowException {
        super(newNumber, name, newSalary);
        setCommissionRate(commissionRate);
    }

    public SalesEmployee(short newNumber, String name, int newSalary, float commissionRate, int salesTotal) throws SalaryTooLowException {
        this(newNumber, name, newSalary, commissionRate);
        setSalesTotal(salesTotal);
    }


    public float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getSalesTotal() {
        return salesTotal;
    }

    public void setSalesTotal(int salesTotal) {
        this.salesTotal = salesTotal;
    }


    @Override
    public int calcPay() {
        return super.calcPay() + Math.round(commissionRate * salesTotal);
    }

/*    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SalesEmployee) {
            SalesEmployee emp = (SalesEmployee) obj;
            return this.getNumber() == emp.getNumber()
                    && this.getName().equals(emp.getName())
                    && this.getSalary() == emp.getSalary()
                    && this.getCommissionRate() == emp.getCommissionRate()
                    && this.getSalesTotal() == emp.getSalesTotal();
        } else return false;
    }*/

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SalesEmployee) {
            SalesEmployee emp = (SalesEmployee) obj;
            return super.equals(emp)
                    && this.getCommissionRate() == emp.getCommissionRate()
                    && this.getSalesTotal() == emp.getSalesTotal();
        } else return false;
    }

    @Override
    public String toString() {

        String message = super.toString();
        message = message + String.format("Commission Rate: %.2f "
                + "Sales Total: %d ",
                this.getCommissionRate(), this.getSalesTotal());

        return message;
    }
}
