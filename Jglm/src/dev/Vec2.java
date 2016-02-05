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

    public Vec2() {
        x = 0f;
        y = 0f;
    }

    public Vec2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vec2(double x, double y) {
        this.x = (float) x;
        this.y = (float) y;
    }

    public Vec2(float f) {
        x = f;
        y = f;
    }
    
    public Vec2(double f) {
        x = (float) f;
        y = (float) f;
    }

    /**
     * Return the length of this vector.
     *
     * @return the length
     */
    public float length() {
        return (float) Math.sqrt((x * x) + (y * y));
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
     * will hold the result
     * @return dest
     */
    public Vec2 normalize(Vec2 dest) {
        float invLength = (float) (1.0 / Math.sqrt(x * x + y * y));
        dest.x = x * invLength;
        dest.y = y * invLength;
        return dest;
    }

    public Vec2 sub(float minuend) {
        return sub(minuend, this);
    }

    public Vec2 sub(Vec2 minuend) {
        return sub(minuend, this);
    }

    public Vec2 sub(float minuend, Vec2 res) {
        res.x = x - minuend;
        res.y = y - minuend;
        return res;
    }

    public Vec2 sub(Vec2 minuend, Vec2 res) {
        res.x = x - minuend.x;
        res.y = y - minuend.y;
        return res;
    }

    public Vec2 mul(float multiplicand) {
        return mul(multiplicand, this);
    }

    public Vec2 mul(Vec2 multiplicand) {
        return mul(multiplicand, this);
    }

    public Vec2 mul(float multiplicand, Vec2 res) {
        res.x = x * multiplicand;
        res.y = y * multiplicand;
        return res;
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
