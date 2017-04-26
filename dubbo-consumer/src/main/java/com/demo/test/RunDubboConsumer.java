package com.demo.test;

import com.alibaba.dubbo.rpc.RpcException;
import com.demo.dao.DubboService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuburu on 2017/4/25.
 */
public class RunDubboConsumer {
    public static void main(String[] args) throws InterruptedException{
        RunDubboConsumer luncher=new RunDubboConsumer();
        luncher.start();
    }


    void start(){
        try {
            String configLocation= "spring/dubbo-consumer.xml";
            ApplicationContext context =new ClassPathXmlApplicationContext(configLocation);
            DubboService ds=(DubboService) context.getBean("dubboService");
            String result = ds.sayWord("刘世友");
            System.out.println("Invoke sayWord Method:"+result);
            ds.sayHello("刘卜铷");
            ds.sayNothing();
            String[] names=context.getBeanDefinitionNames();
            System.out.println("容器Beans:");
            for(String string : names) {
                System.out.println(string);
                System.out.print(",");
            }
        } catch (RpcException e) {
            e.printStackTrace();
        }

    }
}
