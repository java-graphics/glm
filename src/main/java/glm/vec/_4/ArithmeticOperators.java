/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 4 * Float.BYTES;

    public float x, y, z, w;

    public Vec4 add_(float b) {
        return Glm.add(new Vec4(), (Vec4) this, b, b, b, b);
    }

    public Vec4 add_(float bX, float bY, float bZ, float bW) {
        return Glm.add(new Vec4(), (Vec4) this, bX, bY, bZ, bW);
    }

    public Vec4 add_(Vec4 b) {
        return Glm.add(new Vec4(), (Vec4) this, b.x, b.y, b.z, b.w);
    }

    public Vec4 add(float b) {
        return Glm.add((Vec4) this, (Vec4) this, b, b, b, b);
    }

    public Vec4 add(float bX, float bY, float bZ, float bW) {
        return Glm.add((Vec4) this, (Vec4) this, bX, bY, bZ, bW);
    }

    public Vec4 add(Vec4 b) {
        return Glm.add((Vec4) this, (Vec4) this, b.x, b.y, b.z, b.w);
    }

    public Vec4 add(float b, Vec4 res) {
        return Glm.add(res, (Vec4) this, b, b, b, b);
    }

    public Vec4 add(float bX, float bY, float bZ, float bW, Vec4 res) {
        return Glm.add(res, (Vec4) this, bX, bY, bZ, bW);
    }

    public Vec4 add(Vec4 b, Vec4 res) {
        return Glm.add(res, (Vec4) this, b.x, b.y, b.z, b.w);
    }

    public Vec4 sub_(float b) {
        return Glm.sub(new Vec4(), (Vec4) this, b, b, b, b);
    }

    public Vec4 sub_(float bX, float bY, float bZ, float bW) {
        return Glm.sub(new Vec4(), (Vec4) this, bX, bY, bZ, bW);
    }

    public Vec4 sub_(Vec4 b) {
        return Glm.sub(new Vec4(), (Vec4) this, b.x, b.y, b.z, b.w);
    }

    public Vec4 sub(float b) {
        return Glm.sub((Vec4) this, (Vec4) this, b, b, b, b);
    }

    public Vec4 sub(float bX, float bY, float bZ, float bW) {
        return Glm.sub((Vec4) this, (Vec4) this, bX, bY, bZ, bW);
    }

    public Vec4 sub(Vec4 b) {
        return Glm.sub((Vec4) this, (Vec4) this, b.x, b.y, b.z, b.w);
    }

    public Vec4 sub(float b, Vec4 res) {
        return Glm.sub(res, (Vec4) this, b, b, b, b);
    }

    public Vec4 sub(float bX, float bY, float bZ, float bW, Vec4 res) {
        return Glm.sub(res, (Vec4) this, bX, bY, bZ, bW);
    }

    public Vec4 sub(Vec4 b, Vec4 res) {
        return Glm.sub(res, (Vec4) this, b.x, b.y, b.z, b.w);
    }

    public Vec4 mul_(float b) {
        return Glm.mul(new Vec4(), (Vec4) this, b, b, b, b);
    }

    public Vec4 mul_(float bX, float bY, float bZ, float bW) {
        return Glm.mul(new Vec4(), (Vec4) this, bX, bY, bZ, bW);
    }

    public Vec4 mul_(Vec4 b) {
        return Glm.mul(new Vec4(), (Vec4) this, b.x, b.y, b.z, b.w);
    }

    public Vec4 mul(float b) {
        return Glm.mul((Vec4) this, (Vec4) this, b, b, b, b);
    }

    public Vec4 mul(float bX, float bY, float bZ, float bW) {
        return Glm.mul((Vec4) this, (Vec4) this, bX, bY, bZ, bW);
    }

    public Vec4 mul(Vec4 b) {
        return Glm.mul((Vec4) this, (Vec4) this, b.x, b.y, b.z, b.w);
    }

    public Vec4 mul(float b, Vec4 res) {
        return Glm.mul(res, (Vec4) this, b, b, b, b);
    }

    public Vec4 mul(float bX, float bY, float bZ, float bW, Vec4 res) {
        return Glm.mul(res, (Vec4) this, bX, bY, bZ, bW);
    }

    public Vec4 mul(Vec4 b, Vec4 res) {
        return Glm.mul(res, (Vec4) this, b.x, b.y, b.z, b.w);
    }

    public Vec4 div_(float b) {
        return Glm.div(new Vec4(), (Vec4) this, b, b, b, b);
    }

    public Vec4 div_(float bX, float bY, float bZ, float bW) {
        return Glm.div(new Vec4(), (Vec4) this, bX, bY, bZ, bW);
    }

    public Vec4 div_(Vec4 b) {
        return Glm.div(new Vec4(), (Vec4) this, b.x, b.y, b.z, b.w);
    }

    public Vec4 div(float b) {
        return Glm.div((Vec4) this, (Vec4) this, b, b, b, b);
    }

    public Vec4 div(float bX, float bY, float bZ, float bW) {
        return Glm.div((Vec4) this, (Vec4) this, bX, bY, bZ, bW);
    }

    public Vec4 div(Vec4 b) {
        return Glm.div((Vec4) this, (Vec4) this, b.x, b.y, b.z, b.w);
    }

    public Vec4 div(float b, Vec4 res) {
        return Glm.div(res, (Vec4) this, b, b, b, b);
    }

    public Vec4 div(float bX, float bY, float bZ, float bW, Vec4 res) {
        return Glm.div(res, (Vec4) this, bX, bY, bZ, bW);
    }

    public Vec4 div(Vec4 b, Vec4 res) {
        return Glm.div(res, (Vec4) this, b.x, b.y, b.z, b.w);
    }

    public Vec4 incr_() {
        return Glm.incr_((Vec4) this);
    }

    public Vec4 incr() {
        return Glm.incr((Vec4) this);
    }

    public Vec4 incr(Vec4 res) {
        return Glm.incr(res, (Vec4) this);
    }

    public Vec4 decr_() {
        return Glm.decr_((Vec4) this);
    }

    public Vec4 decr() {
        return Glm.decr((Vec4) this);
    }

    public Vec4 decr(Vec4 res) {
        return Glm.decr(res, (Vec4) this);
    }
}
