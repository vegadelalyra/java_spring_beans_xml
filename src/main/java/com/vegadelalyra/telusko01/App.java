package com.vegadelalyra.telusko01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj1 = (Alien) factory.getBean("alien");
        obj1.code();
        System.out.println(obj1.getAge());
    }
}
