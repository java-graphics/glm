/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.i;

import glm.vec._2.u.*;

/**
 *
 * @author GBarbieri
 */
class operator {

    // add  --------------------------------------------------------------------
    public Vec2i add(int addend) {
        return add(addend, (Vec2i) this);
    }

    public Vec2i add_(int addend) {
        return add(addend, new Vec2i());
    }

    public Vec2i add(int addend, Vec2i result) {
        return add((Vec2i) this, addend, addend, result);
    }

    public Vec2i add(Vec2i addend) {
        return add(addend, (Vec2i) this);
    }

    public Vec2i add_(Vec2i addend) {
        return add(addend, new Vec2i());
    }

    public Vec2i add(Vec2i addend, Vec2i result) {
        return add((Vec2i) this, addend.x, addend.y, result);
    }

    public Vec2i add_(int addendX, int addendY, Vec2i result) {
        return add((Vec2i) this, addendX, addendY, result);
    }

    public Vec2i add(int addendX, int addendY) {
        return add((Vec2i) this, addendX, addendY, (Vec2i) this);
    }

    public Vec2i add_(int addendX, int addendY) {
        return add((Vec2i) this, addendX, addendY, new Vec2i());
    }

    public static Vec2i add(Vec2i addend0, int addend1x, int addend1y, Vec2i result) {
        result.x = addend0.x + addend1x;
        result.y = addend0.y + addend1y;
        return result;
    }

    // div  --------------------------------------------------------------------
    public Vec2i div(int divisor) {
        return div(divisor, (Vec2i) this);
    }

    public Vec2i div_(int divisor) {
        return div(divisor, new Vec2i());
    }

    public Vec2i div(int divisor, Vec2i result) {
        return div((Vec2i) this, divisor, divisor, result);
    }

    public Vec2i div(Vec2i divisor) {
        return div(divisor, (Vec2i) this);
    }

    public Vec2i div_(Vec2i divisor) {
        return div(divisor, new Vec2i());
    }

    public Vec2i div(Vec2i divisor, Vec2i result) {
        return div((Vec2i) this, divisor.x, divisor.y, result);
    }

    public Vec2i div_(int divisorX, int divisorY, Vec2i result) {
        return div((Vec2i) this, divisorX, divisorY, result);
    }

    public Vec2i div(int divisorX, int divisorY) {
        return div((Vec2i) this, divisorX, divisorY, (Vec2i) this);
    }

    public Vec2i div_(int divisorX, int divisorY) {
        return div((Vec2i) this, divisorX, divisorY, new Vec2i());
    }

    public static Vec2i div(Vec2i dividend, int divisorX, int divisorY, Vec2i result) {
        result.x = dividend.x / divisorX;
        result.y = dividend.y / divisorY;
        return result;
    }

    // mul  --------------------------------------------------------------------
    public Vec2i mul(int factor) {
        return mul(factor, (Vec2i) this);
    }

    public Vec2i mul_(int factor) {
        return mul(factor, new Vec2i());
    }

    public Vec2i mul(int factor, Vec2i result) {
        return mul((Vec2i) this, factor, factor, result);
    }

    public Vec2i mul(Vec2i factor) {
        return mul(factor, (Vec2i) this);
    }

    public Vec2i mul_(Vec2i factor) {
        return mul(factor, new Vec2i());
    }

    public Vec2i mul(Vec2i factor, Vec2i result) {
        return mul((Vec2i) this, factor.x, factor.y, result);
    }

    public Vec2i mul(int factorX, int factorY, Vec2i result) {
        return mul((Vec2i) this, factorX, factorY, result);
    }

    public Vec2i mul(int factorX, int factorY) {
        return mul((Vec2i) this, factorX, factorY, (Vec2i) this);
    }

    public Vec2i mul_(int factorX, int factorY) {
        return mul((Vec2i) this, factorX, factorY, new Vec2i());
    }

    public static Vec2i mul(Vec2i factor0, int factor1x, int factor1y, Vec2i result) {
        result.x = factor0.x * factor1x;
        result.y = factor0.y * factor1y;
        return result;
    }

    public Vec2i mul(float factor) {
        return mul(factor, (Vec2i) this);
    }

    public Vec2i mul_(float factor) {
        return mul(factor, new Vec2i());
    }

