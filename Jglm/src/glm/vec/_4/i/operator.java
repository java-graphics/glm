/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.i;

import glm.mat._4.Mat4;

/**
 *
 * @author fschaefers
 */
public abstract class operator extends funcRelational {

    public Vec4i add(int addend) {
        return add(addend, (Vec4i) this);
    }

    public Vec4i add_(int addend) {
        return add(addend, new Vec4i());
    }

    public Vec4i add(int addend, Vec4i result) {
        return add((Vec4i) this, addend, addend, addend, addend, result);
    }

    public Vec4i add(Vec4i addend) {
        return add(addend, (Vec4i) this);
    }

    public Vec4i add_(Vec4i addend) {
        return add(addend, new Vec4i());
    }

    public Vec4i add(Vec4i addend, Vec4i result) {
        return add((Vec4i) this, addend.x, addend.y, addend.z, addend.w, result);
    }

    public Vec4i add_(int addendX, int addendY, int addendZ, int addendW, Vec4i result) {
        return add((Vec4i) this, addendX, addendY, addendZ, addendW, result);
    }

    public Vec4i add(int addendX, int addendY, int addendZ, int addendW) {
        return add((Vec4i) this, addendX, addendY, addendZ, addendW, (Vec4i) this);
    }

    public Vec4i add_(int addendX, int addendY, int addendZ, int addendW) {
        return add((Vec4i) this, addendX, addendY, addendZ, addendW, new Vec4i());
    }

    public static Vec4i add(Vec4i addend0, int addend1x, int addend1y, int addend1z, int addend1w,
            Vec4i result) {
        result.x = addend0.x + addend1x;
        result.y = addend0.y + addend1y;
        result.z = addend0.z + addend1z;
        result.w = addend0.w + addend1w;
        return result;
    }

    public Vec4i div(int divisor) {
        return div(divisor, (Vec4i) this);
    }

    public Vec4i div_(int divisor) {
        return div(divisor, new Vec4i());
    }

    public Vec4i div(int divisor, Vec4i result) {
        return div((Vec4i) this, divisor, divisor, divisor, divisor, result);
    }

    public Vec4i div(Vec4i divisor) {
        return div(divisor, (Vec4i) this);
    }

    public Vec4i div_(Vec4i divisor) {
        return div(divisor, new Vec4i());
    }

    public Vec4i div(Vec4i divisor, Vec4i result) {
        return div((Vec4i) this, divisor.x, divisor.y, divisor.z, divisor.w, result);
    }

    public Vec4i div_(int divisorX, int divisorY, int divisorZ, int divisorW, Vec4i result) {
        return div((Vec4i) this, divisorX, divisorY, divisorZ, divisorW, result);
    }

    public Vec4i div(int divisorX, int divisorY, int divisorZ, int divisorW) {
        return div((Vec4i) this, divisorX, divisorY, divisorZ, divisorW, (Vec4i) this);
    }

    public Vec4i div_(int divisorX, int divisorY, int divisorZ, int divisorW) {
        return div((Vec4i) this, divisorX, divisorY, divisorZ, divisorW, new Vec4i());
    }

    public static Vec4i div(Vec4i dividend, int divisorX, int divisorY, int divisorZ, int divisorW,
            Vec4i result) {
        result.x = dividend.x / divisorX;
        result.y = dividend.y / divisorY;
        result.z = dividend.z / divisorZ;
        result.w = dividend.w / divisorW;
        return result;
    }

    public Vec4i mul(float factor) {
        return mul(factor, (Vec4i) this);
    }

    public Vec4i mul_(float factor) {
        return mul(factor, new Vec4i());
    }

    public Vec4i mul(float factor, Vec4i result) {
        return mul((Vec4i) this, factor, factor, factor, factor, result);
    }

    public Vec4i mul(Vec4i factor) {
        return mul(factor, (Vec4i) this);
    }

    public Vec4i mul_(Vec4i factor) {
        return mul(factor, new Vec4i());
    }

