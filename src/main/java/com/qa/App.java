package com.qa;

/**
 * Hello world!
 * testing commit
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Whoop"));
        System.out.println(sayHelloToSomeone("Sparkles"));
        System.out.println(sayHelloToSomeone("Poppy"));
        System.out.println(sayHelloToSomeone("Smudge"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
