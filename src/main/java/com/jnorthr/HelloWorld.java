package com.jnorthr;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication; 
import java.util.Date;
 
//@SpringBootApplication
public class HelloWorld
{  
    public static void main(String[] args) 
    { 
        System.out.println("Hello world from java on "+getCurrentDate());
    }
 
    private static Date getCurrentDate()
    {
        return new Date();
    } 
}
