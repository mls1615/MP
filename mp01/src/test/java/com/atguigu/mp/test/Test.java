package com.atguigu.mp.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test {
    public static void main(String args[]) {
        int i= compare_date("1995-11-12 15:21", "1999-12-11 09:59");
        System.out.println("i=="+i);
    }
    public static int compare_date(String DATE1, String DATE2) {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime() > dt2.getTime()) {
                System.out.println("dt1 在dt2后");
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                System.out.println("date1-->"+dt1.getTime());
                System.out.println("date2-->"+dt2.getTime());
                System.out.println("dt1"+dt1);
                System.out.println("dt2"+dt2);
                System.out.println("dt1 在dt2前");
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }
}