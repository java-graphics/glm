/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

/**
 *
 * @author GBarbieri
 */
public class Vec2 {

    public static final int SIZEOF = 2 * Float.BYTES;

    public float x, y;

    public Vec2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vec2(float f) {
        x = f;
        y = f;
    }
    
    public Vec2 sub(Vec2 minuend) {
        return sub(minuend, this);
    }
    
    public Vec2 sub(Vec2 minuend, Vec2 res) {
        res.x = x - minuend.x;
        res.y = y - minuend.y;
        return res;
    }
    
    public Vec2 mul(Vec2 multiplicand) {
        return mul(multiplicand, this);
    }
    
    public Vec2 mul(Vec2 multiplicand, Vec2 res) {
        res.x = x * multiplicand.x;
        res.y = y * multiplicand.y;
        return res;
    }
    
    public Vec2 div(Vec2 divisor) {
        return div(divisor, this);
    }
    
    public Vec2 div(Vec2 divisor, Vec2 res) {
        res.x = x / divisor.x;
        res.y = y / divisor.y;
        return res;
    }
}
