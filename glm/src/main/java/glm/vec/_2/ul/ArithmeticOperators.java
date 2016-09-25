/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.ul;

import glm.Glm;
import joou.ULong;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 2 * Long.BYTES;

    public ULong x = new ULong(), y = new ULong();

    public Vec2ul add_(byte b) {
        return Glm.add_((Vec2ul) this, b);
    }

    public Vec2ul add_(Vec2ul b) {
        return Glm.add_((Vec2ul) this, b);
    }

    public Vec2ul add(byte b) {
        return Glm.add((Vec2ul) this, (Vec2ul) this, b);
    }

    public Vec2ul add(Vec2ul b) {
        return Glm.add((Vec2ul) this, (Vec2ul) this, b);
    }

    public Vec2ul add(byte b, Vec2ul res) {
        return Glm.add(res, (Vec2ul) this, b);
    }

    public Vec2ul add(Vec2ul b, Vec2ul res) {
        return Glm.add(res, (Vec2ul) this, b);
    }

    public Vec2ul sub_(byte b) {
        return Glm.sub_((Vec2ul) this, b);
    }

    public Vec2ul sub_(Vec2ul b) {
        return Glm.sub_((Vec2ul) this, b);
    }

    public Vec2ul sub(byte b) {
        return Glm.sub((Vec2ul) this, (Vec2ul) this, b);
    }

    public Vec2ul sub(Vec2ul b) {
        return Glm.sub((Vec2ul) this, (Vec2ul) this, b);
    }

    public Vec2ul sub(byte b, Vec2ul res) {
        return Glm.sub(res, (Vec2ul) this, b);
    }

    public Vec2ul sub(Vec2ul b, Vec2ul res) {
        return Glm.sub(res, (Vec2ul) this, b);
    }

    public Vec2ul mul_(byte b) {
        return Glm.mul_((Vec2ul) this, b);
    }

    public Vec2ul mul_(Vec2ul b) {
        return Glm.mul_((Vec2ul) this, b);
    }

    public Vec2ul mul(byte b) {
        return Glm.mul((Vec2ul) this, (Vec2ul) this, b);
    }

    public Vec2ul mul(Vec2ul b) {
        return Glm.mul((Vec2ul) this, (Vec2ul) this, b);
    }

    public Vec2ul mul(byte b, Vec2ul res) {
        return Glm.mul(res, (Vec2ul) this, b);
    }

    public Vec2ul mul(Vec2ul b, Vec2ul res) {
        return Glm.mul(res, (Vec2ul) this, b);
    }

    public Vec2ul div_(byte b) {
        return Glm.div_((Vec2ul) this, b);
    }

    public Vec2ul div_(Vec2ul b) {
        return Glm.div_((Vec2ul) this, b);
    }

    public Vec2ul div(byte b) {
        return Glm.div((Vec2ul) this, (Vec2ul) this, b);
    }

    public Vec2ul div(Vec2ul b) {
        return Glm.div((Vec2ul) this, (Vec2ul) this, b);
    }

    public Vec2ul div(byte b, Vec2ul res) {
        return Glm.div(res, (Vec2ul) this, b);
    }

    public Vec2ul div(Vec2ul b, Vec2ul res) {
        return Glm.div(res, (Vec2ul) this, b);
    }

    public Vec2ul incr_() {
        return Glm.incr_((Vec2ul) this);
    }

    public Vec2ul incr() {
        return Glm.incr((Vec2ul) this);
    }

    public Vec2ul incr(Vec2ul res) {
        return Glm.incr(res, (Vec2ul) this);
    }

    public Vec2ul decr_() {
        return Glm.decr_((Vec2ul) this);
    }

    public Vec2ul decr() {
        return Glm.decr((Vec2ul) this);
    }

    public Vec2ul decr(Vec2ul res) {
        return Glm.decr(res, (Vec2ul) this);
    }
}