    public Vec2i mul(float factor, Vec2i result) {
        return mul((Vec2i) this, factor, factor, result);
    }

    public Vec2i mul(float factorX, float factorY, Vec2i result) {
        return mul((Vec2i) this, factorX, factorY, result);
    }

    public Vec2i mul(float factorX, float factorY) {
        return mul((Vec2i) this, factorX, factorY, (Vec2i) this);
    }

    public Vec2i mul_(float factorX, float factorY) {
        return mul((Vec2i) this, factorX, factorY, new Vec2i());
    }

    public static Vec2i mul(Vec2i factor0, float factor1x, float factor1y, Vec2i result) {
        result.x = (int) (factor0.x * factor1x);
        result.y = (int) (factor0.y * factor1y);
        return result;
    }

    // sub  --------------------------------------------------------------------
    public Vec2i sub(int subtrahend) {
        return sub(subtrahend, (Vec2i) this);
    }

    public Vec2i sub_(int subtrahend) {
        return sub(subtrahend, new Vec2i());
    }

    public Vec2i sub(int subtrahend, Vec2i result) {
        return sub((Vec2i) this, subtrahend, subtrahend, result);
    }

    public Vec2i sub(Vec2i subtrahend) {
        return sub(subtrahend, (Vec2i) this);
    }

    public Vec2i sub_(Vec2i subtrahend) {
        return sub(subtrahend, new Vec2i());
    }

    public Vec2i sub(Vec2i subtrahend, Vec2i result) {
        return sub((Vec2i) this, subtrahend.x, subtrahend.y, result);
    }

    public Vec2i sub(int subtrahendX, int subtrahendY, Vec2i result) {
        return sub((Vec2i) this, subtrahendX, subtrahendY, result);
    }

    public Vec2i sub(int subtrahendX, int subtrahendY) {
        return sub((Vec2i) this, subtrahendX, subtrahendY, (Vec2i) this);
    }

    public Vec2i sub_(int subtrahendX, int subtrahendY) {
        return sub((Vec2i) this, subtrahendX, subtrahendY, new Vec2i());
    }

    public static Vec2i sub(Vec2i minuend, int subtrahendX, int subtrahendY, Vec2i result) {
        result.x = minuend.x - subtrahendX;
        result.y = minuend.y - subtrahendY;
        return result;
    }

    // ++   --------------------------------------------------------------------
    public Vec2i mm_() {
        return mm((Vec2i) this, new Vec2i());
    }

    public Vec2i mm() {
        return mm((Vec2i) this, (Vec2i) this);
    }

    public static Vec2i mm(Vec2i minuend, Vec2i result) {
        minuend.x--;
        minuend.y--;
        return minuend;
    }

    // --   --------------------------------------------------------------------
    public Vec2i pp_() {
        return pp((Vec2i) this, new Vec2i());
    }

    public Vec2i pp() {
        return pp((Vec2i) this, (Vec2i) this);
    }

    public static Vec2i pp(Vec2i addend, Vec2i result) {
        addend.x++;
        addend.y++;
        return addend;
    }

    // &    --------------------------------------------------------------------
    public Vec2i and(int and) {
        return and(and, (Vec2i) this);
    }

    public Vec2i and_(int and) {
        return and(and, new Vec2i());
    }

    public Vec2i and(int and, Vec2i result) {
        return and((Vec2i) this, and, and, result);
    }

    public Vec2i and(Vec2i and) {
        return and(and, (Vec2i) this);
    }

    public Vec2i and_(Vec2i and) {
        return and(and, new Vec2i());
    }

    public Vec2i and(Vec2i and, Vec2i result) {
        return and((Vec2i) this, and.x, and.y, result);
    }

    public Vec2i and_(int andX, int andY, Vec2i result) {
        return and((Vec2i) this, andX, andY, result);
    }

    public Vec2i and(int andX, int andY) {
        return and((Vec2i) this, andX, andY, (Vec2i) this);
    }

    public Vec2i and_(int andX, int andY) {
        return and((Vec2i) this, andX, andY, new Vec2i());
    }

    public static Vec2i and(Vec2i instance, int andX, int andY, Vec2i result) {
        result.x = instance.x % andX;
        result.y = instance.y % andY;
        return result;
    }

