/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.ub;

/**
 *
 * @author elect
 */
public class Vec2ub {

    public static final int SIZE = 2 * Byte.BYTES;

    public byte x, y;

    public Vec2ub set(int x, int y) {
        return set((byte) x, (byte) y);
    }
    
    public Vec2ub set(byte x, byte y) {
        this.x = x;
        this.y = y;
        return this;
    }
}
