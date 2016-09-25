/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.i;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 3 * Integer.BYTES;

    public int x, y, z;

    public Vec3i add_(byte b) {
        return Glm.add_((Vec3i) this, b);
    }

    public Vec3i add_(Vec3i b) {
        return Glm.add_((Vec3i) this, b);
    }

    public Vec3i add(byte b) {
        return Glm.add((Vec3i) this, (Vec3i) this, b);
    }

    public Vec3i add(Vec3i b) {
        return Glm.add((Vec3i) this, (Vec3i) this, b);
    }

    public Vec3i add(byte b, Vec3i res) {
        return Glm.add(res, (Vec3i) this, b);
    }

    public Vec3i add(Vec3i b, Vec3i res) {
        return Glm.add(res, (Vec3i) this, b);
    }

    public Vec3i sub_(byte b) {
        return Glm.sub_((Vec3i) this, b);
    }

    public Vec3i sub_(Vec3i b) {
        return Glm.sub_((Vec3i) this, b);
    }

    public Vec3i sub(byte b) {
        return Glm.sub((Vec3i) this, (Vec3i) this, b);
    }

    public Vec3i sub(Vec3i b) {
        return Glm.sub((Vec3i) this, (Vec3i) this, b);
    }

    public Vec3i sub(byte b, Vec3i res) {
        return Glm.sub(res, (Vec3i) this, b);
    }

    public Vec3i sub(Vec3i b, Vec3i res) {
        return Glm.sub(res, (Vec3i) this, b);
    }

    public Vec3i mul_(byte b) {
        return Glm.mul_((Vec3i) this, b);
    }

    public Vec3i mul_(Vec3i b) {
        return Glm.mul_((Vec3i) this, b);
    }

    public Vec3i mul(byte b) {
        return Glm.mul((Vec3i) this, (Vec3i) this, b);
    }

    public Vec3i mul(Vec3i b) {
        return Glm.mul((Vec3i) this, (Vec3i) this, b);
    }

    public Vec3i mul(byte b, Vec3i res) {
        return Glm.mul(res, (Vec3i) this, b);
    }

    public Vec3i mul(Vec3i b, Vec3i res) {
        return Glm.mul(res, (Vec3i) this, b);
    }

    public Vec3i div_(byte b) {
        return Glm.div_((Vec3i) this, b);
    }

    public Vec3i div_(Vec3i b) {
        return Glm.div_((Vec3i) this, b);
    }

    public Vec3i div(byte b) {
        return Glm.div((Vec3i) this, (Vec3i) this, b);
    }

    public Vec3i div(Vec3i b) {
        return Glm.div((Vec3i) this, (Vec3i) this, b);
    }

    public Vec3i div(byte b, Vec3i res) {
        return Glm.div(res, (Vec3i) this, b);
    }

    public Vec3i div(Vec3i b, Vec3i res) {
        return Glm.div(res, (Vec3i) this, b);
    }

    public Vec3i incr_() {
        return Glm.incr_((Vec3i) this);
    }

    public Vec3i incr() {
        return Glm.incr((Vec3i) this);
    }

    public Vec3i incr(Vec3i res) {
        return Glm.incr(res, (Vec3i) this);
    }

    public Vec3i decr_() {
        return Glm.decr_((Vec3i) this);
    }

    public Vec3i decr() {
        return Glm.decr((Vec3i) this);
    }

    public Vec3i decr(Vec3i res) {
        return Glm.decr(res, (Vec3i) this);
    }
}
