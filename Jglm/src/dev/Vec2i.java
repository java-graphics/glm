/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

/**
 *
 * @author GBarbieri
 */
public class Vec2i {

    public int x, y;
    public static final int SIZEOF = 2 * Integer.BYTES;

    public Vec2i() {
        x = 0;
        y = 0;
    }

    public Vec2i(Vec2i v) {
        x = v.x;
        y = v.y;
    }

    public Vec2i(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vec2i set(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }
}
