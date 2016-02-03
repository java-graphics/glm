/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

/**
 *
 * @author GBarbieri
 */
public class Vec4 {

    public static final int SIZEOF = 4 * Float.BYTES;

    public float x, y, z, w;

    public Vec4(float f) {
        x = f;
        y = f;
        z = f;
        w = f;
    }

    public Vec4(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public Vec4(Vec2 a, Vec2 b) {
        x = a.x;
        y = a.y;
        z = b.x;
        w = b.y;
    }

    public float[] toFA_() {
        return toFA(new float[4]);
    }

    public float[] toFA(float[] fa) {
        fa[0] = x;
        fa[1] = y;
        fa[2] = z;
        fa[3] = w;
        return fa;
    }
}
