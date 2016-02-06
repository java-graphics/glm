/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2;

import dev.*;

/**
 *
 * @author GBarbieri
 */
class operator extends funcVectorRelational {

    public Vec2 sub(float minuend) {
        return sub(minuend, (Vec2) this);
    }

    public Vec2 sub(Vec2 minuend) {
        return sub(minuend, (Vec2) this);
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
        return mul(multiplicand, (Vec2) this);
    }

    public Vec2 mul(Vec2 multiplicand) {
        return mul(multiplicand, (Vec2) this);
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
        return div(divisor, (Vec2) this);
    }

    public Vec2 div(Vec2 divisor, Vec2 res) {
        res.x = x / divisor.x;
        res.y = y / divisor.y;
        return res;
    }
}
