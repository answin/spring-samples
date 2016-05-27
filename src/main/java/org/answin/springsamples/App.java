package org.answin.springsamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("spring/beans.xml");

        context.registerShutdownHook();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.printMessage();
    }
}
