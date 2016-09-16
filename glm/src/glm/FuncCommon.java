/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

import glm.vec._3.d.Vec3d;
import glm.vec._2.Vec2;
import glm.vec._2.b.Vec2b;
import glm.vec._2.d.Vec2d;
import glm.vec._2.i.Vec2i;
import glm.vec._2.l.Vec2l;
import glm.vec._2.s.Vec2s;
import glm.vec._2.ub.Vec2ub;
import glm.vec._2.ui.Vec2ui;
import glm.vec._2.ul.Vec2ul;
import glm.vec._2.us.Vec2us;
import glm.vec._3.Vec3;
import glm.vec._3.b.Vec3b;
import glm.vec._3.i.Vec3i;
import glm.vec._3.l.Vec3l;
import glm.vec._3.s.Vec3s;
import glm.vec._3.ub.Vec3ub;
import glm.vec._3.ui.Vec3ui;
import glm.vec._3.ul.Vec3ul;
import glm.vec._3.us.Vec3us;
import glm.vec._4.Vec4;
import glm.vec._4.b.Vec4b;
import glm.vec._4.d.Vec4d;
import glm.vec._4.i.Vec4i;
import glm.vec._4.l.Vec4l;
import glm.vec._4.s.Vec4s;
import glm.vec._4.ub.Vec4ub;
import glm.vec._4.ui.Vec4ui;
import glm.vec._4.ul.Vec4ul;
import glm.vec._4.us.Vec4us;

/**
 * TODO frexp, ldexp, modf, roundEven, trunc
 *
 * @author elect
 */
abstract class FuncCommon {

    public static int MAX_ULPS = 2;

    // abs ----------------------------------------------------------------------------------------------------------
    public static float abs(float s) {
        return Math.abs(s);
    }

    public static double abs(double s) {
        return Math.abs(s);
    }

