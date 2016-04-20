/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3;

import glm.vec._4.Vec4;
import glm.glm;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/**
 *
 * @author GBarbieri
 */
public class Vec3 extends operator {

    public Vec3() {
        x = 0f;
        y = 0f;
        z = 0f;
    }

    public Vec3(Vec4 v) {
        x = v.x;
        y = v.y;
        z = v.z;
    }

    public Vec3(float f) {
        x = f;
        y = f;
        z = f;
    }

    public Vec3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3(float[] fa) {
        this(fa, 0);
    }

    public Vec3(float[] fa, int i) {
        x = fa[i + 0];
        y = fa[i + 1];
        z = fa[i + 2];
    }

    public Vec3(double x, double y, double z) {
        this.x = (float) x;
        this.y = (float) y;
        this.z = (float) z;
    }

    public Vec3 set(float f) {
        x = f;
        y = f;
        z = f;
        return this;
    }

    public Vec3 set(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    public Vec3 set(float[] fa) {
        x = fa[0];
        y = fa[1];
        z = fa[2];
        return this;
    }

    public static Vec3 linearRand_(Vec3 min, Vec3 max) {
        return linearRand(min, max, new Vec3());
    }

    public static Vec3 linearRand(Vec3 min, Vec3 max, Vec3 res) {
        res.x = (float) glm.linearRand(min.x, max.x);
        res.y = (float) glm.linearRand(min.y, max.y);
        res.z = (float) glm.linearRand(min.z, max.z);
        return res;
    }

    public Vec3 negate() {
        return negate(this);
    }

    public Vec3 negate_() {
        return negate(new Vec3());
    }

    public Vec3 negate(Vec3 res) {
        res.x = -x;
        res.y = -y;
        res.z = -z;
        return res;
    }

    /**
     * Normalize this vector.
     *
     * @return this
     */
    public Vec3 normalize() {
        return normalize(this);
    }

    /**
     * Normalize this vector and store the result in <code>dest</code>.
     *
     * @param dest
     * will hold the result
     * @return dest
     */
    public Vec3 normalize(Vec3 dest) {
        float invLength = (float) (1.0 / Math.sqrt(x * x + y * y + z * z));
        dest.x = x * invLength;
        dest.y = y * invLength;
        dest.z = z * invLength;
        return dest;
    }

    public float[] toFA_() {
        return toFA(new float[3]);
    }

    public float[] toFA(float[] fa) {
        fa[0] = x;
        fa[1] = y;
        fa[2] = z;
        return fa;
    }

    public FloatBuffer toDfb_() {
        return toDfb(ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder()).asFloatBuffer());
    }

    public FloatBuffer toDfb(FloatBuffer fb) {
        return toDfb(fb, 0);
    }

    public FloatBuffer toDfb(FloatBuffer fb, int index) {
        return fb
                .put(index + 0, x)
                .put(index + 1, y)
                .put(index + 2, z);
    }

    public ByteBuffer toDbb_() {
        return toDbb(ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder()));
    }

    public ByteBuffer toDbb(ByteBuffer bb) {
        return toDbb(bb, 0);
    }

    public ByteBuffer toDbb(ByteBuffer bb, int index) {
        return bb
                .putFloat(index + 0 * Float.BYTES, x)
                .putFloat(index + 1 * Float.BYTES, y)
                .putFloat(index + 2 * Float.BYTES, z);
    }
}
