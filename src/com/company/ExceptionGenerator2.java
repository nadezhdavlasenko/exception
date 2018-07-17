package com.company;

public class ExceptionGenerator2 {
    static void generateAndCatchException(Object object){
        try {
            if (object == null) {
                throw new Exception("From ExceptionGenerator #2");
            }
        } catch (Exception e) {
            System.out.println(e);
           // System.exit(1);
        } finally {
            System.out.println("Finally #2: Exception was cathed");
        }
    }

}
