package com.rashiktimalsina.java_assignment.strings;

/**
 * @author Rashik Timalsina
 * @created 16/03/2025
 */
public class StringBuilderEx {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("Hello World");
        s.append("world");
        System.out.println(s);

        s.insert(6,"java");
        System.out.println(s);

        s.reverse();
        System.out.println(s);

    }

    }

