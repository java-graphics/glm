/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 3 * Float.BYTES;

    public float x, y, z;

    public Vec3 add_(byte b) {
        return Glm.add_((Vec3) this, b);
    }

    public Vec3 add_(Vec3 b) {
        return Glm.add_((Vec3) this, b);
    }

    public Vec3 add(byte b) {
        return Glm.add((Vec3) this, (Vec3) this, b);
    }

    public Vec3 add(Vec3 b) {
        return Glm.add((Vec3) this, (Vec3) this, b);
    }

    public Vec3 add(byte b, Vec3 res) {
        return Glm.add(res, (Vec3) this, b);
    }

    public Vec3 add(Vec3 b, Vec3 res) {
        return Glm.add(res, (Vec3) this, b);
    }

    public Vec3 sub_(byte b) {
        return Glm.sub_((Vec3) this, b);
    }

    public Vec3 sub_(Vec3 b) {
        return Glm.sub_((Vec3) this, b);
    }

    public Vec3 sub(byte b) {
        return Glm.sub((Vec3) this, (Vec3) this, b);
    }

    public Vec3 sub(Vec3 b) {
        return Glm.sub((Vec3) this, (Vec3) this, b);
    }

    public Vec3 sub(byte b, Vec3 res) {
        return Glm.sub(res, (Vec3) this, b);
    }

    public Vec3 sub(Vec3 b, Vec3 res) {
        return Glm.sub(res, (Vec3) this, b);
    }

    public Vec3 mul_(byte b) {
        return Glm.mul_((Vec3) this, b);
    }

    public Vec3 mul_(Vec3 b) {
        return Glm.mul_((Vec3) this, b);
    }

    public Vec3 mul(byte b) {
        return Glm.mul((Vec3) this, (Vec3) this, b);
    }

    public Vec3 mul(Vec3 b) {
        return Glm.mul((Vec3) this, (Vec3) this, b);
    }

    public Vec3 mul(byte b, Vec3 res) {
        return Glm.mul(res, (Vec3) this, b);
    }

    public Vec3 mul(Vec3 b, Vec3 res) {
        return Glm.mul(res, (Vec3) this, b);
    }

    public Vec3 div_(byte b) {
        return Glm.div_((Vec3) this, b);
    }

    public Vec3 div_(Vec3 b) {
        return Glm.div_((Vec3) this, b);
    }

    public Vec3 div(byte b) {
        return Glm.div((Vec3) this, (Vec3) this, b);
    }

    public Vec3 div(Vec3 b) {
        return Glm.div((Vec3) this, (Vec3) this, b);
    }

    public Vec3 div(byte b, Vec3 res) {
        return Glm.div(res, (Vec3) this, b);
    }

    public Vec3 div(Vec3 b, Vec3 res) {
        return Glm.div(res, (Vec3) this, b);
    }

    public Vec3 incr_() {
        return Glm.incr_((Vec3) this);
    }

    public Vec3 incr() {
        return Glm.incr((Vec3) this);
    }

    public Vec3 incr(Vec3 res) {
        return Glm.incr(res, (Vec3) this);
    }

    public Vec3 decr_() {
        return Glm.decr_((Vec3) this);
    }

    public Vec3 decr() {
        return Glm.decr((Vec3) this);
    }

    public Vec3 decr(Vec3 res) {
        return Glm.decr(res, (Vec3) this);
    }
}
