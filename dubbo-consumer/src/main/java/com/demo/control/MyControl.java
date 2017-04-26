package com.demo.control;

import com.demo.dao.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuburu on 2017/4/24.
 */
@Controller
@RequestMapping("dubbo")
public class MyControl {

    @Autowired
    private DubboService dubboService;

    @RequestMapping("/success")
    public String sayHello(){
        dubboService.sayHello("Dubbo我爱你~");
        return "success";
    }
}
