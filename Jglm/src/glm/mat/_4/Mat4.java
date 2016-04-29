/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.mat._4;

import glm.vec._3.Vec3;
import glm.vec._4.Vec4;
import glm.glm;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/**
 *
 * @author GBarbieri
 */
public class Mat4 extends matrixTransform {

    public Mat4() {
        this(1.0f);
    }

    public Mat4(float f) {
        this(
                f, 0, 0, 0,
                0, f, 0, 0,
                0, 0, f, 0,
                0, 0, 0, f);
    }

    public Mat4(Mat4 mat) {
        this(
                mat.m00, mat.m01, mat.m02, mat.m03,
                mat.m10, mat.m11, mat.m12, mat.m13,
                mat.m20, mat.m21, mat.m22, mat.m23,
                mat.m30, mat.m31, mat.m32, mat.m33);
    }

    public Mat4(double m00, double m01, double m02, double m03, double m10, double m11, double m12, double m13,
            double m20, double m21, double m22, double m23, double m30, double m31, double m32, double m33) {
        this(
                (float) m00, (float) m01, (float) m02, (float) m03,
                (float) m10, (float) m11, (float) m12, (float) m13,
                (float) m20, (float) m21, (float) m22, (float) m23,
                (float) m30, (float) m31, (float) m32, (float) m33);
    }

    public Mat4(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13,
            float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {
        this.m00 = m00;
        this.m01 = m01;
        this.m02 = m02;
        this.m03 = m03;
        this.m10 = m10;
        this.m11 = m11;
        this.m12 = m12;
        this.m13 = m13;
        this.m20 = m20;
        this.m21 = m21;
        this.m22 = m22;
        this.m23 = m23;
        this.m30 = m30;
        this.m31 = m31;
        this.m32 = m32;
        this.m33 = m33;
    }

    public Mat4 set() {
        return set(0);
    }

    public Mat4 set(float f) {
        return set(
                f, 0, 0, 0,
                0, f, 0, 0,
                0, 0, f, 0,
                0, 0, 0, f);
    }

    public Mat4 set(Mat4 mat) {
        return set(
                mat.m00, mat.m01, mat.m02, mat.m03,
                mat.m10, mat.m11, mat.m12, mat.m13,
                mat.m20, mat.m21, mat.m22, mat.m23,
                mat.m30, mat.m31, mat.m32, mat.m33);
    }

    public Mat4 set(double m00, double m01, double m02, double m03, double m10, double m11, double m12, double m13,
            double m20, double m21, double m22, double m23, double m30, double m31, double m32, double m33) {

        return set(
                (float) m00, (float) m01, (float) m02, (float) m03,
                (float) m10, (float) m11, (float) m12, (float) m13,
                (float) m20, (float) m21, (float) m22, (float) m23,
                (float) m30, (float) m31, (float) m32, (float) m33);
    }

    public Mat4 set(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13,
            float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {
        
        this.m00 = m00;
        this.m01 = m01;
        this.m02 = m02;
        this.m03 = m03;
        this.m10 = m10;
        this.m11 = m11;
        this.m12 = m12;
        this.m13 = m13;
        this.m20 = m20;
        this.m21 = m21;
        this.m22 = m22;
        this.m23 = m23;
        this.m30 = m30;
        this.m31 = m31;
        this.m32 = m32;
        this.m33 = m33;
        return this;
    }

    public Mat4 identity() {
        return set(1.0f);
    }

    public Vec4 mul(Vec4 v) {
        return mul(v, v);
    }

    public Vec4 mul(Vec4 right, Vec4 res) {
        res.set(m00 * right.x + m10 * right.y + m20 * right.z + m30 * right.w,
                m01 * right.x + m11 * right.y + m21 * right.z + m31 * right.w,
                m02 * right.x + m12 * right.y + m22 * right.z + m32 * right.w,
                m03 * right.x + m13 * right.y + m23 * right.z + m33 * right.w);
        return res;
    }

    public Mat4 mul_(Mat4 right) {
        return mul(right, new Mat4());
    }

    public Mat4 mul(Mat4 right) {
        return mul(right, this);
    }

    public Mat4 mul(Mat4 right, Mat4 dest) {
        dest.set(
                m00 * right.m00 + m10 * right.m01 + m20 * right.m02 + m30 * right.m03,
                m01 * right.m00 + m11 * right.m01 + m21 * right.m02 + m31 * right.m03,
                m02 * right.m00 + m12 * right.m01 + m22 * right.m02 + m32 * right.m03,
                m03 * right.m00 + m13 * right.m01 + m23 * right.m02 + m33 * right.m03,
                m00 * right.m10 + m10 * right.m11 + m20 * right.m12 + m30 * right.m13,
                m01 * right.m10 + m11 * right.m11 + m21 * right.m12 + m31 * right.m13,
                m02 * right.m10 + m12 * right.m11 + m22 * right.m12 + m32 * right.m13,
                m03 * right.m10 + m13 * right.m11 + m23 * right.m12 + m33 * right.m13,
                m00 * right.m20 + m10 * right.m21 + m20 * right.m22 + m30 * right.m23,
                m01 * right.m20 + m11 * right.m21 + m21 * right.m22 + m31 * right.m23,
                m02 * right.m20 + m12 * right.m21 + m22 * right.m22 + m32 * right.m23,
                m03 * right.m20 + m13 * right.m21 + m23 * right.m22 + m33 * right.m23,
                m00 * right.m30 + m10 * right.m31 + m20 * right.m32 + m30 * right.m33,
                m01 * right.m30 + m11 * right.m31 + m21 * right.m32 + m31 * right.m33,
                m02 * right.m30 + m12 * right.m31 + m22 * right.m32 + m32 * right.m33,
                m03 * right.m30 + m13 * right.m31 + m23 * right.m32 + m33 * right.m33);
        return dest;
    }

    public boolean equals3(Mat4 other) {
        return equals3(other, 2);
    }

    public boolean equals3(Mat4 other, int maxUlps) {
        if (!glm.compareFloatEquals(m00, other.m00, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m01, other.m01, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m02, other.m02, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m10, other.m10, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m11, other.m11, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m12, other.m12, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m20, other.m20, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m21, other.m21, maxUlps)) {
            return false;
        }
        return glm.compareFloatEquals(m22, other.m22, maxUlps);
    }

    public boolean equals(Mat4 other) {
        return equals(other, 2);
    }

    public boolean equals(Mat4 other, int maxUlps) {
        if (!glm.compareFloatEquals(m00, other.m00, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m01, other.m01, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m02, other.m02, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m03, other.m03, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m10, other.m10, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m11, other.m11, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m12, other.m12, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m13, other.m13, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m20, other.m20, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m21, other.m21, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m22, other.m22, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m23, other.m23, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m30, other.m30, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m31, other.m31, maxUlps)) {
            return false;
        }
        if (!glm.compareFloatEquals(m32, other.m32, maxUlps)) {
            return false;
        }
        return glm.compareFloatEquals(m33, other.m33, maxUlps);
    }

    public float[] toFa_() {
        return toFa(new float[16]);
    }

    public float[] toFa(float[] res) {
        return toFa(res, 0);
    }

    public float[] toFa(float[] res, int index) {
        res[index + 0] = m00;
        res[index + 1] = m01;
        res[index + 2] = m02;
        res[index + 3] = m03;
        res[index + 4] = m10;
        res[index + 5] = m11;
        res[index + 6] = m12;
        res[index + 7] = m13;
        res[index + 8] = m20;
        res[index + 9] = m21;
        res[index + 10] = m22;
        res[index + 11] = m23;
        res[index + 12] = m30;
        res[index + 13] = m31;
        res[index + 14] = m32;
        res[index + 15] = m33;
        return res;
    }

    public ByteBuffer toDbb_() {
        return Mat4.this.toDbb(ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder()));
    }

    public ByteBuffer toDbb(ByteBuffer res) {
        return toDbb(res, 0);
    }

    public ByteBuffer toDbb(ByteBuffer res, int index) {
        res.putFloat(index + 0 * Float.BYTES, m00);
        res.putFloat(index + 1 * Float.BYTES, m01);
        res.putFloat(index + 2 * Float.BYTES, m02);
        res.putFloat(index + 3 * Float.BYTES, m03);
        res.putFloat(index + 4 * Float.BYTES, m10);
        res.putFloat(index + 5 * Float.BYTES, m11);
        res.putFloat(index + 6 * Float.BYTES, m12);
        res.putFloat(index + 7 * Float.BYTES, m13);
        res.putFloat(index + 8 * Float.BYTES, m20);
        res.putFloat(index + 9 * Float.BYTES, m21);
        res.putFloat(index + 10 * Float.BYTES, m22);
        res.putFloat(index + 11 * Float.BYTES, m23);
        res.putFloat(index + 12 * Float.BYTES, m30);
        res.putFloat(index + 13 * Float.BYTES, m31);
        res.putFloat(index + 14 * Float.BYTES, m32);
        res.putFloat(index + 15 * Float.BYTES, m33);
        return res;
    }

    public FloatBuffer toDfb_() {
        return toDfb(ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder()).asFloatBuffer());
    }

