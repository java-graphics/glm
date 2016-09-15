/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.d;

/**
 *
 * @author GBarbieri
 */
public class Vec3d {

    public final static int SIZE = 3 * Double.BYTES;

    public double x, y, z;

    public Vec3d set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }
}
