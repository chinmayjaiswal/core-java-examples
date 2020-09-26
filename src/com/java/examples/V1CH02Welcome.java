package com.java.examples;

public class V1CH02Welcome {
  public static void main(String[] args) {
    String greeting = "Welcome to Core Java!!";
    System.out.println(greeting);
    for (int i = 0; i < greeting.length(); i++) {
      System.out.print("=");
    }
    System.out.println();
  }
}
