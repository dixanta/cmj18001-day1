/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmj18001.day1.command;

/**
 *
 * @author USER
 */
public class PowerCommand extends MathCommand {

    @Override
    public double calculate(double x, double y) {
        if (y == 0) {
            return 1;
        }
        return x * calculate(x, y - 1);
    }
    
}
