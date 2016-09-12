/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.b;

/**
 *
 * @author elect
 */
abstract class operator {

    public static final int SIZE = 3 * Byte.BYTES;

    public byte x, y, z;

    public Vec3b div(byte divisor) {
        return div(divisor, (Vec3b) this);
    }

    public Vec3b div_(byte divisor) {
        return div(divisor, new Vec3b());
    }

    public Vec3b div(byte divisor, Vec3b result) {
        return div((Vec3b) this, divisor, divisor, divisor, result);
    }

    public Vec3b div(Vec3b divisor) {
        return div(divisor, (Vec3b) this);
    }

    public Vec3b div_(Vec3b divisor) {
        return div(divisor, new Vec3b());
    }

    public Vec3b div(Vec3b divisor, Vec3b result) {
        return div((Vec3b) this, divisor.x, divisor.y, divisor.z, result);
    }

    public Vec3b div_(byte divisorX, byte divisorY, byte divisorZ, Vec3b result) {
        return div((Vec3b) this, divisorX, divisorY, divisorZ, result);
    }

    public Vec3b div(byte divisorX, byte divisorY, byte divisorZ) {
        return div((Vec3b) this, divisorX, divisorY, divisorZ, (Vec3b) this);
    }

    public Vec3b div_(byte divisorX, byte divisorY, byte divisorZ) {
        return div((Vec3b) this, divisorX, divisorY, divisorZ, new Vec3b());
    }

    public static Vec3b div(Vec3b dividend, byte divisorX, byte divisorY, byte divisorZ, Vec3b result) {
        result.x = (byte) (dividend.x / divisorX);
        result.y = (byte) (dividend.y / divisorY);
        result.z = (byte) (dividend.z / divisorZ);
        return result;
    }
}
