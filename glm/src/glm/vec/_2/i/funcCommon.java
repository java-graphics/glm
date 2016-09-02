/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.i;

import dev.Vec2bool;
import glm.glm;

/**
 *
 * @author fschaefers
 */
public abstract class funcCommon {

    public int x, y;
    public static final int SIZE = 2 * Integer.BYTES;

    public Vec2i abs() {
        return abs((Vec2i) this);
    }

    public Vec2i abs_() {
        return abs(new Vec2i());
    }

    public Vec2i abs(Vec2i result) {
        return abs((Vec2i) this, result);
    }

    public static Vec2i abs(Vec2i x, Vec2i result) {
        result.x = Math.abs(x.x);
        result.y = Math.abs(x.y);
        return result;
    }

    public Vec2i ceil() {
        return ceil((Vec2i) this);
    }

    public Vec2i ceil_() {
        return ceil(new Vec2i());
    }

    public Vec2i ceil(Vec2i result) {
        return ceil((Vec2i) this, (Vec2i) this);
    }

    public static Vec2i ceil(Vec2i x, Vec2i result) {
        result.x = (int) Math.ceil(x.x);
        result.y = (int) Math.ceil(x.y);
        return result;
    }

    public Vec2i clamp(int minVal, int maxVal) {
        return clamp(minVal, maxVal, (Vec2i) this);
    }

    public Vec2i clamp_(int minVal, int maxVal) {
        return clamp(minVal, maxVal, new Vec2i());
    }

    public Vec2i clamp(int minVal, int maxVal, Vec2i result) {
        return clamp((Vec2i) this, minVal, maxVal, result);
    }

    public static Vec2i clamp(Vec2i x, int minVal, int maxVal, Vec2i result) {
        result.x = Math.min(Math.max(x.x, minVal), maxVal);
        result.y = Math.min(Math.max(x.y, minVal), maxVal);
        return result;
    }

    public Vec2i clamp(Vec2i minVal, Vec2i maxVal) {
        return clamp(minVal, maxVal, (Vec2i) this);
    }

    public Vec2i clamp_(Vec2i minVal, Vec2i maxVal) {
        return clamp(minVal, maxVal, new Vec2i());
    }

    public Vec2i clamp(Vec2i minVal, Vec2i maxVal, Vec2i result) {
        return clamp((Vec2i) this, minVal, maxVal, result);
    }

    public static Vec2i clamp(Vec2i x, Vec2i minVal, Vec2i maxVal, Vec2i result) {
        result.x = Math.min(Math.max(x.x, minVal.x), maxVal.x);
        result.y = Math.min(Math.max(x.y, minVal.y), maxVal.y);
        return result;
    }

    public Vec2i floatToIntBits_() {
        return floatToIntBits((Vec2i) this, new Vec2i());
    }

    public Vec2i floatToIntBits(Vec2i result) {
        return floatToIntBits((Vec2i) this, result);
    }

    public static Vec2i floatToIntBits(Vec2i x, Vec2i result) {
        result.x = Float.floatToIntBits(x.x);
        result.y = Float.floatToIntBits(x.y);
        return result;
    }

    public Vec2i floor() {
        return floor((Vec2i) this);
    }

    public Vec2i floor_() {
        return floor(new Vec2i());
    }

    public Vec2i floor(Vec2i result) {
        return floor((Vec2i) this, result);
    }

    public static Vec2i floor(Vec2i x, Vec2i result) {
        result.x = (int) Math.floor(x.x);
        result.y = (int) Math.floor(x.y);
        return result;
    }

    public Vec2i fma(Vec2i b, Vec2i c) {
        return fma(b, c, (Vec2i) this);
    }

    public Vec2i fma_(Vec2i b, Vec2i c) {
        return fma(b, c, new Vec2i());
    }

    public Vec2i fma(Vec2i b, Vec2i c, Vec2i result) {
        return fma((Vec2i) this, b, c, result);
    }

    public static Vec2i fma(Vec2i a, Vec2i b, Vec2i c, Vec2i result) {
        result.x = a.x * b.x + c.x;
        result.y = a.y * b.y + c.y;
        return result;
    }

    public Vec2i fract() {
        return fract((Vec2i) this);
    }

    public Vec2i fract_() {
        return fract(new Vec2i());
    }

    public Vec2i fract(Vec2i result) {
        return fract((Vec2i) this, result);
    }

    public static Vec2i fract(Vec2i x, Vec2i result) {
        result.x = (int) (x.x - Math.floor(x.x));
        result.y = (int) (x.y - Math.floor(x.y));
        return result;
    }

    public Vec2bool isInf_() {
        return isInf((Vec2i) this, new Vec2bool());
    }

    public Vec2bool isInf(Vec2bool result) {
        return isInf((Vec2i) this, result);
    }

    public static Vec2bool isInf(Vec2i x, Vec2bool result) {
        result.x = Float.isInfinite(x.x);
        result.y = Float.isInfinite(x.y);
        return result;
    }

    public Vec2bool isNan() {
        return isNan((Vec2i) this, new Vec2bool());
    }

    public Vec2bool isNan(Vec2bool result) {
        return isNan((Vec2i) this, result);
    }

    public static Vec2bool isNan(Vec2i x, Vec2bool result) {
        result.x = Float.isNaN(x.x);
        result.y = Float.isNaN(x.y);
        return result;
    }

    public Vec2i max(Vec2i y) {
        return max(y, (Vec2i) this);
    }

    public Vec2i max_(Vec2i y) {
        return max((Vec2i) this, y, new Vec2i());
    }

    public Vec2i max(Vec2i y, Vec2i result) {
        return max((Vec2i) this, y, result);
    }

