/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labreportuthree;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author dell
 */
public class Lab2 {

    public static void main(String[] args) {
        try{
          URL u = new URL("http://www.pkmc.tu.edu.np/hello.php?id=67#header");
          System.out.println("URL:" + u.toString());
          System.out.println("Protocol:" + u.getProtocol());
          System.out.println("Authority:" + u.getAuthority());
          System.out.println("Port:" + u.getPort());
          System.out.println("Host:" + u.getHost());
          System.out.println("File:" + u.getFile());
          System.out.println("Query:" + u.getQuery());
          System.out.println("References:" + u.getRef());
      }catch(MalformedURLException mex){
          System.out.println("Error on URL:" + mex.getMessage());
      }
    }
}