    public Vec4i mul(Vec4i factor, Vec4i result) {
        return mul((Vec4i) this, factor.x, factor.y, factor.z, factor.w, result);
    }

    public Vec4i mul(float factorX, float factorY, float factorZ, float factorW, Vec4i result) {
        return mul((Vec4i) this, factorX, factorY, factorZ, factorW, result);
    }

    public Vec4i mul(float factorX, float factorY, float factorZ, float factorW) {
        return mul((Vec4i) this, factorX, factorY, factorZ, factorW, (Vec4i) this);
    }

    public Vec4i mul_(float factorX, float factorY, float factorZ, float factorW) {
        return mul((Vec4i) this, factorX, factorY, factorZ, factorW, new Vec4i());
    }

    public static Vec4i mul(Vec4i factor0, float factor1x, float factor1y, float factor1z, float factor1w,
            Vec4i result) {
        result.x = (int) (factor0.x * factor1x);
        result.y = (int) (factor0.y * factor1y);
        result.z = (int) (factor0.z * factor1z);
        result.w = (int) (factor0.w * factor1w);
        return result;
    }

    public Vec4i sub(int subtrahend) {
        return sub(subtrahend, (Vec4i) this);
    }

    public Vec4i sub_(int subtrahend) {
        return sub(subtrahend, new Vec4i());
    }

    public Vec4i sub(int subtrahend, Vec4i result) {
        return sub((Vec4i) this, subtrahend, subtrahend, subtrahend, subtrahend, result);
    }

    public Vec4i sub(Vec4i subtrahend) {
        return sub(subtrahend, (Vec4i) this);
    }

    public Vec4i sub_(Vec4i subtrahend) {
        return sub(subtrahend, new Vec4i());
    }

    public Vec4i sub(Vec4i subtrahend, Vec4i result) {
        return sub((Vec4i) this, subtrahend.x, subtrahend.y, subtrahend.z, subtrahend.w, result);
    }

    public Vec4i sub(int subtrahendX, int subtrahendY, int subtrahendZ, int subtrahendW, Vec4i result) {
        return sub((Vec4i) this, subtrahendX, subtrahendY, subtrahendZ, subtrahendW, result);
    }

    public Vec4i sub(int subtrahendX, int subtrahendY, int subtrahendZ, int subtrahendW) {
        return sub((Vec4i) this, subtrahendX, subtrahendY, subtrahendZ, subtrahendW, (Vec4i) this);
    }

    public Vec4i sub_(int subtrahendX, int subtrahendY, int subtrahendZ, int subtrahendW) {
        return sub((Vec4i) this, subtrahendX, subtrahendY, subtrahendZ, subtrahendW, new Vec4i());
    }

    public static Vec4i sub(Vec4i minuend, int subtrahendX, int subtrahendY, int subtrahendZ,
            int subtrahendW, Vec4i result) {
        result.x = minuend.x - subtrahendX;
        result.y = minuend.y - subtrahendY;
        result.z = minuend.z - subtrahendZ;
        result.w = minuend.w - subtrahendW;
        return result;
    }

    /**
     * Multiply this Vec4i by the given matrix mat and store the result in
     * <code>this</code>.
     *
     * @param mat the matrix to multiply the vector with
     * @return this
     */
    public Vec4i mul(Mat4 mat) {
        return mul(mat, (Vec4i) this);
    }

    /**
     * Multiply this Vec4i by the given matrix mat and store the result in
     * <code>dest</code>.
     *
     * @param mat the matrix to multiply the vector with
     * @param res the destination vector to hold the result
     * @return dest
     */
    public Vec4i mul(Mat4 mat, Vec4i res) {
        res.set((int) (mat.m00 * x + mat.m10 * y + mat.m20 * z + mat.m30 * w),
                (int) (mat.m01 * x + mat.m11 * y + mat.m21 * z + mat.m31 * w),
                (int) (mat.m02 * x + mat.m12 * y + mat.m22 * z + mat.m32 * w),
                (int) (mat.m03 * x + mat.m13 * y + mat.m23 * z + mat.m33 * w));
        return res;
    }
}
