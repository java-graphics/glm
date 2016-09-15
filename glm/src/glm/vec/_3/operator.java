/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3;

/**
 *
 * @author elect
 */
abstract class operator extends funcRelational {

    public Vec3 add(float addend) {
        return add(addend, (Vec3) this);
    }

    public Vec3 add_(float addend) {
        return add(addend, new Vec3());
    }

    public Vec3 add(float addend, Vec3 result) {
        return add((Vec3) this, addend, addend, addend, result);
    }

    public Vec3 add(Vec3 addend) {
        return add(addend, (Vec3) this);
    }

    public Vec3 add_(Vec3 addend) {
        return add(addend, new Vec3());
    }

    public Vec3 add(Vec3 addend, Vec3 result) {
        return add((Vec3) this, addend.x, addend.y, addend.z, result);
    }

    public Vec3 add_(float addendX, float addendY, float addendZ, Vec3 result) {
        return add((Vec3) this, addendX, addendY, addendZ, result);
    }

    public Vec3 add(float addendX, float addendY, float addendZ) {
        return add((Vec3) this, addendX, addendY, addendZ, (Vec3) this);
    }

    public Vec3 add_(float addendX, float addendY, float addendZ) {
        return add((Vec3) this, addendX, addendY, addendZ, new Vec3());
    }

    public static Vec3 add(Vec3 addend0, float addend1x, float addend1y, float addend1z, Vec3 result) {
        result.x = addend0.x + addend1x;
        result.y = addend0.y + addend1y;
        result.z = addend0.z + addend1z;
        return result;
    }

    public Vec3 div(float divisor) {
        return div(divisor, (Vec3) this);
    }

    public Vec3 div_(float divisor) {
        return div(divisor, new Vec3());
    }

    public Vec3 div(float divisor, Vec3 result) {
        return div((Vec3) this, divisor, divisor, divisor, result);
    }

    public Vec3 div(Vec3 divisor) {
        return div(divisor, (Vec3) this);
    }

    public Vec3 div_(Vec3 divisor) {
        return div(divisor, new Vec3());
    }

    public Vec3 div(Vec3 divisor, Vec3 result) {
        return div((Vec3) this, divisor.x, divisor.y, divisor.z, result);
    }

    public Vec3 div_(float divisorX, float divisorY, float divisorZ, Vec3 result) {
        return div((Vec3) this, divisorX, divisorY, divisorZ, result);
    }

    public Vec3 div(float divisorX, float divisorY, float divisorZ) {
        return div((Vec3) this, divisorX, divisorY, divisorZ, (Vec3) this);
    }

    public Vec3 div_(float divisorX, float divisorY, float divisorZ) {
        return div((Vec3) this, divisorX, divisorY, divisorZ, new Vec3());
    }

    public static Vec3 div(Vec3 dividend, float divisorX, float divisorY, float divisorZ, Vec3 result) {
        result.x = dividend.x / divisorX;
        result.y = dividend.y / divisorY;
        result.z = dividend.z / divisorZ;
        return result;
    }

    public Vec3 mul(float factor) {
        return mul(factor, (Vec3) this);
    }

    public Vec3 mul_(float factor) {
        return mul(factor, new Vec3());
    }

    public Vec3 mul(float factor, Vec3 result) {
        return mul((Vec3) this, factor, factor, factor, result);
    }

    public Vec3 mul(Vec3 factor) {
        return mul(factor, (Vec3) this);
    }

    public Vec3 mul_(Vec3 factor) {
        return mul(factor, new Vec3());
    }

    public Vec3 mul(Vec3 factor, Vec3 result) {
        return mul((Vec3) this, factor.x, factor.y, factor.z, result);
    }

    public Vec3 mul(float factorX, float factorY, float factorZ, Vec3 result) {
        return mul((Vec3) this, factorX, factorY, factorZ, result);
    }

    public Vec3 mul(float factorX, float factorY, float factorZ) {
        return mul((Vec3) this, factorX, factorY, factorZ, (Vec3) this);
    }

    public Vec3 mul_(float factorX, float factorY, float factorZ) {
        return mul((Vec3) this, factorX, factorY, factorZ, new Vec3());
    }

    public static Vec3 mul(Vec3 factor0, float factor1x, float factor1y, float factor1z, Vec3 result) {
        result.x = factor0.x * factor1x;
        result.y = factor0.y * factor1y;
        result.z = factor0.z * factor1z;
        return result;
    }

    public Vec3 sub(float subtrahend) {
        return sub(subtrahend, (Vec3) this);
    }

    public Vec3 sub_(float subtrahend) {
        return sub(subtrahend, new Vec3());
    }

    public Vec3 sub(float subtrahend, Vec3 result) {
        return sub((Vec3) this, subtrahend, subtrahend, subtrahend, result);
    }

    public Vec3 sub(Vec3 subtrahend) {
        return sub(subtrahend, (Vec3) this);
    }

    public Vec3 sub_(Vec3 subtrahend) {
        return sub(subtrahend, new Vec3());
    }

    public Vec3 sub(Vec3 subtrahend, Vec3 result) {
        return sub((Vec3) this, subtrahend.x, subtrahend.y, subtrahend.z, result);
    }

    public Vec3 sub(float subtrahendX, float subtrahendY, float subtrahendZ, Vec3 result) {
        return sub((Vec3) this, subtrahendX, subtrahendY, subtrahendZ, result);
    }

    public Vec3 sub(float subtrahendX, float subtrahendY, float subtrahendZ) {
        return sub((Vec3) this, subtrahendX, subtrahendY, subtrahendZ, (Vec3) this);
    }

    public Vec3 sub_(float subtrahendX, float subtrahendY, float subtrahendZ) {
        return sub((Vec3) this, subtrahendX, subtrahendY, subtrahendZ, new Vec3());
    }

    public static Vec3 sub(Vec3 minuend, float subtrahendX, float subtrahendY, float subtrahendZ, Vec3 result) {
        result.x = minuend.x - subtrahendX;
        result.y = minuend.y - subtrahendY;
        result.z = minuend.z - subtrahendZ;
        return result;
    }
}
