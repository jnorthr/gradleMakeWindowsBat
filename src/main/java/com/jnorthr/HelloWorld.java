package com.jnorthr;
 
import java.util.Date;
 
public class HelloWorld{
  
 public static void main(String[] args) {
 
  System.out.println("Hello world from java on "+getCurrentDate());
 }
 
 private static Date getCurrentDate(){
  return new Date();
 }
 
}