package com.scsvmv.javalab;

import com.scsvmv.javalab.hello.Hello;
/*
 * TestHello class
 * Demonstrates passing command-line arguments
 */ 
public class TestHello
{
public static void main(String[]args) {  

 // Using Hello class from parent package
 Hello simpleHello=new Hello();
 simpleHello.wish();

 // Using Hello class from child package
  com.scsvmv.javalab.hello.Hello h=
    new com.scsvmv.javalab.hello.Hello();

 //Check for command-line argument
  if(args.length >0) {
     h.wish(args[0];       //pass CLI argument 
     h.wishWithData(args[0]);
  }  else {
      System.out.println("Usage:");
      System.out.println("java com.scsvmv.javalab.TestHello <name>");
      System.out.println("Example:");
      System.out.println("java com.scsvmv.javalab.TestHello Student");
  }
 }
}