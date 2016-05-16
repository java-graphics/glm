/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

import glm.quat.Quat;
import glm.vec._4.Vec4;

/**
 *
 * @author GBarbieri
 */
class funcGeometric extends funcExponential {

    public static float length(float x) {
        return (float)Math.abs(x);
    }
    
    public static float dot(Vec4 v0, Vec4 v1) {
        return Vec4.dot(v0, v1);
    }
    
    public static float dot(Quat v0, Quat v1) {
        return Quat.dot(v0, v1);
    }
}
