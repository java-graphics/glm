/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.s;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {
    
    public static final int SIZE = 2 * Short.BYTES;

    public short x, y;
    
    public Vec2s add_(byte b) {
        return Glm.add_((Vec2s) this, b);
    }

    public Vec2s add_(Vec2s b) {
        return Glm.add_((Vec2s) this, b);
    }

    public Vec2s add(byte b) {
        return Glm.add((Vec2s) this, (Vec2s) this, b);
    }

    public Vec2s add(Vec2s b) {
        return Glm.add((Vec2s) this, (Vec2s) this, b);
    }

    public Vec2s add(byte b, Vec2s res) {
        return Glm.add(res, (Vec2s) this, b);
    }

    public Vec2s add(Vec2s b, Vec2s res) {
        return Glm.add(res, (Vec2s) this, b);
    }

    public Vec2s sub_(byte b) {
        return Glm.sub_((Vec2s) this, b);
    }

    public Vec2s sub_(Vec2s b) {
        return Glm.sub_((Vec2s) this, b);
    }

    public Vec2s sub(byte b) {
        return Glm.sub((Vec2s) this, (Vec2s) this, b);
    }

    public Vec2s sub(Vec2s b) {
        return Glm.sub((Vec2s) this, (Vec2s) this, b);
    }

    public Vec2s sub(byte b, Vec2s res) {
        return Glm.sub(res, (Vec2s) this, b);
    }

    public Vec2s sub(Vec2s b, Vec2s res) {
        return Glm.sub(res, (Vec2s) this, b);
    }

    public Vec2s mul_(byte b) {
        return Glm.mul_((Vec2s) this, b);
    }

    public Vec2s mul_(Vec2s b) {
        return Glm.mul_((Vec2s) this, b);
    }

    public Vec2s mul(byte b) {
        return Glm.mul((Vec2s) this, (Vec2s) this, b);
    }

    public Vec2s mul(Vec2s b) {
        return Glm.mul((Vec2s) this, (Vec2s) this, b);
    }

    public Vec2s mul(byte b, Vec2s res) {
        return Glm.mul(res, (Vec2s) this, b);
    }

    public Vec2s mul(Vec2s b, Vec2s res) {
        return Glm.mul(res, (Vec2s) this, b);
    }

    public Vec2s div_(byte b) {
        return Glm.div_((Vec2s) this, b);
    }

    public Vec2s div_(Vec2s b) {
        return Glm.div_((Vec2s) this, b);
    }

    public Vec2s div(byte b) {
        return Glm.div((Vec2s) this, (Vec2s) this, b);
    }

    public Vec2s div(Vec2s b) {
        return Glm.div((Vec2s) this, (Vec2s) this, b);
    }

    public Vec2s div(byte b, Vec2s res) {
        return Glm.div(res, (Vec2s) this, b);
    }

    public Vec2s div(Vec2s b, Vec2s res) {
        return Glm.div(res, (Vec2s) this, b);
    }

    public Vec2s incr_() {
        return Glm.incr_((Vec2s) this);
    }

    public Vec2s incr() {
        return Glm.incr((Vec2s) this);
    }

    public Vec2s incr(Vec2s res) {
        return Glm.incr(res, (Vec2s) this);
    }

    public Vec2s decr_() {
        return Glm.decr_((Vec2s) this);
    }

    public Vec2s decr() {
        return Glm.decr((Vec2s) this);
    }

    public Vec2s decr(Vec2s res) {
        return Glm.decr(res, (Vec2s) this);
    }
}
