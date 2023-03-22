package com.greedy.section01.contextlistner;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListenerTest implements ServletContextListener, 
         ServletContextAttributeListener {

   @Override
   public void contextInitialized(ServletContextEvent sce) {
      System.out.println("context init!!!");
   }
   
   @Override
   public void contextDestroyed(ServletContextEvent sce) {
      System.out.println("context destroyed!!!");
      
   }
   
   @Override
   public void attributeAdded(ServletContextAttributeEvent scae) {
      System.out.println("context attribute added!!");
      
   }
   
   @Override
   public void attributeReplaced(ServletContextAttributeEvent scae) {
      System.out.println("context attribute replaced!!");
      
   }
   
   @Override
   public void attributeRemoved(ServletContextAttributeEvent scae) {
      System.out.println("context removed!!");
      
   }
   
}