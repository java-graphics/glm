/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3;

/**
 *
 * @author elect
 */
public abstract class funcGeometric extends funcCommon {

    public float dot(Vec3 y) {
        return dot((Vec3) this, y);
    }

    public static float dot(Vec3 x, Vec3 y) {
        float tX = x.x * y.x;
        float tY = x.y * y.y;
        float tZ = x.z * y.z;
        return tX + tY + tZ;
    }
}
