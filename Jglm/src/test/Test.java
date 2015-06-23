/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import jglm.Mat3;

/**
 *
 * @author gbarbieri
 */
public class Test {

    
    
    public static void main(String args[]) {

        Mat3 one = new Mat3(1);

        Mat3 two = new Mat3(2);
        
        Mat3 three = one.times(two);
        
        three.print("three");
    }
}
