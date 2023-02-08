package com.driver;

public class Main {
    public static void main(String[] args) {
        classB b= new classB();
        b.meth();

    }
}
class classA{
   public String meth(){
        return "Invoking method from class A";
    }
}
class classB extends classA{
       public String  meth(){
           return "Method is overridden in Extendend class B";
       }
}

