/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.s;

/**
 *
 * @author GBarbieri
 */
public class Vec4s {

    public static final int SIZE = 4 * Short.BYTES;

    public short x, y, z, w;

    public Vec4s set(int x, int y, int z, int w) {
        return set((short) x, (short) y, (short) z);
    }

    public Vec4s set(short x, short y, short z, short w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }
}
