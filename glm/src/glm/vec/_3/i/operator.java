/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.i;

/**
 *
 * @author fschaefers
 */
abstract class operator extends funcRelational {

    public Vec3i add(int addend) {
        return add(addend, (Vec3i) this);
    }

    public Vec3i add_(int addend) {
        return add(addend, new Vec3i());
    }

    public Vec3i add(int addend, Vec3i result) {
        return add((Vec3i) this, addend, addend, addend, result);
    }

    public Vec3i add(Vec3i addend) {
        return add(addend, (Vec3i) this);
    }

    public Vec3i add_(Vec3i addend) {
        return add(addend, new Vec3i());
    }

    public Vec3i add(Vec3i addend, Vec3i result) {
        return add((Vec3i) this, addend.x, addend.y, addend.z, result);
    }

    public Vec3i add_(int addendX, int addendY, int addendZ, Vec3i result) {
        return add((Vec3i) this, addendX, addendY, addendZ, result);
    }

    public Vec3i add(int addendX, int addendY, int addendZ) {
        return add((Vec3i) this, addendX, addendY, addendZ, (Vec3i) this);
    }

    public Vec3i add_(int addendX, int addendY, int addendZ) {
        return add((Vec3i) this, addendX, addendY, addendZ, new Vec3i());
    }

    public static Vec3i add(Vec3i addend0, int addend1x, int addend1y, int addend1z, Vec3i result) {
        result.x = addend0.x + addend1x;
        result.y = addend0.y + addend1y;
        result.z = addend0.z + addend1z;
        return result;
    }

    public Vec3i div(int divisor) {
        return div(divisor, (Vec3i) this);
    }

    public Vec3i div_(int divisor) {
        return div(divisor, new Vec3i());
    }

    public Vec3i div(int divisor, Vec3i result) {
        return div((Vec3i) this, divisor, divisor, divisor, result);
    }

    public Vec3i div(Vec3i divisor) {
        return div(divisor, (Vec3i) this);
    }

    public Vec3i div_(Vec3i divisor) {
        return div(divisor, new Vec3i());
    }

    public Vec3i div(Vec3i divisor, Vec3i result) {
        return div((Vec3i) this, divisor.x, divisor.y, divisor.z, result);
    }

    public Vec3i div_(int divisorX, int divisorY, int divisorZ, Vec3i result) {
        return div((Vec3i) this, divisorX, divisorY, divisorZ, result);
    }

    public Vec3i div(int divisorX, int divisorY, int divisorZ) {
        return div((Vec3i) this, divisorX, divisorY, divisorZ, (Vec3i) this);
    }

    public Vec3i div_(int divisorX, int divisorY, int divisorZ) {
        return div((Vec3i) this, divisorX, divisorY, divisorZ, new Vec3i());
    }

    public static Vec3i div(Vec3i dividend, int divisorX, int divisorY, int divisorZ, Vec3i result) {
        result.x = dividend.x / divisorX;
        result.y = dividend.y / divisorY;
        result.z = dividend.z / divisorZ;
        return result;
    }

    public Vec3i mul(int factor) {
        return mul(factor, (Vec3i) this);
    }

    public Vec3i mul_(int factor) {
        return mul(factor, new Vec3i());
    }

    public Vec3i mul(int factor, Vec3i result) {
        return mul((Vec3i) this, factor, factor, factor, result);
    }

    public Vec3i mul(Vec3i factor) {
        return mul(factor, (Vec3i) this);
    }

    public Vec3i mul_(Vec3i factor) {
        return mul(factor, new Vec3i());
    }

    public Vec3i mul(Vec3i factor, Vec3i result) {
        return mul((Vec3i) this, factor.x, factor.y, factor.z, result);
    }

    public Vec3i mul(int factorX, int factorY, int factorZ, Vec3i result) {
        return mul((Vec3i) this, factorX, factorY, factorZ, result);
    }

    public Vec3i mul(int factorX, int factorY, int factorZ) {
        return mul((Vec3i) this, factorX, factorY, factorZ, (Vec3i) this);
    }

    public Vec3i mul_(int factorX, int factorY, int factorZ) {
        return mul((Vec3i) this, factorX, factorY, factorZ, new Vec3i());
    }

    public static Vec3i mul(Vec3i factor0, int factor1x, int factor1y, int factor1z, Vec3i result) {
        result.x = factor0.x * factor1x;
        result.y = factor0.y * factor1y;
        result.z = factor0.z * factor1z;
        return result;
    }

    public Vec3i shiftR_(int shift) {
        return shiftR(x, y, z, shift, shift, shift, new Vec3i());
    }

    public Vec3i shiftR(int shift, Vec3i res) {
        return shiftR(x, y, z, shift, shift, shift, res);
    }

    public Vec3i shiftR(int sx, int sy, int sz, Vec3i res) {
        return shiftR(x, y, z, sx, sy, sz, res);
    }

    public static Vec3i shiftR(int ax, int ay, int az, int sx, int sy, int sz, Vec3i res) {
        res.x = ax >> sx;
        res.y = ay >> sy;
        res.z = az >> sz;
        return res;
    }

    public Vec3i sub(int subtrahend) {
        return sub(subtrahend, (Vec3i) this);
    }

    public Vec3i sub_(int subtrahend) {
        return sub(subtrahend, new Vec3i());
    }

    public Vec3i sub(int subtrahend, Vec3i result) {
        return sub((Vec3i) this, subtrahend, subtrahend, subtrahend, result);
    }

    public Vec3i sub(Vec3i subtrahend) {
        return sub(subtrahend, (Vec3i) this);
    }

    public Vec3i sub_(Vec3i subtrahend) {
        return sub(subtrahend, new Vec3i());
    }

    public Vec3i sub(Vec3i subtrahend, Vec3i result) {
        return sub((Vec3i) this, subtrahend.x, subtrahend.y, subtrahend.z, result);
    }

    public Vec3i sub(int subtrahendX, int subtrahendY, int subtrahendZ, Vec3i result) {
        return sub((Vec3i) this, subtrahendX, subtrahendY, subtrahendZ, result);
    }

    public Vec3i sub(int subtrahendX, int subtrahendY, int subtrahendZ) {
        return sub((Vec3i) this, subtrahendX, subtrahendY, subtrahendZ, (Vec3i) this);
    }

    public Vec3i sub_(int subtrahendX, int subtrahendY, int subtrahendZ) {
        return sub((Vec3i) this, subtrahendX, subtrahendY, subtrahendZ, new Vec3i());
    }

    public static Vec3i sub(Vec3i minuend, int subtrahendX, int subtrahendY, int subtrahendZ, Vec3i result) {
        result.x = minuend.x - subtrahendX;
        result.y = minuend.y - subtrahendY;
        result.z = minuend.z - subtrahendZ;
        return result;
    }
}
