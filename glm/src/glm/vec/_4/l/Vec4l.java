/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.l;

/**
 *
 * @author GBarbieri
 */
public class Vec4l {

    public static final int SIZE = 4 * Long.BYTES;

    public long x, y, z, w;

    public Vec4l set(long x, long y, long z, long w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }
}
