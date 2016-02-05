/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import dev.Vec3;
import dev.Vec4;

/**
 *
 * @author elect
 */
class funcCommon {

    public static Vec4 clamp_(Vec4 v, float minVal, float maxVal) {
        return clamp(v, minVal, maxVal, new Vec4());
    }

    public static Vec4 clamp(Vec4 v, float minVal, float maxVal, Vec4 result) {
        result.x = Math.min(Math.max(v.x, minVal), maxVal);
        result.y = Math.min(Math.max(v.y, minVal), maxVal);
        result.z = Math.min(Math.max(v.z, minVal), maxVal);
        result.w = Math.min(Math.max(v.w, minVal), maxVal);
        return result;
    }

    public static float floor(float f) {
        return (float) Math.floor(f);
    }

    public static Vec3 floor(Vec3 v) {
        v.x = (float) Math.floor(v.x);
        v.y = (float) Math.floor(v.y);
        v.z = (float) Math.floor(v.z);
        return v;
    }
    
    public static Vec4 floor(Vec4 v) {
        v.x = (float) Math.floor(v.x);
        v.y = (float) Math.floor(v.y);
        v.z = (float) Math.floor(v.z);
        v.w = (float) Math.floor(v.w);
        return v;
    }

    public static int log2(int value) {
        return (int) (Math.log(value) / Math.log(2));
    }

    public static Vec3 max_(Vec3 v0, Vec3 v1) {
        return max(v0, v1, new Vec3());
    }

    public static Vec3 max(Vec3 v0, Vec3 v1, Vec3 res) {
        return res.set(Math.max(v0.x, v1.x), Math.max(v0.y, v1.y), Math.max(v0.z, v1.z));
    }

    public static Vec3 min_(Vec3 v0, Vec3 v1) {
        return min(v0, v1, new Vec3());
    }

    public static Vec3 min(Vec3 v0, Vec3 v1, Vec3 res) {
        return res.set(Math.min(v0.x, v1.x), Math.min(v0.y, v1.y), Math.min(v0.z, v1.z));
    }

    public static Vec4 mod_(Vec4 dividend, float divisor) {
        return mod(dividend, divisor, new Vec4());
    }

    public static Vec4 mod(Vec4 dividend, float divisor, Vec4 result) {
        result.x = dividend.x % divisor;
        result.y = dividend.y % divisor;
        result.z = dividend.z % divisor;
        result.w = dividend.w % divisor;
        return result;
    }

    /**
     * Compare two floating points for equality within a margin of error.
     *
     * This can be used to compensate for inequality caused by accumulated
     * floating point math errors.
     *
     * The error margin is specified in ULPs (units of least precision). A
     * one-ULP difference means there are no representable floats in between.
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
        int expectedBits = Float.floatToIntBits(expected) < 0
                ? 0x80000000 - Float.floatToIntBits(expected) : Float.floatToIntBits(expected);
        int actualBits = Float.floatToIntBits(actual) < 0
                ? 0x80000000 - Float.floatToIntBits(actual) : Float.floatToIntBits(actual);
        int difference = expectedBits > actualBits ? expectedBits - actualBits : actualBits - expectedBits;
        if (difference > maxUlps) {
            System.out.println("expected: " + expected + ", actual: " + actual);
            System.out.println("diff " + difference);
        }
        return !Float.isNaN(expected) && !Float.isNaN(actual) && difference <= maxUlps;
    }

    public static boolean compareDoubleEquals(double expected, double actual, int maxUlps) {
        long expectedBits = Double.doubleToLongBits(expected) < 0
                ? 0x8000000000000000L - Double.doubleToLongBits(expected) : Double.doubleToLongBits(expected);
        long actualBits = Double.doubleToLongBits(actual) < 0
                ? 0x8000000000000000L - Double.doubleToLongBits(actual) : Double.doubleToLongBits(actual);
        long difference = expectedBits > actualBits ? expectedBits - actualBits : actualBits - expectedBits;
        if (difference > maxUlps) {
            System.out.println("expected: " + expected + ", actual: " + actual);
            System.out.println("diff " + difference);
        }
        return !Double.isNaN(expected) && !Double.isNaN(actual) && difference <= maxUlps;
    }

    public static Vec3 step_(Vec3 edge, Vec3 x) {
        return mix(new Vec3(1), new Vec3(0), lessThan_(x, edge));
    }

    public static Vec3 lessThan_(Vec3 a, Vec3 b) {
        Vec3 result = new Vec3();
        result.x = a.x < b.x ? 1 : 0;
        result.y = a.y < b.y ? 1 : 0;
        result.z = a.z < b.z ? 1 : 0;
        return result;
    }

    public static Vec3 mix(Vec3 v0, Vec3 v1, Vec3 a) {
        Vec3 result = new Vec3();
        result.x = v0.x + a.x * (v1.x - v0.x);
        result.y = v0.y + a.y * (v1.y - v0.y);
        result.z = v0.z + a.z * (v1.z - v0.z);
        return result;
    }
}
