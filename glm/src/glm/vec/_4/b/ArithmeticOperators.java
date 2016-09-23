/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.b;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 4 * Byte.BYTES;

    public byte x, y, z, w;

    public Vec4b add_(byte b) {
        return Glm.add_((Vec4b) this, b);
    }

    public Vec4b add_(Vec4b b) {
        return Glm.add_((Vec4b) this, b);
    }

    public Vec4b add(byte b) {
        return Glm.add((Vec4b) this, (Vec4b) this, b);
    }

    public Vec4b add(Vec4b b) {
        return Glm.add((Vec4b) this, (Vec4b) this, b);
    }

    public Vec4b add(byte b, Vec4b res) {
        return Glm.add(res, (Vec4b) this, b);
    }

    public Vec4b add(Vec4b b, Vec4b res) {
        return Glm.add(res, (Vec4b) this, b);
    }

    public Vec4b sub_(byte b) {
        return Glm.sub_((Vec4b) this, b);
    }

    public Vec4b sub_(Vec4b b) {
        return Glm.sub_((Vec4b) this, b);
    }

    public Vec4b sub(byte b) {
        return Glm.sub((Vec4b) this, (Vec4b) this, b);
    }

    public Vec4b sub(Vec4b b) {
        return Glm.sub((Vec4b) this, (Vec4b) this, b);
    }

    public Vec4b sub(byte b, Vec4b res) {
        return Glm.sub(res, (Vec4b) this, b);
    }

    public Vec4b sub(Vec4b b, Vec4b res) {
        return Glm.sub(res, (Vec4b) this, b);
    }

    public Vec4b mul_(byte b) {
        return Glm.mul_((Vec4b) this, b);
    }

    public Vec4b mul_(Vec4b b) {
        return Glm.mul_((Vec4b) this, b);
    }

    public Vec4b mul(byte b) {
        return Glm.mul((Vec4b) this, (Vec4b) this, b);
    }

    public Vec4b mul(Vec4b b) {
        return Glm.mul((Vec4b) this, (Vec4b) this, b);
    }

    public Vec4b mul(byte b, Vec4b res) {
        return Glm.mul(res, (Vec4b) this, b);
    }

    public Vec4b mul(Vec4b b, Vec4b res) {
        return Glm.mul(res, (Vec4b) this, b);
    }

    public Vec4b div_(byte b) {
        return Glm.div_((Vec4b) this, b);
    }

    public Vec4b div_(Vec4b b) {
        return Glm.div_((Vec4b) this, b);
    }

    public Vec4b div(byte b) {
        return Glm.div((Vec4b) this, (Vec4b) this, b);
    }

    public Vec4b div(Vec4b b) {
        return Glm.div((Vec4b) this, (Vec4b) this, b);
    }

    public Vec4b div(byte b, Vec4b res) {
        return Glm.div(res, (Vec4b) this, b);
    }

    public Vec4b div(Vec4b b, Vec4b res) {
        return Glm.div(res, (Vec4b) this, b);
    }

    public Vec4b incr_() {
        return Glm.incr_((Vec4b) this);
    }

    public Vec4b incr() {
        return Glm.incr((Vec4b) this);
    }

    public Vec4b incr(Vec4b res) {
        return Glm.incr(res, (Vec4b) this);
    }

    public Vec4b decr_() {
        return Glm.decr_((Vec4b) this);
    }

    public Vec4b decr() {
        return Glm.decr((Vec4b) this);
    }

    public Vec4b decr(Vec4b res) {
        return Glm.decr(res, (Vec4b) this);
    }
}
