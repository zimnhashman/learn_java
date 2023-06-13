package com.example.java;


import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.time.LocalDateTime.*;

public class Main {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar(2009, 1 , 28);
        gc.add(GregorianCalendar.DATE, 1 );
        Date d2 = gc.getTime();
        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.WEEK_OF_MONTH_FIELD);
        System.out.println(df.format(d2));






    }
}
