package com.code.testng.group;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupOnClass3 {
    public void teacher1(){
        System.out.println("GroupOnClass3中的teacher1方法运行");
    }
    public void teacher2(){
        System.out.println("GroupOnClass3中的teacher2方法运行");
    }
}
