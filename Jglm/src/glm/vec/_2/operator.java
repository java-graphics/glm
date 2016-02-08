/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2;

import dev.*;

/**
 *
 * @author GBarbieri
 */
class operator extends funcRelational {

    public Vec2 add(float addend) {
        return add(addend, (Vec2) this);
    }

    public Vec2 add_(float addend) {
        return add(addend, new Vec2());
    }

    public Vec2 add(float addend, Vec2 result) {
        return add((Vec2) this, addend, addend, result);
    }

    public Vec2 add(Vec2 addend) {
        return add(addend, (Vec2) this);
    }

    public Vec2 add_(Vec2 addend) {
        return add(addend, new Vec2());
    }

    public Vec2 add(Vec2 addend, Vec2 result) {
        return add((Vec2) this, addend.x, addend.y, result);
    }

    public Vec2 add_(float addendX, float addendY, Vec2 result) {
        return add((Vec2) this, addendX, addendY, result);
    }

    public Vec2 add(float addendX, float addendY) {
        return add((Vec2) this, addendX, addendY, (Vec2) this);
    }

    public Vec2 add_(float addendX, float addendY) {
        return add((Vec2) this, addendX, addendY, new Vec2());
    }

    public static Vec2 add(Vec2 addend0, float addend1x, float addend1y, Vec2 result) {
        result.x = addend0.x + addend1x;
        result.y = addend0.y + addend1y;
        return result;
    }

    public Vec2 div(float divisor) {
        return div(divisor, (Vec2) this);
    }

    public Vec2 div_(float divisor) {
        return div(divisor, new Vec2());
    }

    public Vec2 div(float divisor, Vec2 result) {
        return div((Vec2) this, divisor, divisor, result);
    }

    public Vec2 div(Vec2 divisor) {
        return div(divisor, (Vec2) this);
    }

    public Vec2 div_(Vec2 divisor) {
        return div(divisor, new Vec2());
    }

    public Vec2 div(Vec2 divisor, Vec2 result) {
        return div((Vec2) this, divisor.x, divisor.y, result);
    }

    public Vec2 div_(float divisorX, float divisorY, Vec2 result) {
        return div((Vec2) this, divisorX, divisorY, result);
    }

    public Vec2 div(float divisorX, float divisorY) {
        return div((Vec2) this, divisorX, divisorY, (Vec2) this);
    }

    public Vec2 div_(float divisorX, float divisorY, float divisorZ) {
        return div((Vec2) this, divisorX, divisorY, new Vec2());
    }

    public static Vec2 div(Vec2 dividend, float divisorX, float divisorY, Vec2 result) {
        result.x = dividend.x / divisorX;
        result.y = dividend.y / divisorY;
        return result;
    }

    public Vec2 mul(float factor) {
        return mul(factor, (Vec2) this);
    }

    public Vec2 mul_(float factor) {
        return mul(factor, new Vec2());
    }

    public Vec2 mul(float factor, Vec2 result) {
        return mul((Vec2) this, factor, factor, result);
    }

    public Vec2 mul(Vec2 factor) {
        return mul(factor, (Vec2) this);
    }

    public Vec2 mul_(Vec2 factor) {
        return mul(factor, new Vec2());
    }

    public Vec2 mul(Vec2 factor, Vec2 result) {
        return mul((Vec2) this, factor.x, factor.y, result);
    }

    public Vec2 mul(float factorX, float factorY, Vec2 result) {
        return mul((Vec2) this, factorX, factorY, result);
    }

    public Vec2 mul(float factorX, float factorY) {
        return mul((Vec2) this, factorX, factorY, (Vec2) this);
    }

    public Vec2 mul_(float factorX, float factorY) {
        return mul((Vec2) this, factorX, factorY, new Vec2());
    }

    public static Vec2 mul(Vec2 factor0, float factor1x, float factor1y, Vec2 result) {
        result.x = factor0.x * factor1x;
        result.y = factor0.y * factor1y;
        return result;
    }

    public Vec2 sub(float subtrahend) {
        return sub(subtrahend, (Vec2) this);
    }

    public Vec2 sub_(float subtrahend) {
        return sub(subtrahend, new Vec2());
    }

    public Vec2 sub(float subtrahend, Vec2 result) {
        return sub((Vec2) this, subtrahend, subtrahend, result);
    }

    public Vec2 sub(Vec2 subtrahend) {
        return sub(subtrahend, (Vec2) this);
    }

    public Vec2 sub_(Vec2 subtrahend) {
        return sub(subtrahend, new Vec2());
    }

    public Vec2 sub(Vec2 subtrahend, Vec2 result) {
        return sub((Vec2) this, subtrahend.x, subtrahend.y, result);
    }

    public Vec2 sub(float subtrahendX, float subtrahendY, Vec2 result) {
        return sub((Vec2) this, subtrahendX, subtrahendY, result);
    }

    public Vec2 sub(float subtrahendX, float subtrahendY) {
        return sub((Vec2) this, subtrahendX, subtrahendY, (Vec2) this);
    }

    public Vec2 sub_(float subtrahendX, float subtrahendY) {
        return sub((Vec2) this, subtrahendX, subtrahendY, new Vec2());
    }

    public static Vec2 sub(Vec2 minuend, float subtrahendX, float subtrahendY, Vec2 result) {
        result.x = minuend.x - subtrahendX;
        result.y = minuend.y - subtrahendY;
        return result;
    }
}
