/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.us;

import joou.UShort;

/**
 *
 * @author GBarbieri
 */
public class Vec3us {

    public static final int SIZE = 3 * Short.BYTES;

    public UShort x, y, z;

    public Vec3us set(int x, int y, int z) {
        return set(UShort.valueOf(x), UShort.valueOf(y), UShort.valueOf(z));
    }

    public Vec3us set(UShort x, UShort y, UShort z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }
}
