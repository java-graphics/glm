/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.b;

/**
 *
 * @author elect
 */
public class Vec4b {

    public static final int SIZE = 4 * Byte.BYTES;

    public byte x, y, z, w;

    public boolean all() {
        return x == 1 && y == 1 && z == 1 && w == 1;
    }
}
