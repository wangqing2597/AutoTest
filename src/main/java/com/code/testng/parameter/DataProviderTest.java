package com.code.testng.parameter;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "user")
    public void test(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }
    @DataProvider(name ="user")
    public Object[][] User(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",10},
                {"wangwu",20}
        };
        return o;
    }
    @Test(dataProvider = "method")
    public void test1(String name,int age){
        System.out.println("test1 name="+name+"; age="+age);
    }
    @Test(dataProvider = "method")
    public void test2(String name,int age){
        System.out.println("test2 name="+name+"; age="+age);
    }
    @DataProvider(name = "method")
    public Object[][] Test(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",30},
                    {"lisi",40}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }
        return result;
    }
}
