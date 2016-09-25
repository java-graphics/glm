/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.ul;

import glm.Glm;
import joou.ULong;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 3 * Long.BYTES;

    public ULong x = new ULong(), y = new ULong(), z = new ULong();

    public Vec3ul add_(byte b) {
        return Glm.add_((Vec3ul) this, b);
    }

    public Vec3ul add_(Vec3ul b) {
        return Glm.add_((Vec3ul) this, b);
    }

    public Vec3ul add(byte b) {
        return Glm.add((Vec3ul) this, (Vec3ul) this, b);
    }

    public Vec3ul add(Vec3ul b) {
        return Glm.add((Vec3ul) this, (Vec3ul) this, b);
    }

    public Vec3ul add(byte b, Vec3ul res) {
        return Glm.add(res, (Vec3ul) this, b);
    }

    public Vec3ul add(Vec3ul b, Vec3ul res) {
        return Glm.add(res, (Vec3ul) this, b);
    }

    public Vec3ul sub_(byte b) {
        return Glm.sub_((Vec3ul) this, b);
    }

    public Vec3ul sub_(Vec3ul b) {
        return Glm.sub_((Vec3ul) this, b);
    }

    public Vec3ul sub(byte b) {
        return Glm.sub((Vec3ul) this, (Vec3ul) this, b);
    }

    public Vec3ul sub(Vec3ul b) {
        return Glm.sub((Vec3ul) this, (Vec3ul) this, b);
    }

    public Vec3ul sub(byte b, Vec3ul res) {
        return Glm.sub(res, (Vec3ul) this, b);
    }

    public Vec3ul sub(Vec3ul b, Vec3ul res) {
        return Glm.sub(res, (Vec3ul) this, b);
    }

    public Vec3ul mul_(byte b) {
        return Glm.mul_((Vec3ul) this, b);
    }

    public Vec3ul mul_(Vec3ul b) {
        return Glm.mul_((Vec3ul) this, b);
    }

    public Vec3ul mul(byte b) {
        return Glm.mul((Vec3ul) this, (Vec3ul) this, b);
    }

    public Vec3ul mul(Vec3ul b) {
        return Glm.mul((Vec3ul) this, (Vec3ul) this, b);
    }

    public Vec3ul mul(byte b, Vec3ul res) {
        return Glm.mul(res, (Vec3ul) this, b);
    }

    public Vec3ul mul(Vec3ul b, Vec3ul res) {
        return Glm.mul(res, (Vec3ul) this, b);
    }

    public Vec3ul div_(byte b) {
        return Glm.div_((Vec3ul) this, b);
    }

    public Vec3ul div_(Vec3ul b) {
        return Glm.div_((Vec3ul) this, b);
    }

    public Vec3ul div(byte b) {
        return Glm.div((Vec3ul) this, (Vec3ul) this, b);
    }

    public Vec3ul div(Vec3ul b) {
        return Glm.div((Vec3ul) this, (Vec3ul) this, b);
    }

    public Vec3ul div(byte b, Vec3ul res) {
        return Glm.div(res, (Vec3ul) this, b);
    }

    public Vec3ul div(Vec3ul b, Vec3ul res) {
        return Glm.div(res, (Vec3ul) this, b);
    }

    public Vec3ul incr_() {
        return Glm.incr_((Vec3ul) this);
    }

    public Vec3ul incr() {
        return Glm.incr((Vec3ul) this);
    }

    public Vec3ul incr(Vec3ul res) {
        return Glm.incr(res, (Vec3ul) this);
    }

    public Vec3ul decr_() {
        return Glm.decr_((Vec3ul) this);
    }

    public Vec3ul decr() {
        return Glm.decr((Vec3ul) this);
    }

    public Vec3ul decr(Vec3ul res) {
        return Glm.decr(res, (Vec3ul) this);
    }
}
