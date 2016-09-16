/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.ub;

import org.joou.UByte;

/**
 *
 * @author elect
 */
public class Vec3ub {
    
    public static final int SIZE = 3 * Byte.BYTES;

    public UByte x, y, z;

    public Vec3ub set(int x, int y, int z) {
        return set(UByte.valueOf(x), UByte.valueOf(y), UByte.valueOf(z));
    }
    
    public Vec3ub set(UByte x, UByte y, UByte z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }
}
