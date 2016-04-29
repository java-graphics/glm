/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4;

import glm.mat._4.Mat4;

/**
 *
 * @author elect
 */
public abstract class operator extends funcRelational {

    public Vec4 add(float addend) {
        return add(addend, (Vec4) this);
    }

    public Vec4 add_(float addend) {
        return add(addend, new Vec4());
    }

    public Vec4 add(float addend, Vec4 result) {
        return add((Vec4) this, addend, addend, addend, addend, result);
    }

    public Vec4 add(Vec4 addend) {
        return add(addend, (Vec4) this);
    }

    public Vec4 add_(Vec4 addend) {
        return add(addend, new Vec4());
    }

    public Vec4 add(Vec4 addend, Vec4 result) {
        return add((Vec4) this, addend.x, addend.y, addend.z, addend.w, result);
    }

    public Vec4 add_(float addendX, float addendY, float addendZ, float addendW, Vec4 result) {
        return add((Vec4) this, addendX, addendY, addendZ, addendW, result);
    }

    public Vec4 add(float addendX, float addendY, float addendZ, float addendW) {
        return add((Vec4) this, addendX, addendY, addendZ, addendW, (Vec4) this);
    }

    public Vec4 add_(float addendX, float addendY, float addendZ, float addendW) {
        return add((Vec4) this, addendX, addendY, addendZ, addendW, new Vec4());
    }

    public static Vec4 add(Vec4 addend0, float addend1x, float addend1y, float addend1z, float addend1w,
            Vec4 result) {
        result.x = addend0.x + addend1x;
        result.y = addend0.y + addend1y;
        result.z = addend0.z + addend1z;
        result.w = addend0.w + addend1w;
        return result;
    }

    public Vec4 div(float divisor) {
        return div(divisor, (Vec4) this);
    }

    public Vec4 div_(float divisor) {
        return div(divisor, new Vec4());
    }

    public Vec4 div(float divisor, Vec4 result) {
        return div((Vec4) this, divisor, divisor, divisor, divisor, result);
    }

    public Vec4 div(Vec4 divisor) {
        return div(divisor, (Vec4) this);
    }

    public Vec4 div_(Vec4 divisor) {
        return div(divisor, new Vec4());
    }

    public Vec4 div(Vec4 divisor, Vec4 result) {
        return div((Vec4) this, divisor.x, divisor.y, divisor.z, divisor.w, result);
    }

    public Vec4 div_(float divisorX, float divisorY, float divisorZ, float divisorW, Vec4 result) {
        return div((Vec4) this, divisorX, divisorY, divisorZ, divisorW, result);
    }

    public Vec4 div(float divisorX, float divisorY, float divisorZ, float divisorW) {
        return div((Vec4) this, divisorX, divisorY, divisorZ, divisorW, (Vec4) this);
    }

    public Vec4 div_(float divisorX, float divisorY, float divisorZ, float divisorW) {
        return div((Vec4) this, divisorX, divisorY, divisorZ, divisorW, new Vec4());
    }

    public static Vec4 div(Vec4 dividend, float divisorX, float divisorY, float divisorZ, float divisorW,
            Vec4 result) {
        result.x = dividend.x / divisorX;
        result.y = dividend.y / divisorY;
        result.z = dividend.z / divisorZ;
        result.w = dividend.w / divisorW;
        return result;
    }

    public Vec4 mul(float factor) {
        return mul(factor, (Vec4) this);
    }

    public Vec4 mul_(float factor) {
        return mul(factor, new Vec4());
    }

    public Vec4 mul(float factor, Vec4 result) {
        return mul((Vec4) this, factor, factor, factor, factor, result);
    }

    public Vec4 mul(Vec4 factor) {
        return mul(factor, (Vec4) this);
    }

    public Vec4 mul_(Vec4 factor) {
        return mul(factor, new Vec4());
    }

