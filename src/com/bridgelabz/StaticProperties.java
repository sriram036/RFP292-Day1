package com.bridgelabz;

public class StaticProperties {
    static String variable = "sriram";

    static {
        System.out.println("This is a static block");
    }

    static void demoMethod() {
        System.out.println("This method is a static method.");
    }
    public static void main(String[] args) {
        System.out.println("The name " + variable + " is a static variable value.");
        demoMethod();
    }
}
