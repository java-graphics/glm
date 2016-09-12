/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.d;

/**
 *
 * @author elect
 */
public class Vec2d {

    public final static int SIZE = 2 * Double.BYTES;

    public double x, y;

    public Vec2d set(double x, double y) {
        this.x = x;
        this.y = y;
        return this;
    }
}
