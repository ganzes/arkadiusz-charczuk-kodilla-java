package com.kodilla.hibernate.manytomany.facade;

public class NotFoundExceptionCE extends Exception {
    public static String ERR_NOT_FOUND_COMPANY = "Company not found!";
    public static String ERR_NOT_FOUND_EMPLOYEE = "Employee not found!";

    public NotFoundExceptionCE(String message) {
        super(message);
    }
}
