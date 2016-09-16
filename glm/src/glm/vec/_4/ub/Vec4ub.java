/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.ub;

import org.joou.UByte;

/**
 *
 * @author GBarbieri
 */
public class Vec4ub {

    public static final int SIZE = 4 * Byte.BYTES;

    public UByte x, y, z, w;

    public Vec4ub set(int x, int y, int z, int w) {
        return set(UByte.valueOf(x), UByte.valueOf(y), UByte.valueOf(z), UByte.valueOf(w));
    }

    public Vec4ub set(UByte x, UByte y, UByte z, UByte w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }
}
