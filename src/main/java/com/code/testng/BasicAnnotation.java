package com.code.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("第一个测试用例");
    }
    @Test
    public void testCase2(){
        System.out.println("第二个测试用例");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("测试之前运行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("测试之后运行");
    }
    @BeforeClass
    public void beforClass(){
        System.out.println("类运行之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("类运行之后运行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套");
    }
}
