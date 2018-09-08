package com.code.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("服務端組運行方法11111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("服務端組運行方法2222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("客戶端運行方法3333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("客戶端運行方法4444");
    }
    @BeforeGroups("server")
    public void beforeGroupServer(){
        System.out.println("這是服務端組運行之前的方法");
    }
    @AfterGroups("server")
    public void afterGroupServer(){
        System.out.println("這是服務端組運行之后的方法");
    }
    @BeforeGroups("client")
    public void beforeGroupClient(){
        System.out.println("這是客戶端組運行之前的方法");
    }
    @AfterGroups("client")
    public void afterGroupClient(){
        System.out.println("這是客戶端組運行之后的方法");
    }
}
