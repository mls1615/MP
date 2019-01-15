package com.atguigu.mp.test;

import org.apache.ibatis.io.ResolverUtil;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Person {
    Outer.Inner inner = new Outer().new Inner();


}
