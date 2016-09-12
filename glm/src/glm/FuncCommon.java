/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

import glm.vec._2.Vec2;
import glm.vec._2.i.Vec2i;
import glm.vec._3.Vec3;
import glm.vec._3.i.Vec3i;
import glm.vec._4.Vec4;
import glm.vec._4.i.Vec4i;

/**
 * TODO frexp, ldexp, modf, roundEven, trunc
 *
 * @author elect
 */
abstract class FuncCommon {

    public static int MAX_ULPS = 2;

    // abs ---------------------------------------------------------------------
    public static float abs(float x) {
        return Math.abs(x);
    }

    public static int abs(int i) {
        return Math.abs(i);
    }

    public static Vec2 abs_(Vec2 v) {
        return abs(v, new Vec2());
    }

    public static Vec2 abs(Vec2 v, Vec2 res) {
        return res.set(abs(v.x), abs(v.y));
    }

    public static Vec2i abs_(Vec2i v) {
        return abs(v, new Vec2i());
    }

    public static Vec2i abs(Vec2i v, Vec2i res) {
        return res.set(abs(v.x), abs(v.y));
    }

    public static Vec3 abs_(Vec3 v) {
        return abs(v, new Vec3());
    }

    public static Vec3 abs(Vec3 v, Vec3 res) {
        return res.set(abs(v.x), abs(v.y), abs(v.z));
    }

    public static Vec3i abs_(Vec3i v) {
        return abs(v, new Vec3i());
    }

    public static Vec3i abs(Vec3i v, Vec3i res) {
        return res.set(abs(v.x), abs(v.y), abs(v.z));
    }

    public static Vec4 abs_(Vec4 v) {
        return abs(v, new Vec4());
    }

    public static Vec4 abs(Vec4 v, Vec4 res) {
        return res.set(abs(v.x), abs(v.y), abs(v.z), abs(v.w));
    }

    public static Vec4i abs_(Vec4i v) {
        return abs(v, new Vec4i());
    }

    public static Vec4i abs(Vec4i v, Vec4i res) {
        return res.set(abs(v.x), abs(v.y), abs(v.z), abs(v.w));
    }

    public static float ceil(float x) {
        return (float) Math.ceil(x);
    }

    public static int ceil(int i) {
        return (int) Math.ceil(i);
    }

    public static float clamp(float x, float minVal, float maxVal) {
        return Math.min(Math.max(x, minVal), maxVal);
    }

    public static int clamp(int x, int minVal, int maxVal) {
        return Math.min(Math.max(x, minVal), maxVal);
    }

    public static int floatToIntBits(float x) {
        return Float.floatToIntBits(x);
    }

    // floor -------------------------------------------------------------------
    public static double floor(float x) {
        return Math.floor(x);
    }

    public static Vec2 floor_(Vec2 v) {
        return floor(v, new Vec2());
    }

    public static Vec2 floor(Vec2 v, Vec2 res) {
        return res.set(floor(v.x), floor(v.y));
    }

    public static Vec3 floor_(Vec3 v) {
        return floor(v, new Vec3());
    }

    public static Vec3 floor(Vec3 v, Vec3 res) {
        return res.set(floor(v.x), floor(v.y), floor(v.z));
    }

    public static Vec4 floor_(Vec4 v) {
        return floor(v, new Vec4());
    }

    public static Vec4 floor(Vec4 v, Vec4 res) {
        return res.set(floor(v.x), floor(v.y), floor(v.z), floor(v.w));
    }

    public static float fma(float a, float b, float c) {
        return a * b + c;
    }

    public static int fma(int a, int b, int c) {
        return a * b + c;
    }

