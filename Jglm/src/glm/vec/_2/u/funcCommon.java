/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.u;

import dev.Vec2bool;
import glm.glm;

/**
 *
 * @author fschaefers
 */
public abstract class funcCommon {

    public int x, y;
    public static final int SIZE = 2 * Integer.BYTES;

    public Vec2u abs() {
        return abs((Vec2u) this);
    }

    public Vec2u abs_() {
        return abs(new Vec2u());
    }

    public Vec2u abs(Vec2u result) {
        return abs((Vec2u) this, result);
    }

    public static Vec2u abs(Vec2u x, Vec2u result) {
        result.x = Math.abs(x.x);
        result.y = Math.abs(x.y);
        return result;
    }

    public Vec2u ceil() {
        return ceil((Vec2u) this);
    }

    public Vec2u ceil_() {
        return ceil(new Vec2u());
    }

    public Vec2u ceil(Vec2u result) {
        return ceil((Vec2u) this, (Vec2u) this);
    }

    public static Vec2u ceil(Vec2u x, Vec2u result) {
        result.x = (int) Math.ceil(x.x);
        result.y = (int) Math.ceil(x.y);
        return result;
    }

    public Vec2u clamp(int minVal, int maxVal) {
        return clamp(minVal, maxVal, (Vec2u) this);
    }

    public Vec2u clamp_(int minVal, int maxVal) {
        return clamp(minVal, maxVal, new Vec2u());
    }

    public Vec2u clamp(int minVal, int maxVal, Vec2u result) {
        return clamp((Vec2u) this, minVal, maxVal, result);
    }

    public static Vec2u clamp(Vec2u x, int minVal, int maxVal, Vec2u result) {
        result.x = Math.min(Math.max(x.x, minVal), maxVal);
        result.y = Math.min(Math.max(x.y, minVal), maxVal);
        return result;
    }

    public Vec2u clamp(Vec2u minVal, Vec2u maxVal) {
        return clamp(minVal, maxVal, (Vec2u) this);
    }

    public Vec2u clamp_(Vec2u minVal, Vec2u maxVal) {
        return clamp(minVal, maxVal, new Vec2u());
    }

    public Vec2u clamp(Vec2u minVal, Vec2u maxVal, Vec2u result) {
        return clamp((Vec2u) this, minVal, maxVal, result);
    }

    public static Vec2u clamp(Vec2u x, Vec2u minVal, Vec2u maxVal, Vec2u result) {
        result.x = Math.min(Math.max(x.x, minVal.x), maxVal.x);
        result.y = Math.min(Math.max(x.y, minVal.y), maxVal.y);
        return result;
    }

    public Vec2u floatToIntBits_() {
        return floatToIntBits((Vec2u) this, new Vec2u());
    }

    public Vec2u floatToIntBits(Vec2u result) {
        return floatToIntBits((Vec2u) this, result);
    }

    public static Vec2u floatToIntBits(Vec2u x, Vec2u result) {
        result.x = Float.floatToIntBits(x.x);
        result.y = Float.floatToIntBits(x.y);
        return result;
    }

    public Vec2u floor() {
        return floor((Vec2u) this);
    }

    public Vec2u floor_() {
        return floor(new Vec2u());
    }

    public Vec2u floor(Vec2u result) {
        return floor((Vec2u) this, result);
    }

    public static Vec2u floor(Vec2u x, Vec2u result) {
        result.x = (int) Math.floor(x.x);
        result.y = (int) Math.floor(x.y);
        return result;
    }

    public Vec2u fma(Vec2u b, Vec2u c) {
        return fma(b, c, (Vec2u) this);
    }

    public Vec2u fma_(Vec2u b, Vec2u c) {
        return fma(b, c, new Vec2u());
    }

    public Vec2u fma(Vec2u b, Vec2u c, Vec2u result) {
        return fma((Vec2u) this, b, c, result);
    }

    public static Vec2u fma(Vec2u a, Vec2u b, Vec2u c, Vec2u result) {
        result.x = a.x * b.x + c.x;
        result.y = a.y * b.y + c.y;
        return result;
    }

    public Vec2u fract() {
        return fract((Vec2u) this);
    }

    public Vec2u fract_() {
        return fract(new Vec2u());
    }

    public Vec2u fract(Vec2u result) {
        return fract((Vec2u) this, result);
    }

    public static Vec2u fract(Vec2u x, Vec2u result) {
        result.x = (int) (x.x - Math.floor(x.x));
        result.y = (int) (x.y - Math.floor(x.y));
        return result;
    }

    public Vec2bool isInf_() {
        return isInf((Vec2u) this, new Vec2bool());
    }

    public Vec2bool isInf(Vec2bool result) {
        return isInf((Vec2u) this, result);
    }

    public static Vec2bool isInf(Vec2u x, Vec2bool result) {
        result.x = Float.isInfinite(x.x);
        result.y = Float.isInfinite(x.y);
        return result;
    }

    public Vec2bool isNan() {
        return isNan((Vec2u) this, new Vec2bool());
    }

    public Vec2bool isNan(Vec2bool result) {
        return isNan((Vec2u) this, result);
    }

    public static Vec2bool isNan(Vec2u x, Vec2bool result) {
        result.x = Float.isNaN(x.x);
        result.y = Float.isNaN(x.y);
        return result;
    }

    public Vec2u max(Vec2u y) {
        return max(y, (Vec2u) this);
    }

    public Vec2u max_(Vec2u y) {
        return max((Vec2u) this, y, new Vec2u());
    }

    public Vec2u max(Vec2u y, Vec2u result) {
        return max((Vec2u) this, y, result);
    }

