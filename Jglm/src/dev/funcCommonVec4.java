/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

import glm.glm;

/**
 *
 * @author GBarbieri
 */
class funcCommonVec4 {

    public static final int SIZE = 4 * Float.BYTES;

    public float x, y, z, w;

    public Vec4 mod_(float divisor) {
        return mod(divisor, new Vec4());
    }

    public Vec4 mod(float divisor, Vec4 result) {
        return glm.mod((Vec4) this, divisor, result);
    }
}
