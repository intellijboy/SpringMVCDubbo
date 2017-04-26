package com.demo.service;

import com.demo.dao.DubboService;

/**
 * Created by liuburu on 2017/4/24.
 */
public class DubboServiceIml implements DubboService {

    public void sayHello(String name) {
        System.out.println("DubboServiceIml Is Saying Hello To "+name);
    }

    public void sayNothing() {
        System.out.println("DubboServiceIml Is sayNothing... ");
    }

    public String sayWord(String name) {
        System.out.println("sayWord is Working");
        return "HELLO"+name;
    }
}
