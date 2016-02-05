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
public class Vec4 {

    public static final int SIZE = 4 * Float.BYTES;

    public float x, y, z, w;

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

    public Vec4 add(float f) {
        return add(f, this);
    }

    public Vec4 add(float f, Vec4 res) {
        res.x += f;
        res.y += f;
        res.z += f;
        res.w += f;
        return this;
    }

    public Vec4 div(float f) {
        return div(f, this);
    }

    public Vec4 div(float f, Vec4 res) {
        res.x /= f;
        res.y /= f;
        res.z /= f;
        res.w /= f;
        return this;
    }

    public Vec4 mul(float f) {
        return mul(f, this);
    }

    public Vec4 mul(float f, Vec4 res) {
        res.x *= f;
        res.y *= f;
        res.z *= f;
        res.w *= f;
        return this;
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
