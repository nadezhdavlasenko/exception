package com.company;

import java.util.*;

public class OutOfMemoryErrorGenerator {
    public static void generate() {
        Stack stack = new Stack();
        try {
            for (int i = 0; i < 71400000; i++) {
                stack.push(i);
                stack.pop();
            }
        } catch (OutOfMemoryError e) {
            System.out.println(e + " was cathed");
        }
    }

    public static class Stack {
        private Object[] elements;
        private int size = 0;
        private static final int DEFAULT_INITIAL_CAPACITY = 16;

        public Stack() {
            elements = new Object[DEFAULT_INITIAL_CAPACITY];
        }

        public void push(Object e) {
            ensureCapacity();
            elements[size++] = e;
        }

        public Object pop() {
            if (size == 0)
                throw new EmptyStackException();
            Object result = elements[--size];
            //elements[size] = null; //Eliminate obsolete reference
            return result;
        }

        //Ensure space for at least one more element, roughly doubling the capacity each time the array needs to grow.
        private void ensureCapacity() {
            if (elements.length == size)
                elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
