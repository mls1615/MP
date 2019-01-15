package com.atguigu.mp.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Outer {

    public void print(){
        System.out.println("-Outer---------------");
    }

    public class Inner{
       public void print(){
           System.out.println("-内部类---------------");
       }
    }

    public static void main(String[] args) {
    }
}
