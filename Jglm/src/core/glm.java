/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import dev.Mat4;

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

    public static Mat4 perspectiveFov(float fov, float width, float height, float zNear, float zFar, Mat4 mat) {
        return GLM_LEFT_HANDED ? perspectiveFovRH(fov, width, height, zNear, zFar, mat)
                : perspectiveFovLH(fov, width, height, zNear, zFar, mat);
    }

    public static Mat4 perspectiveFovRH(float fov, float width, float height, float zNear, float zFar, Mat4 res) {
        float h =  (float) (Math.cos(0.5f * fov) / Math.sin(0.5f * fov));
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
        float h =  (float) (Math.cos(0.5f * fov) / Math.sin(0.5f * fov));
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
