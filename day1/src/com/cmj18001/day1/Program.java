/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmj18001.day1;

import com.cmj18001.day1.command.AddCommand;
import com.cmj18001.day1.command.Calculatable;
import com.cmj18001.day1.command.MathCommand;
import com.cmj18001.day1.command.MathContext;
import com.cmj18001.day1.command.Multiplication;
import com.cmj18001.day1.command.PowerCommand;
import com.cmj18001.day1.command.SubCommand;


/**
 *
 * @author USER
 */
public class Program {
    public static void main(String[] args){
        
        PowerCommand cmd=new PowerCommand();
        System.out.println(cmd.calculate(2, 3));
        
        MathCommand cmd1=new SubCommand();
        System.out.println(cmd1.calculate(2, 3));
        
        Calculatable cmd2=new Multiplication();
        System.out.println(cmd2.calculate(2, 3));
        
       
        
        
    }
}
