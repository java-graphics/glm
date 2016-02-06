/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

import glm.glm;

/**
 *
 * @author GBarbieri
 */
public class Vec3 {

    public float x, y, z;
    public static final int SIZE = 3 * Float.BYTES;

    public Vec3() {
        x = 0f;
        y = 0f;
        z = 0f;
    }

    public Vec3(Vec4 v) {
        x = v.x;
        y = v.y;
        z = v.z;
    }

    public Vec3(float f) {
        x = f;
        y = f;
        z = f;
    }

    public Vec3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3(float[] fa) {
        this(fa, 0);
    }

    public Vec3(float[] fa, int i) {
        x = fa[i + 0];
        y = fa[i + 1];
        z = fa[i + 2];
    }

    public Vec3(double x, double y, double z) {
        this.x = (float) x;
        this.y = (float) y;
        this.z = (float) z;
    }

    public Vec3 set(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    public Vec3 max(Vec3 v) {
        return max(v, this);
    }

    public Vec3 max(Vec3 v, Vec3 res) {
        res.x = Math.max(x, v.x);
        res.y = Math.max(y, v.y);
        res.z = Math.max(z, v.z);
        return res;
    }

    public Vec3 min(Vec3 v) {
        return min(v, this);
    }

    public Vec3 min(Vec3 v, Vec3 res) {
        res.x = Math.min(x, v.x);
        res.y = Math.min(y, v.y);
        res.z = Math.min(z, v.z);
        return res;
    }

    public Vec3 mul_(Vec3 multiplicand) {
        return mul(multiplicand, new Vec3());
    }

    public Vec3 mul(Vec3 multiplicand) {
        return mul(multiplicand, this);
    }

    public Vec3 mul(float multiplicand, Vec3 product) {
        return mul(multiplicand, multiplicand, multiplicand, product);
    }

    public Vec3 mul(Vec3 multiplicand, Vec3 product) {
        return mul(multiplicand.x, multiplicand.y, multiplicand.z, product);
    }

    public Vec3 mul(float multiplicand) {
        return mul(multiplicand, this);
    }

    public Vec3 mul(float multiplicandX, float multiplicandY, float multiplicandZ, Vec3 product) {
        product.x = this.x * multiplicandX;
        product.y = this.y * multiplicandY;
        product.z = this.z * multiplicandZ;
        return product;
    }

    public Vec3 sub_(float f) {
        return sub(f, new Vec3());
    }

    public Vec3 sub(float f) {
        return sub(f, this);
    }

    public Vec3 sub(float f, Vec3 res) {
        res.x -= f;
        res.y -= f;
        res.z -= f;
        return this;
    }

    public Vec3 sub_(Vec3 subtrahend) {
        return sub(subtrahend, new Vec3());
    }

    public Vec3 sub(Vec3 subtrahend) {
        return sub(subtrahend, this);
    }

    public Vec3 sub(Vec3 subtrahend, Vec3 res) {
        res.x -= subtrahend.x;
        res.y -= subtrahend.y;
        res.z -= subtrahend.z;
        return this;
    }

    public static Vec3 linearRand_(Vec3 min, Vec3 max) {
        return linearRand(min, max, new Vec3());
    }

    public static Vec3 linearRand(Vec3 min, Vec3 max, Vec3 res) {
        res.x = (float) glm.linearRand(min.x, max.x);
        res.y = (float) glm.linearRand(min.y, max.y);
        res.z = (float) glm.linearRand(min.z, max.z);
        return res;
    }

    public Vec3 negate() {
        x = -x;
        y = -y;
        z = -z;
        return this;
    }

    public float[] toFA_() {
        return toFA(new float[3]);
    }

    public float[] toFA(float[] fa) {
        fa[0] = x;
        fa[1] = y;
        fa[2] = z;
        return fa;
    }

}
