/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.ui;

import glm.Glm;
import joou.UInt;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 2 * Integer.BYTES;

    public UInt x = new UInt(), y = new UInt();

    public Vec2ui add_(byte b) {
        return Glm.add_((Vec2ui) this, b);
    }

    public Vec2ui add_(Vec2ui b) {
        return Glm.add_((Vec2ui) this, b);
    }

    public Vec2ui add(byte b) {
        return Glm.add((Vec2ui) this, (Vec2ui) this, b);
    }

    public Vec2ui add(Vec2ui b) {
        return Glm.add((Vec2ui) this, (Vec2ui) this, b);
    }

    public Vec2ui add(byte b, Vec2ui res) {
        return Glm.add(res, (Vec2ui) this, b);
    }

    public Vec2ui add(Vec2ui b, Vec2ui res) {
        return Glm.add(res, (Vec2ui) this, b);
    }

    public Vec2ui sub_(byte b) {
        return Glm.sub_((Vec2ui) this, b);
    }

    public Vec2ui sub_(Vec2ui b) {
        return Glm.sub_((Vec2ui) this, b);
    }

    public Vec2ui sub(byte b) {
        return Glm.sub((Vec2ui) this, (Vec2ui) this, b);
    }

    public Vec2ui sub(Vec2ui b) {
        return Glm.sub((Vec2ui) this, (Vec2ui) this, b);
    }

    public Vec2ui sub(byte b, Vec2ui res) {
        return Glm.sub(res, (Vec2ui) this, b);
    }

    public Vec2ui sub(Vec2ui b, Vec2ui res) {
        return Glm.sub(res, (Vec2ui) this, b);
    }

    public Vec2ui mul_(byte b) {
        return Glm.mul_((Vec2ui) this, b);
    }

    public Vec2ui mul_(Vec2ui b) {
        return Glm.mul_((Vec2ui) this, b);
    }

    public Vec2ui mul(byte b) {
        return Glm.mul((Vec2ui) this, (Vec2ui) this, b);
    }

    public Vec2ui mul(Vec2ui b) {
        return Glm.mul((Vec2ui) this, (Vec2ui) this, b);
    }

    public Vec2ui mul(byte b, Vec2ui res) {
        return Glm.mul(res, (Vec2ui) this, b);
    }

    public Vec2ui mul(Vec2ui b, Vec2ui res) {
        return Glm.mul(res, (Vec2ui) this, b);
    }

    public Vec2ui div_(byte b) {
        return Glm.div_((Vec2ui) this, b);
    }

    public Vec2ui div_(Vec2ui b) {
        return Glm.div_((Vec2ui) this, b);
    }

    public Vec2ui div(byte b) {
        return Glm.div((Vec2ui) this, (Vec2ui) this, b);
    }

    public Vec2ui div(Vec2ui b) {
        return Glm.div((Vec2ui) this, (Vec2ui) this, b);
    }

    public Vec2ui div(byte b, Vec2ui res) {
        return Glm.div(res, (Vec2ui) this, b);
    }

    public Vec2ui div(Vec2ui b, Vec2ui res) {
        return Glm.div(res, (Vec2ui) this, b);
    }

    public Vec2ui incr_() {
        return Glm.incr_((Vec2ui) this);
    }

    public Vec2ui incr() {
        return Glm.incr((Vec2ui) this);
    }

    public Vec2ui incr(Vec2ui res) {
        return Glm.incr(res, (Vec2ui) this);
    }

    public Vec2ui decr_() {
        return Glm.decr_((Vec2ui) this);
    }

    public Vec2ui decr() {
        return Glm.decr((Vec2ui) this);
    }

    public Vec2ui decr(Vec2ui res) {
        return Glm.decr(res, (Vec2ui) this);
    }
}
