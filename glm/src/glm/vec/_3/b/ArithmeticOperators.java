/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.b;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 3 * Byte.BYTES;

    public byte x, y, z;

    public Vec3b add_(byte b) {
        return Glm.add_((Vec3b) this, b);
    }

    public Vec3b add_(Vec3b b) {
        return Glm.add_((Vec3b) this, b);
    }

    public Vec3b add(byte b) {
        return Glm.add((Vec3b) this, (Vec3b) this, b);
    }

    public Vec3b add(Vec3b b) {
        return Glm.add((Vec3b) this, (Vec3b) this, b);
    }

    public Vec3b add(byte b, Vec3b res) {
        return Glm.add(res, (Vec3b) this, b);
    }

    public Vec3b add(Vec3b b, Vec3b res) {
        return Glm.add(res, (Vec3b) this, b);
    }

    public Vec3b sub_(byte b) {
        return Glm.sub_((Vec3b) this, b);
    }

    public Vec3b sub_(Vec3b b) {
        return Glm.sub_((Vec3b) this, b);
    }

    public Vec3b sub(byte b) {
        return Glm.sub((Vec3b) this, (Vec3b) this, b);
    }

    public Vec3b sub(Vec3b b) {
        return Glm.sub((Vec3b) this, (Vec3b) this, b);
    }

    public Vec3b sub(byte b, Vec3b res) {
        return Glm.sub(res, (Vec3b) this, b);
    }

    public Vec3b sub(Vec3b b, Vec3b res) {
        return Glm.sub(res, (Vec3b) this, b);
    }

    public Vec3b mul_(byte b) {
        return Glm.mul_((Vec3b) this, b);
    }

    public Vec3b mul_(Vec3b b) {
        return Glm.mul_((Vec3b) this, b);
    }

    public Vec3b mul(byte b) {
        return Glm.mul((Vec3b) this, (Vec3b) this, b);
    }

    public Vec3b mul(Vec3b b) {
        return Glm.mul((Vec3b) this, (Vec3b) this, b);
    }

    public Vec3b mul(byte b, Vec3b res) {
        return Glm.mul(res, (Vec3b) this, b);
    }

    public Vec3b mul(Vec3b b, Vec3b res) {
        return Glm.mul(res, (Vec3b) this, b);
    }

    public Vec3b div_(byte b) {
        return Glm.div_((Vec3b) this, b);
    }

    public Vec3b div_(Vec3b b) {
        return Glm.div_((Vec3b) this, b);
    }

    public Vec3b div(byte b) {
        return Glm.div((Vec3b) this, (Vec3b) this, b);
    }

    public Vec3b div(Vec3b b) {
        return Glm.div((Vec3b) this, (Vec3b) this, b);
    }

    public Vec3b div(byte b, Vec3b res) {
        return Glm.div(res, (Vec3b) this, b);
    }

    public Vec3b div(Vec3b b, Vec3b res) {
        return Glm.div(res, (Vec3b) this, b);
    }

    public Vec3b incr_() {
        return Glm.incr_((Vec3b) this);
    }

    public Vec3b incr() {
        return Glm.incr((Vec3b) this);
    }

    public Vec3b incr(Vec3b res) {
        return Glm.incr(res, (Vec3b) this);
    }

    public Vec3b decr_() {
        return Glm.decr_((Vec3b) this);
    }

    public Vec3b decr() {
        return Glm.decr((Vec3b) this);
    }

    public Vec3b decr(Vec3b res) {
        return Glm.decr(res, (Vec3b) this);
    }
}