    // TODO check floor return type
    public static float fract(float x) {
        return (float) (x - floor(x));
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

    public static int max(int x, int y) {
        return Math.max(x, y);
    }

    public static float min(float x, float y) {
        return Math.min(x, y);
    }

    public static int min(int x, int y) {
        return Math.min(x, y);
    }

    public static float mix(float x, float y, boolean a) {
        return a ? y : x;
    }

    public static int mix(int x, int y, boolean a) {
        return a ? y : x;
    }

    public static float mix(float x, float y, float a) {
        return x + a * (y - x);
    }

    public static int mix(int x, int y, int a) {
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

    // TODO check floor return type
    public static float mod(float x, float y) {
        return (float) (x - y * floor(x / y));
    }

    public static float round(float x) {
        return Math.round(x);
    }
    
    // sign --------------------------------------------------------------------
    public static float sign(float x) {
        return Math.signum(x);
    }

    public static int sign(int i) {
        return (int) Math.signum((float) i);
    }

    public static Vec2 sign_(Vec2 v) {
        return sign(v, new Vec2());
    }

    public static Vec2 sign(Vec2 v, Vec2 res) {
        return res.set(sign(v.x), sign(v.y));
    }

    public static Vec2i sign_(Vec2i v) {
        return sign(v, new Vec2i());
    }

    public static Vec2i sign(Vec2i v, Vec2i res) {
        return res.set(sign(v.x), sign(v.y));
    }

    public static Vec3 sign_(Vec3 v) {
        return sign(v, new Vec3());
    }

    public static Vec3 sign(Vec3 v, Vec3 res) {
        return res.set(sign(v.x), sign(v.y), sign(v.z));
    }

    public static Vec3i sign_(Vec3i v) {
        return sign(v, new Vec3i());
    }

    public static Vec3i sign(Vec3i v, Vec3i res) {
        return res.set(sign(v.x), sign(v.y), sign(v.z));
    }

    public static Vec4 sign_(Vec4 v) {
        return sign(v, new Vec4());
    }

    public static Vec4 sign(Vec4 v, Vec4 res) {
        return res.set(sign(v.x), sign(v.y), sign(v.z), sign(v.w));
    }

    public static Vec4i sign_(Vec4i v) {
        return sign(v, new Vec4i());
    }

    public static Vec4i sign(Vec4i v, Vec4i res) {
        return res.set(sign(v.x), sign(v.y), sign(v.z), sign(v.w));
    }

    public static float smoothstep(float edge0, float edge1, float x) {
        float tmp = clamp((x - edge0) / (edge1 - edge0), 0, 1);
        return tmp * tmp * (3 - 2 * tmp);
    }

    public static float step(float edge, float x) {
        return x < edge ? 0f : 1f;
    }
    
    // trunc -------------------------------------------------------------------
    public static double trunc(float x) {
        return x < 0 ? -floor(-x) : floor(x);
    }

    public static Vec2 trunc_(Vec2 v) {
        return trunc(v, new Vec2());
    }

    public static Vec2 trunc(Vec2 v, Vec2 res) {
        return res.set(trunc(v.x), trunc(v.y));
    }

    public static Vec3 trunc_(Vec3 v) {
        return trunc(v, new Vec3());
    }

    public static Vec3 trunc(Vec3 v, Vec3 res) {
        return res.set(trunc(v.x), trunc(v.y), trunc(v.z));
    }

    public static Vec4 trunc_(Vec4 v) {
        return trunc(v, new Vec4());
    }

    public static Vec4 trunc(Vec4 v, Vec4 res) {
        return res.set(trunc(v.x), trunc(v.y), trunc(v.z), trunc(v.w));
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
//            System.out.println("expected: " + expected + ", actual: " + actual);
//            System.out.println("diff " + difference);
        }
        return !Float.isNaN(expected) && !Float.isNaN(actual) && Math.abs(difference) <= maxUlps;
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
//            System.out.println("expected: " + expected + ", actual: " + actual);
//            System.out.println("diff " + difference);
        }
        return !Double.isNaN(expected) && !Double.isNaN(actual) && Math.abs(difference) <= maxUlps;
    }
}
