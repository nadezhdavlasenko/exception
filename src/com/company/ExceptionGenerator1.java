package com.company;

public class ExceptionGenerator1 {
    private static void generateException(String s) throws Exception{
        throw new Exception(s);
    }
    static void catchException(){
        try {
            generateException("From ExceptionGenerator #1");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally #1: Exception was cathed");
        }
    }
}
