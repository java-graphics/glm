/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.d;

import glm.Glm;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public final static int SIZE = 2 * Double.BYTES;

    public double x, y;

    public Vec2d add_(byte b) {
        return Glm.add_((Vec2d) this, b);
    }

    public Vec2d add_(Vec2d b) {
        return Glm.add_((Vec2d) this, b);
    }

    public Vec2d add(byte b) {
        return Glm.add((Vec2d) this, (Vec2d) this, b);
    }

    public Vec2d add(Vec2d b) {
        return Glm.add((Vec2d) this, (Vec2d) this, b);
    }

    public Vec2d add(byte b, Vec2d res) {
        return Glm.add(res, (Vec2d) this, b);
    }

    public Vec2d add(Vec2d b, Vec2d res) {
        return Glm.add(res, (Vec2d) this, b);
    }

    public Vec2d sub_(byte b) {
        return Glm.sub_((Vec2d) this, b);
    }

    public Vec2d sub_(Vec2d b) {
        return Glm.sub_((Vec2d) this, b);
    }

    public Vec2d sub(byte b) {
        return Glm.sub((Vec2d) this, (Vec2d) this, b);
    }

    public Vec2d sub(Vec2d b) {
        return Glm.sub((Vec2d) this, (Vec2d) this, b);
    }

    public Vec2d sub(byte b, Vec2d res) {
        return Glm.sub(res, (Vec2d) this, b);
    }

    public Vec2d sub(Vec2d b, Vec2d res) {
        return Glm.sub(res, (Vec2d) this, b);
    }

    public Vec2d mul_(byte b) {
        return Glm.mul_((Vec2d) this, b);
    }

    public Vec2d mul_(Vec2d b) {
        return Glm.mul_((Vec2d) this, b);
    }

    public Vec2d mul(byte b) {
        return Glm.mul((Vec2d) this, (Vec2d) this, b);
    }

    public Vec2d mul(Vec2d b) {
        return Glm.mul((Vec2d) this, (Vec2d) this, b);
    }

    public Vec2d mul(byte b, Vec2d res) {
        return Glm.mul(res, (Vec2d) this, b);
    }

    public Vec2d mul(Vec2d b, Vec2d res) {
        return Glm.mul(res, (Vec2d) this, b);
    }

    public Vec2d div_(byte b) {
        return Glm.div_((Vec2d) this, b);
    }

    public Vec2d div_(Vec2d b) {
        return Glm.div_((Vec2d) this, b);
    }

    public Vec2d div(byte b) {
        return Glm.div((Vec2d) this, (Vec2d) this, b);
    }

    public Vec2d div(Vec2d b) {
        return Glm.div((Vec2d) this, (Vec2d) this, b);
    }

    public Vec2d div(byte b, Vec2d res) {
        return Glm.div(res, (Vec2d) this, b);
    }

    public Vec2d div(Vec2d b, Vec2d res) {
        return Glm.div(res, (Vec2d) this, b);
    }

    public Vec2d incr_() {
        return Glm.incr_((Vec2d) this);
    }

    public Vec2d incr() {
        return Glm.incr((Vec2d) this);
    }

    public Vec2d incr(Vec2d res) {
        return Glm.incr(res, (Vec2d) this);
    }

    public Vec2d decr_() {
        return Glm.decr_((Vec2d) this);
    }

    public Vec2d decr() {
        return Glm.decr((Vec2d) this);
    }

    public Vec2d decr(Vec2d res) {
        return Glm.decr(res, (Vec2d) this);
    }
}