    public static Vec2u max(Vec2u x, Vec2u y, Vec2u result) {
        result.x = Math.max(x.x, y.x);
        result.y = Math.max(x.y, y.y);
        return result;
    }

    public Vec2u min(Vec2u y) {
        return min(y, (Vec2u) this);
    }

    public Vec2u min_(Vec2u y) {
        return min(y, new Vec2u());
    }

    public Vec2u min(Vec2u y, Vec2u result) {
        return min((Vec2u) this, y, result);
    }

    public static Vec2u min(Vec2u x, Vec2u y, Vec2u result) {
        result.x = Math.min(x.x, y.x);
        result.y = Math.min(x.y, y.y);
        return result;
    }

    public Vec2u mix(Vec2u y, boolean a) {
        return mix(y, a, (Vec2u) this);
    }

    public Vec2u mix_(Vec2u y, boolean a) {
        return mix(y, a, new Vec2u());
    }

    public Vec2u mix(Vec2u y, boolean a, Vec2u result) {
        return mix((Vec2u) this, y, a, result);
    }

    public static Vec2u mix(Vec2u x, Vec2u y, boolean a, Vec2u result) {
        result.x = a ? y.x : x.x;
        result.y = a ? y.y : x.y;
        return result;
    }

    public Vec2u mix(Vec2u y, Vec2bool a) {
        return mix(y, a, (Vec2u) this);
    }

    public Vec2u mix_(Vec2u y, Vec2bool a) {
        return mix(y, a, new Vec2u());
    }

    public Vec2u mix(Vec2u y, Vec2bool a, Vec2u result) {
        return mix((Vec2u) this, y, a, result);
    }

    public static Vec2u mix(Vec2u x, Vec2u y, Vec2bool a, Vec2u result) {
        result.x = a.x ? y.x : x.x;
        result.y = a.y ? y.y : x.y;
        return result;
    }

    public Vec2u mix(Vec2u y, int a) {
        return mix(y, a, (Vec2u) this);
    }

    public Vec2u mix_(Vec2u y, int a) {
        return mix(y, a, new Vec2u());
    }

    public Vec2u mix(Vec2u y, int a, Vec2u result) {
        return mix((Vec2u) this, y, a, result);
    }

    public static Vec2u mix(Vec2u x, Vec2u y, int a, Vec2u result) {
        result.x = x.x + a * (y.x - x.x);
        result.y = x.y + a * (y.y - x.y);
        return result;
    }

    public Vec2u mix(Vec2u y, Vec2u a) {
        return mix(y, a, (Vec2u) this);
    }

    public Vec2u mix_(Vec2u y, Vec2u a) {
        return mix(y, a, new Vec2u());
    }

    public Vec2u mix(Vec2u y, Vec2u a, Vec2u result) {
        return mix((Vec2u) this, y, a, result);
    }

    public static Vec2u mix(Vec2u x, Vec2u y, Vec2u a, Vec2u result) {
        result.x = x.x + a.x * (y.x - x.x);
        result.y = x.y + a.y * (y.y - x.y);
        return result;
    }

    public Vec2u mod(Vec2u y) {
        return mod(y, (Vec2u) this);
    }

    public Vec2u mod_(Vec2u y) {
        return mod(y, new Vec2u());
    }

    public Vec2u mod(Vec2u y, Vec2u result) {
        return mod((Vec2u) this, y, result);
    }

    public static Vec2u mod(Vec2u x, Vec2u y, Vec2u result) {
        result.x = x.x - y.x * glm.floor(Integer.divideUnsigned(x.x, y.x));
        result.y = x.y - y.y * glm.floor(Integer.divideUnsigned(x.y, y.y));
        return result;
    }

    public Vec2u sign() {
        return sign((Vec2u) this, (Vec2u) this);
    }

    public Vec2u sign_() {
        return sign(new Vec2u());
    }

    public Vec2u sign(Vec2u result) {
        return sign((Vec2u) this, result);
    }

    public static Vec2u sign(Vec2u x, Vec2u result) {
        result.x = (int) Math.signum(x.x);
        result.y = (int) Math.signum(x.y);
        return result;
    }

    public Vec2u smoothStep(Vec2u edge0, Vec2u edge1) {
        return smoothStep(edge0, edge1, (Vec2u) this);
    }

    public Vec2u smoothStep_(Vec2u edge0, Vec2u edge1) {
        return smoothStep(edge0, edge1, new Vec2u());
    }

    public Vec2u smoothStep(Vec2u edge0, Vec2u edge1, Vec2u result) {
        return smoothStep(edge0, edge1, (Vec2u) this, result);
    }

    public static Vec2u smoothStep(Vec2u edge0, Vec2u edge1, Vec2u x, Vec2u result) {
        // clamp
        int tmpX = Math.min(Math.max(Integer.divideUnsigned((x.x - edge0.x), (edge1.x - edge0.x)), 0), 1);
        int tmpY = Math.min(Math.max(Integer.divideUnsigned((x.y - edge0.y), (edge1.y - edge0.y)), 0), 1);
        result.x = tmpX * tmpX * (3 - 2 * tmpX);
        result.y = tmpY * tmpY * (3 - 2 * tmpY);
        return result;
    }

    public Vec2u step(Vec2u edge) {
        return step(edge, (Vec2u) this);
    }

    public Vec2u step_(Vec2u edge) {
        return step(edge, new Vec2u());
    }

    public Vec2u step(Vec2u edge, Vec2u result) {
        return step(edge, (Vec2u) this, result);
    }

    public static Vec2u step(Vec2u edge, Vec2u x, Vec2u result) {
        result.x = x.x < edge.x ? 0 : 1;
        result.y = x.y < edge.y ? 0 : 1;
        return result;
    }

}
