/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.ui;

import glm.Glm;
import joou.UInt;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 3 * Integer.BYTES;

    public UInt x = new UInt(), y = new UInt(), z = new UInt();

    public Vec3ui add_(byte b) {
        return Glm.add_((Vec3ui) this, b);
    }

    public Vec3ui add_(Vec3ui b) {
        return Glm.add_((Vec3ui) this, b);
    }

    public Vec3ui add(byte b) {
        return Glm.add((Vec3ui) this, (Vec3ui) this, b);
    }

    public Vec3ui add(Vec3ui b) {
        return Glm.add((Vec3ui) this, (Vec3ui) this, b);
    }

    public Vec3ui add(byte b, Vec3ui res) {
        return Glm.add(res, (Vec3ui) this, b);
    }

    public Vec3ui add(Vec3ui b, Vec3ui res) {
        return Glm.add(res, (Vec3ui) this, b);
    }

    public Vec3ui sub_(byte b) {
        return Glm.sub_((Vec3ui) this, b);
    }

    public Vec3ui sub_(Vec3ui b) {
        return Glm.sub_((Vec3ui) this, b);
    }

    public Vec3ui sub(byte b) {
        return Glm.sub((Vec3ui) this, (Vec3ui) this, b);
    }

    public Vec3ui sub(Vec3ui b) {
        return Glm.sub((Vec3ui) this, (Vec3ui) this, b);
    }

    public Vec3ui sub(byte b, Vec3ui res) {
        return Glm.sub(res, (Vec3ui) this, b);
    }

    public Vec3ui sub(Vec3ui b, Vec3ui res) {
        return Glm.sub(res, (Vec3ui) this, b);
    }

    public Vec3ui mul_(byte b) {
        return Glm.mul_((Vec3ui) this, b);
    }

    public Vec3ui mul_(Vec3ui b) {
        return Glm.mul_((Vec3ui) this, b);
    }

    public Vec3ui mul(byte b) {
        return Glm.mul((Vec3ui) this, (Vec3ui) this, b);
    }

    public Vec3ui mul(Vec3ui b) {
        return Glm.mul((Vec3ui) this, (Vec3ui) this, b);
    }

    public Vec3ui mul(byte b, Vec3ui res) {
        return Glm.mul(res, (Vec3ui) this, b);
    }

    public Vec3ui mul(Vec3ui b, Vec3ui res) {
        return Glm.mul(res, (Vec3ui) this, b);
    }

    public Vec3ui div_(byte b) {
        return Glm.div_((Vec3ui) this, b);
    }

    public Vec3ui div_(Vec3ui b) {
        return Glm.div_((Vec3ui) this, b);
    }

    public Vec3ui div(byte b) {
        return Glm.div((Vec3ui) this, (Vec3ui) this, b);
    }

    public Vec3ui div(Vec3ui b) {
        return Glm.div((Vec3ui) this, (Vec3ui) this, b);
    }

    public Vec3ui div(byte b, Vec3ui res) {
        return Glm.div(res, (Vec3ui) this, b);
    }

    public Vec3ui div(Vec3ui b, Vec3ui res) {
        return Glm.div(res, (Vec3ui) this, b);
    }

    public Vec3ui incr_() {
        return Glm.incr_((Vec3ui) this);
    }

    public Vec3ui incr() {
        return Glm.incr((Vec3ui) this);
    }

    public Vec3ui incr(Vec3ui res) {
        return Glm.incr(res, (Vec3ui) this);
    }

    public Vec3ui decr_() {
        return Glm.decr_((Vec3ui) this);
    }

    public Vec3ui decr() {
        return Glm.decr((Vec3ui) this);
    }

    public Vec3ui decr(Vec3ui res) {
        return Glm.decr(res, (Vec3ui) this);
    }
}
