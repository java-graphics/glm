/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

import core.glm;

/**
 *
 * @author GBarbieri
 */
public class Vec3 {

    public float x, y, z;
    public static final int SIZEOF = 3 * Float.BYTES;

    public Vec3() {
        x = 0f;
        y = 0f;
        z = 0f;
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

    public static Vec3 linearRand_(Vec3 min, Vec3 max) {
        return linearRand(min, max, new Vec3());
    }

    public static Vec3 linearRand(Vec3 min, Vec3 max, Vec3 res) {
        res.x = (float) glm.linearRand(min.x, max.x);
        res.y = (float) glm.linearRand(min.y, max.y);
        res.z = (float) glm.linearRand(min.z, max.z);
        return res;
    }

    public float[] toFA(float[] fa) {
        fa[0] = x;
        fa[1] = y;
        fa[2] = z;
        return fa;
    }
}