    public FloatBuffer toDfb(FloatBuffer res) {
        return toDfb(res, 0);
    }

    public FloatBuffer toDfb(FloatBuffer res, int index) {
        res.put(index + 0, m00);
        res.put(index + 1, m01);
        res.put(index + 2, m02);
        res.put(index + 3, m03);
        res.put(index + 4, m10);
        res.put(index + 5, m11);
        res.put(index + 6, m12);
        res.put(index + 7, m13);
        res.put(index + 8, m20);
        res.put(index + 9, m21);
        res.put(index + 10, m22);
        res.put(index + 11, m23);
        res.put(index + 12, m30);
        res.put(index + 13, m31);
        res.put(index + 14, m32);
        res.put(index + 15, m33);
        return res;
    }

    public void print() {
        print("", true);
    }

    public void print(String title) {
        print(title, true);
    }

    public void print(boolean outStream) {
        print("", outStream);
    }

    public void print(String title, boolean outStream) {
        String res = title + "\n"
                + "| " + m00 + " " + m10 + " " + m20 + " " + m30 + " |\n"
                + "| " + m01 + " " + m11 + " " + m21 + " " + m31 + " |\n"
                + "| " + m02 + " " + m12 + " " + m22 + " " + m32 + " |\n"
                + "| " + m03 + " " + m13 + " " + m23 + " " + m33 + " |\n";
        if (outStream) {
            System.out.print(res);
        } else {
            System.err.print(res);
        }
    }
}
