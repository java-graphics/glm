/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.s;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 4 * Short.BYTES;

    public short x, y, z, w;

    public Vec4s add_(byte b) {
        return Glm.add_((Vec4s) this, b);
    }

    public Vec4s add_(Vec4s b) {
        return Glm.add_((Vec4s) this, b);
    }

    public Vec4s add(byte b) {
        return Glm.add((Vec4s) this, (Vec4s) this, b);
    }

    public Vec4s add(Vec4s b) {
        return Glm.add((Vec4s) this, (Vec4s) this, b);
    }

    public Vec4s add(byte b, Vec4s res) {
        return Glm.add(res, (Vec4s) this, b);
    }

    public Vec4s add(Vec4s b, Vec4s res) {
        return Glm.add(res, (Vec4s) this, b);
    }

    public Vec4s sub_(byte b) {
        return Glm.sub_((Vec4s) this, b);
    }

    public Vec4s sub_(Vec4s b) {
        return Glm.sub_((Vec4s) this, b);
    }

    public Vec4s sub(byte b) {
        return Glm.sub((Vec4s) this, (Vec4s) this, b);
    }

    public Vec4s sub(Vec4s b) {
        return Glm.sub((Vec4s) this, (Vec4s) this, b);
    }

    public Vec4s sub(byte b, Vec4s res) {
        return Glm.sub(res, (Vec4s) this, b);
    }

    public Vec4s sub(Vec4s b, Vec4s res) {
        return Glm.sub(res, (Vec4s) this, b);
    }

    public Vec4s mul_(byte b) {
        return Glm.mul_((Vec4s) this, b);
    }

    public Vec4s mul_(Vec4s b) {
        return Glm.mul_((Vec4s) this, b);
    }

    public Vec4s mul(byte b) {
        return Glm.mul((Vec4s) this, (Vec4s) this, b);
    }

    public Vec4s mul(Vec4s b) {
        return Glm.mul((Vec4s) this, (Vec4s) this, b);
    }

    public Vec4s mul(byte b, Vec4s res) {
        return Glm.mul(res, (Vec4s) this, b);
    }

    public Vec4s mul(Vec4s b, Vec4s res) {
        return Glm.mul(res, (Vec4s) this, b);
    }

    public Vec4s div_(byte b) {
        return Glm.div_((Vec4s) this, b);
    }

    public Vec4s div_(Vec4s b) {
        return Glm.div_((Vec4s) this, b);
    }

    public Vec4s div(byte b) {
        return Glm.div((Vec4s) this, (Vec4s) this, b);
    }

    public Vec4s div(Vec4s b) {
        return Glm.div((Vec4s) this, (Vec4s) this, b);
    }

    public Vec4s div(byte b, Vec4s res) {
        return Glm.div(res, (Vec4s) this, b);
    }

    public Vec4s div(Vec4s b, Vec4s res) {
        return Glm.div(res, (Vec4s) this, b);
    }

    public Vec4s incr_() {
        return Glm.incr_((Vec4s) this);
    }

    public Vec4s incr() {
        return Glm.incr((Vec4s) this);
    }

    public Vec4s incr(Vec4s res) {
        return Glm.incr(res, (Vec4s) this);
    }

    public Vec4s decr_() {
        return Glm.decr_((Vec4s) this);
    }

    public Vec4s decr() {
        return Glm.decr((Vec4s) this);
    }

    public Vec4s decr(Vec4s res) {
        return Glm.decr(res, (Vec4s) this);
    }
}