    public static int abs(int s) {
        return Math.abs(s);
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

    // ceil ---------------------------------------------------------------------------------------------------------
    public static float ceil(float s) {
        return (float) Math.ceil(s);
    }

    public static double ceil(double s) {
        return Math.ceil(s);
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

    // floor --------------------------------------------------------------------------------------------------------
    public static float floor(float s) {
        return (float) Math.floor(s);
    }

    public static double floor(double s) {
        return Math.floor(s);
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

    // fract --------------------------------------------------------------------------------------------------------
    public static float fract(float s) {
        return s - floor(s);
    }

    public static double fract(double s) {
        return s - floor(s);
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

    // max ----------------------------------------------------------------------------------------------------------
    public static float max(float sA, float sB) {
        return Math.max(sA, sB);
    }

    public static double max(double sA, double sB) {
        return Math.max(sA, sB);
    }

    public static int max(int sA, int sB) {
        return Math.max(sA, sB);
    }

    public static long max(long sA, long sB) {
        return Math.max(sA, sB);
    }

    // max(vec2, scalar) -------------------------------------------------------
    public static Vec2 max_(Vec2 v, float s) {
        return max(v, s, new Vec2());
    }

    public static Vec2 max(Vec2 v, float s, Vec2 res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2b max_(Vec2b v, byte s) {
        return max(v, s, new Vec2b());
    }

    public static Vec2b max(Vec2b v, byte s, Vec2b res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2d max_(Vec2d v, double s) {
        return max(v, s, new Vec2d());
    }

    public static Vec2d max(Vec2d v, double s, Vec2d res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2i max_(Vec2i v, int s) {
        return max(v, s, new Vec2i());
    }

    public static Vec2i max(Vec2i v, int s, Vec2i res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2l max_(Vec2l v, long s) {
        return max(v, s, new Vec2l());
    }

    public static Vec2l max(Vec2l v, long s, Vec2l res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2s max_(Vec2s v, short s) {
        return max(v, s, new Vec2s());
    }

    public static Vec2s max(Vec2s v, short s, Vec2s res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2ub max_(Vec2ub v, byte s) {
        return max(v, s, new Vec2ub());
    }

    public static Vec2ub max(Vec2ub v, byte s, Vec2ub res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2ui max_(Vec2ui v, int s) {
        return max(v, s, new Vec2ui());
    }

    public static Vec2ui max(Vec2ui v, int s, Vec2ui res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2ul max_(Vec2ul v, long s) {
        return max(v, s, new Vec2ul());
    }

    public static Vec2ul max(Vec2ul v, long s, Vec2ul res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    public static Vec2us max_(Vec2us v, short s) {
        return max(v, s, new Vec2us());
    }

    public static Vec2us max(Vec2us v, short s, Vec2us res) {
        return res.set(max(v.x, s), max(v.y, s));
    }

    // max(vec2, vec2) ---------------------------------------------------------
    public static Vec2 max_(Vec2 vA, Vec2 vB) {
        return max(vA, vB, new Vec2());
    }

    public static Vec2 max(Vec2 vA, Vec2 vB, Vec2 res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2b max_(Vec2b vA, Vec2b vB) {
        return max(vA, vB, new Vec2b());
    }

    public static Vec2b max(Vec2b va, Vec2b vB, Vec2b res) {
        return res.set(max(va.x, vB.x), max(va.y, vB.y));
    }

    public static Vec2d max_(Vec2d vA, Vec2d vB) {
        return max(vA, vB, new Vec2d());
    }

    public static Vec2d max(Vec2d vA, Vec2d vB, Vec2d res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2i max_(Vec2i vA, Vec2i vB) {
        return max(vA, vB, new Vec2i());
    }

    public static Vec2i max(Vec2i vA, Vec2i vB, Vec2i res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2l max_(Vec2l vA, Vec2l vB) {
        return max(vA, vB, new Vec2l());
    }

    public static Vec2l max(Vec2l vA, Vec2l vB, Vec2l res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2s max_(Vec2s vA, Vec2s vB) {
        return max(vA, vB, new Vec2s());
    }

    public static Vec2s max(Vec2s vA, Vec2s vB, Vec2s res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2ub max_(Vec2ub vA, Vec2ub vB) {
        return max(vA, vB, new Vec2ub());
    }

    public static Vec2ub max(Vec2ub vA, Vec2ub vB, Vec2ub res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2ui max_(Vec2ui vA, Vec2ui vB) {
        return max(vA, vB, new Vec2ui());
    }

    public static Vec2ui max(Vec2ui vA, Vec2ui vB, Vec2ui res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2ul max_(Vec2ul vA, Vec2ul vB) {
        return max(vA, vB, new Vec2ul());
    }

    public static Vec2ul max(Vec2ul vA, Vec2ul vB, Vec2ul res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    public static Vec2us max_(Vec2us vA, Vec2us vB) {
        return max(vA, vB, new Vec2us());
    }

    public static Vec2us max(Vec2us vA, Vec2us vB, Vec2us res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y));
    }

    // max(vec3, scalar) -------------------------------------------------------
    public static Vec3 max_(Vec3 v, float s) {
        return max(v, s, new Vec3());
    }

    public static Vec3 max(Vec3 v, float s, Vec3 res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3b max_(Vec3b v, byte s) {
        return max(v, s, new Vec3b());
    }

    public static Vec3b max(Vec3b v, byte s, Vec3b res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3d max_(Vec3d v, double s) {
        return max(v, s, new Vec3d());
    }

    public static Vec3d max(Vec3d v, double s, Vec3d res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3i max_(Vec3i v, int s) {
        return max(v, s, new Vec3i());
    }

    public static Vec3i max(Vec3i v, int s, Vec3i res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3l max_(Vec3l v, long s) {
        return max(v, s, new Vec3l());
    }

    public static Vec3l max(Vec3l v, long s, Vec3l res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3s max_(Vec3s v, short s) {
        return max(v, s, new Vec3s());
    }

    public static Vec3s max(Vec3s v, short s, Vec3s res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3ub max_(Vec3ub v, byte s) {
        return max(v, s, new Vec3ub());
    }

    public static Vec3ub max(Vec3ub v, byte s, Vec3ub res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3ui max_(Vec3ui v, int s) {
        return max(v, s, new Vec3ui());
    }

    public static Vec3ui max(Vec3ui v, int s, Vec3ui res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3ul max_(Vec3ul v, long s) {
        return max(v, s, new Vec3ul());
    }

    public static Vec3ul max(Vec3ul v, long s, Vec3ul res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    public static Vec3us max_(Vec3us v, short s) {
        return max(v, s, new Vec3us());
    }

    public static Vec3us max(Vec3us v, short s, Vec3us res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s));
    }

    // max(vec3, vec3) ---------------------------------------------------------
    public static Vec3 max_(Vec3 vA, Vec3 vB) {
        return max(vA, vB, new Vec3());
    }

    public static Vec3 max(Vec3 vA, Vec3 vB, Vec3 res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3b max_(Vec3b vA, Vec3b vB) {
        return max(vA, vB, new Vec3b());
    }

    public static Vec3b max(Vec3b vA, Vec3b vB, Vec3b res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3d max_(Vec3d vA, Vec3d vB) {
        return max(vA, vB, new Vec3d());
    }

    public static Vec3d max(Vec3d vA, Vec3d vB, Vec3d res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3i max_(Vec3i vA, Vec3i vB) {
        return max(vA, vB, new Vec3i());
    }

    public static Vec3i max(Vec3i vA, Vec3i vB, Vec3i res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3l max_(Vec3l vA, Vec3l vB) {
        return max(vA, vB, new Vec3l());
    }

    public static Vec3l max(Vec3l vA, Vec3l vB, Vec3l res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3s max_(Vec3s vA, Vec3s vB) {
        return max(vA, vB, new Vec3s());
    }

    public static Vec3s max(Vec3s vA, Vec3s vB, Vec3s res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3ub max_(Vec3ub vA, Vec3ub vB) {
        return max(vA, vB, new Vec3ub());
    }

    public static Vec3ub max(Vec3ub vA, Vec3ub vB, Vec3ub res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3ui max_(Vec3ui vA, Vec3ui vB) {
        return max(vA, vB, new Vec3ui());
    }

    public static Vec3ui max(Vec3ui vA, Vec3ui vB, Vec3ui res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3ul max_(Vec3ul vA, Vec3ul vB) {
        return max(vA, vB, new Vec3ul());
    }

    public static Vec3ul max(Vec3ul vA, Vec3ul vB, Vec3ul res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    public static Vec3us max_(Vec3us vA, Vec3us vB) {
        return max(vA, vB, new Vec3us());
    }

    public static Vec3us max(Vec3us vA, Vec3us vB, Vec3us res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z));
    }

    // max(vec4, scalar) -------------------------------------------------------
    public static Vec4 max_(Vec4 v, float s) {
        return max(v, s, new Vec4());
    }

    public static Vec4 max(Vec4 v, float s, Vec4 res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4b max_(Vec4b v, byte s) {
        return max(v, s, new Vec4b());
    }

    public static Vec4b max(Vec4b v, byte s, Vec4b res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4d max_(Vec4d v, double s) {
        return max(v, s, new Vec4d());
    }

    public static Vec4d max(Vec4d v, double s, Vec4d res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4i max_(Vec4i v, int s) {
        return max(v, s, new Vec4i());
    }

    public static Vec4i max(Vec4i v, int s, Vec4i res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4l max_(Vec4l v, long s) {
        return max(v, s, new Vec4l());
    }

    public static Vec4l max(Vec4l v, long s, Vec4l res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4s max_(Vec4s v, short s) {
        return max(v, s, new Vec4s());
    }

    public static Vec4s max(Vec4s v, short s, Vec4s res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4ub max_(Vec4ub v, byte s) {
        return max(v, s, new Vec4ub());
    }

    public static Vec4ub max(Vec4ub v, byte s, Vec4ub res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4ui max_(Vec4ui v, int s) {
        return max(v, s, new Vec4ui());
    }

    public static Vec4ui max(Vec4ui v, int s, Vec4ui res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4ul max_(Vec4ul v, long s) {
        return max(v, s, new Vec4ul());
    }

    public static Vec4ul max(Vec4ul v, long s, Vec4ul res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    public static Vec4us max_(Vec4us v, short s) {
        return max(v, s, new Vec4us());
    }

    public static Vec4us max(Vec4us v, short s, Vec4us res) {
        return res.set(max(v.x, s), max(v.y, s), max(v.z, s), max(v.w, s));
    }

    // max(vec4, vec4) ---------------------------------------------------------
    public static Vec4 max_(Vec4 vA, Vec4 vB) {
        return max(vA, vB, new Vec4());
    }

    public static Vec4 max(Vec4 vA, Vec4 vB, Vec4 res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4b max_(Vec4b vA, Vec4b vB) {
        return max(vA, vB, new Vec4b());
    }

    public static Vec4b max(Vec4b vA, Vec4b vB, Vec4b res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4d max_(Vec4d vA, Vec4d vB) {
        return max(vA, vB, new Vec4d());
    }

    public static Vec4d max(Vec4d vA, Vec4d vB, Vec4d res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4i max_(Vec4i vA, Vec4i vB) {
        return max(vA, vB, new Vec4i());
    }

    public static Vec4i max(Vec4i vA, Vec4i vB, Vec4i res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4l max_(Vec4l vA, Vec4l vB) {
        return max(vA, vB, new Vec4l());
    }

    public static Vec4l max(Vec4l vA, Vec4l vB, Vec4l res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4s max_(Vec4s vA, Vec4s vB) {
        return max(vA, vB, new Vec4s());
    }

    public static Vec4s max(Vec4s vA, Vec4s vB, Vec4s res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4ub max_(Vec4ub vA, Vec4ub vB) {
        return max(vA, vB, new Vec4ub());
    }

    public static Vec4ub max(Vec4ub vA, Vec4ub vB, Vec4ub res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4ui max_(Vec4ui vA, Vec4ui vB) {
        return max(vA, vB, new Vec4ui());
    }

    public static Vec4ui max(Vec4ui vA, Vec4ui vB, Vec4ui res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4ul max_(Vec4ul vA, Vec4ul vB) {
        return max(vA, vB, new Vec4ul());
    }

    public static Vec4ul max(Vec4ul vA, Vec4ul vB, Vec4ul res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    public static Vec4us max_(Vec4us vA, Vec4us vB) {
        return max(vA, vB, new Vec4us());
    }

    public static Vec4us max(Vec4us vA, Vec4us vB, Vec4us res) {
        return res.set(max(vA.x, vB.x), max(vA.y, vB.y), max(vA.z, vB.z), max(vA.w, vB.w));
    }

    // min ----------------------------------------------------------------------------------------------------------
    public static float min(float sA, float sB) {
        return Math.min(sA, sB);
    }

    public static double min(double sA, double sB) {
        return Math.min(sA, sB);
    }

    public static int min(int sA, int sB) {
        return Math.min(sA, sB);
    }

    public static long min(long sA, long sB) {
        return Math.min(sA, sB);
    }

    // min(vec2, scalar) -------------------------------------------------------
    public static Vec2 min_(Vec2 v, float s) {
        return min(v, s, new Vec2());
    }

    public static Vec2 min(Vec2 v, float s, Vec2 res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2b min_(Vec2b v, byte s) {
        return min(v, s, new Vec2b());
    }

    public static Vec2b min(Vec2b v, byte s, Vec2b res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2d min_(Vec2d v, double s) {
        return min(v, s, new Vec2d());
    }

    public static Vec2d min(Vec2d v, double s, Vec2d res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2i min_(Vec2i v, int s) {
        return min(v, s, new Vec2i());
    }

    public static Vec2i min(Vec2i v, int s, Vec2i res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2l min_(Vec2l v, long s) {
        return min(v, s, new Vec2l());
    }

    public static Vec2l min(Vec2l v, long s, Vec2l res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2s min_(Vec2s v, short s) {
        return min(v, s, new Vec2s());
    }

    public static Vec2s min(Vec2s v, short s, Vec2s res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2ub min_(Vec2ub v, byte s) {
        return min(v, s, new Vec2ub());
    }

    public static Vec2ub min(Vec2ub v, byte s, Vec2ub res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2ui min_(Vec2ui v, int s) {
        return min(v, s, new Vec2ui());
    }

    public static Vec2ui min(Vec2ui v, int s, Vec2ui res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2ul min_(Vec2ul v, long s) {
        return min(v, s, new Vec2ul());
    }

    public static Vec2ul min(Vec2ul v, long s, Vec2ul res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    public static Vec2us min_(Vec2us v, short s) {
        return min(v, s, new Vec2us());
    }

    public static Vec2us min(Vec2us v, short s, Vec2us res) {
        return res.set(min(v.x, s), min(v.y, s));
    }

    // min(vec2, vec2) ---------------------------------------------------------
    public static Vec2 min_(Vec2 vA, Vec2 vB) {
        return min(vA, vB, new Vec2());
    }

    public static Vec2 min(Vec2 vA, Vec2 vB, Vec2 res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2b min_(Vec2b vA, Vec2b vB) {
        return min(vA, vB, new Vec2b());
    }

    public static Vec2b min(Vec2b va, Vec2b vB, Vec2b res) {
        return res.set(max(va.x, vB.x), max(va.y, vB.y));
    }

    public static Vec2d min_(Vec2d vA, Vec2d vB) {
        return min(vA, vB, new Vec2d());
    }

    public static Vec2d min(Vec2d vA, Vec2d vB, Vec2d res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2i min_(Vec2i vA, Vec2i vB) {
        return min(vA, vB, new Vec2i());
    }

    public static Vec2i min(Vec2i vA, Vec2i vB, Vec2i res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2l min_(Vec2l vA, Vec2l vB) {
        return min(vA, vB, new Vec2l());
    }

    public static Vec2l min(Vec2l vA, Vec2l vB, Vec2l res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2s min_(Vec2s vA, Vec2s vB) {
        return min(vA, vB, new Vec2s());
    }

    public static Vec2s min(Vec2s vA, Vec2s vB, Vec2s res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2ub min_(Vec2ub vA, Vec2ub vB) {
        return min(vA, vB, new Vec2ub());
    }

    public static Vec2ub min(Vec2ub vA, Vec2ub vB, Vec2ub res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2ui min_(Vec2ui vA, Vec2ui vB) {
        return min(vA, vB, new Vec2ui());
    }

    public static Vec2ui min(Vec2ui vA, Vec2ui vB, Vec2ui res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2ul min_(Vec2ul vA, Vec2ul vB) {
        return min(vA, vB, new Vec2ul());
    }

    public static Vec2ul min(Vec2ul vA, Vec2ul vB, Vec2ul res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    public static Vec2us min_(Vec2us vA, Vec2us vB) {
        return min(vA, vB, new Vec2us());
    }

    public static Vec2us min(Vec2us vA, Vec2us vB, Vec2us res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y));
    }

    // min(vec3, scalar) -------------------------------------------------------
    public static Vec3 min_(Vec3 v, float s) {
        return min(v, s, new Vec3());
    }

    public static Vec3 min(Vec3 v, float s, Vec3 res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3b min_(Vec3b v, byte s) {
        return min(v, s, new Vec3b());
    }

    public static Vec3b min(Vec3b v, byte s, Vec3b res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3d min_(Vec3d v, double s) {
        return min(v, s, new Vec3d());
    }

    public static Vec3d min(Vec3d v, double s, Vec3d res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3i min_(Vec3i v, int s) {
        return min(v, s, new Vec3i());
    }

    public static Vec3i min(Vec3i v, int s, Vec3i res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3l min_(Vec3l v, long s) {
        return min(v, s, new Vec3l());
    }

    public static Vec3l min(Vec3l v, long s, Vec3l res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3s min_(Vec3s v, short s) {
        return min(v, s, new Vec3s());
    }

    public static Vec3s min(Vec3s v, short s, Vec3s res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3ub min_(Vec3ub v, byte s) {
        return min(v, s, new Vec3ub());
    }

    public static Vec3ub min(Vec3ub v, byte s, Vec3ub res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3ui min_(Vec3ui v, int s) {
        return min(v, s, new Vec3ui());
    }

    public static Vec3ui min(Vec3ui v, int s, Vec3ui res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3ul min_(Vec3ul v, long s) {
        return min(v, s, new Vec3ul());
    }

    public static Vec3ul min(Vec3ul v, long s, Vec3ul res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    public static Vec3us min_(Vec3us v, short s) {
        return min(v, s, new Vec3us());
    }

    public static Vec3us min(Vec3us v, short s, Vec3us res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s));
    }

    // min(vec3, vec3) ---------------------------------------------------------
    public static Vec3 min_(Vec3 vA, Vec3 vB) {
        return min(vA, vB, new Vec3());
    }

    public static Vec3 min(Vec3 vA, Vec3 vB, Vec3 res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3b min_(Vec3b vA, Vec3b vB) {
        return min(vA, vB, new Vec3b());
    }

    public static Vec3b min(Vec3b vA, Vec3b vB, Vec3b res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3d min_(Vec3d vA, Vec3d vB) {
        return min(vA, vB, new Vec3d());
    }

    public static Vec3d min(Vec3d vA, Vec3d vB, Vec3d res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3i min_(Vec3i vA, Vec3i vB) {
        return min(vA, vB, new Vec3i());
    }

    public static Vec3i min(Vec3i vA, Vec3i vB, Vec3i res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3l min_(Vec3l vA, Vec3l vB) {
        return min(vA, vB, new Vec3l());
    }

    public static Vec3l min(Vec3l vA, Vec3l vB, Vec3l res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3s min_(Vec3s vA, Vec3s vB) {
        return min(vA, vB, new Vec3s());
    }

    public static Vec3s min(Vec3s vA, Vec3s vB, Vec3s res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3ub min_(Vec3ub vA, Vec3ub vB) {
        return min(vA, vB, new Vec3ub());
    }

    public static Vec3ub min(Vec3ub vA, Vec3ub vB, Vec3ub res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3ui min_(Vec3ui vA, Vec3ui vB) {
        return min(vA, vB, new Vec3ui());
    }

    public static Vec3ui min(Vec3ui vA, Vec3ui vB, Vec3ui res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3ul min_(Vec3ul vA, Vec3ul vB) {
        return min(vA, vB, new Vec3ul());
    }

    public static Vec3ul min(Vec3ul vA, Vec3ul vB, Vec3ul res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    public static Vec3us min_(Vec3us vA, Vec3us vB) {
        return min(vA, vB, new Vec3us());
    }

    public static Vec3us min(Vec3us vA, Vec3us vB, Vec3us res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z));
    }

    // min(vec4, scalar) -------------------------------------------------------
    public static Vec4 min_(Vec4 v, float s) {
        return min(v, s, new Vec4());
    }

    public static Vec4 min(Vec4 v, float s, Vec4 res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4b min_(Vec4b v, byte s) {
        return min(v, s, new Vec4b());
    }

    public static Vec4b min(Vec4b v, byte s, Vec4b res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4d min_(Vec4d v, double s) {
        return min(v, s, new Vec4d());
    }

    public static Vec4d min(Vec4d v, double s, Vec4d res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4i min_(Vec4i v, int s) {
        return min(v, s, new Vec4i());
    }

    public static Vec4i min(Vec4i v, int s, Vec4i res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4l min_(Vec4l v, long s) {
        return min(v, s, new Vec4l());
    }

    public static Vec4l min(Vec4l v, long s, Vec4l res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4s min_(Vec4s v, short s) {
        return min(v, s, new Vec4s());
    }

    public static Vec4s min(Vec4s v, short s, Vec4s res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4ub min_(Vec4ub v, byte s) {
        return min(v, s, new Vec4ub());
    }

    public static Vec4ub min(Vec4ub v, byte s, Vec4ub res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4ui min_(Vec4ui v, int s) {
        return min(v, s, new Vec4ui());
    }

    public static Vec4ui min(Vec4ui v, int s, Vec4ui res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4ul min_(Vec4ul v, long s) {
        return min(v, s, new Vec4ul());
    }

    public static Vec4ul min(Vec4ul v, long s, Vec4ul res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    public static Vec4us min_(Vec4us v, short s) {
        return min(v, s, new Vec4us());
    }

    public static Vec4us min(Vec4us v, short s, Vec4us res) {
        return res.set(min(v.x, s), min(v.y, s), min(v.z, s), min(v.w, s));
    }

    // min(vec4, vec4) ---------------------------------------------------------
    public static Vec4 min_(Vec4 vA, Vec4 vB) {
        return min(vA, vB, new Vec4());
    }

    public static Vec4 min(Vec4 vA, Vec4 vB, Vec4 res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4b min_(Vec4b vA, Vec4b vB) {
        return min(vA, vB, new Vec4b());
    }

    public static Vec4b min(Vec4b vA, Vec4b vB, Vec4b res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4d min_(Vec4d vA, Vec4d vB) {
        return min(vA, vB, new Vec4d());
    }

    public static Vec4d min(Vec4d vA, Vec4d vB, Vec4d res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4i min_(Vec4i vA, Vec4i vB) {
        return min(vA, vB, new Vec4i());
    }

    public static Vec4i min(Vec4i vA, Vec4i vB, Vec4i res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4l min_(Vec4l vA, Vec4l vB) {
        return min(vA, vB, new Vec4l());
    }

    public static Vec4l min(Vec4l vA, Vec4l vB, Vec4l res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4s min_(Vec4s vA, Vec4s vB) {
        return min(vA, vB, new Vec4s());
    }

    public static Vec4s min(Vec4s vA, Vec4s vB, Vec4s res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4ub min_(Vec4ub vA, Vec4ub vB) {
        return min(vA, vB, new Vec4ub());
    }

    public static Vec4ub min(Vec4ub vA, Vec4ub vB, Vec4ub res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4ui min_(Vec4ui vA, Vec4ui vB) {
        return min(vA, vB, new Vec4ui());
    }

    public static Vec4ui min(Vec4ui vA, Vec4ui vB, Vec4ui res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4ul min_(Vec4ul vA, Vec4ul vB) {
        return min(vA, vB, new Vec4ul());
    }

    public static Vec4ul min(Vec4ul vA, Vec4ul vB, Vec4ul res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
    }

    public static Vec4us min_(Vec4us vA, Vec4us vB) {
        return min(vA, vB, new Vec4us());
    }

    public static Vec4us min(Vec4us vA, Vec4us vB, Vec4us res) {
        return res.set(min(vA.x, vB.x), min(vA.y, vB.y), min(vA.z, vB.z), min(vA.w, vB.w));
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