    public static Vec2i max(Vec2i x, Vec2i y, Vec2i result) {
        result.x = Math.max(x.x, y.x);
        result.y = Math.max(x.y, y.y);
        return result;
    }

    public Vec2i min(Vec2i y) {
        return min(y, (Vec2i) this);
    }

    public Vec2i min_(Vec2i y) {
        return min(y, new Vec2i());
    }

    public Vec2i min(Vec2i y, Vec2i result) {
        return min((Vec2i) this, y, result);
    }

    public static Vec2i min(Vec2i x, Vec2i y, Vec2i result) {
        result.x = Math.min(x.x, y.x);
        result.y = Math.min(x.y, y.y);
        return result;
    }

    public Vec2i mix(Vec2i y, boolean a) {
        return mix(y, a, (Vec2i) this);
    }

    public Vec2i mix_(Vec2i y, boolean a) {
        return mix(y, a, new Vec2i());
    }

    public Vec2i mix(Vec2i y, boolean a, Vec2i result) {
        return mix((Vec2i) this, y, a, result);
    }

    public static Vec2i mix(Vec2i x, Vec2i y, boolean a, Vec2i result) {
        result.x = a ? y.x : x.x;
        result.y = a ? y.y : x.y;
        return result;
    }

    public Vec2i mix(Vec2i y, Vec2bool a) {
        return mix(y, a, (Vec2i) this);
    }

    public Vec2i mix_(Vec2i y, Vec2bool a) {
        return mix(y, a, new Vec2i());
    }

    public Vec2i mix(Vec2i y, Vec2bool a, Vec2i result) {
        return mix((Vec2i) this, y, a, result);
    }

    public static Vec2i mix(Vec2i x, Vec2i y, Vec2bool a, Vec2i result) {
        result.x = a.x ? y.x : x.x;
        result.y = a.y ? y.y : x.y;
        return result;
    }

    public Vec2i mix(Vec2i y, int a) {
        return mix(y, a, (Vec2i) this);
    }

    public Vec2i mix_(Vec2i y, int a) {
        return mix(y, a, new Vec2i());
    }

    public Vec2i mix(Vec2i y, int a, Vec2i result) {
        return mix((Vec2i) this, y, a, result);
    }

    public static Vec2i mix(Vec2i x, Vec2i y, int a, Vec2i result) {
        result.x = x.x + a * (y.x - x.x);
        result.y = x.y + a * (y.y - x.y);
        return result;
    }

    public Vec2i mix(Vec2i y, Vec2i a) {
        return mix(y, a, (Vec2i) this);
    }

    public Vec2i mix_(Vec2i y, Vec2i a) {
        return mix(y, a, new Vec2i());
    }

    public Vec2i mix(Vec2i y, Vec2i a, Vec2i result) {
        return mix((Vec2i) this, y, a, result);
    }

    public static Vec2i mix(Vec2i x, Vec2i y, Vec2i a, Vec2i result) {
        result.x = x.x + a.x * (y.x - x.x);
        result.y = x.y + a.y * (y.y - x.y);
        return result;
    }

    public Vec2i mod(Vec2i y) {
        return mod(y, (Vec2i) this);
    }

    public Vec2i mod_(Vec2i y) {
        return mod(y, new Vec2i());
    }

    public Vec2i mod(Vec2i y, Vec2i result) {
        return mod((Vec2i) this, y, result);
    }

    public static Vec2i mod(Vec2i x, Vec2i y, Vec2i result) {
        result.x = x.x - y.x * glm.floor(x.x / y.x);
        result.y = x.y - y.y * glm.floor(x.y / y.y);
        return result;
    }

    public Vec2i sign() {
        return sign((Vec2i) this, (Vec2i) this);
    }

    public Vec2i sign_() {
        return sign(new Vec2i());
    }

    public Vec2i sign(Vec2i result) {
        return sign((Vec2i) this, result);
    }

    public static Vec2i sign(Vec2i x, Vec2i result) {
        result.x = (int) Math.signum(x.x);
        result.y = (int) Math.signum(x.y);
        return result;
    }

    public Vec2i smoothStep(Vec2i edge0, Vec2i edge1) {
        return smoothStep(edge0, edge1, (Vec2i) this);
    }

    public Vec2i smoothStep_(Vec2i edge0, Vec2i edge1) {
        return smoothStep(edge0, edge1, new Vec2i());
    }

    public Vec2i smoothStep(Vec2i edge0, Vec2i edge1, Vec2i result) {
        return smoothStep(edge0, edge1, (Vec2i) this, result);
    }

    public static Vec2i smoothStep(Vec2i edge0, Vec2i edge1, Vec2i x, Vec2i result) {
        // clamp
        int tmpX = Math.min(Math.max((x.x - edge0.x) / (edge1.x - edge0.x), 0), 1);
        int tmpY = Math.min(Math.max((x.y - edge0.y) / (edge1.y - edge0.y), 0), 1);
        result.x = tmpX * tmpX * (3 - 2 * tmpX);
        result.y = tmpY * tmpY * (3 - 2 * tmpY);
        return result;
    }

    public Vec2i step(Vec2i edge) {
        return step(edge, (Vec2i) this);
    }

    public Vec2i step_(Vec2i edge) {
        return step(edge, new Vec2i());
    }

    public Vec2i step(Vec2i edge, Vec2i result) {
        return step(edge, (Vec2i) this, result);
    }

    public static Vec2i step(Vec2i edge, Vec2i x, Vec2i result) {
        result.x = x.x < edge.x ? 0 : 1;
        result.y = x.y < edge.y ? 0 : 1;
        return result;
    }

}
