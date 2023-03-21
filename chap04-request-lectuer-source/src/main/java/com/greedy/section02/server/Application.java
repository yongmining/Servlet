package com.greedy.section02.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Application {

   public static void main(String[] args) throws IOException {
      
      ServerSocket listener = new ServerSocket(8002);
      
      int count = 1;
      
      System.out.println("Http Server started at 8002 port");
      
      while(true) {
         Socket socket = listener.accept();
         
         System.out.println("New Client Connect!! connected IP :" 
               + socket.getInetAddress() + ", Port : " + socket.getPort());
         
         count++;
         
         InputStream in = socket.getInputStream();
         OutputStream out = socket.getOutputStream();
         
         int value = 0;
         while((value = in.read()) != -1 && count == 3) {
            System.out.print((char) value);
         }
         
         String responseText = "<h1>Hello world!</h1>";
         
         String responseGeneralHeader = "HTTP/1.1 200 OK \r\n";
         String contentType = "Content-Type: text/html; charset=utf-8\r\n";
         String contenLength = "Content-Length: " + responseText.length() + "\r\n";
         String whiteLine = "\r\n";
         
         out.write(responseGeneralHeader.getBytes());
         out.write(contenLength.getBytes());
         out.write(contentType.getBytes());
         
         out.write(whiteLine.getBytes());
         
         out.write(responseText.getBytes());
         out.write(whiteLine.getBytes());
         
         out.flush();
//         socket.close();
//         listener.close();
      }
   }

}