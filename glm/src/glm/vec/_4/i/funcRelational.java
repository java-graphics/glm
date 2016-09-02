/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.i;

import glm.glm;

/**
 *
 * @author fschaefers
 */
public abstract class funcRelational extends funcCommon {

    public Vec4i lessThan(Vec4i y) {
        return lessThan((Vec4i) this, y, (Vec4i) this);
    }

    public Vec4i lessThan_(Vec4i y) {
        return lessThan((Vec4i) this, y, new Vec4i());
    }

    public Vec4i lessThan(Vec4i y, Vec4i result) {
        return lessThan((Vec4i) this, y, result);
    }

    public static Vec4i lessThan(Vec4i x, Vec4i y, Vec4i result) {
        result.x = x.x < y.x ? 1 : 0;
        result.y = x.y < y.y ? 1 : 0;
        result.z = x.z < y.z ? 1 : 0;
        result.w = x.w < y.w ? 1 : 0;
        return result;
    }

    public Vec4i lessThanEqual(Vec4i y) {
        return lessThan((Vec4i) this, y, (Vec4i) this);
    }

    public Vec4i lessThanEqual_(Vec4i y) {
        return lessThanEqual((Vec4i) this, y, new Vec4i());
    }

    public Vec4i lessThanEqual(Vec4i y, Vec4i result) {
        return lessThanEqual((Vec4i) this, y, result);
    }

    public static Vec4i lessThanEqual(Vec4i x, Vec4i y, Vec4i result) {
        result.x = x.x <= y.x ? 1 : 0;
        result.y = x.y <= y.y ? 1 : 0;
        result.z = x.z <= y.z ? 1 : 0;
        result.w = x.w <= y.w ? 1 : 0;
        return result;
    }

    public Vec4i greaterThan(Vec4i y) {
        return greaterThan((Vec4i) this, y, (Vec4i) this);
    }

    public Vec4i greaterThan_(Vec4i y) {
        return greaterThan((Vec4i) this, y, new Vec4i());
    }

    public Vec4i greaterThan(Vec4i y, Vec4i result) {
        return greaterThan((Vec4i) this, y, result);
    }

    public static Vec4i greaterThan(Vec4i x, Vec4i y, Vec4i result) {
        result.x = x.x > y.x ? 1 : 0;
        result.y = x.y > y.y ? 1 : 0;
        result.z = x.z > y.z ? 1 : 0;
        result.w = x.w > y.w ? 1 : 0;
        return result;
    }

    public Vec4i greaterThanEqual(Vec4i y) {
        return greaterThanEqual((Vec4i) this, y, (Vec4i) this);
    }

    public Vec4i greaterThanEqual_(Vec4i y) {
        return greaterThanEqual((Vec4i) this, y, new Vec4i());
    }

    public Vec4i greaterThanEqual(Vec4i y, Vec4i result) {
        return greaterThanEqual((Vec4i) this, y, result);
    }

    public static Vec4i greaterThanEqual(Vec4i x, Vec4i y, Vec4i result) {
        result.x = x.x >= y.x ? 1 : 0;
        result.y = x.y >= y.y ? 1 : 0;
        result.z = x.z >= y.z ? 1 : 0;
        result.w = x.w >= y.w ? 1 : 0;
        return result;
    }

    public Vec4i equal(Vec4i y) {
        return equal((Vec4i) this, y, (Vec4i) this);
    }

    public Vec4i equal_(Vec4i y) {
        return equal((Vec4i) this, y, new Vec4i());
    }

    public Vec4i equal(Vec4i y, Vec4i result) {
        return equal((Vec4i) this, y, result);
    }

    public static Vec4i equal(Vec4i x, Vec4i y, Vec4i result) {
        result.x = (x.x == y.x) ? 1 : 0;
        result.y = (x.y == y.y) ? 1 : 0;
        result.z = (x.z == y.z) ? 1 : 0;
        result.w = (x.w == y.w) ? 1 : 0;
        return result;
    }

    public boolean isEqual(Vec4i y) {

        return (this.x == y.x)
                && (this.y == y.y)
                && (this.z == y.z)
                && (this.w == y.w);
    }

    public Vec4i notEqual(Vec4i y) {
        return notEqual((Vec4i) this, y, (Vec4i) this);
    }

    public Vec4i notEqual_(Vec4i y) {
        return notEqual((Vec4i) this, y, new Vec4i());
    }

    public Vec4i notEqual(Vec4i y, Vec4i result) {
        return notEqual((Vec4i) this, y, result);
    }

    public static Vec4i notEqual(Vec4i x, Vec4i y, Vec4i result) {
        result.x = (x.x == y.x) ? 1 : 0;
        result.y = (x.y == y.y) ? 1 : 0;
        result.z = (x.z == y.z) ? 1 : 0;
        result.w = (x.w == y.w) ? 1 : 0;
        return result;
    }

    public boolean any() {
        return any((Vec4i) this);
    }

    public static boolean any(Vec4i v) {
        boolean result = false;
        result = result || (v.x != 0);
        result = result || (v.y != 0);
        result = result || (v.z != 0);
        result = result || (v.w != 0);
        return result;
    }

    public boolean all() {
        return all((Vec4i) this);
    }

    public static boolean all(Vec4i v) {
        boolean result = true;
        result = result && (v.x != 0);
        result = result && (v.y != 0);
        result = result && (v.z != 0);
        result = result && (v.w != 0);
        return result;
    }

    public Vec4i not_(Vec4i y) {
        return not((Vec4i) this, new Vec4i());
    }

    public Vec4i not(Vec4i result) {
        return not((Vec4i) this, result);
    }

    public static Vec4i not(Vec4i v, Vec4i result) {
        result.x = v.x == 0 ? 1 : 0;
        result.y = v.y == 0 ? 1 : 0;
        result.z = v.z == 0 ? 1 : 0;
        result.w = v.w == 0 ? 1 : 0;
        return result;
    }
}
