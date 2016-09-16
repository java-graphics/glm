/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.us;

/**
 *
 * @author GBarbieri
 */
public class Vec4us {

    public static final int SIZE = 4 * Short.BYTES;

    public short x, y, z, w;

    public Vec4us set(int x, int y, int z, int w) {
        return set((short) x, (short) y, (short) z, (short) w);
    }

    public Vec4us set(short x, short y, short z, short w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }
}
