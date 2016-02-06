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
public class Mat3 {

    public float m00, m10, m20;
    public float m01, m11, m21;
    public float m02, m12, m22;

    public static final int SIZE = 3 * 3 * Float.BYTES;

    public Mat3() {
        m00 = 1.0f;
        m01 = 0.0f;
        m02 = 0.0f;
        m10 = 0.0f;
        m11 = 1.0f;
        m12 = 0.0f;
        m20 = 0.0f;
        m21 = 0.0f;
        m22 = 1.0f;
    }

    public Mat3(Mat3 m) {
        m00 = m.m00;
        m01 = m.m01;
        m02 = m.m02;
        m10 = m.m10;
        m11 = m.m11;
        m12 = m.m12;
        m20 = m.m20;
        m21 = m.m21;
        m22 = m.m22;
    }

    /**
     * Create a new {@link Matrix3f} and make it a copy of the upper left 3x3 of the given {@link Matrix4f}.
     *
     * @param mat
     * the {@link Matrix4f} to copy the values from
     */
    public Mat3(Mat4 mat) {
        m00 = mat.m00;
        m01 = mat.m01;
        m02 = mat.m02;
        m10 = mat.m10;
        m11 = mat.m11;
        m12 = mat.m12;
        m20 = mat.m20;
        m21 = mat.m21;
        m22 = mat.m22;
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

    public Mat3 set(Mat3 m) {
        m00 = m.m00;
        m01 = m.m01;
        m02 = m.m02;
        m10 = m.m10;
        m11 = m.m11;
        m12 = m.m12;
        m20 = m.m20;
        m21 = m.m21;
        m22 = m.m22;
        return this;
    }

    public Mat3 set(Mat4 m) {
        m00 = m.m00;
        m01 = m.m01;
        m02 = m.m02;
        m10 = m.m10;
        m11 = m.m11;
        m12 = m.m12;
        m20 = m.m20;
        m21 = m.m21;
        m22 = m.m22;
        return this;
    }

    /**
     * Return the determinant of this matrix.
     *
     * @return the determinant
     */
    public float det() {
        return (m00 * m11 - m01 * m10) * m22
                + (m02 * m10 - m00 * m12) * m21
                + (m01 * m12 - m02 * m11) * m20;
    }

    public Mat3 invTransp() {
        return invTransp(this);
    }

    /**
     * Invert this matrix.
     *
     * @return this
     */
    public Mat3 invert() {
        return invert(this);
    }

    /**
     * Invert the <code>this</code> matrix and store the result in <code>dest</code>.
     *
     * @param dest
     * will hold the result
     * @return dest
     */
    public Mat3 invert(Mat3 dest) {
        float s = det();
        // client must make sure that matrix is invertible
        s = 1.0f / s;
        dest.set((m11 * m22 - m21 * m12) * s,
                (m21 * m02 - m01 * m22) * s,
                (m01 * m12 - m11 * m02) * s,
                (m20 * m12 - m10 * m22) * s,
                (m00 * m22 - m20 * m02) * s,
                (m10 * m02 - m00 * m12) * s,
                (m10 * m21 - m20 * m11) * s,
                (m20 * m01 - m00 * m21) * s,
                (m00 * m11 - m10 * m01) * s);
        return dest;
    }

    /**
     * Compute a inverse and transpose matrix from <code>this</code> matrix and store it into <code>dest</code>.
     * <p>
     * Please note that, if <code>this</code> is an orthogonal matrix or a matrix whose columns are orthogonal vectors,
     * then this method <i>need not</i> be invoked, since in that case <code>this</code> itself is its normal matrix.
     *
     * @see #set(Matrix3f)
     *
     * @param dest
     * will hold the result
     * @return dest
     */
    public Mat3 invTransp(Mat3 dest) {
        float det = det();
        float s = 1.0f / det;
        /* Invert and transpose in one go */
        dest.set((m11 * m22 - m21 * m12) * s,
                (m20 * m12 - m10 * m22) * s,
                (m10 * m21 - m20 * m11) * s,
                (m21 * m02 - m01 * m22) * s,
                (m00 * m22 - m20 * m02) * s,
                (m20 * m01 - m00 * m21) * s,
                (m01 * m12 - m11 * m02) * s,
                (m10 * m02 - m00 * m12) * s,
                (m00 * m11 - m10 * m01) * s);
        return dest;
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
