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

    public static final int SIZE = 2 * Float.BYTES;

    public float x, y;

    public Vec2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vec2(float f) {
        x = f;
        y = f;
    }
    
    /**
     * Normalize this vector.
     * 
     * @return this
     */
    public Vec2 normalize() {
        return normalize(this);
    }

    /**
     * Normalize this vector and store the result in <code>dest</code>.
     * 
     * @param dest
     *        will hold the result
     * @return dest
     */
    public Vec2 normalize(Vec2 dest) {
        float invLength = (float) (1.0 / Math.sqrt(x * x + y * y));
        dest.x = x * invLength;
        dest.y = y * invLength;
        return dest;
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
