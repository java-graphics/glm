/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.d;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 4 * Double.BYTES;

    public double x, y, z, w;

    public Vec4d add_(byte b) {
        return Glm.add_((Vec4d) this, b);
    }

    public Vec4d add_(Vec4d b) {
        return Glm.add_((Vec4d) this, b);
    }

    public Vec4d add(byte b) {
        return Glm.add((Vec4d) this, (Vec4d) this, b);
    }

    public Vec4d add(Vec4d b) {
        return Glm.add((Vec4d) this, (Vec4d) this, b);
    }

    public Vec4d add(byte b, Vec4d res) {
        return Glm.add(res, (Vec4d) this, b);
    }

    public Vec4d add(Vec4d b, Vec4d res) {
        return Glm.add(res, (Vec4d) this, b);
    }

    public Vec4d sub_(byte b) {
        return Glm.sub_((Vec4d) this, b);
    }

    public Vec4d sub_(Vec4d b) {
        return Glm.sub_((Vec4d) this, b);
    }

    public Vec4d sub(byte b) {
        return Glm.sub((Vec4d) this, (Vec4d) this, b);
    }

    public Vec4d sub(Vec4d b) {
        return Glm.sub((Vec4d) this, (Vec4d) this, b);
    }

    public Vec4d sub(byte b, Vec4d res) {
        return Glm.sub(res, (Vec4d) this, b);
    }

    public Vec4d sub(Vec4d b, Vec4d res) {
        return Glm.sub(res, (Vec4d) this, b);
    }

    public Vec4d mul_(byte b) {
        return Glm.mul_((Vec4d) this, b);
    }

    public Vec4d mul_(Vec4d b) {
        return Glm.mul_((Vec4d) this, b);
    }

    public Vec4d mul(byte b) {
        return Glm.mul((Vec4d) this, (Vec4d) this, b);
    }

    public Vec4d mul(Vec4d b) {
        return Glm.mul((Vec4d) this, (Vec4d) this, b);
    }

    public Vec4d mul(byte b, Vec4d res) {
        return Glm.mul(res, (Vec4d) this, b);
    }

    public Vec4d mul(Vec4d b, Vec4d res) {
        return Glm.mul(res, (Vec4d) this, b);
    }

    public Vec4d div_(byte b) {
        return Glm.div_((Vec4d) this, b);
    }

    public Vec4d div_(Vec4d b) {
        return Glm.div_((Vec4d) this, b);
    }

    public Vec4d div(byte b) {
        return Glm.div((Vec4d) this, (Vec4d) this, b);
    }

    public Vec4d div(Vec4d b) {
        return Glm.div((Vec4d) this, (Vec4d) this, b);
    }

    public Vec4d div(byte b, Vec4d res) {
        return Glm.div(res, (Vec4d) this, b);
    }

    public Vec4d div(Vec4d b, Vec4d res) {
        return Glm.div(res, (Vec4d) this, b);
    }

    public Vec4d incr_() {
        return Glm.incr_((Vec4d) this);
    }

    public Vec4d incr() {
        return Glm.incr((Vec4d) this);
    }

    public Vec4d incr(Vec4d res) {
        return Glm.incr(res, (Vec4d) this);
    }

    public Vec4d decr_() {
        return Glm.decr_((Vec4d) this);
    }

    public Vec4d decr() {
        return Glm.decr((Vec4d) this);
    }

    public Vec4d decr(Vec4d res) {
        return Glm.decr(res, (Vec4d) this);
    }
}
