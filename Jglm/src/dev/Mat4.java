/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

import java.io.PrintStream;

/**
 *
 * @author GBarbieri
 */
public class Mat4 {

    public float m00, m10, m20, m30;
    public float m01, m11, m21, m31;
    public float m02, m12, m22, m32;
    public float m03, m13, m23, m33;

    public Mat4() {
        m00 = 1.0f;
        m01 = 0.0f;
        m02 = 0.0f;
        m03 = 0.0f;
        m10 = 0.0f;
        m11 = 1.0f;
        m12 = 0.0f;
        m13 = 0.0f;
        m20 = 0.0f;
        m21 = 0.0f;
        m22 = 1.0f;
        m23 = 0.0f;
        m30 = 0.0f;
        m31 = 0.0f;
        m32 = 0.0f;
        m33 = 1.0f;
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

    public Mat4 mulPerspective_(float fovy, float aspect, float zNear, float zFar) {
        return mulPerspective(fovy, aspect, zNear, zFar, new Mat4());
    }

    public Mat4 mulPerspective(float fovy, float aspect, float zNear, float zFar, Mat4 res) {
        float h = (float) Math.tan(fovy * 0.5f) * zNear;
        float w = h * aspect;

        // calculate right matrix elements
        float rm00 = zNear / w;
        float rm11 = zNear / h;
        float rm22 = -(zFar + zNear) / (zFar - zNear);
        float rm32 = -2.0f * zFar * zNear / (zFar - zNear);

        // perform optimized matrix multiplication
        float nm20 = m20 * rm22 - m30;
        float nm21 = m21 * rm22 - m31;
        float nm22 = m22 * rm22 - m32;
        float nm23 = m23 * rm22 - m33;
        res.m00 = m00 * rm00;
        res.m01 = m01 * rm00;
        res.m02 = m02 * rm00;
        res.m03 = m03 * rm00;
        res.m10 = m10 * rm11;
        res.m11 = m11 * rm11;
        res.m12 = m12 * rm11;
        res.m13 = m13 * rm11;
        res.m30 = m20 * rm32;
        res.m31 = m21 * rm32;
        res.m32 = m22 * rm32;
        res.m33 = m23 * rm32;
        res.m20 = nm20;
        res.m21 = nm21;
        res.m22 = nm22;
        res.m23 = nm23;

        return res;
    }

    public static Mat4 perspective_(float fovy, float aspect, float zNear, float zFar) {
        return perspective(fovy, aspect, zNear, zFar, new Mat4());
    }

    public static Mat4 perspective(float fovy, float aspect, float zNear, float zFar, Mat4 res) {
        float h = (float) Math.tan(fovy * 0.5f) * zNear;
        float w = h * aspect;
        res.m00 = zNear / w;
        res.m01 = 0.0f;
        res.m02 = 0.0f;
        res.m03 = 0.0f;
        res.m10 = 0.0f;
        res.m11 = zNear / h;
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

    public boolean equals(Mat4 other) {
        return equals(other, 1);
    }

    public boolean equals(Mat4 other, int maxUlps) {
        if (!compareFloatEquals(m00, other.m00, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m01, other.m01, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m02, other.m02, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m03, other.m03, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m10, other.m10, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m11, other.m11, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m12, other.m12, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m13, other.m13, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m20, other.m20, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m21, other.m21, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m22, other.m22, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m23, other.m23, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m30, other.m30, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m31, other.m31, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m32, other.m32, maxUlps)) {
            return false;
        }
        return compareFloatEquals(m33, other.m33, maxUlps);
    }

    /**
     * Compare two floating points for equality within a margin of error.
     *
     * This can be used to compensate for inequality caused by accumulated
     * floating point math errors.
     *
     * The error margin is specified in ULPs (units of least precision).
     * A one-ULP difference means there are no representable floats in between.
     * E.g. 0f and 1.4e-45f are one ULP apart. So are -6.1340704f and -6.13407f.
     * Depending on the number of calculations involved, typically a margin of
     * 1-5 ULPs should be enough.
     *
     * @param expected The expected value.
     * @param actual The actual value.
     * @param maxUlps The maximum difference in ULPs.
     * @return 
     */
    public static boolean compareFloatEquals(float expected, float actual, int maxUlps) {
        int expectedBits = Float.floatToIntBits(expected) < 0 ? 0x80000000 - Float.floatToIntBits(expected) : Float.floatToIntBits(expected);
        int actualBits = Float.floatToIntBits(actual) < 0 ? 0x80000000 - Float.floatToIntBits(actual) : Float.floatToIntBits(actual);
        int difference = expectedBits > actualBits ? expectedBits - actualBits : actualBits - expectedBits;
boolean a = !Float.isNaN(expected);
boolean b = !Float.isNaN(actual);
boolean c = difference <= maxUlps;
        return !Float.isNaN(expected) && !Float.isNaN(actual) && difference <= maxUlps;
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
        String res = title.isEmpty() ? "" : (title + "\n")
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
