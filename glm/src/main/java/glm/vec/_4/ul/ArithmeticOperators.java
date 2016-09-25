/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.ul;

import glm.Glm;
import joou.ULong;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {
    
    public static final int SIZE = 4 * Long.BYTES;

    public ULong x = new ULong(), y = new ULong(), z = new ULong(), w = new ULong();
    
    public Vec4ul add_(byte b) {
        return Glm.add_((Vec4ul) this, b);
    }

    public Vec4ul add_(Vec4ul b) {
        return Glm.add_((Vec4ul) this, b);
    }

    public Vec4ul add(byte b) {
        return Glm.add((Vec4ul) this, (Vec4ul) this, b);
    }

    public Vec4ul add(Vec4ul b) {
        return Glm.add((Vec4ul) this, (Vec4ul) this, b);
    }

    public Vec4ul add(byte b, Vec4ul res) {
        return Glm.add(res, (Vec4ul) this, b);
    }

    public Vec4ul add(Vec4ul b, Vec4ul res) {
        return Glm.add(res, (Vec4ul) this, b);
    }

    public Vec4ul sub_(byte b) {
        return Glm.sub_((Vec4ul) this, b);
    }

    public Vec4ul sub_(Vec4ul b) {
        return Glm.sub_((Vec4ul) this, b);
    }

    public Vec4ul sub(byte b) {
        return Glm.sub((Vec4ul) this, (Vec4ul) this, b);
    }

    public Vec4ul sub(Vec4ul b) {
        return Glm.sub((Vec4ul) this, (Vec4ul) this, b);
    }

    public Vec4ul sub(byte b, Vec4ul res) {
        return Glm.sub(res, (Vec4ul) this, b);
    }

    public Vec4ul sub(Vec4ul b, Vec4ul res) {
        return Glm.sub(res, (Vec4ul) this, b);
    }

    public Vec4ul mul_(byte b) {
        return Glm.mul_((Vec4ul) this, b);
    }

    public Vec4ul mul_(Vec4ul b) {
        return Glm.mul_((Vec4ul) this, b);
    }

    public Vec4ul mul(byte b) {
        return Glm.mul((Vec4ul) this, (Vec4ul) this, b);
    }

    public Vec4ul mul(Vec4ul b) {
        return Glm.mul((Vec4ul) this, (Vec4ul) this, b);
    }

    public Vec4ul mul(byte b, Vec4ul res) {
        return Glm.mul(res, (Vec4ul) this, b);
    }

    public Vec4ul mul(Vec4ul b, Vec4ul res) {
        return Glm.mul(res, (Vec4ul) this, b);
    }

    public Vec4ul div_(byte b) {
        return Glm.div_((Vec4ul) this, b);
    }

    public Vec4ul div_(Vec4ul b) {
        return Glm.div_((Vec4ul) this, b);
    }

    public Vec4ul div(byte b) {
        return Glm.div((Vec4ul) this, (Vec4ul) this, b);
    }

    public Vec4ul div(Vec4ul b) {
        return Glm.div((Vec4ul) this, (Vec4ul) this, b);
    }

    public Vec4ul div(byte b, Vec4ul res) {
        return Glm.div(res, (Vec4ul) this, b);
    }

    public Vec4ul div(Vec4ul b, Vec4ul res) {
        return Glm.div(res, (Vec4ul) this, b);
    }

    public Vec4ul incr_() {
        return Glm.incr_((Vec4ul) this);
    }

    public Vec4ul incr() {
        return Glm.incr((Vec4ul) this);
    }

    public Vec4ul incr(Vec4ul res) {
        return Glm.incr(res, (Vec4ul) this);
    }

    public Vec4ul decr_() {
        return Glm.decr_((Vec4ul) this);
    }

    public Vec4ul decr() {
        return Glm.decr((Vec4ul) this);
    }

    public Vec4ul decr(Vec4ul res) {
        return Glm.decr(res, (Vec4ul) this);
    }
}
