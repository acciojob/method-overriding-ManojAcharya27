package com.driver;

public class Main {
    public static void main(String[] args) {
        classB b= new classB();
        b.meth();

    }
}
class classA{
    void meth(){
        System.out.println("Invoking method from class A");
    }
}
class classB extends classA{
       void meth(){
           System.out.println("Method is overridden in Extendend class B");
       }
}

