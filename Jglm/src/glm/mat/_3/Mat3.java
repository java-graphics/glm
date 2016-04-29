/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.mat._3;

import glm.mat._4.Mat4;

/**
 *
 * @author GBarbieri
 */
public class Mat3 extends matrixTransform {

    public Mat3() {
        this(1.0f);
    }

    public Mat3(float f) {
        this(
                f, 0, 0,
                0, f, 0,
                0, 0, f);
    }

    public Mat3(Mat3 mat) {
        this(
                mat.m00, mat.m01, mat.m02,
                mat.m10, mat.m11, mat.m12,
                mat.m20, mat.m21, mat.m22);
    }

    public Mat3(Mat4 mat) {
        this(
                mat.m00, mat.m01, mat.m02,
                mat.m10, mat.m11, mat.m12,
                mat.m20, mat.m21, mat.m22);
    }

    public Mat3(double m00, double m01, double m02, double m10, double m11, double m12, double m20, double m21, double m22) {
        this(
                (float) m00, (float) m01, (float) m02,
                (float) m10, (float) m11, (float) m12,
                (float) m20, (float) m21, (float) m22);
    }

    public Mat3(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22) {
        this.m00 = m00;
        this.m01 = m01;
        this.m02 = m02;
        this.m10 = m10;
        this.m11 = m11;
        this.m12 = m12;
        this.m20 = m20;
        this.m21 = m21;
        this.m22 = m22;
    }

    public Mat3 set() {
        return set(1.0f);
    }

    public Mat3 set(float m00) {
        return set(m00, m00, m00, m00, m00, m00, m00, m00, m00);
    }

    public Mat3 set(Mat3 m) {
        return set(m.m00, m.m01, m.m02, m.m10, m.m11, m.m12, m.m20, m.m21, m.m22);
    }

    public Mat3 set(Mat4 m) {
        return set(m.m00, m.m01, m.m02, m.m10, m.m11, m.m12, m.m20, m.m21, m.m22);
    }

    public Mat3 set(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22) {
        this.m00 = m00;
        this.m01 = m01;
        this.m02 = m02;
        this.m10 = m10;
        this.m11 = m11;
        this.m12 = m12;
        this.m20 = m20;
        this.m21 = m21;
        this.m22 = m22;
        return this;
    }
    
    public Mat3 identity() {
        return set();
    }

    public boolean equals(Mat3 other) {
        return equals(other, 2);
    }

    public boolean equals(Mat3 other, int maxUlps) {
        if (!compareFloatEquals(m00, other.m00, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m01, other.m01, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m02, other.m02, maxUlps)) {
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
        if (!compareFloatEquals(m20, other.m20, maxUlps)) {
            return false;
        }
        if (!compareFloatEquals(m21, other.m21, maxUlps)) {
            return false;
        }
        return compareFloatEquals(m22, other.m22, maxUlps);
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
//        if (difference > maxUlps) {
        System.out.println("expected: " + expected + ", actual: " + actual);
        System.out.println("diff " + difference);
//        }
        return !Float.isNaN(expected) && !Float.isNaN(actual) && difference <= maxUlps;
    }

    public float[] toFA_() {
        return toFA(new float[9], 0);
    }

    public float[] toFA(float[] res) {
        return toFA(res, 0);
    }

    public float[] toFA(float[] res, int index) {
        res[index + 0] = m00;
        res[index + 1] = m01;
        res[index + 2] = m02;
        res[index + 3] = m10;
        res[index + 4] = m11;
        res[index + 5] = m12;
        res[index + 6] = m20;
        res[index + 7] = m21;
        res[index + 8] = m22;
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
                + "| " + m00 + " " + m10 + " " + m20 + " |\n"
                + "| " + m01 + " " + m11 + " " + m21 + " |\n"
                + "| " + m02 + " " + m12 + " " + m22 + " |\n";
        if (outStream) {
            System.out.print(res);
        } else {
            System.err.print(res);
        }
    }
}
