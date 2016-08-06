package org.eventyou.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ctx=SpringApplication.run(App.class, args);
      
      String[] beanNames = ctx.getBeanDefinitionNames();
      
      for(String bean :beanNames){
    	  System.out.println(bean);
    	  
    	  
      }
    }
}
