package com.kainos.ea;
import com.kainos.ea.employee_stuff.Employee;


public class Hello{



    void func1(int i){
        i = 10;
    }
    void func2(String s){
        s = "World";
    }
    void func3(Employee e){
        Employee x = new Employee();
        x.setName("Fred");
        e = x;
    }


    public static void main(String[] args){
        System.out.println("Hello from the IDE!");

    }
}
