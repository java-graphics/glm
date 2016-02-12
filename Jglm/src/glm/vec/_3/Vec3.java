/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3;

import glm.vec._4.Vec4;
import glm.glm;

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
        x = -x;
        y = -y;
        z = -z;
        return this;
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

}
