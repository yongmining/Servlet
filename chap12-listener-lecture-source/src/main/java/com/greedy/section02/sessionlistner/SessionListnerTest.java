package com.greedy.section02.sessionlistner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class SessionListnerTest implements HttpSessionListener, HttpSessionAttributeListener {

    public SessionListnerTest() {
    	System.out.println("session listener 인스턴스 생성");
    }
    
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("session created!!");
    	System.out.println("sessionCreate() 내 session id : " + se.getSession().getId());
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
       System.out.println("session destroyed!!");
    }

	
    public void attributeAdded(HttpSessionBindingEvent se)  { 
    	System.out.println("session attribute added!!");
    	System.out.println("session에 추가된 attr : " + se.getName()
    	+ ", " + se.getValue());
    }

	
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	System.out.println("session attribute removed!!");    
    }

	
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	System.out.println("session attribute replaced!!");
    }
	
}
