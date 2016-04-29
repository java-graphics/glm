/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4;

/**
 *
 * @author elect
 */
public abstract class funcGeometric extends funcCommon {

    public float dot(Vec4 y) {
        return dot((Vec4) this, y);
    }

    public static float dot(Vec4 x, Vec4 y) {
        float tX = x.x * y.x;
        float tY = x.y * y.y;
        float tZ = x.z * y.z;
        float tW = x.w * y.w;
        return tX + tY + tZ + tW;
    }

}
