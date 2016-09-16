/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.ul;

/**
 *
 * @author GBarbieri
 */
public class Vec3ul {

    public static final int SIZE = 3 * Long.BYTES;

    public long x, y, z;

    public Vec3ul set(long x, long y, long z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }
}
