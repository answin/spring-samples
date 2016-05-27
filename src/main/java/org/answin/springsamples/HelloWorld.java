package org.answin.springsamples;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {

    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void printMessage(){

        System.out.println("Your Message : " + message);
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("afterPropertiesSet by InitializingBean");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("destroy by DisposableBean");
    }
}