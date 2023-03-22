package com.greedy.section03.requestlistner;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListenerTest implements ServletRequestListener, ServletRequestAttributeListener {

   
    public RequestListenerTest() {
     
    }

	
    public void requestDestroyed(ServletRequestEvent sre)  { 
       System.out.println("request destroyed!");
    }

	
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
       System.out.println("request attribute removed!");
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
        System.out.println("request init!!");
    }

    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
        System.out.println("request attribute added!!");
    }

	
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
        System.out.println("request attribute replace!!");
    }
	
}
