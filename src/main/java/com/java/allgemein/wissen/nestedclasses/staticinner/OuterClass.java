package com.java.allgemein.wissen.nestedclasses.staticinner;

public class OuterClass {

    public String s =  "Outer S";
    private static String outterStatic = "outer Static";

    public static void main(String[] args) {
        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
        innerStaticClass.display();
        System.out.println(InnerStaticClass.innterStatic);
        System.out.println(new InnerStaticClass().s);
    }

    static class InnerStaticClass{
        String s = "Inner S";
        static String innterStatic ="inner Static";

        public void display(){
            System.out.println(s);
            System.out.println(innterStatic);
            System.out.println(outterStatic);
            System.out.println(new OuterClass().s);
        }
    }
}
