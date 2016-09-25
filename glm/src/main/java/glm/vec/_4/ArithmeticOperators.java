/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 4 * Float.BYTES;

    public float x, y, z, w;

    public Vec4 add_(byte b) {
        return Glm.add_((Vec4) this, b);
    }

    public Vec4 add_(Vec4 b) {
        return Glm.add_((Vec4) this, b);
    }

    public Vec4 add(byte b) {
        return Glm.add((Vec4) this, (Vec4) this, b);
    }

    public Vec4 add(Vec4 b) {
        return Glm.add((Vec4) this, (Vec4) this, b);
    }

    public Vec4 add(byte b, Vec4 res) {
        return Glm.add(res, (Vec4) this, b);
    }

    public Vec4 add(Vec4 b, Vec4 res) {
        return Glm.add(res, (Vec4) this, b);
    }

    public Vec4 sub_(byte b) {
        return Glm.sub_((Vec4) this, b);
    }

    public Vec4 sub_(Vec4 b) {
        return Glm.sub_((Vec4) this, b);
    }

    public Vec4 sub(byte b) {
        return Glm.sub((Vec4) this, (Vec4) this, b);
    }

    public Vec4 sub(Vec4 b) {
        return Glm.sub((Vec4) this, (Vec4) this, b);
    }

    public Vec4 sub(byte b, Vec4 res) {
        return Glm.sub(res, (Vec4) this, b);
    }

    public Vec4 sub(Vec4 b, Vec4 res) {
        return Glm.sub(res, (Vec4) this, b);
    }

    public Vec4 mul_(byte b) {
        return Glm.mul_((Vec4) this, b);
    }

    public Vec4 mul_(Vec4 b) {
        return Glm.mul_((Vec4) this, b);
    }

    public Vec4 mul(byte b) {
        return Glm.mul((Vec4) this, (Vec4) this, b);
    }

    public Vec4 mul(Vec4 b) {
        return Glm.mul((Vec4) this, (Vec4) this, b);
    }

    public Vec4 mul(byte b, Vec4 res) {
        return Glm.mul(res, (Vec4) this, b);
    }

    public Vec4 mul(Vec4 b, Vec4 res) {
        return Glm.mul(res, (Vec4) this, b);
    }

    public Vec4 div_(byte b) {
        return Glm.div_((Vec4) this, b);
    }

    public Vec4 div_(Vec4 b) {
        return Glm.div_((Vec4) this, b);
    }

    public Vec4 div(byte b) {
        return Glm.div((Vec4) this, (Vec4) this, b);
    }

    public Vec4 div(Vec4 b) {
        return Glm.div((Vec4) this, (Vec4) this, b);
    }

    public Vec4 div(byte b, Vec4 res) {
        return Glm.div(res, (Vec4) this, b);
    }

    public Vec4 div(Vec4 b, Vec4 res) {
        return Glm.div(res, (Vec4) this, b);
    }

    public Vec4 incr_() {
        return Glm.incr_((Vec4) this);
    }

    public Vec4 incr() {
        return Glm.incr((Vec4) this);
    }

    public Vec4 incr(Vec4 res) {
        return Glm.incr(res, (Vec4) this);
    }

    public Vec4 decr_() {
        return Glm.decr_((Vec4) this);
    }

    public Vec4 decr() {
        return Glm.decr((Vec4) this);
    }

    public Vec4 decr(Vec4 res) {
        return Glm.decr(res, (Vec4) this);
    }
}
