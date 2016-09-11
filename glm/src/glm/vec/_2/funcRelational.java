/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2;

import glm.glm;

/**
 *
 * @author elect
 */
abstract class funcRelational extends funcGeometric {

    public Vec2 lessThan(Vec2 y) {
        return lessThan((Vec2) this, y, (Vec2) this);
    }

    public Vec2 lessThan_(Vec2 y) {
        return lessThan((Vec2) this, y, new Vec2());
    }

    public Vec2 lessThan(Vec2 y, Vec2 result) {
        return lessThan((Vec2) this, y, result);
    }

    public static Vec2 lessThan(Vec2 x, Vec2 y, Vec2 result) {
        result.x = x.x < y.x ? 1 : 0;
        result.y = x.y < y.y ? 1 : 0;
        return result;
    }

    public Vec2 lessThanEqual(Vec2 y) {
        return lessThan((Vec2) this, y, (Vec2) this);
    }

    public Vec2 lessThanEqual_(Vec2 y) {
        return lessThanEqual((Vec2) this, y, new Vec2());
    }

    public Vec2 lessThanEqual(Vec2 y, Vec2 result) {
        return lessThanEqual((Vec2) this, y, result);
    }

    public static Vec2 lessThanEqual(Vec2 x, Vec2 y, Vec2 result) {
        result.x = x.x <= y.x ? 1 : 0;
        result.y = x.y <= y.y ? 1 : 0;
        return result;
    }

    public Vec2 greaterThan(Vec2 y) {
        return greaterThan((Vec2) this, y, (Vec2) this);
    }

    public Vec2 greaterThan_(Vec2 y) {
        return greaterThan((Vec2) this, y, new Vec2());
    }

    public Vec2 greaterThan(Vec2 y, Vec2 result) {
        return greaterThan((Vec2) this, y, result);
    }

    public static Vec2 greaterThan(Vec2 x, Vec2 y, Vec2 result) {
        result.x = x.x > y.x ? 1 : 0;
        result.y = x.y > y.y ? 1 : 0;
        return result;
    }

    public Vec2 greaterThanEqual(Vec2 y) {
        return greaterThanEqual((Vec2) this, y, (Vec2) this);
    }

    public Vec2 greaterThanEqual_(Vec2 y) {
        return greaterThanEqual((Vec2) this, y, new Vec2());
    }

    public Vec2 greaterThanEqual(Vec2 y, Vec2 result) {
        return greaterThanEqual((Vec2) this, y, result);
    }

    public static Vec2 greaterThanEqual(Vec2 x, Vec2 y, Vec2 result) {
        result.x = x.x >= y.x ? 1 : 0;
        result.y = x.y >= y.y ? 1 : 0;
        return result;
    }

    public Vec2 equal(Vec2 y) {
        return equal((Vec2) this, y, (Vec2) this);
    }

    public Vec2 equal_(Vec2 y) {
        return equal((Vec2) this, y, new Vec2());
    }

    public Vec2 equal(Vec2 y, Vec2 result) {
        return equal((Vec2) this, y, result);
    }

    public static Vec2 equal(Vec2 x, Vec2 y, Vec2 result) {
        result.x = glm.compareFloatEquals(x.x, y.x) ? 1 : 0;
        result.y = glm.compareFloatEquals(x.y, y.y) ? 1 : 0;
        return result;
    }

    public boolean isEqual(Vec2 y) {

        return glm.compareFloatEquals(this.x, y.x)
                && glm.compareFloatEquals(this.y, y.y);

    }

    public Vec2 notEqual(Vec2 y) {
        return notEqual((Vec2) this, y, (Vec2) this);
    }

    public Vec2 notEqual_(Vec2 y) {
        return notEqual((Vec2) this, y, new Vec2());
    }

    public Vec2 notEqual(Vec2 y, Vec2 result) {
        return notEqual((Vec2) this, y, result);
    }

    public static Vec2 notEqual(Vec2 x, Vec2 y, Vec2 result) {
        result.x = !glm.compareFloatEquals(x.x, y.x) ? 1 : 0;
        result.y = !glm.compareFloatEquals(x.y, y.y) ? 1 : 0;
        return result;
    }

    public boolean any() {
        return any((Vec2) this);
    }

    public static boolean any(Vec2 v) {
        boolean result = false;
        result = result || (v.x != 0);
        result = result || (v.y != 0);
        return result;
    }

    public boolean all() {
        return all((Vec2) this);
    }

    public static boolean all(Vec2 v) {
        boolean result = true;
        result = result && (v.x != 0);
        result = result && (v.y != 0);
        return result;
    }

    public Vec2 not_(Vec2 y) {
        return not((Vec2) this, new Vec2());
    }

    public Vec2 not(Vec2 result) {
        return not((Vec2) this, result);
    }

    public static Vec2 not(Vec2 v, Vec2 result) {
        result.x = v.x == 0 ? 1 : 0;
        result.y = v.y == 0 ? 1 : 0;
        return result;
    }
}
