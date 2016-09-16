/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.us;

/**
 *
 * @author GBarbieri
 */
public class Vec2us {

    public static final int SIZE = 2 * Short.BYTES;

    public short x, y;

    public Vec2us set(int x, int y) {
        return set((short) x, (short) y);
    }

    public Vec2us set(short x, short y) {
        this.x = x;
        this.y = y;
        return this;
    }
}
