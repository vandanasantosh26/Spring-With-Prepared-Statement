package com.springwithpreparedstatement;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
          
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
    boolean status=dao.saveEmployeeByPreparedStatement(new Employee(109,"Vandana",35000));  
    System.out.println(status);
}  
}