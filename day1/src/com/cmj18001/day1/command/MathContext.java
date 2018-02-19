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
public class MathContext {
    private MathCommand cmd;

    
    public MathContext(MathCommand cmd) {
        this.cmd = cmd;
    }

    public void setCmd(MathCommand cmd) {
        this.cmd = cmd;
    }
    
    public double calculate(double x, double y){
        return cmd.calculate(x, y);
    }
    
    
    
}
