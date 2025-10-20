package org.example.ExceptionHandling;

import java.io.IOException;

/**
 *
 *  ClassNotFoundException
 *  IOException
 *  NullPointerException
 */
public class EH {
    public static void main(String[] args) {
        Integer a = null;
        try {
            if (a== null) {
                throw new NullPointerException("null exception");
            }
            System.out.println(a+1);
        } catch (ExceptionInInitializerError e) {
            System.out.println("This is exception");
            //throw new NullPointerException("Exception pointer");
        }
        System.out.println("Hello world");

    }
}
