package com.xie.shop.product.test;

import com.xie.shop.product.model.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * .
 *
 * @date: 2021-02-19
 * @version: 1.0
 * @author: xieenlu@beyondsoft.com
 */
public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //FileSystemXmlApplicationContext context1  = new FileSystemXmlApplicationContext("F:\\myshop\\src\\main\\resources\\spring.xml");
        Student student =  context.getBean(Student.class);
        //Student s1 = context1.getBean(Student.class);
        //System.out.println(student.getName());
        //System.out.println(s1.getName());
    }
}
