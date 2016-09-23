/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.l;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 3 * Long.BYTES;

    public long x, y, z;

    public Vec3l add_(byte b) {
        return Glm.add_((Vec3l) this, b);
    }

    public Vec3l add_(Vec3l b) {
        return Glm.add_((Vec3l) this, b);
    }

    public Vec3l add(byte b) {
        return Glm.add((Vec3l) this, (Vec3l) this, b);
    }

    public Vec3l add(Vec3l b) {
        return Glm.add((Vec3l) this, (Vec3l) this, b);
    }

    public Vec3l add(byte b, Vec3l res) {
        return Glm.add(res, (Vec3l) this, b);
    }

    public Vec3l add(Vec3l b, Vec3l res) {
        return Glm.add(res, (Vec3l) this, b);
    }

    public Vec3l sub_(byte b) {
        return Glm.sub_((Vec3l) this, b);
    }

    public Vec3l sub_(Vec3l b) {
        return Glm.sub_((Vec3l) this, b);
    }

    public Vec3l sub(byte b) {
        return Glm.sub((Vec3l) this, (Vec3l) this, b);
    }

    public Vec3l sub(Vec3l b) {
        return Glm.sub((Vec3l) this, (Vec3l) this, b);
    }

    public Vec3l sub(byte b, Vec3l res) {
        return Glm.sub(res, (Vec3l) this, b);
    }

    public Vec3l sub(Vec3l b, Vec3l res) {
        return Glm.sub(res, (Vec3l) this, b);
    }

    public Vec3l mul_(byte b) {
        return Glm.mul_((Vec3l) this, b);
    }

    public Vec3l mul_(Vec3l b) {
        return Glm.mul_((Vec3l) this, b);
    }

    public Vec3l mul(byte b) {
        return Glm.mul((Vec3l) this, (Vec3l) this, b);
    }

    public Vec3l mul(Vec3l b) {
        return Glm.mul((Vec3l) this, (Vec3l) this, b);
    }

    public Vec3l mul(byte b, Vec3l res) {
        return Glm.mul(res, (Vec3l) this, b);
    }

    public Vec3l mul(Vec3l b, Vec3l res) {
        return Glm.mul(res, (Vec3l) this, b);
    }

    public Vec3l div_(byte b) {
        return Glm.div_((Vec3l) this, b);
    }

    public Vec3l div_(Vec3l b) {
        return Glm.div_((Vec3l) this, b);
    }

    public Vec3l div(byte b) {
        return Glm.div((Vec3l) this, (Vec3l) this, b);
    }

    public Vec3l div(Vec3l b) {
        return Glm.div((Vec3l) this, (Vec3l) this, b);
    }

    public Vec3l div(byte b, Vec3l res) {
        return Glm.div(res, (Vec3l) this, b);
    }

    public Vec3l div(Vec3l b, Vec3l res) {
        return Glm.div(res, (Vec3l) this, b);
    }

    public Vec3l incr_() {
        return Glm.incr_((Vec3l) this);
    }

    public Vec3l incr() {
        return Glm.incr((Vec3l) this);
    }

    public Vec3l incr(Vec3l res) {
        return Glm.incr(res, (Vec3l) this);
    }

    public Vec3l decr_() {
        return Glm.decr_((Vec3l) this);
    }

    public Vec3l decr() {
        return Glm.decr((Vec3l) this);
    }

    public Vec3l decr(Vec3l res) {
        return Glm.decr(res, (Vec3l) this);
    }
}
