/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

import core.glm;
import java.nio.ByteBuffer;

/**
 *
 * @author GBarbieri
 */
public class Mat4 {

    public float m00, m10, m20, m30;
    public float m01, m11, m21, m31;
    public float m02, m12, m22, m32;
    public float m03, m13, m23, m33;

    public static final int SIZE = 4 * 4 * Float.BYTES;

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

    public Mat4(float s) {
        m00 = s;
        m01 = 0.0f;
        m02 = 0.0f;
        m03 = 0.0f;
        m10 = 0.0f;
        m11 = s;
        m12 = 0.0f;
        m13 = 0.0f;
        m20 = 0.0f;
        m21 = 0.0f;
        m22 = s;
        m23 = 0.0f;
        m30 = 0.0f;
        m31 = 0.0f;
        m32 = 0.0f;
        m33 = s;
    }

    public Mat4(Mat4 m) {
        m00 = m.m00;
        m01 = m.m01;
        m02 = m.m02;
        m03 = m.m03;
        m10 = m.m10;
        m11 = m.m11;
        m12 = m.m12;
        m13 = m.m13;
        m20 = m.m20;
        m21 = m.m21;
        m22 = m.m22;
        m23 = m.m23;
        m30 = m.m30;
        m31 = m.m31;
        m32 = m.m32;
        m33 = m.m33;
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

    public Mat4 set(Mat4 m) {
        m00 = m.m00;
        m01 = m.m01;
        m02 = m.m02;
        m03 = m.m03;
        m10 = m.m10;
        m11 = m.m11;
        m12 = m.m12;
        m13 = m.m13;
        m20 = m.m20;
        m21 = m.m21;
        m22 = m.m22;
        m23 = m.m23;
        m30 = m.m30;
        m31 = m.m31;
        m32 = m.m32;
        m33 = m.m33;
        return this;
    }

    public float det() {
        return (m00 * m11 - m01 * m10) * (m22 * m33 - m23 * m32)
                + (m02 * m10 - m00 * m12) * (m21 * m33 - m23 * m31)
                + (m00 * m13 - m03 * m10) * (m21 * m32 - m22 * m31)
                + (m01 * m12 - m02 * m11) * (m20 * m33 - m23 * m30)
                + (m03 * m11 - m01 * m13) * (m20 * m32 - m22 * m30)
                + (m02 * m13 - m03 * m12) * (m20 * m31 - m21 * m30);
    }

    /**
     * Return the determinant of the upper left 3x3 submatrix of this matrix.
     *
     * @return the determinant
     */
    public float det3() {
        return (m00 * m11 - m01 * m10) * m22
                + (m02 * m10 - m00 * m12) * m21
                + (m01 * m12 - m02 * m11) * m20;
    }

    /**
     * Return the determinant of this matrix by assuming that it represents an
     * {@link #isAffine() affine} transformation and thus its last row is equal
     * to <tt>(0, 0, 0, 1)</tt>.
     *
     * @return the determinant
     */
    public float det4x3() {
        return (m00 * m11 - m01 * m10) * m22
                + (m02 * m10 - m00 * m12) * m21
                + (m01 * m12 - m02 * m11) * m20;
    }

    public Mat4 identity() {
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
        return this;
    }

    /**
     * Invert this matrix and write the result into <code>dest</code>.
     * <p>
     * If <code>this</code> matrix represents an {@link #isAffine() affine}
     * transformation, such as translation, rotation, scaling and shearing, and
     * thus its last row is equal to <tt>(0, 0, 0, 1)</tt>, then
     * {@link #invert4x3(Matrix4f)} can be used instead of this method.
     *
     * @see #invert4x3(Matrix4f)
     * @return dest
     */
    public Mat4 inverse() {
        return inverse(this);
    }

    /**
     * Invert this matrix.
     * <p>
     * If <code>this</code> matrix represents an {@link #isAffine() affine}
     * transformation, such as translation, rotation, scaling and shearing, and
     * thus its last row is equal to <tt>(0, 0, 0, 1)</tt>, then
     * {@link #inverse4x3()} can be used instead of this method.
     *
     * @param dest
     * @see #inverse4x3()
     *
     * @return this
     */
    public Mat4 inverse(Mat4 dest) {
        float a = m00 * m11 - m01 * m10;
        float b = m00 * m12 - m02 * m10;
        float c = m00 * m13 - m03 * m10;
        float d = m01 * m12 - m02 * m11;
        float e = m01 * m13 - m03 * m11;
        float f = m02 * m13 - m03 * m12;
        float g = m20 * m31 - m21 * m30;
        float h = m20 * m32 - m22 * m30;
        float i = m20 * m33 - m23 * m30;
        float j = m21 * m32 - m22 * m31;
        float k = m21 * m33 - m23 * m31;
        float l = m22 * m33 - m23 * m32;
        float det = a * l - b * k + c * j + d * i - e * h + f * g;
        det = 1.0f / det;
        dest.set((m11 * l - m12 * k + m13 * j) * det,
                (-m01 * l + m02 * k - m03 * j) * det,
                (m31 * f - m32 * e + m33 * d) * det,
                (-m21 * f + m22 * e - m23 * d) * det,
                (-m10 * l + m12 * i - m13 * h) * det,
                (m00 * l - m02 * i + m03 * h) * det,
                (-m30 * f + m32 * c - m33 * b) * det,
                (m20 * f - m22 * c + m23 * b) * det,
                (m10 * k - m11 * i + m13 * g) * det,
                (-m00 * k + m01 * i - m03 * g) * det,
                (m30 * e - m31 * c + m33 * a) * det,
                (-m20 * e + m21 * c - m23 * a) * det,
                (-m10 * j + m11 * h - m12 * g) * det,
                (m00 * j - m01 * h + m02 * g) * det,
                (-m30 * d + m31 * b - m32 * a) * det,
                (m20 * d - m21 * b + m22 * a) * det);
        return dest;
    }

    /**
     * Invert this matrix by assuming that it is an {@link #isAffine() affine}
     * transformation (i.e. its last row is equal to <tt>(0, 0, 0, 1)</tt>).
     *
     * @return this
     */
    public Mat4 inverse4x3() {
        return inverse4x3(this);
    }

    /**
     * Invert this matrix by assuming that it is an {@link #isAffine() affine}
     * transformation (i.e. its last row is equal to <tt>(0, 0, 0, 1)</tt>) and
     * write the result into <code>dest</code>.
     *
     * @param dest will hold the result
     * @return dest
     */
    public Mat4 inverse4x3(Mat4 dest) {
        float s = det4x3();
        s = 1.0f / s;
        float m10m22 = m10 * m22;
        float m10m21 = m10 * m21;
        float m10m02 = m10 * m02;
        float m10m01 = m10 * m01;
        float m11m22 = m11 * m22;
        float m11m20 = m11 * m20;
        float m11m02 = m11 * m02;
        float m11m00 = m11 * m00;
        float m12m21 = m12 * m21;
        float m12m20 = m12 * m20;
        float m12m01 = m12 * m01;
        float m12m00 = m12 * m00;
        float m20m02 = m20 * m02;
        float m20m01 = m20 * m01;
        float m21m02 = m21 * m02;
        float m21m00 = m21 * m00;
        float m22m01 = m22 * m01;
        float m22m00 = m22 * m00;
        dest.set((m11m22 - m12m21) * s,
                (m21m02 - m22m01) * s,
                (m12m01 - m11m02) * s,
                0.0f,
                (m12m20 - m10m22) * s,
                (m22m00 - m20m02) * s,
                (m10m02 - m12m00) * s,
                0.0f,
                (m10m21 - m11m20) * s,
                (m20m01 - m21m00) * s,
                (m11m00 - m10m01) * s,
                0.0f,
                (m10m22 * m31 - m10m21 * m32 + m11m20 * m32 - m11m22 * m30 + m12m21 * m30 - m12m20 * m31) * s,
                (m20m02 * m31 - m20m01 * m32 + m21m00 * m32 - m21m02 * m30 + m22m01 * m30 - m22m00 * m31) * s,
                (m11m02 * m30 - m12m01 * m30 + m12m00 * m31 - m10m02 * m31 + m10m01 * m32 - m11m00 * m32) * s,
                1.0f);
        return dest;
    }

    public Mat4 invTransp() {
        return invTransp3(this);
    }

    /**
     * Compute a normal matrix from the upper left 3x3 submatrix of
     * <code>this</code> and store it into the upper left 3x3 submatrix of
     * <code>dest</code>. All other values of <code>dest</code> will be set to
     * {@link #identity() identity}.
     * <p>
     * The normal matrix of <tt>m</tt> is the transpose of the inverse of
     * <tt>m</tt>.
     * <p>
     * Please note that, if <code>this</code> is an orthogonal matrix or a
     * matrix whose columns are orthogonal vectors, then this method <i>need
     * not</i> be invoked, since in that case <code>this</code> itself is its
     * normal matrix. In that case, use {@link #set3x3(Matrix4f)} to set a given
     * Matrix4f to only the upper left 3x3 submatrix of this matrix.
     *
     * @see #set3x3(Matrix4f)
     *
     * @param dest will hold the result
     * @return dest
     */
    public Mat4 invTransp3(Mat4 dest) {
        float det = det3();
        float s = 1.0f / det;
        /* Invert and transpose in one go */
        dest.set((m11 * m22 - m21 * m12) * s,
                (m20 * m12 - m10 * m22) * s,
                (m10 * m21 - m20 * m11) * s,
                0.0f,
                (m21 * m02 - m01 * m22) * s,
                (m00 * m22 - m20 * m02) * s,
                (m20 * m01 - m00 * m21) * s,
                0.0f,
                (m01 * m12 - m11 * m02) * s,
                (m10 * m02 - m00 * m12) * s,
                (m00 * m11 - m10 * m01) * s,
                0.0f,
                0.0f, 0.0f, 0.0f, 1.0f);
        return dest;
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

    // Vec must be normalized
    public Mat4 rotation(float angle, float x, float y, float z) {
        float c = (float) Math.cos(angle);
        float s = (float) Math.sin(angle);
        float t = (float) (1.0 - c);
        m00 = c + x * x * t;
        m11 = c + y * y * t;
        m22 = c + z * z * t;
        float tmp1 = x * y * t;
        float tmp2 = z * s;
        m01 = tmp1 + tmp2;
        m10 = tmp1 - tmp2;
        tmp1 = x * z * t;
        tmp2 = y * s;
        m02 = tmp1 - tmp2;
        m20 = tmp1 + tmp2;
        tmp1 = y * z * t;
        tmp2 = x * s;
        m12 = tmp1 + tmp2;
        m21 = tmp1 - tmp2;
        m03 = 0;
        m13 = 0;
        m23 = 0;
        m30 = 0;
        m31 = 0;
        m32 = 0;
        m33 = 1;
        return this;
    }

    public Mat4 rotate(float angle, float x, float y, float z) {
        return rotate(angle, x, y, z, this);
    }

    /**
     * Vec must be normalized.
     *
     * @param angle
     * @param x
     * @param y
     * @param z
     * @param dest
     * @return
     */
    public Mat4 rotate(float angle, float x, float y, float z, Mat4 dest) {
        float s = (float) Math.sin(angle);
        float c = (float) Math.cos(angle);
        float C = 1.0f - c;
        // rotation matrix elements: m30, m31, m32, m03, m13, m23 = 0, m33 = 1
        float xx = x * x, xy = x * y, xz = x * z;
        float yy = y * y, yz = y * z;
        float zz = z * z;
        float rm00 = xx * C + c;
        float rm01 = xy * C + z * s;
        float rm02 = xz * C - y * s;
        float rm10 = xy * C - z * s;
        float rm11 = yy * C + c;
        float rm12 = yz * C + x * s;
        float rm20 = xz * C + y * s;
        float rm21 = yz * C - x * s;
        float rm22 = zz * C + c;
        // add temporaries for dependent values
        float nm00 = m00 * rm00 + m10 * rm01 + m20 * rm02;
        float nm01 = m01 * rm00 + m11 * rm01 + m21 * rm02;
        float nm02 = m02 * rm00 + m12 * rm01 + m22 * rm02;
        float nm03 = m03 * rm00 + m13 * rm01 + m23 * rm02;
        float nm10 = m00 * rm10 + m10 * rm11 + m20 * rm12;
        float nm11 = m01 * rm10 + m11 * rm11 + m21 * rm12;
        float nm12 = m02 * rm10 + m12 * rm11 + m22 * rm12;
        float nm13 = m03 * rm10 + m13 * rm11 + m23 * rm12;
        // set non-dependent values directly
        dest.m20 = m00 * rm20 + m10 * rm21 + m20 * rm22;
        dest.m21 = m01 * rm20 + m11 * rm21 + m21 * rm22;
        dest.m22 = m02 * rm20 + m12 * rm21 + m22 * rm22;
        dest.m23 = m03 * rm20 + m13 * rm21 + m23 * rm22;
        // set other values
        dest.m00 = nm00;
        dest.m01 = nm01;
        dest.m02 = nm02;
        dest.m03 = nm03;
        dest.m10 = nm10;
        dest.m11 = nm11;
        dest.m12 = nm12;
        dest.m13 = nm13;
        dest.m30 = m30;
        dest.m31 = m31;
        dest.m32 = m32;
        dest.m33 = m33;
        return dest;
    }
    
    /**
     * Apply scaling to this matrix by uniformly scaling all base axes by the given <code>xyz</code> factor.
     * <p>
     * If <code>M</code> is <code>this</code> matrix and <code>S</code> the scaling matrix,
     * then the new matrix will be <code>M * S</code>. So when transforming a
     * vector <code>v</code> with the new matrix by using <code>M * S * v</code>, the
     * scaling will be applied first!
     * <p>
     * Individual scaling of all three axes can be applied using {@link #scale(float, float, float)}. 
     * 
     * @see #scale(float, float, float)
     * 
     * @param xyz
     *            the factor for all components
     * @return this
     */
    public Mat4 scale(float xyz) {
        return scale(xyz, xyz, xyz);
    }
    
    public Mat4 scale(Vec3 v) {
        return scale(v.x, v.y, v.z);
    }
    
    public Mat4 scale(Vec3 v, Mat4 res) {
        return scale(v.x, v.y, v.z, res);
    }
    
    /**
     * Apply scaling to this matrix by scaling the base axes by the given x,
     * y and z factors.
     * <p>
     * If <code>M</code> is <code>this</code> matrix and <code>S</code> the scaling matrix,
     * then the new matrix will be <code>M * S</code>. So when transforming a
     * vector <code>v</code> with the new matrix by using <code>M * S * v</code>, the
     * scaling will be applied first!
     * 
     * @param x
     *            the factor of the x component
     * @param y
     *            the factor of the y component
     * @param z
     *            the factor of the z component
     * @return this
     */
    public Mat4 scale(float x, float y, float z) {
        return scale(x, y, z, this);
    }
    
    /**
     * Apply scaling to the this matrix by scaling the base axes by the given x,
     * y and z factors and store the result in <code>dest</code>.
     * <p>
     * If <code>M</code> is <code>this</code> matrix and <code>S</code> the scaling matrix,
     * then the new matrix will be <code>M * S</code>. So when transforming a
     * vector <code>v</code> with the new matrix by using <code>M * S * v</code>
     * , the scaling will be applied first!
     * 
     * @param x
     *            the factor of the x component
     * @param y
     *            the factor of the y component
     * @param z
     *            the factor of the z component
     * @param dest
     *            will hold the result
     * @return dest
     */
    public Mat4 scale(float x, float y, float z, Mat4 dest) {
        // scale matrix elements:
        // m00 = x, m11 = y, m22 = z
        // m33 = 1
        // all others = 0
        dest.m00 = m00 * x;
        dest.m01 = m01 * x;
        dest.m02 = m02 * x;
        dest.m03 = m03 * x;
        dest.m10 = m10 * y;
        dest.m11 = m11 * y;
        dest.m12 = m12 * y;
        dest.m13 = m13 * y;
        dest.m20 = m20 * z;
        dest.m21 = m21 * z;
        dest.m22 = m22 * z;
        dest.m23 = m23 * z;
        dest.m30 = m30;
        dest.m31 = m31;
        dest.m32 = m32;
        dest.m33 = m33;
        return dest;
    }

    public Mat4 translation(float x, float y, float z) {
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
        m30 = x;
        m31 = y;
        m32 = z;
        m33 = 1.0f;
        return this;
    }

    public Mat4 translate(Vec3 v) {
        return translate(this, v.x, v.y, v.z);
    }

    public Mat4 translate(float x, float y, float z) {
        return translate(this, x, y, z);
    }

    public Mat4 translate(Mat4 res, Vec3 v) {
        return translate(res, v.x, v.y, v.z);
    }

    public Mat4 translate(Mat4 res, float x, float y, float z) {
        // translation matrix elements: m00, m11, m22, m33 = 1
        // m30 = x, m31 = y, m32 = z, all others = 0
        res.m30 = res.m00 * x + res.m10 * y + res.m20 * z + res.m30;
        res.m31 = res.m01 * x + res.m11 * y + res.m21 * z + res.m31;
        res.m32 = res.m02 * x + res.m12 * y + res.m22 * z + res.m32;
        res.m33 = res.m03 * x + res.m13 * y + res.m23 * z + res.m33;
        return this;
    }

    public Mat4 perspective(float fovy, float aspect, float zNear, float zFar) {
        return glm.perspective(fovy, aspect, zNear, zFar, this);
    }

    public static Mat4 perspective(float fovy, float aspect, float zNear, float zFar, Mat4 res) {
        return glm.perspective(fovy, aspect, zNear, zFar, res);
    }

    public Mat4 perspectiveFov(float fov, float width, float height, float zNear, float zFar) {
        return glm.perspectiveFov(fov, width, height, zNear, zFar, this);
    }

    public static Mat4 perspectiveFov(float fov, float width, float height, float zNear, float zFar, Mat4 res) {
        return glm.perspectiveFov(fov, width, height, zNear, zFar, res);
    }

    public Mat4 mulPerspective(float fovy, float aspect, float zNear, float zFar) {
        return mulPerspective(fovy, aspect, zNear, zFar, this);
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

    public float[] toFA_() {
        return toFA(new float[16]);
    }

    public float[] toFA(float[] res) {
        return Mat4.this.toFA(res, 0);
    }

    public float[] toFA(float[] res, int index) {
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

    public ByteBuffer toFB_() {
        return toFB(ByteBuffer.allocate(16 * Float.BYTES));
    }

    public ByteBuffer toFB(ByteBuffer res) {
        return toFB(res, 0);
    }

    public ByteBuffer toFB(ByteBuffer res, int index) {
        res.putFloat(index + 0, m00);
        res.putFloat(index + 1, m01);
        res.putFloat(index + 2, m02);
        res.putFloat(index + 3, m03);
        res.putFloat(index + 4, m10);
        res.putFloat(index + 5, m11);
        res.putFloat(index + 6, m12);
        res.putFloat(index + 7, m13);
        res.putFloat(index + 8, m20);
        res.putFloat(index + 9, m21);
        res.putFloat(index + 10, m22);
        res.putFloat(index + 11, m23);
        res.putFloat(index + 12, m30);
        res.putFloat(index + 13, m31);
        res.putFloat(index + 14, m32);
        res.putFloat(index + 15, m33);
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
