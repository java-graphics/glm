/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.ui;

import dev.Vec2bool;
import glm.Glm;

/**
 *
 * @author fschaefers
 */
abstract class funcCommon {

    public int x, y;
    public static final int SIZE = 2 * Integer.BYTES;

    public Vec2ui abs() {
        return abs((Vec2ui) this);
    }

    public Vec2ui abs_() {
        return abs(new Vec2ui());
    }

    public Vec2ui abs(Vec2ui result) {
        return abs((Vec2ui) this, result);
    }

    public static Vec2ui abs(Vec2ui x, Vec2ui result) {
        result.x = Math.abs(x.x);
        result.y = Math.abs(x.y);
        return result;
    }

    public Vec2ui ceil() {
        return ceil((Vec2ui) this);
    }

    public Vec2ui ceil_() {
        return ceil(new Vec2ui());
    }

    public Vec2ui ceil(Vec2ui result) {
        return ceil((Vec2ui) this, (Vec2ui) this);
    }

    public static Vec2ui ceil(Vec2ui x, Vec2ui result) {
        result.x = (int) Math.ceil(x.x);
        result.y = (int) Math.ceil(x.y);
        return result;
    }

    public Vec2ui clamp(int minVal, int maxVal) {
        return clamp(minVal, maxVal, (Vec2ui) this);
    }

    public Vec2ui clamp_(int minVal, int maxVal) {
        return clamp(minVal, maxVal, new Vec2ui());
    }

    public Vec2ui clamp(int minVal, int maxVal, Vec2ui result) {
        return clamp((Vec2ui) this, minVal, maxVal, result);
    }

    public static Vec2ui clamp(Vec2ui x, int minVal, int maxVal, Vec2ui result) {
        result.x = Math.min(Math.max(x.x, minVal), maxVal);
        result.y = Math.min(Math.max(x.y, minVal), maxVal);
        return result;
    }

    public Vec2ui clamp(Vec2ui minVal, Vec2ui maxVal) {
        return clamp(minVal, maxVal, (Vec2ui) this);
    }

    public Vec2ui clamp_(Vec2ui minVal, Vec2ui maxVal) {
        return clamp(minVal, maxVal, new Vec2ui());
    }

    public Vec2ui clamp(Vec2ui minVal, Vec2ui maxVal, Vec2ui result) {
        return clamp((Vec2ui) this, minVal, maxVal, result);
    }

    public static Vec2ui clamp(Vec2ui x, Vec2ui minVal, Vec2ui maxVal, Vec2ui result) {
        result.x = Math.min(Math.max(x.x, minVal.x), maxVal.x);
        result.y = Math.min(Math.max(x.y, minVal.y), maxVal.y);
        return result;
    }

    public Vec2ui floatToIntBits_() {
        return floatToIntBits((Vec2ui) this, new Vec2ui());
    }

    public Vec2ui floatToIntBits(Vec2ui result) {
        return floatToIntBits((Vec2ui) this, result);
    }

    public static Vec2ui floatToIntBits(Vec2ui x, Vec2ui result) {
        result.x = Float.floatToIntBits(x.x);
        result.y = Float.floatToIntBits(x.y);
        return result;
    }

    public Vec2ui floor() {
        return floor((Vec2ui) this);
    }

    public Vec2ui floor_() {
        return floor(new Vec2ui());
    }

    public Vec2ui floor(Vec2ui result) {
        return floor((Vec2ui) this, result);
    }

    public static Vec2ui floor(Vec2ui x, Vec2ui result) {
        result.x = (int) Math.floor(x.x);
        result.y = (int) Math.floor(x.y);
        return result;
    }

    public Vec2ui fma(Vec2ui b, Vec2ui c) {
        return fma(b, c, (Vec2ui) this);
    }

    public Vec2ui fma_(Vec2ui b, Vec2ui c) {
        return fma(b, c, new Vec2ui());
    }

    public Vec2ui fma(Vec2ui b, Vec2ui c, Vec2ui result) {
        return fma((Vec2ui) this, b, c, result);
    }

