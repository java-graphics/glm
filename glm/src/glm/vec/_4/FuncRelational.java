/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4;

import glm.Glm;

/**
 *
 * @author elect
 */
abstract class funcRelational extends funcGeometric {

    public Vec4 lessThan(Vec4 y) {
        return lessThan((Vec4) this, y, (Vec4) this);
    }

    public Vec4 lessThan_(Vec4 y) {
        return lessThan((Vec4) this, y, new Vec4());
    }

    public Vec4 lessThan(Vec4 y, Vec4 result) {
        return lessThan((Vec4) this, y, result);
    }

    public static Vec4 lessThan(Vec4 x, Vec4 y, Vec4 result) {
        result.x = x.x < y.x ? 1 : 0;
        result.y = x.y < y.y ? 1 : 0;
        result.z = x.z < y.z ? 1 : 0;
        result.w = x.w < y.w ? 1 : 0;
        return result;
    }

    public Vec4 lessThanEqual(Vec4 y) {
        return lessThan((Vec4) this, y, (Vec4) this);
    }

    public Vec4 lessThanEqual_(Vec4 y) {
        return lessThanEqual((Vec4) this, y, new Vec4());
    }

    public Vec4 lessThanEqual(Vec4 y, Vec4 result) {
        return lessThanEqual((Vec4) this, y, result);
    }

    public static Vec4 lessThanEqual(Vec4 x, Vec4 y, Vec4 result) {
        result.x = x.x <= y.x ? 1 : 0;
        result.y = x.y <= y.y ? 1 : 0;
        result.z = x.z <= y.z ? 1 : 0;
        result.w = x.w <= y.w ? 1 : 0;
        return result;
    }

    public Vec4 greaterThan(Vec4 y) {
        return greaterThan((Vec4) this, y, (Vec4) this);
    }

    public Vec4 greaterThan_(Vec4 y) {
        return greaterThan((Vec4) this, y, new Vec4());
    }

    public Vec4 greaterThan(Vec4 y, Vec4 result) {
        return greaterThan((Vec4) this, y, result);
    }

    public static Vec4 greaterThan(Vec4 x, Vec4 y, Vec4 result) {
        result.x = x.x > y.x ? 1 : 0;
        result.y = x.y > y.y ? 1 : 0;
        result.z = x.z > y.z ? 1 : 0;
        result.w = x.w > y.w ? 1 : 0;
        return result;
    }

    public Vec4 greaterThanEqual(Vec4 y) {
        return greaterThanEqual((Vec4) this, y, (Vec4) this);
    }

    public Vec4 greaterThanEqual_(Vec4 y) {
        return greaterThanEqual((Vec4) this, y, new Vec4());
    }

    public Vec4 greaterThanEqual(Vec4 y, Vec4 result) {
        return greaterThanEqual((Vec4) this, y, result);
    }

    public static Vec4 greaterThanEqual(Vec4 x, Vec4 y, Vec4 result) {
        result.x = x.x >= y.x ? 1 : 0;
        result.y = x.y >= y.y ? 1 : 0;
        result.z = x.z >= y.z ? 1 : 0;
        result.w = x.w >= y.w ? 1 : 0;
        return result;
    }

    public Vec4 equal(Vec4 y) {
        return equal((Vec4) this, y, (Vec4) this);
    }

    public Vec4 equal_(Vec4 y) {
        return equal((Vec4) this, y, new Vec4());
    }

    public Vec4 equal(Vec4 y, Vec4 result) {
        return equal((Vec4) this, y, result);
    }

    public static Vec4 equal(Vec4 x, Vec4 y, Vec4 result) {
        result.x = Glm.compareFloatEquals(x.x, y.x) ? 1 : 0;
        result.y = Glm.compareFloatEquals(x.y, y.y) ? 1 : 0;
        result.z = Glm.compareFloatEquals(x.z, y.z) ? 1 : 0;
        result.w = Glm.compareFloatEquals(x.w, y.w) ? 1 : 0;
        return result;
    }

    public boolean isEqual(Vec4 y) {
    
        return Glm.compareFloatEquals(this.x, y.x)
                && Glm.compareFloatEquals(this.y, y.y)
                && Glm.compareFloatEquals(this.z, y.z)
                && Glm.compareFloatEquals(this.w, y.w);

    }

    public Vec4 notEqual(Vec4 y) {
        return notEqual((Vec4) this, y, (Vec4) this);
    }

    public Vec4 notEqual_(Vec4 y) {
        return notEqual((Vec4) this, y, new Vec4());
    }

    public Vec4 notEqual(Vec4 y, Vec4 result) {
        return notEqual((Vec4) this, y, result);
    }

    public static Vec4 notEqual(Vec4 x, Vec4 y, Vec4 result) {
        result.x = !Glm.compareFloatEquals(x.x, y.x) ? 1 : 0;
        result.y = !Glm.compareFloatEquals(x.y, y.y) ? 1 : 0;
        result.z = !Glm.compareFloatEquals(x.z, y.z) ? 1 : 0;
        result.w = !Glm.compareFloatEquals(x.w, y.w) ? 1 : 0;
        return result;
    }

    public boolean any() {
        return any((Vec4) this);
    }

    public static boolean any(Vec4 v) {
        boolean result = false;
        result = result || (v.x != 0);
        result = result || (v.y != 0);
        result = result || (v.z != 0);
        result = result || (v.w != 0);
        return result;
    }

    public boolean all() {
        return all((Vec4) this);
    }

    public static boolean all(Vec4 v) {
        boolean result = true;
        result = result && (v.x != 0);
        result = result && (v.y != 0);
        result = result && (v.z != 0);
        result = result && (v.w != 0);
        return result;
    }

    public Vec4 not_(Vec4 y) {
        return not((Vec4) this, new Vec4());
    }

    public Vec4 not(Vec4 result) {
        return not((Vec4) this, result);
    }

    public static Vec4 not(Vec4 v, Vec4 result) {
        result.x = v.x == 0 ? 1 : 0;
        result.y = v.y == 0 ? 1 : 0;
        result.z = v.z == 0 ? 1 : 0;
        result.w = v.w == 0 ? 1 : 0;
        return result;
    }
}
