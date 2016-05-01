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

    public Vec3 cross(Vec3 y) {
        return cross(y, (Vec3) this);
    }

    public Vec3 cross_(Vec3 y) {
        return cross(y, new Vec3());
    }

    public Vec3 cross(Vec3 y, Vec3 res) {
        return cross((Vec3) this, y, res);
    }

    public static Vec3 cross(Vec3 x, Vec3 y, Vec3 res) {
        return res.set(
                x.y * y.z - y.y * x.z,
                x.z * y.x - y.z * x.x,
                x.x * y.y - y.x * x.y);
    }

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
