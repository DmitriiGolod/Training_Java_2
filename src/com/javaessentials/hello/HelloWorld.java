package com.javaessentials.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        System.out.println("One more thing!");
        String sJavaPath=System.getenv("JAVA_HOME");
        System.out.println(sJavaPath);
    }
}
