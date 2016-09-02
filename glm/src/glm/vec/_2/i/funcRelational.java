/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.i;

import glm.glm;

/**
 *
 * @author fschaefers
 */
public abstract class funcRelational extends funcCommon {

    public Vec2i lessThan(Vec2i y) {
        return lessThan((Vec2i) this, y, (Vec2i) this);
    }

    public Vec2i lessThan_(Vec2i y) {
        return lessThan((Vec2i) this, y, new Vec2i());
    }

    public Vec2i lessThan(Vec2i y, Vec2i result) {
        return lessThan((Vec2i) this, y, result);
    }

    public static Vec2i lessThan(Vec2i x, Vec2i y, Vec2i result) {
        result.x = x.x < y.x ? 1 : 0;
        result.y = x.y < y.y ? 1 : 0;
        return result;
    }

    public Vec2i lessThanEqual(Vec2i y) {
        return lessThan((Vec2i) this, y, (Vec2i) this);
    }

    public Vec2i lessThanEqual_(Vec2i y) {
        return lessThanEqual((Vec2i) this, y, new Vec2i());
    }

    public Vec2i lessThanEqual(Vec2i y, Vec2i result) {
        return lessThanEqual((Vec2i) this, y, result);
    }

    public static Vec2i lessThanEqual(Vec2i x, Vec2i y, Vec2i result) {
        result.x = x.x <= y.x ? 1 : 0;
        result.y = x.y <= y.y ? 1 : 0;
        return result;
    }

    public Vec2i greaterThan(Vec2i y) {
        return greaterThan((Vec2i) this, y, (Vec2i) this);
    }

    public Vec2i greaterThan_(Vec2i y) {
        return greaterThan((Vec2i) this, y, new Vec2i());
    }

    public Vec2i greaterThan(Vec2i y, Vec2i result) {
        return greaterThan((Vec2i) this, y, result);
    }

    public static Vec2i greaterThan(Vec2i x, Vec2i y, Vec2i result) {
        result.x = x.x > y.x ? 1 : 0;
        result.y = x.y > y.y ? 1 : 0;
        return result;
    }

    public Vec2i greaterThanEqual(Vec2i y) {
        return greaterThanEqual((Vec2i) this, y, (Vec2i) this);
    }

    public Vec2i greaterThanEqual_(Vec2i y) {
        return greaterThanEqual((Vec2i) this, y, new Vec2i());
    }

    public Vec2i greaterThanEqual(Vec2i y, Vec2i result) {
        return greaterThanEqual((Vec2i) this, y, result);
    }

    public static Vec2i greaterThanEqual(Vec2i x, Vec2i y, Vec2i result) {
        result.x = x.x >= y.x ? 1 : 0;
        result.y = x.y >= y.y ? 1 : 0;
        return result;
    }

    public Vec2i equal(Vec2i y) {
        return equal((Vec2i) this, y, (Vec2i) this);
    }

    public Vec2i equal_(Vec2i y) {
        return equal((Vec2i) this, y, new Vec2i());
    }

    public Vec2i equal(Vec2i y, Vec2i result) {
        return equal((Vec2i) this, y, result);
    }

    public static Vec2i equal(Vec2i x, Vec2i y, Vec2i result) {
        result.x = (x.x == y.x) ? 1 : 0;
        result.y = (x.y == y.y) ? 1 : 0;
        return result;
    }

    public boolean isEqual(Vec2i y) {

        return glm.compareFloatEquals(this.x, y.x)
                && glm.compareFloatEquals(this.y, y.y);

    }

    public Vec2i notEqual(Vec2i y) {
        return notEqual((Vec2i) this, y, (Vec2i) this);
    }

    public Vec2i notEqual_(Vec2i y) {
        return notEqual((Vec2i) this, y, new Vec2i());
    }

    public Vec2i notEqual(Vec2i y, Vec2i result) {
        return notEqual((Vec2i) this, y, result);
    }

    public static Vec2i notEqual(Vec2i x, Vec2i y, Vec2i result) {
        result.x = (x.x != y.x) ? 1 : 0;
        result.y = (x.y != y.y) ? 1 : 0;
        return result;
    }

    public boolean any() {
        return any((Vec2i) this);
    }

    public static boolean any(Vec2i v) {
        boolean result = false;
        result = result || (v.x != 0);
        result = result || (v.y != 0);
        return result;
    }

    public boolean all() {
        return all((Vec2i) this);
    }

    public static boolean all(Vec2i v) {
        boolean result = true;
        result = result && (v.x != 0);
        result = result && (v.y != 0);
        return result;
    }

    public Vec2i not_(Vec2i y) {
        return not((Vec2i) this, new Vec2i());
    }

    public Vec2i not(Vec2i result) {
        return not((Vec2i) this, result);
    }

    public static Vec2i not(Vec2i v, Vec2i result) {
        result.x = v.x == 0 ? 1 : 0;
        result.y = v.y == 0 ? 1 : 0;
        return result;
    }
}
