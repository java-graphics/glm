/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.ub;

/**
 *
 * @author GBarbieri
 */
public class Vec4ub {

    public static final int SIZE = 4 * Byte.BYTES;

    public byte x, y, z, w;

    public Vec4ub set(int x, int y, int z, int w) {
        return set((byte) x, (byte) y, (byte) z, (byte) w);
    }

    public Vec4ub set(byte x, byte y, byte z, byte w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }
}
