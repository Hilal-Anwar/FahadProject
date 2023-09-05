package org.graded.classes.core;

public class CoreFunctions {
    public CoreFunctions(){
        System.out.println("I am called");
    }
    public CoreFunctions(String name){
        System.out.println("I am called "+name);
    }
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return (a + b);
    }

    float sum(float a, float b) {
        return (a + b);
    }

    int sum(byte a, byte b) {
        return (a + b);
    }

    void difference(int a, int b) {

    }
}
