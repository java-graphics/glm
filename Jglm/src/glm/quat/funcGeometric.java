/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.quat;

/**
 *
 * @author elect
 */
abstract class funcGeometric extends funcCommon {

    public float dot(Quat q) {
        return w * q.w + x * q.x + y * q.y + z * q.z;
    }

    public static float dot(Quat q1, Quat q2) {
        return q1.x * q2.x + q1.y * q2.y + q1.z * q2.z + q1.w * q2.w;
    }

    public float length() {
        return length((Quat) this);
    }

    public static float length(Quat q) {
        return (float) Math.sqrt(dot(q, q));
    }

    public Quat normalize() {
        return Quat.normalize((Quat) this, (Quat) this);
    }

    public Quat normalize_() {
        return Quat.normalize((Quat) this, new Quat());
    }

    public Quat normalize(Quat res) {
        return Quat.normalize((Quat) this, res);
    }

    public static Quat normalize(Quat q, Quat res) {
        float len = length(q);
        if (len <= 0) { // Problem
            return new Quat(1, 0, 0, 0);
        }
        float oneOverLen = 1 / len;
        return res.set(q.w * oneOverLen, q.x * oneOverLen, q.y * oneOverLen, q.z * oneOverLen);
    }
}
