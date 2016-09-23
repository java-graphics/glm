/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.s;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 3 * Short.BYTES;

    public short x, y, z;

    public Vec3s add_(byte b) {
        return Glm.add_((Vec3s) this, b);
    }

    public Vec3s add_(Vec3s b) {
        return Glm.add_((Vec3s) this, b);
    }

    public Vec3s add(byte b) {
        return Glm.add((Vec3s) this, (Vec3s) this, b);
    }

    public Vec3s add(Vec3s b) {
        return Glm.add((Vec3s) this, (Vec3s) this, b);
    }

    public Vec3s add(byte b, Vec3s res) {
        return Glm.add(res, (Vec3s) this, b);
    }

    public Vec3s add(Vec3s b, Vec3s res) {
        return Glm.add(res, (Vec3s) this, b);
    }

    public Vec3s sub_(byte b) {
        return Glm.sub_((Vec3s) this, b);
    }

    public Vec3s sub_(Vec3s b) {
        return Glm.sub_((Vec3s) this, b);
    }

    public Vec3s sub(byte b) {
        return Glm.sub((Vec3s) this, (Vec3s) this, b);
    }

    public Vec3s sub(Vec3s b) {
        return Glm.sub((Vec3s) this, (Vec3s) this, b);
    }

    public Vec3s sub(byte b, Vec3s res) {
        return Glm.sub(res, (Vec3s) this, b);
    }

    public Vec3s sub(Vec3s b, Vec3s res) {
        return Glm.sub(res, (Vec3s) this, b);
    }

    public Vec3s mul_(byte b) {
        return Glm.mul_((Vec3s) this, b);
    }

    public Vec3s mul_(Vec3s b) {
        return Glm.mul_((Vec3s) this, b);
    }

    public Vec3s mul(byte b) {
        return Glm.mul((Vec3s) this, (Vec3s) this, b);
    }

    public Vec3s mul(Vec3s b) {
        return Glm.mul((Vec3s) this, (Vec3s) this, b);
    }

    public Vec3s mul(byte b, Vec3s res) {
        return Glm.mul(res, (Vec3s) this, b);
    }

    public Vec3s mul(Vec3s b, Vec3s res) {
        return Glm.mul(res, (Vec3s) this, b);
    }

    public Vec3s div_(byte b) {
        return Glm.div_((Vec3s) this, b);
    }

    public Vec3s div_(Vec3s b) {
        return Glm.div_((Vec3s) this, b);
    }

    public Vec3s div(byte b) {
        return Glm.div((Vec3s) this, (Vec3s) this, b);
    }

    public Vec3s div(Vec3s b) {
        return Glm.div((Vec3s) this, (Vec3s) this, b);
    }

    public Vec3s div(byte b, Vec3s res) {
        return Glm.div(res, (Vec3s) this, b);
    }

    public Vec3s div(Vec3s b, Vec3s res) {
        return Glm.div(res, (Vec3s) this, b);
    }

    public Vec3s incr_() {
        return Glm.incr_((Vec3s) this);
    }

    public Vec3s incr() {
        return Glm.incr((Vec3s) this);
    }

    public Vec3s incr(Vec3s res) {
        return Glm.incr(res, (Vec3s) this);
    }

    public Vec3s decr_() {
        return Glm.decr_((Vec3s) this);
    }

    public Vec3s decr() {
        return Glm.decr((Vec3s) this);
    }

    public Vec3s decr(Vec3s res) {
        return Glm.decr(res, (Vec3s) this);
    }
}
