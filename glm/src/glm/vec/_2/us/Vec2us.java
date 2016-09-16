/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.us;

import org.joou.UShort;

/**
 *
 * @author GBarbieri
 */
public class Vec2us {

    public static final int SIZE = 2 * Short.BYTES;

    public UShort x, y;

    public Vec2us set(int x, int y) {
        return set(UShort.valueOf(x), UShort.valueOf(y));
    }

    public Vec2us set(UShort x, UShort y) {
        this.x = x;
        this.y = y;
        return this;
    }
}
