/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.us;

import joou.UShort;

/**
 *
 * @author GBarbieri
 */
public class Vec4us {

    public static final int SIZE = 4 * Short.BYTES;

    public UShort x, y, z, w;

    public Vec4us set(int x, int y, int z, int w) {
        return set(UShort.valueOf(x), UShort.valueOf(y), UShort.valueOf(z), UShort.valueOf(w));
    }

    public Vec4us set(UShort x, UShort y, UShort z, UShort w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }
}
