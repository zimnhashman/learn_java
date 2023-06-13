package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale locale = new Locale("da" ,"DK");
	double doubleValue = 1234567.89;
        NumberFormat numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));


        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + curF.format(doubleValue));


        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + intF.format(doubleValue));
    }


}
