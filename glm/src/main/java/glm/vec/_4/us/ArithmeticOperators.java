/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.us;

import glm.Glm;
import joou.UShort;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 4 * Short.BYTES;

    public UShort x = new UShort(), y = new UShort(), z = new UShort(), w = new UShort();

    public Vec4us add_(byte b) {
        return Glm.add_((Vec4us) this, b);
    }

    public Vec4us add_(Vec4us b) {
        return Glm.add_((Vec4us) this, b);
    }

    public Vec4us add(byte b) {
        return Glm.add((Vec4us) this, (Vec4us) this, b);
    }

    public Vec4us add(Vec4us b) {
        return Glm.add((Vec4us) this, (Vec4us) this, b);
    }

    public Vec4us add(byte b, Vec4us res) {
        return Glm.add(res, (Vec4us) this, b);
    }

    public Vec4us add(Vec4us b, Vec4us res) {
        return Glm.add(res, (Vec4us) this, b);
    }

    public Vec4us sub_(byte b) {
        return Glm.sub_((Vec4us) this, b);
    }

    public Vec4us sub_(Vec4us b) {
        return Glm.sub_((Vec4us) this, b);
    }

    public Vec4us sub(byte b) {
        return Glm.sub((Vec4us) this, (Vec4us) this, b);
    }

    public Vec4us sub(Vec4us b) {
        return Glm.sub((Vec4us) this, (Vec4us) this, b);
    }

    public Vec4us sub(byte b, Vec4us res) {
        return Glm.sub(res, (Vec4us) this, b);
    }

    public Vec4us sub(Vec4us b, Vec4us res) {
        return Glm.sub(res, (Vec4us) this, b);
    }

    public Vec4us mul_(byte b) {
        return Glm.mul_((Vec4us) this, b);
    }

    public Vec4us mul_(Vec4us b) {
        return Glm.mul_((Vec4us) this, b);
    }

    public Vec4us mul(byte b) {
        return Glm.mul((Vec4us) this, (Vec4us) this, b);
    }

    public Vec4us mul(Vec4us b) {
        return Glm.mul((Vec4us) this, (Vec4us) this, b);
    }

    public Vec4us mul(byte b, Vec4us res) {
        return Glm.mul(res, (Vec4us) this, b);
    }

    public Vec4us mul(Vec4us b, Vec4us res) {
        return Glm.mul(res, (Vec4us) this, b);
    }

    public Vec4us div_(byte b) {
        return Glm.div_((Vec4us) this, b);
    }

    public Vec4us div_(Vec4us b) {
        return Glm.div_((Vec4us) this, b);
    }

    public Vec4us div(byte b) {
        return Glm.div((Vec4us) this, (Vec4us) this, b);
    }

    public Vec4us div(Vec4us b) {
        return Glm.div((Vec4us) this, (Vec4us) this, b);
    }

    public Vec4us div(byte b, Vec4us res) {
        return Glm.div(res, (Vec4us) this, b);
    }

    public Vec4us div(Vec4us b, Vec4us res) {
        return Glm.div(res, (Vec4us) this, b);
    }

    public Vec4us incr_() {
        return Glm.incr_((Vec4us) this);
    }

    public Vec4us incr() {
        return Glm.incr((Vec4us) this);
    }

    public Vec4us incr(Vec4us res) {
        return Glm.incr(res, (Vec4us) this);
    }

    public Vec4us decr_() {
        return Glm.decr_((Vec4us) this);
    }

    public Vec4us decr() {
        return Glm.decr((Vec4us) this);
    }

    public Vec4us decr(Vec4us res) {
        return Glm.decr(res, (Vec4us) this);
    }
}
