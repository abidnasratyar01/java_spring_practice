package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student std = (Student) context.getBean("student1");
        System.out.println(std);
        
        Student std2 = (Student) context.getBean("student2");
        System.out.println(std2);
        
        Student std3 = (Student) context.getBean("student3");
        System.out.println(std3);
        
    }
}
