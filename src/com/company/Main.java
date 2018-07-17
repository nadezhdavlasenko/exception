package com.company;

public class Main {

    public static void main(String[] args) {
        NullObject.callMethodOnNull();
        ExceptionGenerator1.catchException();
        ExceptionGenerator2.generateAndCatchException(NullObject.object);
        StackOverflowErrorGenerator.generate();
        OutOfMemoryErrorGenerator.generate();
    }
}
