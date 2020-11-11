package com.kainos.ea;

import com.kainos.ea.employee_stuff.*;

public class HR {

    public static void main(String[] args) {

        try {

            //Class eClass = Class.forName("employee_stuff.Employee");//Ask about


            Employee emp1 = new Employee((short) 10, 15000_00);
            //Employee emp1 = (Employee) eClass.newInstance();     //Ask about

            /*emp1.setNumber( (short) 10);
            emp1.setNumber("11");
            emp1.setSalary(15000_00);*/
            emp1.setName("A. Smith");

            //emp1.setNumber("asdasdf"); //throws BadNumber exception
            //emp1.setSalary(5000_00); //throws SalaryTooLowException

            Employee emp2 = new Employee((short) 10, "B. Black", 15000_00);


            SalesEmployee emp3 = new SalesEmployee((short) 10, "C. Wilde", 15000_00, 0.5f, 2000);

            Employee johnE = new Employee((short) 815, "John Smith", 18200_00);

            SalesEmployee johnS = new SalesEmployee((short) 815, "John Smith",
                    18200_00, 1.4f, 2450);


            System.out.println(emp1);
            System.out.println(emp2);
            System.out.println(emp3);
            System.out.println(johnE);
            System.out.println(johnS);


            PayrollSystem ps = new PayrollSystem();
            double emp1_pay = ps.netPay(emp1);
            double emp2_pay = ps.netPay(emp2);
            double emp3_pay = ps.netPay(emp3);
            double johnE_pay = ps.netPay(johnE);
            double johnS_pay = ps.netPay(johnS);

            System.out.println("Emp1 pay after tax: " + emp1_pay);
            System.out.println("Emp2 pay after tax: " + emp2_pay);
            System.out.println("Emp3 pay after tax: " + emp3_pay);
            System.out.println("johnE pay after tax: " + johnE_pay);
            System.out.println("johnS pay after tax: " + johnS_pay);

            Consultant sarahM = new Consultant("Sarah Mills", 150_00, 10);

            System.out.println("SarahM pay after tax: " + ps.netPay(sarahM));

        } catch (SalaryTooLowException e) {
            System.out.println(e);
        } catch (BadNumber ex) {
            System.out.println(ex);
        }

    }
}