    // %    --------------------------------------------------------------------
    public Vec2i mod(int divisor) {
        return mod(divisor, (Vec2i) this);
    }

    public Vec2i mod_(int divisor) {
        return mod(divisor, new Vec2i());
    }

    public Vec2i mod(int divisor, Vec2i result) {
        return mod((Vec2i) this, divisor, divisor, result);
    }

    public Vec2i mod(Vec2i divisor) {
        return mod(divisor, (Vec2i) this);
    }

    public Vec2i mod_(Vec2i divisor) {
        return mod(divisor, new Vec2i());
    }

    public Vec2i mod(Vec2i divisor, Vec2i result) {
        return mod((Vec2i) this, divisor.x, divisor.y, result);
    }

    public Vec2i mod_(int divisorX, int divisorY, Vec2i result) {
        return mod((Vec2i) this, divisorX, divisorY, result);
    }

    public Vec2i mod(int divisorX, int divisorY) {
        return mod((Vec2i) this, divisorX, divisorY, (Vec2i) this);
    }

    public Vec2i mod_(int divisorX, int divisorY) {
        return mod((Vec2i) this, divisorX, divisorY, new Vec2i());
    }

    public static Vec2i mod(Vec2i dividend, int divisorX, int divisorY, Vec2i result) {
        result.x = dividend.x % divisorX;
        result.y = dividend.y % divisorY;
        return result;
    }

    // <<   --------------------------------------------------------------------
    public Vec2i shiftL(int shift) {
        return shiftL(shift, (Vec2i) this);
    }

    public Vec2i shiftL_(int shift) {
        return shiftL(shift, new Vec2i());
    }

    public Vec2i shiftL(int shift, Vec2i result) {
        return shiftL((Vec2i) this, shift, shift, result);
    }

    public Vec2i shiftL(Vec2i shift) {
        return shiftL(shift, (Vec2i) this);
    }

    public Vec2i shiftL_(Vec2i shift) {
        return shiftL(shift, new Vec2i());
    }

    public Vec2i shiftL(Vec2i shift, Vec2i result) {
        return shiftL((Vec2i) this, shift.x, shift.y, result);
    }

    public Vec2i shiftL(int shiftX, int shiftY, Vec2i result) {
        return shiftL((Vec2i) this, shiftX, shiftY, result);
    }

    public Vec2i shiftL(int shiftX, int shiftY) {
        return shiftL((Vec2i) this, shiftX, shiftY, (Vec2i) this);
    }

    public Vec2i shiftL_(int shiftX, int shiftY) {
        return shiftL((Vec2i) this, shiftX, shiftY, new Vec2i());
    }

    public static Vec2i shiftL(Vec2i instance, int shiftX, int shiftY, Vec2i result) {
        result.x = instance.x << shiftX;
        result.y = instance.y << shiftY;
        return result;
    }

    // >>   --------------------------------------------------------------------
    public Vec2i shiftR(int shift) {
        return shiftR(shift, (Vec2i) this);
    }

    public Vec2i shiftR_(int shift) {
        return shiftR(shift, new Vec2i());
    }

    public Vec2i shiftR(int shift, Vec2i result) {
        return shiftR((Vec2i) this, shift, shift, result);
    }

    public Vec2i shiftR(Vec2i shift) {
        return shiftR(shift, (Vec2i) this);
    }

    public Vec2i shiftR_(Vec2i shift) {
        return shiftR(shift, new Vec2i());
    }

    public Vec2i shiftR(Vec2i shift, Vec2i result) {
        return shiftR((Vec2i) this, shift.x, shift.y, result);
    }

    public Vec2i shiftR(int shiftX, int shiftY, Vec2i result) {
        return shiftR((Vec2i) this, shiftX, shiftY, result);
    }

    public Vec2i shiftR(int shiftX, int shiftY) {
        return shiftR((Vec2i) this, shiftX, shiftY, (Vec2i) this);
    }

    public Vec2i shiftR_(int shiftX, int shiftY) {
        return shiftR((Vec2i) this, shiftX, shiftY, new Vec2i());
    }

    public static Vec2i shiftR(Vec2i instance, int shiftX, int shiftY, Vec2i result) {
        result.x = instance.x >> shiftX;
        result.y = instance.y >> shiftY;
        return result;
    }
}
