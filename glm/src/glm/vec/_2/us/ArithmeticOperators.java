/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.us;

import glm.Glm;
import joou.UShort;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 2 * Short.BYTES;

    public UShort x = new UShort(), y = new UShort();

    public Vec2us add_(byte b) {
        return Glm.add_((Vec2us) this, b);
    }

    public Vec2us add_(Vec2us b) {
        return Glm.add_((Vec2us) this, b);
    }

    public Vec2us add(byte b) {
        return Glm.add((Vec2us) this, (Vec2us) this, b);
    }

    public Vec2us add(Vec2us b) {
        return Glm.add((Vec2us) this, (Vec2us) this, b);
    }

    public Vec2us add(byte b, Vec2us res) {
        return Glm.add(res, (Vec2us) this, b);
    }

    public Vec2us add(Vec2us b, Vec2us res) {
        return Glm.add(res, (Vec2us) this, b);
    }

    public Vec2us sub_(byte b) {
        return Glm.sub_((Vec2us) this, b);
    }

    public Vec2us sub_(Vec2us b) {
        return Glm.sub_((Vec2us) this, b);
    }

    public Vec2us sub(byte b) {
        return Glm.sub((Vec2us) this, (Vec2us) this, b);
    }

    public Vec2us sub(Vec2us b) {
        return Glm.sub((Vec2us) this, (Vec2us) this, b);
    }

    public Vec2us sub(byte b, Vec2us res) {
        return Glm.sub(res, (Vec2us) this, b);
    }

    public Vec2us sub(Vec2us b, Vec2us res) {
        return Glm.sub(res, (Vec2us) this, b);
    }

    public Vec2us mul_(byte b) {
        return Glm.mul_((Vec2us) this, b);
    }

    public Vec2us mul_(Vec2us b) {
        return Glm.mul_((Vec2us) this, b);
    }

    public Vec2us mul(byte b) {
        return Glm.mul((Vec2us) this, (Vec2us) this, b);
    }

    public Vec2us mul(Vec2us b) {
        return Glm.mul((Vec2us) this, (Vec2us) this, b);
    }

    public Vec2us mul(byte b, Vec2us res) {
        return Glm.mul(res, (Vec2us) this, b);
    }

    public Vec2us mul(Vec2us b, Vec2us res) {
        return Glm.mul(res, (Vec2us) this, b);
    }

    public Vec2us div_(byte b) {
        return Glm.div_((Vec2us) this, b);
    }

    public Vec2us div_(Vec2us b) {
        return Glm.div_((Vec2us) this, b);
    }

    public Vec2us div(byte b) {
        return Glm.div((Vec2us) this, (Vec2us) this, b);
    }

    public Vec2us div(Vec2us b) {
        return Glm.div((Vec2us) this, (Vec2us) this, b);
    }

    public Vec2us div(byte b, Vec2us res) {
        return Glm.div(res, (Vec2us) this, b);
    }

    public Vec2us div(Vec2us b, Vec2us res) {
        return Glm.div(res, (Vec2us) this, b);
    }

    public Vec2us incr_() {
        return Glm.incr_((Vec2us) this);
    }

    public Vec2us incr() {
        return Glm.incr((Vec2us) this);
    }

    public Vec2us incr(Vec2us res) {
        return Glm.incr(res, (Vec2us) this);
    }

    public Vec2us decr_() {
        return Glm.decr_((Vec2us) this);
    }

    public Vec2us decr() {
        return Glm.decr((Vec2us) this);
    }

    public Vec2us decr(Vec2us res) {
        return Glm.decr(res, (Vec2us) this);
    }
}
