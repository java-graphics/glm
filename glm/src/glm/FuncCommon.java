/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

import glm.vec._3.d.Vec3d;
import glm.vec._2.Vec2;
import glm.vec._2.d.Vec2d;
import glm.vec._2.i.Vec2i;
import glm.vec._3.Vec3;
import glm.vec._3.i.Vec3i;
import glm.vec._4.Vec4;
import glm.vec._4.d.Vec4d;
import glm.vec._4.i.Vec4i;

/**
 * TODO frexp, ldexp, modf, roundEven, trunc
 *
 * @author elect
 */
abstract class FuncCommon {

    public static int MAX_ULPS = 2;

    // abs ---------------------------------------------------------------------
    public static float abs(float f) {
        return Math.abs(f);
    }

    public static double abs(double d) {
        return Math.abs(d);
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

    public static Vec2d abs_(Vec2d v) {
        return abs(v, new Vec2d());
    }

    public static Vec2d abs(Vec2d v, Vec2d res) {
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

    public static Vec3d abs_(Vec3d v) {
        return abs(v, new Vec3d());
    }

    public static Vec3d abs(Vec3d v, Vec3d res) {
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

    public static Vec4d abs_(Vec4d v) {
        return abs(v, new Vec4d());
    }

    public static Vec4d abs(Vec4d v, Vec4d res) {
        return res.set(abs(v.x), abs(v.y), abs(v.z), abs(v.w));
    }

    public static Vec4i abs_(Vec4i v) {
        return abs(v, new Vec4i());
    }

    public static Vec4i abs(Vec4i v, Vec4i res) {
        return res.set(abs(v.x), abs(v.y), abs(v.z), abs(v.w));
    }

    // ceil --------------------------------------------------------------------
    public static float ceil(float f) {
        return (float) Math.ceil(f);
    }

    public static double ceil(double d) {
        return Math.ceil(d);
    }

    public static Vec2 ceil_(Vec2 v) {
        return ceil(v, new Vec2());
    }

    public static Vec2 ceil(Vec2 v, Vec2 res) {
        return res.set(ceil(v.x), ceil(v.y));
    }

    public static Vec2d ceil_(Vec2d v) {
        return ceil(v, new Vec2d());
    }

    public static Vec2d ceil(Vec2d v, Vec2d res) {
        return res.set(ceil(v.x), ceil(v.y));
    }

    public static Vec3 ceil_(Vec3 v) {
        return ceil(v, new Vec3());
    }

    public static Vec3 ceil(Vec3 v, Vec3 res) {
        return res.set(ceil(v.x), ceil(v.y), ceil(v.z));
    }

    public static Vec3d ceil_(Vec3d v) {
        return ceil(v, new Vec3d());
    }

    public static Vec3d ceil(Vec3d v, Vec3d res) {
        return res.set(ceil(v.x), ceil(v.y), ceil(v.z));
    }

    public static Vec4 ceil_(Vec4 v) {
        return ceil(v, new Vec4());
    }

    public static Vec4 ceil(Vec4 v, Vec4 res) {
        return res.set(ceil(v.x), ceil(v.y), ceil(v.z), ceil(v.w));
    }

    public static Vec4d ceil_(Vec4d v) {
        return ceil(v, new Vec4d());
    }

    public static Vec4d ceil(Vec4d v, Vec4d res) {
        return res.set(ceil(v.x), ceil(v.y), ceil(v.z), ceil(v.w));
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
    public static float floor(float f) {
        return (float) Math.floor(f);
    }

    public static double floor(double d) {
        return Math.floor(d);
    }

    public static Vec2 floor_(Vec2 v) {
        return floor(v, new Vec2());
    }

    public static Vec2 floor(Vec2 v, Vec2 res) {
        return res.set(floor(v.x), floor(v.y));
    }

    public static Vec2d floor_(Vec2d v) {
        return floor(v, new Vec2d());
    }

    public static Vec2d floor(Vec2d v, Vec2d res) {
        return res.set(floor(v.x), floor(v.y));
    }

    public static Vec3 floor_(Vec3 v) {
        return floor(v, new Vec3());
    }

    public static Vec3 floor(Vec3 v, Vec3 res) {
        return res.set(floor(v.x), floor(v.y), floor(v.z));
    }

    public static Vec3d floor_(Vec3d v) {
        return floor(v, new Vec3d());
    }

    public static Vec3d floor(Vec3d v, Vec3d res) {
        return res.set(floor(v.x), floor(v.y), floor(v.z));
    }

    public static Vec4 floor_(Vec4 v) {
        return floor(v, new Vec4());
    }

    public static Vec4 floor(Vec4 v, Vec4 res) {
        return res.set(floor(v.x), floor(v.y), floor(v.z), floor(v.w));
    }

    public static Vec4d floor_(Vec4d v) {
        return floor(v, new Vec4d());
    }

    public static Vec4d floor(Vec4d v, Vec4d res) {
        return res.set(floor(v.x), floor(v.y), floor(v.z), floor(v.w));
    }

    public static float fma(float a, float b, float c) {
        return a * b + c;
    }

    public static int fma(int a, int b, int c) {
        return a * b + c;
    }

    // fract -------------------------------------------------------------------
    public static float fract(float f) {
        return f - floor(f);
    }

    public static double fract(double d) {
        return d - floor(d);
    }

    public static Vec2 fract_(Vec2 v) {
        return fract(v, new Vec2());
    }

    public static Vec2 fract(Vec2 v, Vec2 res) {
        return res.set(fract(v.x), fract(v.y));
    }

    public static Vec2d fract_(Vec2d v) {
        return fract(v, new Vec2d());
    }

    public static Vec2d fract(Vec2d v, Vec2d res) {
        return res.set(fract(v.x), fract(v.y));
    }

    public static Vec3 fract_(Vec3 v) {
        return fract(v, new Vec3());
    }

    public static Vec3 fract(Vec3 v, Vec3 res) {
        return res.set(fract(v.x), fract(v.y), fract(v.z));
    }

    public static Vec3d fract_(Vec3d v) {
        return fract(v, new Vec3d());
    }

    public static Vec3d fract(Vec3d v, Vec3d res) {
        return res.set(fract(v.x), fract(v.y), fract(v.z));
    }

    public static Vec4 fract_(Vec4 v) {
        return fract(v, new Vec4());
    }

    public static Vec4 fract(Vec4 v, Vec4 res) {
        return res.set(fract(v.x), fract(v.y), fract(v.z), fract(v.w));
    }

    public static Vec4d fract_(Vec4d v) {
        return fract(v, new Vec4d());
    }

    public static Vec4d fract(Vec4d v, Vec4d res) {
        return res.set(fract(v.x), fract(v.y), fract(v.z), fract(v.w));
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

    // max ---------------------------------------------------------------------
    public static float max(float x, float y) {
        return Math.max(x, y);
    }

    public static double max(double x, double y) {
        return Math.max(x, y);
    }

    public static int max(int x, int y) {
        return Math.max(x, y);
    }

    public static Vec2 max_(Vec2 v, float f) {
        return max(v, f, new Vec2());
    }

    public static Vec2 max(Vec2 v, float f, Vec2 res) {
        return res.set(max(v.x, f), max(v.y, f));
    }

    public static Vec2d max_(Vec2d v, double d) {
        return max(v, d, new Vec2d());
    }

    public static Vec2d max(Vec2d v, double d, Vec2d res) {
        return res.set(max(v.x, d), max(v.y, d));
    }

    public static Vec2i max_(Vec2i v, int i) {
        return max(v, i, new Vec2i());
    }

    public static Vec2i max(Vec2i v, int i, Vec2i res) {
        return res.set(max(v.x, i), max(v.y, i));
    }

    public static Vec2 max_(Vec2 a, Vec2 b) {
        return max(a, b, new Vec2());
    }

    public static Vec2 max(Vec2 a, Vec2 b, Vec2 res) {
        return res.set(max(a.x, b.x), max(a.y, b.y));
    }

    public static Vec2d max_(Vec2d a, Vec2d b) {
        return max(a, b, new Vec2d());
    }

    public static Vec2d max(Vec2d a, Vec2d b, Vec2d res) {
        return res.set(max(a.x, b.x), max(a.y, b.y));
    }

    public static Vec2i max_(Vec2i a, Vec2i b) {
        return max(a, b, new Vec2i());
    }

    public static Vec2i max(Vec2i a, Vec2i b, Vec2i res) {
        return res.set(max(a.x, b.x), max(a.y, b.y));
    }

    public static Vec3 max_(Vec3 v, float f) {
        return max(v, f, new Vec3());
    }

    public static Vec3 max(Vec3 v, float f, Vec3 res) {
        return res.set(max(v.x, f), max(v.y, f), max(v.z, f));
    }

    public static Vec3d max_(Vec3d v, double d) {
        return max(v, d, new Vec3d());
    }

    public static Vec3d max(Vec3d v, double d, Vec3d res) {
        return res.set(max(v.x, d), max(v.y, d), max(v.z, d));
    }

    public static Vec3i max_(Vec3i v, int i) {
        return max(v, i, new Vec3i());
    }

    public static Vec3i max(Vec3i v, int i, Vec3i res) {
        return res.set(max(v.x, i), max(v.y, i), max(v.z, i));
    }

    public static Vec3 max_(Vec3 a, Vec3 b) {
        return max(a, b, new Vec3());
    }

    public static Vec3 max(Vec3 a, Vec3 b, Vec3 res) {
        return res.set(max(a.x, b.x), max(a.y, b.y), max(a.z, b.z));
    }

    public static Vec3d max_(Vec3d a, Vec3d b) {
        return max(a, b, new Vec3d());
    }

    public static Vec3d max(Vec3d a, Vec3d b, Vec3d res) {
        return res.set(max(a.x, b.x), max(a.y, b.y), max(a.z, b.z));
    }

    public static Vec3i max_(Vec3i a, Vec3i b) {
        return max(a, b, new Vec3i());
    }

    public static Vec3i max(Vec3i a, Vec3i b, Vec3i res) {
        return res.set(max(a.x, b.x), max(a.y, b.y), max(a.z, b.z));
    }

    public static Vec4 max_(Vec4 v, float f) {
        return max(v, f, new Vec4());
    }

    public static Vec4 max(Vec4 v, float f, Vec4 res) {
        return res.set(max(v.x, f), max(v.y, f), max(v.z, f), max(v.w, f));
    }

    public static Vec4d max_(Vec4d v, double d) {
        return max(v, d, new Vec4d());
    }

    public static Vec4d max(Vec4d v, double d, Vec4d res) {
        return res.set(max(v.x, d), max(v.y, d), max(v.z, d), max(v.w, d));
    }

    public static Vec4i max_(Vec4i v, int i) {
        return max(v, i, new Vec4i());
    }

    public static Vec4i max(Vec4i v, int i, Vec4i res) {
        return res.set(max(v.x, i), max(v.y, i), max(v.z, i), max(v.w, i));
    }

    public static Vec4 max_(Vec4 a, Vec4 b) {
        return max(a, b, new Vec4());
    }

    public static Vec4 max(Vec4 a, Vec4 b, Vec4 res) {
        return res.set(max(a.x, b.x), max(a.y, b.y), max(a.z, b.z), max(a.w, b.w));
    }

    public static Vec4d max_(Vec4d a, Vec4d b) {
        return max(a, b, new Vec4d());
    }

    public static Vec4d max(Vec4d a, Vec4d b, Vec4d res) {
        return res.set(max(a.x, b.x), max(a.y, b.y), max(a.z, b.z), max(a.w, b.w));
    }

    public static Vec4i max_(Vec4i a, Vec4i b) {
        return max(a, b, new Vec4i());
    }

    public static Vec4i max(Vec4i a, Vec4i b, Vec4i res) {
        return res.set(max(a.x, b.x), max(a.y, b.y), max(a.z, b.z), max(a.w, b.w));
    }

    // min ---------------------------------------------------------------------
    public static float min(float x, float y) {
        return Math.min(x, y);
    }

    public static double min(double x, double y) {
        return Math.min(x, y);
    }

    public static int min(int x, int y) {
        return Math.min(x, y);
    }

    public static Vec2 min_(Vec2 v, float f) {
        return min(v, f, new Vec2());
    }

    public static Vec2 min(Vec2 v, float f, Vec2 res) {
        return res.set(min(v.x, f), min(v.y, f));
    }

    public static Vec2d min_(Vec2d v, double d) {
        return min(v, d, new Vec2d());
    }

    public static Vec2d min(Vec2d v, double d, Vec2d res) {
        return res.set(min(v.x, d), min(v.y, d));
    }

    public static Vec2i min_(Vec2i v, int i) {
        return min(v, i, new Vec2i());
    }

    public static Vec2i min(Vec2i v, int i, Vec2i res) {
        return res.set(min(v.x, i), min(v.y, i));
    }

    public static Vec2 min_(Vec2 a, Vec2 b) {
        return min(a, b, new Vec2());
    }

    public static Vec2 min(Vec2 a, Vec2 b, Vec2 res) {
        return res.set(min(a.x, b.x), min(a.y, b.y));
    }

    public static Vec2d min_(Vec2d a, Vec2d b) {
        return min(a, b, new Vec2d());
    }

    public static Vec2d min(Vec2d a, Vec2d b, Vec2d res) {
        return res.set(min(a.x, b.x), min(a.y, b.y));
    }

    public static Vec2i min_(Vec2i a, Vec2i b) {
        return min(a, b, new Vec2i());
    }

    public static Vec2i min(Vec2i a, Vec2i b, Vec2i res) {
        return res.set(min(a.x, b.x), min(a.y, b.y));
    }

    public static Vec3 min_(Vec3 v, float f) {
        return min(v, f, new Vec3());
    }

    public static Vec3 min(Vec3 v, float f, Vec3 res) {
        return res.set(min(v.x, f), min(v.y, f), min(v.z, f));
    }

    public static Vec3d min_(Vec3d v, double d) {
        return min(v, d, new Vec3d());
    }

    public static Vec3d min(Vec3d v, double d, Vec3d res) {
        return res.set(min(v.x, d), min(v.y, d), min(v.z, d));
    }

    public static Vec3i min_(Vec3i v, int i) {
        return min(v, i, new Vec3i());
    }

    public static Vec3i min(Vec3i v, int i, Vec3i res) {
        return res.set(min(v.x, i), min(v.y, i), min(v.z, i));
    }

    public static Vec3 min_(Vec3 a, Vec3 b) {
        return min(a, b, new Vec3());
    }

    public static Vec3 min(Vec3 a, Vec3 b, Vec3 res) {
        return res.set(min(a.x, b.x), min(a.y, b.y), min(a.z, b.z));
    }

    public static Vec3d min_(Vec3d a, Vec3d b) {
        return min(a, b, new Vec3d());
    }

    public static Vec3d min(Vec3d a, Vec3d b, Vec3d res) {
        return res.set(min(a.x, b.x), min(a.y, b.y), min(a.z, b.z));
    }

    public static Vec3i min_(Vec3i a, Vec3i b) {
        return min(a, b, new Vec3i());
    }

    public static Vec3i min(Vec3i a, Vec3i b, Vec3i res) {
        return res.set(min(a.x, b.x), min(a.y, b.y), min(a.z, b.z));
    }

    public static Vec4 min_(Vec4 v, float f) {
        return min(v, f, new Vec4());
    }

    public static Vec4 min(Vec4 v, float f, Vec4 res) {
        return res.set(min(v.x, f), min(v.y, f), min(v.z, f), min(v.w, f));
    }

    public static Vec4d min_(Vec4d v, double d) {
        return min(v, d, new Vec4d());
    }

    public static Vec4d min(Vec4d v, double d, Vec4d res) {
        return res.set(min(v.x, d), min(v.y, d), min(v.z, d), min(v.w, d));
    }

    public static Vec4i min_(Vec4i v, int i) {
        return min(v, i, new Vec4i());
    }

    public static Vec4i min(Vec4i v, int i, Vec4i res) {
        return res.set(min(v.x, i), min(v.y, i), min(v.z, i), min(v.w, i));
    }

    public static Vec4 min_(Vec4 a, Vec4 b) {
        return min(a, b, new Vec4());
    }

    public static Vec4 min(Vec4 a, Vec4 b, Vec4 res) {
        return res.set(min(a.x, b.x), min(a.y, b.y), min(a.z, b.z), min(a.w, b.w));
    }

    public static Vec4d min_(Vec4d a, Vec4d b) {
        return min(a, b, new Vec4d());
    }

    public static Vec4d min(Vec4d a, Vec4d b, Vec4d res) {
        return res.set(min(a.x, b.x), min(a.y, b.y), min(a.z, b.z), min(a.w, b.w));
    }

    public static Vec4i min_(Vec4i a, Vec4i b) {
        return min(a, b, new Vec4i());
    }

    public static Vec4i min(Vec4i a, Vec4i b, Vec4i res) {
        return res.set(min(a.x, b.x), min(a.y, b.y), min(a.z, b.z), min(a.w, b.w));
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

    // mod ---------------------------------------------------------------------
    public static float mod(float x, float y) {
        return x - y * floor(x / y);
    }

    public static double mod(double x, double y) {
        return x - y * floor(x / y);
    }

    public static Vec2 mod_(Vec2 v, float f) {
        return mod(v, f, new Vec2());
    }

    public static Vec2 mod(Vec2 v, float f, Vec2 res) {
        return res.set(mod(v.x, f), mod(v.y, f));
    }

    public static Vec2d mod_(Vec2d v, double d) {
        return mod(v, d, new Vec2d());
    }

    public static Vec2d mod(Vec2d v, double d, Vec2d res) {
        return res.set(mod(v.x, d), mod(v.y, d));
    }

    public static Vec2 mod_(Vec2 a, Vec2 b) {
        return mod(a, b, new Vec2());
    }

    public static Vec2 mod(Vec2 a, Vec2 b, Vec2 res) {
        return res.set(mod(a.x, b.x), mod(a.y, b.y));
    }

    public static Vec2d mod_(Vec2d a, Vec2d b) {
        return mod(a, b, new Vec2d());
    }

    public static Vec2d mod(Vec2d a, Vec2d b, Vec2d res) {
        return res.set(mod(a.x, b.x), mod(a.y, b.y));
    }

    public static Vec3 mod_(Vec3 v, float f) {
        return mod(v, f, new Vec3());
    }

    public static Vec3 mod(Vec3 v, float f, Vec3 res) {
        return res.set(mod(v.x, f), mod(v.y, f), mod(v.z, f));
    }

    public static Vec3d mod_(Vec3d v, double d) {
        return mod(v, d, new Vec3d());
    }

    public static Vec3d mod(Vec3d v, double d, Vec3d res) {
        return res.set(mod(v.x, d), mod(v.y, d), mod(v.z, d));
    }

    public static Vec3 mod_(Vec3 a, Vec3 b) {
        return mod(a, b, new Vec3());
    }

    public static Vec3 mod(Vec3 a, Vec3 b, Vec3 res) {
        return res.set(mod(a.x, b.x), mod(a.y, b.y), mod(a.z, b.z));
    }

    public static Vec3d mod_(Vec3d a, Vec3d b) {
        return mod(a, b, new Vec3d());
    }

    public static Vec3d mod(Vec3d a, Vec3d b, Vec3d res) {
        return res.set(mod(a.x, b.x), mod(a.y, b.y), mod(a.z, b.z));
    }

    public static Vec4 mod_(Vec4 v, float f) {
        return mod(v, f, new Vec4());
    }

    public static Vec4 mod(Vec4 v, float f, Vec4 res) {
        return res.set(mod(v.x, f), mod(v.y, f), mod(v.z, f), mod(v.w, f));
    }

    public static Vec4d mod_(Vec4d v, double d) {
        return mod(v, d, new Vec4d());
    }

    public static Vec4d mod(Vec4d v, double d, Vec4d res) {
        return res.set(mod(v.x, d), mod(v.y, d), mod(v.z, d), mod(v.w, d));
    }

    public static Vec4 mod_(Vec4 a, Vec4 b) {
        return mod(a, b, new Vec4());
    }

    public static Vec4 mod(Vec4 a, Vec4 b, Vec4 res) {
        return res.set(mod(a.x, b.x), mod(a.y, b.y), mod(a.z, b.z), mod(a.w, b.w));
    }

    public static Vec4d mod_(Vec4d a, Vec4d b) {
        return mod(a, b, new Vec4d());
    }

    public static Vec4d mod(Vec4d a, Vec4d b, Vec4d res) {
        return res.set(mod(a.x, b.x), mod(a.y, b.y), mod(a.z, b.z), mod(a.w, b.w));
    }

    // round -------------------------------------------------------------------
    public static int round(float f) {
        return Math.round(f);
    }

    public static long round(double d) {
        return Math.round(d);
    }

    public static Vec2 round_(Vec2 v) {
        return round(v, new Vec2());
    }

    public static Vec2 round(Vec2 v, Vec2 res) {
        return res.set(round(v.x), round(v.y));
    }

    public static Vec2d round_(Vec2d v) {
        return round(v, new Vec2d());
    }

    public static Vec2d round(Vec2d v, Vec2d res) {
        return res.set(round(v.x), round(v.y));
    }

    public static Vec3 round_(Vec3 v) {
        return round(v, new Vec3());
    }

    public static Vec3 round(Vec3 v, Vec3 res) {
        return res.set(round(v.x), round(v.y), round(v.z));
    }

    public static Vec3d round_(Vec3d v) {
        return round(v, new Vec3d());
    }

    public static Vec3d round(Vec3d v, Vec3d res) {
        return res.set(round(v.x), round(v.y), round(v.z));
    }

    public static Vec4 round_(Vec4 v) {
        return round(v, new Vec4());
    }

    public static Vec4 round(Vec4 v, Vec4 res) {
        return res.set(round(v.x), round(v.y), round(v.z), round(v.w));
    }

    public static Vec4d round_(Vec4d v) {
        return round(v, new Vec4d());
    }

    public static Vec4d round(Vec4d v, Vec4d res) {
        return res.set(round(v.x), round(v.y), round(v.z), round(v.w));
    }

    // roundEven ---------------------------------------------------------------
    public static int roundEven(float f) {
        int integerPart = (int) f;
        float fractionalPart = fract(f);
        if (fractionalPart > 0.5f || fractionalPart < 0.5f) {
            return round(f);
        } else if ((integerPart % 2) == 0) {
            return integerPart;
        } else if (f <= 0) {    // Work around... 
            return integerPart - 1;
        } else {
            return integerPart + 1;
        }
    }

    public static long roundEven(double d) {
        long integerPart = (long) d;
        double fractionalPart = fract(d);
        if (fractionalPart > 0.5f || fractionalPart < 0.5f) {
            return round(d);
        } else if ((integerPart % 2) == 0) {
            return integerPart;
        } else if (d <= 0) {    // Work around... 
            return integerPart - 1;
        } else {
            return integerPart + 1;
        }
    }

    public static Vec2 roundEven_(Vec2 v) {
        return roundEven(v, new Vec2());
    }

    public static Vec2 roundEven(Vec2 v, Vec2 res) {
        return res.set(roundEven(v.x), roundEven(v.y));
    }

    public static Vec2d roundEven_(Vec2d v) {
        return roundEven(v, new Vec2d());
    }

    public static Vec2d roundEven(Vec2d v, Vec2d res) {
        return res.set(roundEven(v.x), roundEven(v.y));
    }

    public static Vec3 roundEven_(Vec3 v) {
        return roundEven(v, new Vec3());
    }

    public static Vec3 roundEven(Vec3 v, Vec3 res) {
        return res.set(roundEven(v.x), roundEven(v.y), roundEven(v.z));
    }

    public static Vec3d roundEven_(Vec3d v) {
        return roundEven(v, new Vec3d());
    }

    public static Vec3d roundEven(Vec3d v, Vec3d res) {
        return res.set(roundEven(v.x), roundEven(v.y), roundEven(v.z));
    }

    public static Vec4 roundEven_(Vec4 v) {
        return roundEven(v, new Vec4());
    }

    public static Vec4 roundEven(Vec4 v, Vec4 res) {
        return res.set(roundEven(v.x), roundEven(v.y), roundEven(v.z), roundEven(v.w));
    }

    public static Vec4d roundEven_(Vec4d v) {
        return roundEven(v, new Vec4d());
    }

    public static Vec4d roundEven(Vec4d v, Vec4d res) {
        return res.set(roundEven(v.x), roundEven(v.y), roundEven(v.z), roundEven(v.w));
    }

    // sign --------------------------------------------------------------------
    public static float sign(float f) {
        return Math.signum(f);
    }

    public static double sign(double d) {
        return Math.signum(d);
    }

    public static int sign(int i) {
        return (int) Math.signum(i);
    }

    public static Vec2 sign_(Vec2 v) {
        return sign(v, new Vec2());
    }

    public static Vec2 sign(Vec2 v, Vec2 res) {
        return res.set(sign(v.x), sign(v.y));
    }

    public static Vec2d sign_(Vec2d v) {
        return sign(v, new Vec2d());
    }

    public static Vec2d sign(Vec2d v, Vec2d res) {
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

    public static Vec3d sign_(Vec3d v) {
        return sign(v, new Vec3d());
    }

    public static Vec3d sign(Vec3d v, Vec3d res) {
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

    public static Vec4d sign_(Vec4d v) {
        return sign(v, new Vec4d());
    }

    public static Vec4d sign(Vec4d v, Vec4d res) {
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
    public static double trunc(float f) {
        return f < 0 ? -floor(-f) : floor(f);
    }

    public static double trunc(double d) {
        return d < 0 ? -floor(-d) : floor(d);
    }

    public static Vec2 trunc_(Vec2 v) {
        return trunc(v, new Vec2());
    }

    public static Vec2 trunc(Vec2 v, Vec2 res) {
        return res.set(trunc(v.x), trunc(v.y));
    }

    public static Vec2d trunc_(Vec2d v) {
        return trunc(v, new Vec2d());
    }

    public static Vec2d trunc(Vec2d v, Vec2d res) {
        return res.set(trunc(v.x), trunc(v.y));
    }

    public static Vec3 trunc_(Vec3 v) {
        return trunc(v, new Vec3());
    }

    public static Vec3 trunc(Vec3 v, Vec3 res) {
        return res.set(trunc(v.x), trunc(v.y), trunc(v.z));
    }

    public static Vec3d trunc_(Vec3d v) {
        return trunc(v, new Vec3d());
    }

    public static Vec3d trunc(Vec3d v, Vec3d res) {
        return res.set(trunc(v.x), trunc(v.y), trunc(v.z));
    }

    public static Vec4 trunc_(Vec4 v) {
        return trunc(v, new Vec4());
    }

    public static Vec4 trunc(Vec4 v, Vec4 res) {
        return res.set(trunc(v.x), trunc(v.y), trunc(v.z), trunc(v.w));
    }

    public static Vec4d trunc_(Vec4d v) {
        return trunc(v, new Vec4d());
    }

    public static Vec4d trunc(Vec4d v, Vec4d res) {
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
