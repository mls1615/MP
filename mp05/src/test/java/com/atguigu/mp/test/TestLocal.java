package com.atguigu.mp.test;


import com.baomidou.mybatisplus.toolkit.StringUtils;

public class TestLocal {

    public static void main(String[] args) {
        boolean last = StringUtils.isCapitalMode("L");
        System.out.println(last);

    }
}
