package com.example.java;

public class Main {

    public static void main(String[] args) throws StringIndexOutOfBoundsException {
        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
           char lastChar = chars[chars.length - 1];
            System.out.println(lastChar);

            String sub = welcome.substring(10);
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Array index problem");
        }
        System.out.println("String index problem!");
    }
}
