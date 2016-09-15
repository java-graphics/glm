/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.ui;

/**
 *
 * @author GBarbieri
 */
abstract class operator extends funcRelational {

    public Vec2ui add(int addend) {
        return add(addend, (Vec2ui) this);
    }

    public Vec2ui add_(int addend) {
        return add(addend, new Vec2ui());
    }

    public Vec2ui add(int addend, Vec2ui result) {
        return add((Vec2ui) this, addend, addend, result);
    }

    public Vec2ui add(Vec2ui addend) {
        return add(addend, (Vec2ui) this);
    }

    public Vec2ui add_(Vec2ui addend) {
        return add(addend, new Vec2ui());
    }

    public Vec2ui add(Vec2ui addend, Vec2ui result) {
        return add((Vec2ui) this, addend.x, addend.y, result);
    }

    public Vec2ui add_(int addendX, int addendY, Vec2ui result) {
        return add((Vec2ui) this, addendX, addendY, result);
    }

    public Vec2ui add(int addendX, int addendY) {
        return add((Vec2ui) this, addendX, addendY, (Vec2ui) this);
    }

    public Vec2ui add_(int addendX, int addendY) {
        return add((Vec2ui) this, addendX, addendY, new Vec2ui());
    }

    public static Vec2ui add(Vec2ui addend0, int addend1x, int addend1y, Vec2ui result) {
        result.x = addend0.x + addend1x;
        result.y = addend0.y + addend1y;
        return result;
    }

    public Vec2ui div(int divisor) {
        return div(divisor, (Vec2ui) this);
    }

    public Vec2ui div_(int divisor) {
        return div(divisor, new Vec2ui());
    }

    public Vec2ui div(int divisor, Vec2ui result) {
        return div((Vec2ui) this, divisor, divisor, result);
    }

    public Vec2ui div(Vec2ui divisor) {
        return div(divisor, (Vec2ui) this);
    }

    public Vec2ui div_(Vec2ui divisor) {
        return div(divisor, new Vec2ui());
    }

    public Vec2ui div(Vec2ui divisor, Vec2ui result) {
        return div((Vec2ui) this, divisor.x, divisor.y, result);
    }

    public Vec2ui div_(int divisorX, int divisorY, Vec2ui result) {
        return div((Vec2ui) this, divisorX, divisorY, result);
    }

    public Vec2ui div(int divisorX, int divisorY) {
        return div((Vec2ui) this, divisorX, divisorY, (Vec2ui) this);
    }

    public Vec2ui div_(int divisorX, int divisorY, int divisorZ) {
        return div((Vec2ui) this, divisorX, divisorY, new Vec2ui());
    }

    public static Vec2ui div(Vec2ui dividend, int divisorX, int divisorY, Vec2ui result) {
        /**
         * Note, division is the only operation where signed/unsigned require
         * different paths.
         */
        result.x = Integer.divideUnsigned(dividend.x, divisorX);
        result.y = Integer.divideUnsigned(dividend.y, divisorY);
        return result;
    }

    public Vec2ui mul(int factor) {
        return mul(factor, (Vec2ui) this);
    }

    public Vec2ui mul_(int factor) {
        return mul(factor, new Vec2ui());
    }

    public Vec2ui mul(int factor, Vec2ui result) {
        return mul((Vec2ui) this, factor, factor, result);
    }

    public Vec2ui mul(Vec2ui factor) {
        return mul(factor, (Vec2ui) this);
    }

    public Vec2ui mul_(Vec2ui factor) {
        return mul(factor, new Vec2ui());
    }

    public Vec2ui mul(Vec2ui factor, Vec2ui result) {
        return mul((Vec2ui) this, factor.x, factor.y, result);
    }

    public Vec2ui mul(int factorX, int factorY, Vec2ui result) {
        return mul((Vec2ui) this, factorX, factorY, result);
    }

    public Vec2ui mul(int factorX, int factorY) {
        return mul((Vec2ui) this, factorX, factorY, (Vec2ui) this);
    }

    public Vec2ui mul_(int factorX, int factorY) {
        return mul((Vec2ui) this, factorX, factorY, new Vec2ui());
    }

    public static Vec2ui mul(Vec2ui factor0, int factor1x, int factor1y, Vec2ui result) {
        result.x = factor0.x * factor1x;
        result.y = factor0.y * factor1y;
        return result;
    }

    public Vec2ui sub(int subtrahend) {
        return sub(subtrahend, (Vec2ui) this);
    }

    public Vec2ui sub_(int subtrahend) {
        return sub(subtrahend, new Vec2ui());
    }

    public Vec2ui sub(int subtrahend, Vec2ui result) {
        return sub((Vec2ui) this, subtrahend, subtrahend, result);
    }

    public Vec2ui sub(Vec2ui subtrahend) {
        return sub(subtrahend, (Vec2ui) this);
    }

    public Vec2ui sub_(Vec2ui subtrahend) {
        return sub(subtrahend, new Vec2ui());
    }

    public Vec2ui sub(Vec2ui subtrahend, Vec2ui result) {
        return sub((Vec2ui) this, subtrahend.x, subtrahend.y, result);
    }

    public Vec2ui sub(int subtrahendX, int subtrahendY, Vec2ui result) {
        return sub((Vec2ui) this, subtrahendX, subtrahendY, result);
    }

    public Vec2ui sub(int subtrahendX, int subtrahendY) {
        return sub((Vec2ui) this, subtrahendX, subtrahendY, (Vec2ui) this);
    }

    public Vec2ui sub_(int subtrahendX, int subtrahendY) {
        return sub((Vec2ui) this, subtrahendX, subtrahendY, new Vec2ui());
    }

    public static Vec2ui sub(Vec2ui minuend, int subtrahendX, int subtrahendY, Vec2ui result) {
        result.x = minuend.x - subtrahendX;
        result.y = minuend.y - subtrahendY;
        return result;
    }

    public Vec2ui mm_() {
        return mm((Vec2ui) this, new Vec2ui());
    }

    public Vec2ui mm() {
        return mm((Vec2ui) this, (Vec2ui) this);
    }

    public static Vec2ui mm(Vec2ui minuend, Vec2ui result) {
        minuend.x--;
        minuend.y--;
        return minuend;
    }

    public Vec2ui pp_() {
        return pp((Vec2ui) this, new Vec2ui());
    }

    public Vec2ui pp() {
        return pp((Vec2ui) this, (Vec2ui) this);
    }

    public static Vec2ui pp(Vec2ui addend, Vec2ui result) {
        addend.x++;
        addend.y++;
        return addend;
    }
}
