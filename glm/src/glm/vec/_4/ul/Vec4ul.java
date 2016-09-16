/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.ul;

import joou.ULong;

/**
 *
 * @author GBarbieri
 */
public class Vec4ul {

    public static final int SIZE = 4 * Long.BYTES;

    public ULong x, y, z, w;

    public Vec4ul set(ULong x, ULong y, ULong z, ULong w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }
}
