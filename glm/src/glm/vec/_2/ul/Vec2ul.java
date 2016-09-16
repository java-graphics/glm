/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.ul;

/**
 *
 * @author GBarbieri
 */
public class Vec2ul {

    public static final int SIZE = 2 * Long.BYTES;

    public long x, y;

    public Vec2ul set(long x, long y) {
        this.x = x;
        this.y = y;
        return this;
    }
}
