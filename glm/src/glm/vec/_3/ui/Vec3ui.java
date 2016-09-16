/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.ui;

/**
 *
 * @author elect
 */
public class Vec3ui {
    
    public static final int SIZE = 3 * Integer.BYTES;

    public int x, y, z;

    public Vec3ui set(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }
}
