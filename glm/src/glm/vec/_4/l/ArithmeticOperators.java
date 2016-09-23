/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.l;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 4 * Long.BYTES;

    public long x, y, z, w;

    public Vec4l add_(byte b) {
        return Glm.add_((Vec4l) this, b);
    }

    public Vec4l add_(Vec4l b) {
        return Glm.add_((Vec4l) this, b);
    }

    public Vec4l add(byte b) {
        return Glm.add((Vec4l) this, (Vec4l) this, b);
    }

    public Vec4l add(Vec4l b) {
        return Glm.add((Vec4l) this, (Vec4l) this, b);
    }

    public Vec4l add(byte b, Vec4l res) {
        return Glm.add(res, (Vec4l) this, b);
    }

    public Vec4l add(Vec4l b, Vec4l res) {
        return Glm.add(res, (Vec4l) this, b);
    }

    public Vec4l sub_(byte b) {
        return Glm.sub_((Vec4l) this, b);
    }

    public Vec4l sub_(Vec4l b) {
        return Glm.sub_((Vec4l) this, b);
    }

    public Vec4l sub(byte b) {
        return Glm.sub((Vec4l) this, (Vec4l) this, b);
    }

    public Vec4l sub(Vec4l b) {
        return Glm.sub((Vec4l) this, (Vec4l) this, b);
    }

    public Vec4l sub(byte b, Vec4l res) {
        return Glm.sub(res, (Vec4l) this, b);
    }

    public Vec4l sub(Vec4l b, Vec4l res) {
        return Glm.sub(res, (Vec4l) this, b);
    }

    public Vec4l mul_(byte b) {
        return Glm.mul_((Vec4l) this, b);
    }

    public Vec4l mul_(Vec4l b) {
        return Glm.mul_((Vec4l) this, b);
    }

    public Vec4l mul(byte b) {
        return Glm.mul((Vec4l) this, (Vec4l) this, b);
    }

    public Vec4l mul(Vec4l b) {
        return Glm.mul((Vec4l) this, (Vec4l) this, b);
    }

    public Vec4l mul(byte b, Vec4l res) {
        return Glm.mul(res, (Vec4l) this, b);
    }

    public Vec4l mul(Vec4l b, Vec4l res) {
        return Glm.mul(res, (Vec4l) this, b);
    }

    public Vec4l div_(byte b) {
        return Glm.div_((Vec4l) this, b);
    }

    public Vec4l div_(Vec4l b) {
        return Glm.div_((Vec4l) this, b);
    }

    public Vec4l div(byte b) {
        return Glm.div((Vec4l) this, (Vec4l) this, b);
    }

    public Vec4l div(Vec4l b) {
        return Glm.div((Vec4l) this, (Vec4l) this, b);
    }

    public Vec4l div(byte b, Vec4l res) {
        return Glm.div(res, (Vec4l) this, b);
    }

    public Vec4l div(Vec4l b, Vec4l res) {
        return Glm.div(res, (Vec4l) this, b);
    }

    public Vec4l incr_() {
        return Glm.incr_((Vec4l) this);
    }

    public Vec4l incr() {
        return Glm.incr((Vec4l) this);
    }

    public Vec4l incr(Vec4l res) {
        return Glm.incr(res, (Vec4l) this);
    }

    public Vec4l decr_() {
        return Glm.decr_((Vec4l) this);
    }

    public Vec4l decr() {
        return Glm.decr((Vec4l) this);
    }

    public Vec4l decr(Vec4l res) {
        return Glm.decr(res, (Vec4l) this);
    }
}