    public static Vec2ui fma(Vec2ui a, Vec2ui b, Vec2ui c, Vec2ui result) {
        result.x = a.x * b.x + c.x;
        result.y = a.y * b.y + c.y;
        return result;
    }

    public Vec2ui fract() {
        return fract((Vec2ui) this);
    }

    public Vec2ui fract_() {
        return fract(new Vec2ui());
    }

    public Vec2ui fract(Vec2ui result) {
        return fract((Vec2ui) this, result);
    }

    public static Vec2ui fract(Vec2ui x, Vec2ui result) {
        result.x = (int) (x.x - Math.floor(x.x));
        result.y = (int) (x.y - Math.floor(x.y));
        return result;
    }

    public Vec2bool isInf_() {
        return isInf((Vec2ui) this, new Vec2bool());
    }

    public Vec2bool isInf(Vec2bool result) {
        return isInf((Vec2ui) this, result);
    }

    public static Vec2bool isInf(Vec2ui x, Vec2bool result) {
        result.x = Float.isInfinite(x.x);
        result.y = Float.isInfinite(x.y);
        return result;
    }

    public Vec2bool isNan() {
        return isNan((Vec2ui) this, new Vec2bool());
    }

    public Vec2bool isNan(Vec2bool result) {
        return isNan((Vec2ui) this, result);
    }

    public static Vec2bool isNan(Vec2ui x, Vec2bool result) {
        result.x = Float.isNaN(x.x);
        result.y = Float.isNaN(x.y);
        return result;
    }

    public Vec2ui max(Vec2ui y) {
        return max(y, (Vec2ui) this);
    }

    public Vec2ui max_(Vec2ui y) {
        return max((Vec2ui) this, y, new Vec2ui());
    }

    public Vec2ui max(Vec2ui y, Vec2ui result) {
        return max((Vec2ui) this, y, result);
    }

    public static Vec2ui max(Vec2ui x, Vec2ui y, Vec2ui result) {
        result.x = Math.max(x.x, y.x);
        result.y = Math.max(x.y, y.y);
        return result;
    }

    public Vec2ui min(Vec2ui y) {
        return min(y, (Vec2ui) this);
    }

    public Vec2ui min_(Vec2ui y) {
        return min(y, new Vec2ui());
    }

    public Vec2ui min(Vec2ui y, Vec2ui result) {
        return min((Vec2ui) this, y, result);
    }

    public static Vec2ui min(Vec2ui x, Vec2ui y, Vec2ui result) {
        result.x = Math.min(x.x, y.x);
        result.y = Math.min(x.y, y.y);
        return result;
    }

    public Vec2ui mix(Vec2ui y, boolean a) {
        return mix(y, a, (Vec2ui) this);
    }

    public Vec2ui mix_(Vec2ui y, boolean a) {
        return mix(y, a, new Vec2ui());
    }

    public Vec2ui mix(Vec2ui y, boolean a, Vec2ui result) {
        return mix((Vec2ui) this, y, a, result);
    }

    public static Vec2ui mix(Vec2ui x, Vec2ui y, boolean a, Vec2ui result) {
        result.x = a ? y.x : x.x;
        result.y = a ? y.y : x.y;
        return result;
    }

    public Vec2ui mix(Vec2ui y, Vec2bool a) {
        return mix(y, a, (Vec2ui) this);
    }

    public Vec2ui mix_(Vec2ui y, Vec2bool a) {
        return mix(y, a, new Vec2ui());
    }

    public Vec2ui mix(Vec2ui y, Vec2bool a, Vec2ui result) {
        return mix((Vec2ui) this, y, a, result);
    }

    public static Vec2ui mix(Vec2ui x, Vec2ui y, Vec2bool a, Vec2ui result) {
        result.x = a.x ? y.x : x.x;
        result.y = a.y ? y.y : x.y;
        return result;
    }

    public Vec2ui mix(Vec2ui y, int a) {
        return mix(y, a, (Vec2ui) this);
    }

