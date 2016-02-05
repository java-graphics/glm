/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

/**
 *
 * @author GBarbieri
 */
public class Vec4 extends funcCommonVec4 {

    public Vec4() {
        x = 0f;
        y = 0f;
        z = 0f;
        w = 0f;
    }

    public Vec4(Vec4 v) {
        x = v.x;
        y = v.y;
        z = v.z;
        w = v.w;
    }

    public Vec4(float f) {
        x = f;
        y = f;
        z = f;
        w = f;
    }

    public Vec4(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public Vec4(float f, Vec3 v) {
        this.x = f;
        this.y = v.x;
        this.z = v.y;
        this.w = v.z;
    }

    public Vec4(Vec2 a, Vec2 b) {
        x = a.x;
        y = a.y;
        z = b.x;
        w = b.y;
    }

    public Vec4 set(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }

    public Vec4 set(Vec3 v, float f) {
        x = v.x;
        y = v.y;
        z = v.z;
        w = f;
        return this;
    }

    public Vec4 add_(float addend) {
        return add(addend, new Vec4());
    }

    public Vec4 add(float addend) {
        return add(addend, this);
    }

    public Vec4 add(float addend, Vec4 result) {
        result.x += addend;
        result.y += addend;
        result.z += addend;
        result.w += addend;
        return this;
    }

    public Vec4 div(float divisor) {
        return div(divisor, this);
    }

    public Vec4 div(float divisor, Vec4 quotient) {
        quotient.x /= divisor;
        quotient.y /= divisor;
        quotient.z /= divisor;
        quotient.w /= divisor;
        return this;
    }

    public Vec4 mul_(Vec4 multiplicand) {
        return mul(multiplicand, new Vec4());
    }

    public Vec4 mul(Vec4 multiplicand) {
        return mul(multiplicand, this);
    }

    public Vec4 mul(float f, Vec4 res) {
        return mul(f, f, f, f, res);
    }

    public Vec4 mul(Vec4 multiplicand, Vec4 product) {
        product.x = x * multiplicand.x;
        product.y = y * multiplicand.y;
        product.z = z * multiplicand.z;
        product.w = w * multiplicand.w;
        return product;
    }

    public Vec4 mul(float f) {
        return mul(f, this);
    }
    
    public Vec4 mul(float x, float y, float z, float w, Vec4 product) {
        product.x = this.x * x;
        product.y = this.y * y;
        product.z = this.z * z;
        product.w = this.w * w;
        return product;
    }

    /**
     * Multiply this Vec4 by the given matrix mat and store the result in
     * <code>this</code>.
     *
     * @param mat
     * the matrix to multiply the vector with
     * @return this
     */
    public Vec4 mul(Mat4 mat) {
        return mul(mat, this);
    }

    /**
     * Multiply this Vec4 by the given matrix mat and store the result in
     * <code>dest</code>.
     *
     * @param mat
     * the matrix to multiply the vector with
     * @param res
     * the destination vector to hold the result
     * @return dest
     */
    public Vec4 mul(Mat4 mat, Vec4 res) {
        res.set(mat.m00 * x + mat.m10 * y + mat.m20 * z + mat.m30 * w,
                mat.m01 * x + mat.m11 * y + mat.m21 * z + mat.m31 * w,
                mat.m02 * x + mat.m12 * y + mat.m22 * z + mat.m32 * w,
                mat.m03 * x + mat.m13 * y + mat.m23 * z + mat.m33 * w);
        return res;
    }

    public Vec4 plus_(float addend) {
        return plus(addend, new Vec4());
    }

    public Vec4 plus(float addend) {
        return plus(addend, this);
    }

    public Vec4 plus(float addend, Vec4 res) {
        return plus(addend, addend, addend, addend, res);
    }

    public Vec4 plus_(Vec4 addend) {
        return plus(addend, new Vec4());
    }

    public Vec4 plus(Vec4 addend) {
        return plus(addend, this);
    }

    public Vec4 plus(Vec4 addend, Vec4 res) {
        return plus(addend.x, addend.y, addend.z, addend.w, res);
    }

    public Vec4 plus_(float x, float y, float z, float w) {
        return plus(x, y, z, w, new Vec4());
    }

    public Vec4 plus(float x, float y, float z, float w) {
        return plus(x, y, z, w, this);
    }

    public Vec4 plus(float x, float y, float z, float w, Vec4 res) {
        res.x += x;
        res.y += y;
        res.z += z;
        res.w += w;
        return res;
    }

    public Vec4 sub_(float minuend) {
        return sub(minuend, new Vec4());
    }

    public Vec4 sub(float minuend) {
        return sub(minuend, this);
    }

    public Vec4 sub(float minuend, Vec4 res) {
        res.x -= minuend;
        res.y -= minuend;
        res.z -= minuend;
        res.w -= minuend;
        return this;
    }

    public Vec4 sub_(Vec4 subtrahend) {
        return sub(subtrahend, new Vec4());
    }

    public Vec4 sub(Vec4 subtrahend) {
        return sub(subtrahend, this);
    }

    public Vec4 sub(Vec4 subtrahend, Vec4 res) {
        res.x -= subtrahend.x;
        res.y -= subtrahend.y;
        res.z -= subtrahend.z;
        res.w -= subtrahend.w;
        return this;
    }

    public float[] toFA_() {
        return toFA(new float[4]);
    }

    public float[] toFA(float[] fa) {
        fa[0] = x;
        fa[1] = y;
        fa[2] = z;
        fa[3] = w;
        return fa;
    }
}
