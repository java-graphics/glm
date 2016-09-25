/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.ub;

import glm.Glm;
import joou.UByte;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 4 * Byte.BYTES;

    public UByte x = new UByte(), y = new UByte(), z = new UByte(), w = new UByte();

    public Vec4ub add_(byte b) {
        return Glm.add_((Vec4ub) this, b);
    }

    public Vec4ub add_(Vec4ub b) {
        return Glm.add_((Vec4ub) this, b);
    }

    public Vec4ub add(byte b) {
        return Glm.add((Vec4ub) this, (Vec4ub) this, b);
    }

    public Vec4ub add(Vec4ub b) {
        return Glm.add((Vec4ub) this, (Vec4ub) this, b);
    }

    public Vec4ub add(byte b, Vec4ub res) {
        return Glm.add(res, (Vec4ub) this, b);
    }

    public Vec4ub add(Vec4ub b, Vec4ub res) {
        return Glm.add(res, (Vec4ub) this, b);
    }

    public Vec4ub sub_(byte b) {
        return Glm.sub_((Vec4ub) this, b);
    }

    public Vec4ub sub_(Vec4ub b) {
        return Glm.sub_((Vec4ub) this, b);
    }

    public Vec4ub sub(byte b) {
        return Glm.sub((Vec4ub) this, (Vec4ub) this, b);
    }

    public Vec4ub sub(Vec4ub b) {
        return Glm.sub((Vec4ub) this, (Vec4ub) this, b);
    }

    public Vec4ub sub(byte b, Vec4ub res) {
        return Glm.sub(res, (Vec4ub) this, b);
    }

    public Vec4ub sub(Vec4ub b, Vec4ub res) {
        return Glm.sub(res, (Vec4ub) this, b);
    }

    public Vec4ub mul_(byte b) {
        return Glm.mul_((Vec4ub) this, b);
    }

    public Vec4ub mul_(Vec4ub b) {
        return Glm.mul_((Vec4ub) this, b);
    }

    public Vec4ub mul(byte b) {
        return Glm.mul((Vec4ub) this, (Vec4ub) this, b);
    }

    public Vec4ub mul(Vec4ub b) {
        return Glm.mul((Vec4ub) this, (Vec4ub) this, b);
    }

    public Vec4ub mul(byte b, Vec4ub res) {
        return Glm.mul(res, (Vec4ub) this, b);
    }

    public Vec4ub mul(Vec4ub b, Vec4ub res) {
        return Glm.mul(res, (Vec4ub) this, b);
    }

    public Vec4ub div_(byte b) {
        return Glm.div_((Vec4ub) this, b);
    }

    public Vec4ub div_(Vec4ub b) {
        return Glm.div_((Vec4ub) this, b);
    }

    public Vec4ub div(byte b) {
        return Glm.div((Vec4ub) this, (Vec4ub) this, b);
    }

    public Vec4ub div(Vec4ub b) {
        return Glm.div((Vec4ub) this, (Vec4ub) this, b);
    }

    public Vec4ub div(byte b, Vec4ub res) {
        return Glm.div(res, (Vec4ub) this, b);
    }

    public Vec4ub div(Vec4ub b, Vec4ub res) {
        return Glm.div(res, (Vec4ub) this, b);
    }

    public Vec4ub incr_() {
        return Glm.incr_((Vec4ub) this);
    }

    public Vec4ub incr() {
        return Glm.incr((Vec4ub) this);
    }

    public Vec4ub incr(Vec4ub res) {
        return Glm.incr(res, (Vec4ub) this);
    }

    public Vec4ub decr_() {
        return Glm.decr_((Vec4ub) this);
    }

    public Vec4ub decr() {
        return Glm.decr((Vec4ub) this);
    }

    public Vec4ub decr(Vec4ub res) {
        return Glm.decr(res, (Vec4ub) this);
    }
}
