/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.u;

/**
 *
 * @author GBarbieri
 */
public abstract class operator {

    public Vec2u add(int addend) {
        return add(addend, (Vec2u) this);
    }

    public Vec2u add_(int addend) {
        return add(addend, new Vec2u());
    }

    public Vec2u add(int addend, Vec2u result) {
        return add((Vec2u) this, addend, addend, result);
    }

    public Vec2u add(Vec2u addend) {
        return add(addend, (Vec2u) this);
    }

    public Vec2u add_(Vec2u addend) {
        return add(addend, new Vec2u());
    }

    public Vec2u add(Vec2u addend, Vec2u result) {
        return add((Vec2u) this, addend.x, addend.y, result);
    }

    public Vec2u add_(int addendX, int addendY, Vec2u result) {
        return add((Vec2u) this, addendX, addendY, result);
    }

    public Vec2u add(int addendX, int addendY) {
        return add((Vec2u) this, addendX, addendY, (Vec2u) this);
    }

    public Vec2u add_(int addendX, int addendY) {
        return add((Vec2u) this, addendX, addendY, new Vec2u());
    }

    public static Vec2u add(Vec2u addend0, int addend1x, int addend1y, Vec2u result) {
        result.x = addend0.x + addend1x;
        result.y = addend0.y + addend1y;
        return result;
    }

    public Vec2u div(int divisor) {
        return div(divisor, (Vec2u) this);
    }

    public Vec2u div_(int divisor) {
        return div(divisor, new Vec2u());
    }

    public Vec2u div(int divisor, Vec2u result) {
        return div((Vec2u) this, divisor, divisor, result);
    }

    public Vec2u div(Vec2u divisor) {
        return div(divisor, (Vec2u) this);
    }

    public Vec2u div_(Vec2u divisor) {
        return div(divisor, new Vec2u());
    }

    public Vec2u div(Vec2u divisor, Vec2u result) {
        return div((Vec2u) this, divisor.x, divisor.y, result);
    }

    public Vec2u div_(int divisorX, int divisorY, Vec2u result) {
        return div((Vec2u) this, divisorX, divisorY, result);
    }

    public Vec2u div(int divisorX, int divisorY) {
        return div((Vec2u) this, divisorX, divisorY, (Vec2u) this);
    }

    public Vec2u div_(int divisorX, int divisorY, int divisorZ) {
        return div((Vec2u) this, divisorX, divisorY, new Vec2u());
    }

    public static Vec2u div(Vec2u dividend, int divisorX, int divisorY, Vec2u result) {
        /**
         * Note, division is the only operation where signed/unsigned require different paths.
         */
        result.x = Integer.divideUnsigned(dividend.x , divisorX);
        result.y = Integer.divideUnsigned(dividend.y , divisorY);
        return result;
    }

    public Vec2u mul(int factor) {
        return mul(factor, (Vec2u) this);
    }

    public Vec2u mul_(int factor) {
        return mul(factor, new Vec2u());
    }

    public Vec2u mul(int factor, Vec2u result) {
        return mul((Vec2u) this, factor, factor, result);
    }

    public Vec2u mul(Vec2u factor) {
        return mul(factor, (Vec2u) this);
    }

    public Vec2u mul_(Vec2u factor) {
        return mul(factor, new Vec2u());
    }

    public Vec2u mul(Vec2u factor, Vec2u result) {
        return mul((Vec2u) this, factor.x, factor.y, result);
    }

    public Vec2u mul(int factorX, int factorY, Vec2u result) {
        return mul((Vec2u) this, factorX, factorY, result);
    }

    public Vec2u mul(int factorX, int factorY) {
        return mul((Vec2u) this, factorX, factorY, (Vec2u) this);
    }

    public Vec2u mul_(int factorX, int factorY) {
        return mul((Vec2u) this, factorX, factorY, new Vec2u());
    }

    public static Vec2u mul(Vec2u factor0, int factor1x, int factor1y, Vec2u result) {
        result.x = factor0.x * factor1x;
        result.y = factor0.y * factor1y;
        return result;
    }

    public Vec2u sub(int subtrahend) {
        return sub(subtrahend, (Vec2u) this);
    }

    public Vec2u sub_(int subtrahend) {
        return sub(subtrahend, new Vec2u());
    }

    public Vec2u sub(int subtrahend, Vec2u result) {
        return sub((Vec2u) this, subtrahend, subtrahend, result);
    }

    public Vec2u sub(Vec2u subtrahend) {
        return sub(subtrahend, (Vec2u) this);
    }

    public Vec2u sub_(Vec2u subtrahend) {
        return sub(subtrahend, new Vec2u());
    }

    public Vec2u sub(Vec2u subtrahend, Vec2u result) {
        return sub((Vec2u) this, subtrahend.x, subtrahend.y, result);
    }

    public Vec2u sub(int subtrahendX, int subtrahendY, Vec2u result) {
        return sub((Vec2u) this, subtrahendX, subtrahendY, result);
    }

    public Vec2u sub(int subtrahendX, int subtrahendY) {
        return sub((Vec2u) this, subtrahendX, subtrahendY, (Vec2u) this);
    }

    public Vec2u sub_(int subtrahendX, int subtrahendY) {
        return sub((Vec2u) this, subtrahendX, subtrahendY, new Vec2u());
    }

    public static Vec2u sub(Vec2u minuend, int subtrahendX, int subtrahendY, Vec2u result) {
        result.x = minuend.x - subtrahendX;
        result.y = minuend.y - subtrahendY;
        return result;
    }
    
    public Vec2u mm_() {
        return mm((Vec2u) this, new Vec2u());
    }

    public Vec2u mm() {
        return mm((Vec2u) this, (Vec2u) this);
    }

    public static Vec2u mm(Vec2u minuend, Vec2u result) {
        minuend.x--;
        minuend.y--;
        return minuend;
    }

    public Vec2u pp_() {
        return pp((Vec2u) this, new Vec2u());
    }

    public Vec2u pp() {
        return pp((Vec2u) this, (Vec2u) this);
    }

    public static Vec2u pp(Vec2u addend, Vec2u result) {
        addend.x++;
        addend.y++;
        return addend;
    }
}
