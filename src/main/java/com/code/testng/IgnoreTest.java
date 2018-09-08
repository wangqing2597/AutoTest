package com.code.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignoreTest1(){
        System.out.println("ignore1 test");
    }
    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("ignore2 test");
    }
    @Test(enabled = true)
    public void ignoreTest3(){
        System.out.println("ignore3 test");
    }
}