    public Vec4 mul(Vec4 factor, Vec4 result) {
        return mul((Vec4) this, factor.x, factor.y, factor.z, factor.w, result);
    }

    public Vec4 mul(float factorX, float factorY, float factorZ, float factorW, Vec4 result) {
        return mul((Vec4) this, factorX, factorY, factorZ, factorW, result);
    }

    public Vec4 mul(float factorX, float factorY, float factorZ, float factorW) {
        return mul((Vec4) this, factorX, factorY, factorZ, factorW, (Vec4) this);
    }

    public Vec4 mul_(float factorX, float factorY, float factorZ, float factorW) {
        return mul((Vec4) this, factorX, factorY, factorZ, factorW, new Vec4());
    }

    public static Vec4 mul(Vec4 factor0, float factor1x, float factor1y, float factor1z, float factor1w,
            Vec4 result) {
        result.x = factor0.x * factor1x;
        result.y = factor0.y * factor1y;
        result.z = factor0.z * factor1z;
        result.w = factor0.w * factor1w;
        return result;
    }

    public Vec4 sub(float subtrahend) {
        return sub(subtrahend, (Vec4) this);
    }

    public Vec4 sub_(float subtrahend) {
        return sub(subtrahend, new Vec4());
    }

    public Vec4 sub(float subtrahend, Vec4 result) {
        return sub((Vec4) this, subtrahend, subtrahend, subtrahend, subtrahend, result);
    }

    public Vec4 sub(Vec4 subtrahend) {
        return sub(subtrahend, (Vec4) this);
    }

    public Vec4 sub_(Vec4 subtrahend) {
        return sub(subtrahend, new Vec4());
    }

    public Vec4 sub(Vec4 subtrahend, Vec4 result) {
        return sub((Vec4) this, subtrahend.x, subtrahend.y, subtrahend.z, subtrahend.w, result);
    }

    public Vec4 sub(float subtrahendX, float subtrahendY, float subtrahendZ, float subtrahendW, Vec4 result) {
        return sub((Vec4) this, subtrahendX, subtrahendY, subtrahendZ, subtrahendW, result);
    }

    public Vec4 sub(float subtrahendX, float subtrahendY, float subtrahendZ, float subtrahendW) {
        return sub((Vec4) this, subtrahendX, subtrahendY, subtrahendZ, subtrahendW, (Vec4) this);
    }

    public Vec4 sub_(float subtrahendX, float subtrahendY, float subtrahendZ, float subtrahendW) {
        return sub((Vec4) this, subtrahendX, subtrahendY, subtrahendZ, subtrahendW, new Vec4());
    }

    public static Vec4 sub(Vec4 minuend, float subtrahendX, float subtrahendY, float subtrahendZ,
            float subtrahendW, Vec4 result) {
        result.x = minuend.x - subtrahendX;
        result.y = minuend.y - subtrahendY;
        result.z = minuend.z - subtrahendZ;
        result.w = minuend.w - subtrahendW;
        return result;
    }

    /**
     * Multiply this Vec4 by the given matrix mat and store the result in
     * <code>this</code>.
     *
     * @param mat the matrix to multiply the vector with
     * @return this
     */
    public Vec4 mul(Mat4 mat) {
        return mul(mat, (Vec4) this);
    }

    /**
     * Multiply this Vec4 by the given matrix mat and store the result in
     * <code>dest</code>.
     *
     * @param mat the matrix to multiply the vector with
     * @param res the destination vector to hold the result
     * @return dest
     */
    public Vec4 mul(Mat4 mat, Vec4 res) {
        res.set(mat.m00 * x + mat.m10 * y + mat.m20 * z + mat.m30 * w,
                mat.m01 * x + mat.m11 * y + mat.m21 * z + mat.m31 * w,
                mat.m02 * x + mat.m12 * y + mat.m22 * z + mat.m32 * w,
                mat.m03 * x + mat.m13 * y + mat.m23 * z + mat.m33 * w);
        return res;
    }

}
