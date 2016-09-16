/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.ul;

import org.joou.ULong;

/**
 *
 * @author GBarbieri
 */
public class Vec2ul {

    public static final int SIZE = 2 * Long.BYTES;

    public ULong x, y;

    public Vec2ul set(ULong x, ULong y) {
        this.x = x;
        this.y = y;
        return this;
    }
}
