/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmj18001.day1.util;

/**
 *
 * @author USER
 */
public class Calculator {

    private double add(double x, double y) {
        return x + y;
    }

    private double sub(double x, double y) {
        return x - y;
    }

    private double mul(double x, double y) {
        return x * y;
    }

    private double div(double x, double y) {
        return x / y;
    }

    private double power(double x, double y) {
        double total = 1;
        for (int i = 1; i <= y; i++) {
            total = total * x;
        }
        return total;
    }

    public double powerRecursive(double x, double y) {
        if (y == 0) {
            return 1;
        }
        return x * powerRecursive(x, y - 1);
    }

    public double sum(double x) {
        double total = 1;
        for (int i = 1; i <= x; i++) {
            total = total * i;
        }
        return total;
    }
    
    public double sumRecursive(double x) {
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        return x * sumRecursive(x-1);
    }
    
    public double calculate(double x, double y,String choice){
        if(choice.equals("+")){
            return add(x, y);
        }else if(choice.equals("-")){
            return sub(x, y);
        }
        return -1;
    }

}
