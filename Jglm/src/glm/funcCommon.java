/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

import glm.vec._2.Vec2;
import glm.vec._3.Vec3;
import glm.vec._4.Vec4;

/**
 * TODO frexp, ldexp, modf, roundEven, trunc
 *
 * @author elect
 */
class funcCommon {

    public static int MAX_ULPS = 2;

    public static float abs(float x) {
        return Math.abs(x);
    }

    public static float ceil(float x) {
        return (float) Math.ceil(x);
    }

    public static float clamp(float x, float minVal, float maxVal) {
        return Math.min(Math.max(x, minVal), maxVal);
    }

    public static int floatToIntBits(float x) {
        return Float.floatToIntBits(x);
    }

    public static float floor(float f) {
        return (float) Math.floor(f);
    }

    public static float fma(float a, float b, float c) {
        return a * b + c;
    }

    public static float fract(float x) {
        return x - floor(x);
    }

    public static float intBitsToFloat(int value) {
        return Float.intBitsToFloat(value);
    }

    public static boolean isInf(float f) {
        return Float.isInfinite(f);
    }

    public static boolean isNan(float f) {
        return Float.isNaN(f);
    }

    public static float max(float x, float y) {
        return Math.max(x, y);
    }

    public static float min(float x, float y) {
        return Math.min(x, y);
    }

    public static float mix(float x, float y, boolean a) {
        return a ? y : x;
    }

    public static float mix(float x, float y, float a) {
        return x + a * (y - x);
    }

    public static Vec4 mix_(Vec4 x, Vec4 y, float a) {
        return mix(x, y, a, new Vec4());
    }

    public static Vec4 mix(Vec4 x, Vec4 y, float a, Vec4 res) {
        return Vec4.mix(x, y, a, res);
    }

    public static Vec4 mix_(Vec4 x, Vec4 y, Vec4 a) {
        return mix(x, y, a, new Vec4());
    }

    public static Vec4 mix(Vec4 x, Vec4 y, Vec4 a, Vec4 res) {
        return Vec4.mix(x, y, a, res);
    }

    public static float mod(float x, float y) {
        return x - y * floor(x / y);
    }

    public static float round(float x) {
        return Math.round(x);
    }

    public static float sign(float x) {
        return Math.signum(x);
    }

    public static float smoothstep(float edge0, float edge1, float x) {
        float tmp = clamp((x - edge0) / (edge1 - edge0), 0, 1);
        return tmp * tmp * (3 - 2 * tmp);
    }

    public static float step(float edge, float x) {
        return x < edge ? 0f : 1f;
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
    public static boolean compareFloatEquals(float expected, float actual) {
        return compareFloatEquals(expected, actual, MAX_ULPS);
    }

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

    public static boolean compareDoubleEquals(double expected, double actual) {
        return compareDoubleEquals(expected, actual, MAX_ULPS);
    }

    public static boolean compareDoubleEquals(double expected, double actual, int maxUlps) {
        long expectedBits = Double.doubleToLongBits(expected) < 0 ? 0x8000000000000000L
                - Double.doubleToLongBits(expected) : Double.doubleToLongBits(expected);
        long actualBits = Double.doubleToLongBits(actual) < 0
                ? 0x8000000000000000L - Double.doubleToLongBits(actual) : Double.doubleToLongBits(actual);
        long difference = expectedBits > actualBits ? expectedBits - actualBits : actualBits - expectedBits;
        if (difference > maxUlps) {
            System.out.println("expected: " + expected + ", actual: " + actual);
            System.out.println("diff " + difference);
        }
        return !Double.isNaN(expected) && !Double.isNaN(actual) && difference <= maxUlps;
    }
}
