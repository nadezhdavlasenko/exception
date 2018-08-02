package com.company;

public class NullObject {

    static final Object object = null;

    static void callMethodOnNull() {
        try {
            System.out.println(object.getClass());
        } catch (NullPointerException e) {
            //unchecked
            System.out.println(e + " was cathed");
        }
    }

}
