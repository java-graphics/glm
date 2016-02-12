/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.u;

import glm.vec._3.Vec3;
import glm.vec._4.Vec4;
import java.nio.ByteBuffer;

/**
 *
 * @author GBarbieri
 */
public class Vec2u {

    public static final int SIZE = 2 * Integer.BYTES;
    public int x, y;

    public Vec2u() {
        x = 0;
        y = 0;
    }

    public Vec2u(int i) {
        x = i;
        y = i;
    }

    public Vec2u(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vec2u(Vec2u v) {
        x = v.x;
        y = v.y;
    }

    public Vec2u(Vec3 v) {
        x = (int) v.x;
        y = (int) v.y;
    }

    public Vec2u(Vec4 v) {
        x = (int) v.x;
        y = (int) v.y;
    }

    public Vec2u set(int i) {
        x = i;
        y = i;
        return this;
    }

    public Vec2u set(float x, float y) {
        this.x = (int) x;
        this.y = (int) y;
        return this;
    }

    public Vec2u set(int[] ia) {
        x = ia[0];
        y = ia[1];
        return this;
    }

    public float[] toIa_() {
        return toIa(new float[2]);
    }

    public float[] toIa(float[] fa) {
        fa[0] = x;
        fa[1] = y;
        return fa;
    }

    public ByteBuffer toBb(ByteBuffer bb, int index) {
        bb
                .putInt(index * SIZE + 0 * Integer.BYTES, x)
                .putInt(index * SIZE + 1 * Integer.BYTES, y);
        return bb;
    }
}
