/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.d;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public final static int SIZE = 3 * Double.BYTES;

    public double x, y, z;

    public Vec3d add_(byte b) {
        return Glm.add_((Vec3d) this, b);
    }

    public Vec3d add_(Vec3d b) {
        return Glm.add_((Vec3d) this, b);
    }

    public Vec3d add(byte b) {
        return Glm.add((Vec3d) this, (Vec3d) this, b);
    }

    public Vec3d add(Vec3d b) {
        return Glm.add((Vec3d) this, (Vec3d) this, b);
    }

    public Vec3d add(byte b, Vec3d res) {
        return Glm.add(res, (Vec3d) this, b);
    }

    public Vec3d add(Vec3d b, Vec3d res) {
        return Glm.add(res, (Vec3d) this, b);
    }

    public Vec3d sub_(byte b) {
        return Glm.sub_((Vec3d) this, b);
    }

    public Vec3d sub_(Vec3d b) {
        return Glm.sub_((Vec3d) this, b);
    }

    public Vec3d sub(byte b) {
        return Glm.sub((Vec3d) this, (Vec3d) this, b);
    }

    public Vec3d sub(Vec3d b) {
        return Glm.sub((Vec3d) this, (Vec3d) this, b);
    }

    public Vec3d sub(byte b, Vec3d res) {
        return Glm.sub(res, (Vec3d) this, b);
    }

    public Vec3d sub(Vec3d b, Vec3d res) {
        return Glm.sub(res, (Vec3d) this, b);
    }

    public Vec3d mul_(byte b) {
        return Glm.mul_((Vec3d) this, b);
    }

    public Vec3d mul_(Vec3d b) {
        return Glm.mul_((Vec3d) this, b);
    }

    public Vec3d mul(byte b) {
        return Glm.mul((Vec3d) this, (Vec3d) this, b);
    }

    public Vec3d mul(Vec3d b) {
        return Glm.mul((Vec3d) this, (Vec3d) this, b);
    }

    public Vec3d mul(byte b, Vec3d res) {
        return Glm.mul(res, (Vec3d) this, b);
    }

    public Vec3d mul(Vec3d b, Vec3d res) {
        return Glm.mul(res, (Vec3d) this, b);
    }

    public Vec3d div_(byte b) {
        return Glm.div_((Vec3d) this, b);
    }

    public Vec3d div_(Vec3d b) {
        return Glm.div_((Vec3d) this, b);
    }

    public Vec3d div(byte b) {
        return Glm.div((Vec3d) this, (Vec3d) this, b);
    }

    public Vec3d div(Vec3d b) {
        return Glm.div((Vec3d) this, (Vec3d) this, b);
    }

    public Vec3d div(byte b, Vec3d res) {
        return Glm.div(res, (Vec3d) this, b);
    }

    public Vec3d div(Vec3d b, Vec3d res) {
        return Glm.div(res, (Vec3d) this, b);
    }

    public Vec3d incr_() {
        return Glm.incr_((Vec3d) this);
    }

    public Vec3d incr() {
        return Glm.incr((Vec3d) this);
    }

    public Vec3d incr(Vec3d res) {
        return Glm.incr(res, (Vec3d) this);
    }

    public Vec3d decr_() {
        return Glm.decr_((Vec3d) this);
    }

    public Vec3d decr() {
        return Glm.decr((Vec3d) this);
    }

    public Vec3d decr(Vec3d res) {
        return Glm.decr(res, (Vec3d) this);
    }
}
