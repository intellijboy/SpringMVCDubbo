package com.demo.test;

import com.alibaba.fastjson.JSON;

/**
 * Created by liuburu on 2017/4/25.
 */
public class TestJsonDemo {

    public static void main(String[] args) {
        User user = new User();
        user.setAge(18);
        user.setId(101);
        user.setName("test");
        String result = JSON.toJSONString(user);
    }

}
