package com.kainos.ea.employee_stuff;

public class SalaryTooLowException extends IllegalArgumentException{

    public SalaryTooLowException() {
    }

    public SalaryTooLowException(String message) {
        super(message);
    }

    public SalaryTooLowException(String message, Throwable cause) {
        super(message, cause);
    }

    public SalaryTooLowException(Throwable cause) {
        super(cause);
    }
}
