/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 2 * Float.BYTES;

    public float x, y;

    public Vec2 add_(byte b) {
        return Glm.add_((Vec2) this, b);
    }

    public Vec2 add_(Vec2 b) {
        return Glm.add_((Vec2) this, b);
    }

    public Vec2 add(byte b) {
        return Glm.add((Vec2) this, (Vec2) this, b);
    }

    public Vec2 add(Vec2 b) {
        return Glm.add((Vec2) this, (Vec2) this, b);
    }

    public Vec2 add(byte b, Vec2 res) {
        return Glm.add(res, (Vec2) this, b);
    }

    public Vec2 add(Vec2 b, Vec2 res) {
        return Glm.add(res, (Vec2) this, b);
    }

    public Vec2 sub_(byte b) {
        return Glm.sub_((Vec2) this, b);
    }

    public Vec2 sub_(Vec2 b) {
        return Glm.sub_((Vec2) this, b);
    }

    public Vec2 sub(byte b) {
        return Glm.sub((Vec2) this, (Vec2) this, b);
    }

    public Vec2 sub(Vec2 b) {
        return Glm.sub((Vec2) this, (Vec2) this, b);
    }

    public Vec2 sub(byte b, Vec2 res) {
        return Glm.sub(res, (Vec2) this, b);
    }

    public Vec2 sub(Vec2 b, Vec2 res) {
        return Glm.sub(res, (Vec2) this, b);
    }

    public Vec2 mul_(byte b) {
        return Glm.mul_((Vec2) this, b);
    }

    public Vec2 mul_(Vec2 b) {
        return Glm.mul_((Vec2) this, b);
    }

    public Vec2 mul(byte b) {
        return Glm.mul((Vec2) this, (Vec2) this, b);
    }

    public Vec2 mul(Vec2 b) {
        return Glm.mul((Vec2) this, (Vec2) this, b);
    }

    public Vec2 mul(byte b, Vec2 res) {
        return Glm.mul(res, (Vec2) this, b);
    }

    public Vec2 mul(Vec2 b, Vec2 res) {
        return Glm.mul(res, (Vec2) this, b);
    }

    public Vec2 div_(byte b) {
        return Glm.div_((Vec2) this, b);
    }

    public Vec2 div_(Vec2 b) {
        return Glm.div_((Vec2) this, b);
    }

    public Vec2 div(byte b) {
        return Glm.div((Vec2) this, (Vec2) this, b);
    }

    public Vec2 div(Vec2 b) {
        return Glm.div((Vec2) this, (Vec2) this, b);
    }

    public Vec2 div(byte b, Vec2 res) {
        return Glm.div(res, (Vec2) this, b);
    }

    public Vec2 div(Vec2 b, Vec2 res) {
        return Glm.div(res, (Vec2) this, b);
    }

    public Vec2 incr_() {
        return Glm.incr_((Vec2) this);
    }

    public Vec2 incr() {
        return Glm.incr((Vec2) this);
    }

    public Vec2 incr(Vec2 res) {
        return Glm.incr(res, (Vec2) this);
    }

    public Vec2 decr_() {
        return Glm.decr_((Vec2) this);
    }

    public Vec2 decr() {
        return Glm.decr((Vec2) this);
    }

    public Vec2 decr(Vec2 res) {
        return Glm.decr(res, (Vec2) this);
    }
}
