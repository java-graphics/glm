/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3;

import glm.glm;

/**
 *
 * @author elect
 */
public abstract class funcRelational extends funcGeometric {

    public Vec3 lessThan(Vec3 y) {
        return lessThan((Vec3) this, y, (Vec3) this);
    }

    public Vec3 lessThan_(Vec3 y) {
        return lessThan((Vec3) this, y, new Vec3());
    }

    public Vec3 lessThan(Vec3 y, Vec3 result) {
        return lessThan((Vec3) this, y, result);
    }

    public static Vec3 lessThan(Vec3 x, Vec3 y, Vec3 result) {
        result.x = x.x < y.x ? 1 : 0;
        result.y = x.y < y.y ? 1 : 0;
        result.z = x.z < y.z ? 1 : 0;
        return result;
    }

    public Vec3 lessThanEqual(Vec3 y) {
        return lessThan((Vec3) this, y, (Vec3) this);
    }

    public Vec3 lessThanEqual_(Vec3 y) {
        return lessThanEqual((Vec3) this, y, new Vec3());
    }

    public Vec3 lessThanEqual(Vec3 y, Vec3 result) {
        return lessThanEqual((Vec3) this, y, result);
    }

    public static Vec3 lessThanEqual(Vec3 x, Vec3 y, Vec3 result) {
        result.x = x.x <= y.x ? 1 : 0;
        result.y = x.y <= y.y ? 1 : 0;
        result.z = x.z <= y.z ? 1 : 0;
        return result;
    }

    public Vec3 greaterThan(Vec3 y) {
        return greaterThan((Vec3) this, y, (Vec3) this);
    }

    public Vec3 greaterThan_(Vec3 y) {
        return greaterThan((Vec3) this, y, new Vec3());
    }

    public Vec3 greaterThan(Vec3 y, Vec3 result) {
        return greaterThan((Vec3) this, y, result);
    }

    public static Vec3 greaterThan(Vec3 x, Vec3 y, Vec3 result) {
        result.x = x.x > y.x ? 1 : 0;
        result.y = x.y > y.y ? 1 : 0;
        result.z = x.z > y.z ? 1 : 0;
        return result;
    }

    public Vec3 greaterThanEqual(Vec3 y) {
        return greaterThanEqual((Vec3) this, y, (Vec3) this);
    }

    public Vec3 greaterThanEqual_(Vec3 y) {
        return greaterThanEqual((Vec3) this, y, new Vec3());
    }

    public Vec3 greaterThanEqual(Vec3 y, Vec3 result) {
        return greaterThanEqual((Vec3) this, y, result);
    }

    public static Vec3 greaterThanEqual(Vec3 x, Vec3 y, Vec3 result) {
        result.x = x.x >= y.x ? 1 : 0;
        result.y = x.y >= y.y ? 1 : 0;
        result.z = x.z >= y.z ? 1 : 0;
        return result;
    }

    public Vec3 equal(Vec3 y) {
        return equal((Vec3) this, y, (Vec3) this);
    }

    public Vec3 equal_(Vec3 y) {
        return equal((Vec3) this, y, new Vec3());
    }

    public Vec3 equal(Vec3 y, Vec3 result) {
        return equal((Vec3) this, y, result);
    }

    public static Vec3 equal(Vec3 x, Vec3 y, Vec3 result) {
        result.x = glm.compareFloatEquals(x.x, y.x) ? 1 : 0;
        result.y = glm.compareFloatEquals(x.y, y.y) ? 1 : 0;
        result.z = glm.compareFloatEquals(x.z, y.z) ? 1 : 0;
        return result;
    }

    public Vec3 notEqual(Vec3 y) {
        return notEqual((Vec3) this, y, (Vec3) this);
    }

    public Vec3 notEqual_(Vec3 y) {
        return notEqual((Vec3) this, y, new Vec3());
    }

    public Vec3 notEqual(Vec3 y, Vec3 result) {
        return notEqual((Vec3) this, y, result);
    }

    public static Vec3 notEqual(Vec3 x, Vec3 y, Vec3 result) {
        result.x = !glm.compareFloatEquals(x.x, y.x) ? 1 : 0;
        result.y = !glm.compareFloatEquals(x.y, y.y) ? 1 : 0;
        result.z = !glm.compareFloatEquals(x.z, y.z) ? 1 : 0;
        return result;
    }

    public boolean any() {
        return any((Vec3) this);
    }

    public static boolean any(Vec3 v) {
        boolean result = false;
        result = result || (v.x != 0);
        result = result || (v.y != 0);
        result = result || (v.z != 0);
        return result;
    }

    public boolean all() {
        return all((Vec3) this);
    }

    public static boolean all(Vec3 v) {
        boolean result = true;
        result = result && (v.x != 0);
        result = result && (v.y != 0);
        result = result && (v.z != 0);
        return result;
    }

    public Vec3 not_(Vec3 y) {
        return not((Vec3) this, new Vec3());
    }

    public Vec3 not(Vec3 result) {
        return not((Vec3) this, result);
    }

    public static Vec3 not(Vec3 v, Vec3 result) {
        result.x = v.x == 0 ? 1 : 0;
        result.y = v.y == 0 ? 1 : 0;
        result.z = v.z == 0 ? 1 : 0;
        return result;
    }
}
