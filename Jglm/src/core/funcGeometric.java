/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import dev.Vec4;

/**
 *
 * @author GBarbieri
 */
class funcGeometric extends funcCommon {

    public static float dot(Vec4 v0, Vec4 v1) {
        return v0.x * v1.x + v0.y * v1.y + v0.z * v1.z + v0.w * v1.w;
    }
}
