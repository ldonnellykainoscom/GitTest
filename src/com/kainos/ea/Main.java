package com.kainos.ea;
import com.kainos.ea.employee_stuff.Employee;
import com.kainos.ea.employee_stuff.SalesEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[]args){

            Employee a=new Employee((short)1,"A. Smith",40000_00);
            Employee b=new Employee((short)2,"B. Jones",20000_00);
            Employee c=new Employee((short)3,"C. Doe",10000_00);
            Employee d=new Employee((short)4,"D. Wong",30000_00);

            SalesEmployee e=new SalesEmployee((short)5, "E. Wright", 40000_00);
            SalesEmployee f=new SalesEmployee((short)6, "F. Black", 60000_00, 0.1f,1500);

            String s = "Hello World";
            List<Employee> emps = new ArrayList<>();
            //List emps = new ArrayList();

            emps.add(a);
            emps.add(b);
            emps.add(c);
            emps.add(d);
            emps.add(e);
            emps.add(f);
            //


            Collections.shuffle(emps);


/*            Comparator<Employee> whoEarnsMore = new Comparator<Employee>(){
                public int compare(Employee e1, Employee e2){
                    return (int) (e1.getSalary() - e2.getSalary());
                }
            };

            Collections.sort(emps, whoEarnsMore);*/

            /*Collections.sort(emps);

            for(Employee e : emps){
                System.out.println(e);
            }


            for(Object x:emps){
            Employee e=(Employee)x;
            System.out.println(e.getName()+" earns "+e.calcPay());
            }

            System.out.println("\nHighest: " + Collections.max(emps));
            System.out.println("Lowest: " + Collections.min(emps));*/


            //Streams

            emps.parallelStream().forEach(System.out::println);






            System.out.println("\nEmployee with s int their name :");

            emps.parallelStream()
                    .filter(emp -> emp.getName().contains("s"))
                    .forEach(System.out::println);

            System.out.println("\nEmployee with less than 25k salary : ");
            emps.parallelStream()
                    .filter(emp -> emp.getSalary() < 25000_00)
                    .forEach(System.out::println);

            System.out.println("\nSales Employees : ");
            emps.parallelStream()
                    .filter(emp -> emp instanceof SalesEmployee)
                    .sorted()
                    .forEach(System.out::println);

            emps.parallelStream()
                    .forEach(emp -> System.out.println("This month "+emp.getName()+" earned £"+emp.getSalary()));

            System.out.println("\n");

            emps.parallelStream()
                    .filter(emp -> emp instanceof SalesEmployee)
                    .forEach(emp -> System.out.println("This month "+emp.getName()+" sold £"+((SalesEmployee) emp).getSalesTotal()+ " worth of goods"));















    }

}

