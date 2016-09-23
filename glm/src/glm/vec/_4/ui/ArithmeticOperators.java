/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.ui;

import glm.Glm;
import joou.UInt;

/**
 *
 * @author GBarbieri
 */
public class ArithmeticOperators {

    public static final int SIZE = 4 * Integer.BYTES;

    public UInt x = new UInt(), y = new UInt(), z = new UInt(), w = new UInt();

    public Vec4ui add_(byte b) {
        return Glm.add_((Vec4ui) this, b);
    }

    public Vec4ui add_(Vec4ui b) {
        return Glm.add_((Vec4ui) this, b);
    }

    public Vec4ui add(byte b) {
        return Glm.add((Vec4ui) this, (Vec4ui) this, b);
    }

    public Vec4ui add(Vec4ui b) {
        return Glm.add((Vec4ui) this, (Vec4ui) this, b);
    }

    public Vec4ui add(byte b, Vec4ui res) {
        return Glm.add(res, (Vec4ui) this, b);
    }

    public Vec4ui add(Vec4ui b, Vec4ui res) {
        return Glm.add(res, (Vec4ui) this, b);
    }

    public Vec4ui sub_(byte b) {
        return Glm.sub_((Vec4ui) this, b);
    }

    public Vec4ui sub_(Vec4ui b) {
        return Glm.sub_((Vec4ui) this, b);
    }

    public Vec4ui sub(byte b) {
        return Glm.sub((Vec4ui) this, (Vec4ui) this, b);
    }

    public Vec4ui sub(Vec4ui b) {
        return Glm.sub((Vec4ui) this, (Vec4ui) this, b);
    }

    public Vec4ui sub(byte b, Vec4ui res) {
        return Glm.sub(res, (Vec4ui) this, b);
    }

    public Vec4ui sub(Vec4ui b, Vec4ui res) {
        return Glm.sub(res, (Vec4ui) this, b);
    }

    public Vec4ui mul_(byte b) {
        return Glm.mul_((Vec4ui) this, b);
    }

    public Vec4ui mul_(Vec4ui b) {
        return Glm.mul_((Vec4ui) this, b);
    }

    public Vec4ui mul(byte b) {
        return Glm.mul((Vec4ui) this, (Vec4ui) this, b);
    }

    public Vec4ui mul(Vec4ui b) {
        return Glm.mul((Vec4ui) this, (Vec4ui) this, b);
    }

    public Vec4ui mul(byte b, Vec4ui res) {
        return Glm.mul(res, (Vec4ui) this, b);
    }

    public Vec4ui mul(Vec4ui b, Vec4ui res) {
        return Glm.mul(res, (Vec4ui) this, b);
    }

    public Vec4ui div_(byte b) {
        return Glm.div_((Vec4ui) this, b);
    }

    public Vec4ui div_(Vec4ui b) {
        return Glm.div_((Vec4ui) this, b);
    }

    public Vec4ui div(byte b) {
        return Glm.div((Vec4ui) this, (Vec4ui) this, b);
    }

    public Vec4ui div(Vec4ui b) {
        return Glm.div((Vec4ui) this, (Vec4ui) this, b);
    }

    public Vec4ui div(byte b, Vec4ui res) {
        return Glm.div(res, (Vec4ui) this, b);
    }

    public Vec4ui div(Vec4ui b, Vec4ui res) {
        return Glm.div(res, (Vec4ui) this, b);
    }

    public Vec4ui incr_() {
        return Glm.incr_((Vec4ui) this);
    }

    public Vec4ui incr() {
        return Glm.incr((Vec4ui) this);
    }

    public Vec4ui incr(Vec4ui res) {
        return Glm.incr(res, (Vec4ui) this);
    }

    public Vec4ui decr_() {
        return Glm.decr_((Vec4ui) this);
    }

    public Vec4ui decr() {
        return Glm.decr((Vec4ui) this);
    }

    public Vec4ui decr(Vec4ui res) {
        return Glm.decr(res, (Vec4ui) this);
    }
}
