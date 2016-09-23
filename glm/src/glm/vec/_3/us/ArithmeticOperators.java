/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.us;

import glm.Glm;
import joou.UShort;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 3 * Short.BYTES;

    public UShort x = new UShort(), y = new UShort(), z = new UShort();

    public Vec3us add_(byte b) {
        return Glm.add_((Vec3us) this, b);
    }

    public Vec3us add_(Vec3us b) {
        return Glm.add_((Vec3us) this, b);
    }

    public Vec3us add(byte b) {
        return Glm.add((Vec3us) this, (Vec3us) this, b);
    }

    public Vec3us add(Vec3us b) {
        return Glm.add((Vec3us) this, (Vec3us) this, b);
    }

    public Vec3us add(byte b, Vec3us res) {
        return Glm.add(res, (Vec3us) this, b);
    }

    public Vec3us add(Vec3us b, Vec3us res) {
        return Glm.add(res, (Vec3us) this, b);
    }

    public Vec3us sub_(byte b) {
        return Glm.sub_((Vec3us) this, b);
    }

    public Vec3us sub_(Vec3us b) {
        return Glm.sub_((Vec3us) this, b);
    }

    public Vec3us sub(byte b) {
        return Glm.sub((Vec3us) this, (Vec3us) this, b);
    }

    public Vec3us sub(Vec3us b) {
        return Glm.sub((Vec3us) this, (Vec3us) this, b);
    }

    public Vec3us sub(byte b, Vec3us res) {
        return Glm.sub(res, (Vec3us) this, b);
    }

    public Vec3us sub(Vec3us b, Vec3us res) {
        return Glm.sub(res, (Vec3us) this, b);
    }

    public Vec3us mul_(byte b) {
        return Glm.mul_((Vec3us) this, b);
    }

    public Vec3us mul_(Vec3us b) {
        return Glm.mul_((Vec3us) this, b);
    }

    public Vec3us mul(byte b) {
        return Glm.mul((Vec3us) this, (Vec3us) this, b);
    }

    public Vec3us mul(Vec3us b) {
        return Glm.mul((Vec3us) this, (Vec3us) this, b);
    }

    public Vec3us mul(byte b, Vec3us res) {
        return Glm.mul(res, (Vec3us) this, b);
    }

    public Vec3us mul(Vec3us b, Vec3us res) {
        return Glm.mul(res, (Vec3us) this, b);
    }

    public Vec3us div_(byte b) {
        return Glm.div_((Vec3us) this, b);
    }

    public Vec3us div_(Vec3us b) {
        return Glm.div_((Vec3us) this, b);
    }

    public Vec3us div(byte b) {
        return Glm.div((Vec3us) this, (Vec3us) this, b);
    }

    public Vec3us div(Vec3us b) {
        return Glm.div((Vec3us) this, (Vec3us) this, b);
    }

    public Vec3us div(byte b, Vec3us res) {
        return Glm.div(res, (Vec3us) this, b);
    }

    public Vec3us div(Vec3us b, Vec3us res) {
        return Glm.div(res, (Vec3us) this, b);
    }

    public Vec3us incr_() {
        return Glm.incr_((Vec3us) this);
    }

    public Vec3us incr() {
        return Glm.incr((Vec3us) this);
    }

    public Vec3us incr(Vec3us res) {
        return Glm.incr(res, (Vec3us) this);
    }

    public Vec3us decr_() {
        return Glm.decr_((Vec3us) this);
    }

    public Vec3us decr() {
        return Glm.decr((Vec3us) this);
    }

    public Vec3us decr(Vec3us res) {
        return Glm.decr(res, (Vec3us) this);
    }
}
