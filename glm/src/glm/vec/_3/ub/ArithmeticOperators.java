/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.ub;

import glm.Glm;
import joou.UByte;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 3 * Byte.BYTES;

    public UByte x = new UByte(), y = new UByte(), z = new UByte();

    public Vec3ub add_(byte b) {
        return Glm.add_((Vec3ub) this, b);
    }

    public Vec3ub add_(Vec3ub b) {
        return Glm.add_((Vec3ub) this, b);
    }

    public Vec3ub add(byte b) {
        return Glm.add((Vec3ub) this, (Vec3ub) this, b);
    }

    public Vec3ub add(Vec3ub b) {
        return Glm.add((Vec3ub) this, (Vec3ub) this, b);
    }

    public Vec3ub add(byte b, Vec3ub res) {
        return Glm.add(res, (Vec3ub) this, b);
    }

    public Vec3ub add(Vec3ub b, Vec3ub res) {
        return Glm.add(res, (Vec3ub) this, b);
    }

    public Vec3ub sub_(byte b) {
        return Glm.sub_((Vec3ub) this, b);
    }

    public Vec3ub sub_(Vec3ub b) {
        return Glm.sub_((Vec3ub) this, b);
    }

    public Vec3ub sub(byte b) {
        return Glm.sub((Vec3ub) this, (Vec3ub) this, b);
    }

    public Vec3ub sub(Vec3ub b) {
        return Glm.sub((Vec3ub) this, (Vec3ub) this, b);
    }

    public Vec3ub sub(byte b, Vec3ub res) {
        return Glm.sub(res, (Vec3ub) this, b);
    }

    public Vec3ub sub(Vec3ub b, Vec3ub res) {
        return Glm.sub(res, (Vec3ub) this, b);
    }

    public Vec3ub mul_(byte b) {
        return Glm.mul_((Vec3ub) this, b);
    }

    public Vec3ub mul_(Vec3ub b) {
        return Glm.mul_((Vec3ub) this, b);
    }

    public Vec3ub mul(byte b) {
        return Glm.mul((Vec3ub) this, (Vec3ub) this, b);
    }

    public Vec3ub mul(Vec3ub b) {
        return Glm.mul((Vec3ub) this, (Vec3ub) this, b);
    }

    public Vec3ub mul(byte b, Vec3ub res) {
        return Glm.mul(res, (Vec3ub) this, b);
    }

    public Vec3ub mul(Vec3ub b, Vec3ub res) {
        return Glm.mul(res, (Vec3ub) this, b);
    }

    public Vec3ub div_(byte b) {
        return Glm.div_((Vec3ub) this, b);
    }

    public Vec3ub div_(Vec3ub b) {
        return Glm.div_((Vec3ub) this, b);
    }

    public Vec3ub div(byte b) {
        return Glm.div((Vec3ub) this, (Vec3ub) this, b);
    }

    public Vec3ub div(Vec3ub b) {
        return Glm.div((Vec3ub) this, (Vec3ub) this, b);
    }

    public Vec3ub div(byte b, Vec3ub res) {
        return Glm.div(res, (Vec3ub) this, b);
    }

    public Vec3ub div(Vec3ub b, Vec3ub res) {
        return Glm.div(res, (Vec3ub) this, b);
    }

    public Vec3ub incr_() {
        return Glm.incr_((Vec3ub) this);
    }

    public Vec3ub incr() {
        return Glm.incr((Vec3ub) this);
    }

    public Vec3ub incr(Vec3ub res) {
        return Glm.incr(res, (Vec3ub) this);
    }

    public Vec3ub decr_() {
        return Glm.decr_((Vec3ub) this);
    }

    public Vec3ub decr() {
        return Glm.decr((Vec3ub) this);
    }

    public Vec3ub decr(Vec3ub res) {
        return Glm.decr(res, (Vec3ub) this);
    }
}
