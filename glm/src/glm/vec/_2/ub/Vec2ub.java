/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.ub;

import org.joou.UByte;

/**
 *
 * @author elect
 */
public class Vec2ub {

    public static final int SIZE = 2 * Byte.BYTES;

    public UByte x, y;

    public Vec2ub set(int x, int y) {
        return set(UByte.valueOf(x), UByte.valueOf(y));
    }

    public Vec2ub set(UByte x, UByte y) {
        this.x = x;
        this.y = y;
        return this;
    }
}
