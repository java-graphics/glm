/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import dev.Mat4;
import dev.Vec3;
import dev.Vec4;

/**
 *
 * @author GBarbieri
 */
public class glm {

    public static boolean GLM_LEFT_HANDED = true;

    public static int ceilMultiple(int source, int multiple) {
        if (source > 0) {
            float tmp = source - 1;
            return (int) (tmp + (multiple - (tmp % multiple)));
        } else {
            return source + (-source % multiple);
        }
    }

    public static int packSnorm3x10_1x2(Vec4 v) {
        int[] result = new int[4];
        result[0] = (int) (Math.max(-1, Math.min(1, v.x)) * 511.f);
        result[1] = (int) (Math.max(-1, Math.min(1, v.y)) * 511.f);
        result[2] = (int) (Math.max(-1, Math.min(1, v.z)) * 511.f);
        result[3] = (int) (Math.max(-1, Math.min(1, v.w)) * 1.f);
        result[0] = (result[0] << 22) >>> 22;
        result[1] = (result[1] << 22) >>> 12;
        result[2] = (result[2] << 22) >>> 2;
        result[3] = (result[3] << 30);
        return result[0] | result[1] | result[2] | result[3];
    }

    public static int packF2x11_1x10(Vec3 v) {
        return ((int) v.x << 21) >>> 21 | ((int) v.y << 21) >>> 11 | ((int) v.z << 22);
    }

    /**
     * http://stackoverflow.com/a/18946610/1047713
     *
     * @param min
     * @param max
     * @param res
     * @return
     */
    public static Vec3 linearRand(Vec3 min, Vec3 max, Vec3 res) {
        return Vec3.linearRand(min, max, res);
    }

    public static Vec3 linearRand_(Vec3 min, Vec3 max) {
        return Vec3.linearRand_(min, max);
    }

    public static double linearRand(double min, double max) {
        return Math.random() * (max + Double.MIN_VALUE) + min;
    }

    public static Mat4 perspective_(float fovy, float aspect, float zNear, float zFar) {
        return GLM_LEFT_HANDED ? perspectiveRH(fovy, aspect, zNear, zFar, new Mat4())
                : perspectiveLH(fovy, aspect, zNear, zFar, new Mat4());
    }

    public static Mat4 perspective(float fovy, float aspect, float zNear, float zFar, Mat4 mat) {
        return GLM_LEFT_HANDED ? perspectiveRH(fovy, aspect, zNear, zFar, mat)
                : perspectiveLH(fovy, aspect, zNear, zFar, mat);
    }

    public static Mat4 perspectiveRH(float fovy, float aspect, float zNear, float zFar, Mat4 res) {
        float tanHalfFovy = (float) Math.tan(fovy * 0.5f);
        res.m00 = 1.0f / (aspect * tanHalfFovy);
        res.m01 = 0.0f;
        res.m02 = 0.0f;
        res.m03 = 0.0f;
        res.m10 = 0.0f;
        res.m11 = 1.0f / tanHalfFovy;
        res.m12 = 0.0f;
        res.m13 = 0.0f;
        res.m20 = 0.0f;
        res.m21 = 0.0f;
        res.m22 = -(zFar + zNear) / (zFar - zNear);
        res.m23 = -1.0f;
        res.m30 = 0.0f;
        res.m31 = 0.0f;
        res.m32 = -2.0f * zFar * zNear / (zFar - zNear);
        res.m33 = 0.0f;
        return res;
    }

    public static Mat4 perspectiveLH(float fovy, float aspect, float zNear, float zFar, Mat4 res) {
        float tanHalfFovy = (float) Math.tan(fovy * 0.5f);
        res.m00 = 1.0f / (aspect * tanHalfFovy);
        res.m01 = 0.0f;
        res.m02 = 0.0f;
        res.m03 = 0.0f;
        res.m10 = 0.0f;
        res.m11 = 1.0f / tanHalfFovy;
        res.m12 = 0.0f;
        res.m13 = 0.0f;
        res.m20 = 0.0f;
        res.m21 = 0.0f;
        res.m22 = (zFar + zNear) / (zFar - zNear);
        res.m23 = 1.0f;
        res.m30 = 0.0f;
        res.m31 = 0.0f;
        res.m32 = -2.0f * zFar * zNear / (zFar - zNear);
        res.m33 = 0.0f;
        return res;
    }

    public static Mat4 perspectiveFov_(float fov, float width, float height, float zNear, float zFar) {
        return GLM_LEFT_HANDED ? perspectiveFovRH(fov, width, height, zNear, zFar, new Mat4())
                : perspectiveFovLH(fov, width, height, zNear, zFar, new Mat4());
    }

    public static Mat4 perspectiveFov(float fov, float width, float height, float zNear, float zFar, Mat4 mat) {
        return GLM_LEFT_HANDED ? perspectiveFovRH(fov, width, height, zNear, zFar, mat)
                : perspectiveFovLH(fov, width, height, zNear, zFar, mat);
    }

    public static Mat4 perspectiveFovRH(float fov, float width, float height, float zNear, float zFar, Mat4 res) {
        float h = (float) (Math.cos(0.5f * fov) / Math.sin(0.5f * fov));
        float w = h * height / width;
        res.m00 = w;
        res.m01 = 0.0f;
        res.m02 = 0.0f;
        res.m03 = 0.0f;
        res.m10 = 0.0f;
        res.m11 = h;
        res.m12 = 0.0f;
        res.m13 = 0.0f;
        res.m20 = 0.0f;
        res.m21 = 0.0f;
        res.m22 = -(zFar + zNear) / (zFar - zNear);
        res.m23 = -1.0f;
        res.m30 = 0.0f;
        res.m31 = 0.0f;
        res.m32 = -2.0f * zFar * zNear / (zFar - zNear);
        res.m33 = 0.0f;
        return res;
    }

    public static Mat4 perspectiveFovLH(float fov, float width, float height, float zNear, float zFar, Mat4 res) {
        float h = (float) (Math.cos(0.5f * fov) / Math.sin(0.5f * fov));
        float w = h * height / width;
        res.m00 = w;
        res.m01 = 0.0f;
        res.m02 = 0.0f;
        res.m03 = 0.0f;
        res.m10 = 0.0f;
        res.m11 = h;
        res.m12 = 0.0f;
        res.m13 = 0.0f;
        res.m20 = 0.0f;
        res.m21 = 0.0f;
        res.m22 = (zFar + zNear) / (zFar - zNear);
        res.m23 = 1.0f;
        res.m30 = 0.0f;
        res.m31 = 0.0f;
        res.m32 = -2.0f * zFar * zNear / (zFar - zNear);
        res.m33 = 0.0f;
        return res;
    }
}