    public Vec2ui mix_(Vec2ui y, int a) {
        return mix(y, a, new Vec2ui());
    }

    public Vec2ui mix(Vec2ui y, int a, Vec2ui result) {
        return mix((Vec2ui) this, y, a, result);
    }

    public static Vec2ui mix(Vec2ui x, Vec2ui y, int a, Vec2ui result) {
        result.x = x.x + a * (y.x - x.x);
        result.y = x.y + a * (y.y - x.y);
        return result;
    }

    public Vec2ui mix(Vec2ui y, Vec2ui a) {
        return mix(y, a, (Vec2ui) this);
    }

    public Vec2ui mix_(Vec2ui y, Vec2ui a) {
        return mix(y, a, new Vec2ui());
    }

    public Vec2ui mix(Vec2ui y, Vec2ui a, Vec2ui result) {
        return mix((Vec2ui) this, y, a, result);
    }

    public static Vec2ui mix(Vec2ui x, Vec2ui y, Vec2ui a, Vec2ui result) {
        result.x = x.x + a.x * (y.x - x.x);
        result.y = x.y + a.y * (y.y - x.y);
        return result;
    }

    public Vec2ui mod(Vec2ui y) {
        return mod(y, (Vec2ui) this);
    }

    public Vec2ui mod_(Vec2ui y) {
        return mod(y, new Vec2ui());
    }

    public Vec2ui mod(Vec2ui y, Vec2ui result) {
        return mod((Vec2ui) this, y, result);
    }

    // TODO check floor return type
    public static Vec2ui mod(Vec2ui x, Vec2ui y, Vec2ui result) {
        result.x = (int) (x.x - y.x * Glm.floor(Integer.divideUnsigned(x.x, y.x)));
        result.y = (int) (x.y - y.y * Glm.floor(Integer.divideUnsigned(x.y, y.y)));
        return result;
    }

    public Vec2ui sign() {
        return sign((Vec2ui) this, (Vec2ui) this);
    }

    public Vec2ui sign_() {
        return sign(new Vec2ui());
    }

    public Vec2ui sign(Vec2ui result) {
        return sign((Vec2ui) this, result);
    }

    public static Vec2ui sign(Vec2ui x, Vec2ui result) {
        result.x = (int) Math.signum(x.x);
        result.y = (int) Math.signum(x.y);
        return result;
    }

    public Vec2ui smoothStep(Vec2ui edge0, Vec2ui edge1) {
        return smoothStep(edge0, edge1, (Vec2ui) this);
    }

    public Vec2ui smoothStep_(Vec2ui edge0, Vec2ui edge1) {
        return smoothStep(edge0, edge1, new Vec2ui());
    }

    public Vec2ui smoothStep(Vec2ui edge0, Vec2ui edge1, Vec2ui result) {
        return smoothStep(edge0, edge1, (Vec2ui) this, result);
    }

    public static Vec2ui smoothStep(Vec2ui edge0, Vec2ui edge1, Vec2ui x, Vec2ui result) {
        // clamp
        int tmpX = Math.min(Math.max(Integer.divideUnsigned((x.x - edge0.x), (edge1.x - edge0.x)), 0), 1);
        int tmpY = Math.min(Math.max(Integer.divideUnsigned((x.y - edge0.y), (edge1.y - edge0.y)), 0), 1);
        result.x = tmpX * tmpX * (3 - 2 * tmpX);
        result.y = tmpY * tmpY * (3 - 2 * tmpY);
        return result;
    }

    public Vec2ui step(Vec2ui edge) {
        return step(edge, (Vec2ui) this);
    }

    public Vec2ui step_(Vec2ui edge) {
        return step(edge, new Vec2ui());
    }

    public Vec2ui step(Vec2ui edge, Vec2ui result) {
        return step(edge, (Vec2ui) this, result);
    }

    public static Vec2ui step(Vec2ui edge, Vec2ui x, Vec2ui result) {
        result.x = x.x < edge.x ? 0 : 1;
        result.y = x.y < edge.y ? 0 : 1;
        return result;
    }

}
