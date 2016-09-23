/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.i;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
public class ArithmeticOperators {

    public static final int SIZE = 4 * Float.BYTES;

    public int x, y, z, w;

    public Vec4i add_(byte b) {
        return Glm.add_((Vec4i) this, b);
    }

    public Vec4i add_(Vec4i b) {
        return Glm.add_((Vec4i) this, b);
    }

    public Vec4i add(byte b) {
        return Glm.add((Vec4i) this, (Vec4i) this, b);
    }

    public Vec4i add(Vec4i b) {
        return Glm.add((Vec4i) this, (Vec4i) this, b);
    }

    public Vec4i add(byte b, Vec4i res) {
        return Glm.add(res, (Vec4i) this, b);
    }

    public Vec4i add(Vec4i b, Vec4i res) {
        return Glm.add(res, (Vec4i) this, b);
    }

    public Vec4i sub_(byte b) {
        return Glm.sub_((Vec4i) this, b);
    }

    public Vec4i sub_(Vec4i b) {
        return Glm.sub_((Vec4i) this, b);
    }

    public Vec4i sub(byte b) {
        return Glm.sub((Vec4i) this, (Vec4i) this, b);
    }

    public Vec4i sub(Vec4i b) {
        return Glm.sub((Vec4i) this, (Vec4i) this, b);
    }

    public Vec4i sub(byte b, Vec4i res) {
        return Glm.sub(res, (Vec4i) this, b);
    }

    public Vec4i sub(Vec4i b, Vec4i res) {
        return Glm.sub(res, (Vec4i) this, b);
    }

    public Vec4i mul_(byte b) {
        return Glm.mul_((Vec4i) this, b);
    }

    public Vec4i mul_(Vec4i b) {
        return Glm.mul_((Vec4i) this, b);
    }

    public Vec4i mul(byte b) {
        return Glm.mul((Vec4i) this, (Vec4i) this, b);
    }

    public Vec4i mul(Vec4i b) {
        return Glm.mul((Vec4i) this, (Vec4i) this, b);
    }

    public Vec4i mul(byte b, Vec4i res) {
        return Glm.mul(res, (Vec4i) this, b);
    }

    public Vec4i mul(Vec4i b, Vec4i res) {
        return Glm.mul(res, (Vec4i) this, b);
    }

    public Vec4i div_(byte b) {
        return Glm.div_((Vec4i) this, b);
    }

    public Vec4i div_(Vec4i b) {
        return Glm.div_((Vec4i) this, b);
    }

    public Vec4i div(byte b) {
        return Glm.div((Vec4i) this, (Vec4i) this, b);
    }

    public Vec4i div(Vec4i b) {
        return Glm.div((Vec4i) this, (Vec4i) this, b);
    }

    public Vec4i div(byte b, Vec4i res) {
        return Glm.div(res, (Vec4i) this, b);
    }

    public Vec4i div(Vec4i b, Vec4i res) {
        return Glm.div(res, (Vec4i) this, b);
    }

    public Vec4i incr_() {
        return Glm.incr_((Vec4i) this);
    }

    public Vec4i incr() {
        return Glm.incr((Vec4i) this);
    }

    public Vec4i incr(Vec4i res) {
        return Glm.incr(res, (Vec4i) this);
    }

    public Vec4i decr_() {
        return Glm.decr_((Vec4i) this);
    }

    public Vec4i decr() {
        return Glm.decr((Vec4i) this);
    }

    public Vec4i decr(Vec4i res) {
        return Glm.decr(res, (Vec4i) this);
    }
}
