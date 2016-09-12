/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.u;
import glm.glm;

/**
 *
 * @author fschaefers
 */
abstract class funcRelational extends funcCommon {

    public Vec2u lessThan(Vec2u y) {
        return lessThan((Vec2u) this, y, (Vec2u) this);
    }

    public Vec2u lessThan_(Vec2u y) {
        return lessThan((Vec2u) this, y, new Vec2u());
    }

    public Vec2u lessThan(Vec2u y, Vec2u result) {
        return lessThan((Vec2u) this, y, result);
    }

    public static Vec2u lessThan(Vec2u x, Vec2u y, Vec2u result) {
        result.x = x.x < y.x ? 1 : 0;
        result.y = x.y < y.y ? 1 : 0;
        return result;
    }

    public Vec2u lessThanEqual(Vec2u y) {
        return lessThan((Vec2u) this, y, (Vec2u) this);
    }

    public Vec2u lessThanEqual_(Vec2u y) {
        return lessThanEqual((Vec2u) this, y, new Vec2u());
    }

    public Vec2u lessThanEqual(Vec2u y, Vec2u result) {
        return lessThanEqual((Vec2u) this, y, result);
    }

    public static Vec2u lessThanEqual(Vec2u x, Vec2u y, Vec2u result) {
        result.x = x.x <= y.x ? 1 : 0;
        result.y = x.y <= y.y ? 1 : 0;
        return result;
    }

    public Vec2u greaterThan(Vec2u y) {
        return greaterThan((Vec2u) this, y, (Vec2u) this);
    }

    public Vec2u greaterThan_(Vec2u y) {
        return greaterThan((Vec2u) this, y, new Vec2u());
    }

    public Vec2u greaterThan(Vec2u y, Vec2u result) {
        return greaterThan((Vec2u) this, y, result);
    }

    public static Vec2u greaterThan(Vec2u x, Vec2u y, Vec2u result) {
        result.x = x.x > y.x ? 1 : 0;
        result.y = x.y > y.y ? 1 : 0;
        return result;
    }

    public Vec2u greaterThanEqual(Vec2u y) {
        return greaterThanEqual((Vec2u) this, y, (Vec2u) this);
    }

    public Vec2u greaterThanEqual_(Vec2u y) {
        return greaterThanEqual((Vec2u) this, y, new Vec2u());
    }

    public Vec2u greaterThanEqual(Vec2u y, Vec2u result) {
        return greaterThanEqual((Vec2u) this, y, result);
    }

    public static Vec2u greaterThanEqual(Vec2u x, Vec2u y, Vec2u result) {
        result.x = x.x >= y.x ? 1 : 0;
        result.y = x.y >= y.y ? 1 : 0;
        return result;
    }

    public Vec2u equal(Vec2u y) {
        return equal((Vec2u) this, y, (Vec2u) this);
    }

    public Vec2u equal_(Vec2u y) {
        return equal((Vec2u) this, y, new Vec2u());
    }

    public Vec2u equal(Vec2u y, Vec2u result) {
        return equal((Vec2u) this, y, result);
    }

    public static Vec2u equal(Vec2u x, Vec2u y, Vec2u result) {
        result.x = (x.x == y.x) ? 1 : 0;
        result.y = (x.y == y.y) ? 1 : 0;
        return result;
    }

    public boolean isEqual(Vec2u y) {

        return glm.compareFloatEquals(this.x, y.x)
                && glm.compareFloatEquals(this.y, y.y);

    }

    public Vec2u notEqual(Vec2u y) {
        return notEqual((Vec2u) this, y, (Vec2u) this);
    }

    public Vec2u notEqual_(Vec2u y) {
        return notEqual((Vec2u) this, y, new Vec2u());
    }

    public Vec2u notEqual(Vec2u y, Vec2u result) {
        return notEqual((Vec2u) this, y, result);
    }

    public static Vec2u notEqual(Vec2u x, Vec2u y, Vec2u result) {
        result.x = (x.x != y.x) ? 1 : 0;
        result.y = (x.y != y.y) ? 1 : 0;
        return result;
    }

    public boolean any() {
        return any((Vec2u) this);
    }

    public static boolean any(Vec2u v) {
        boolean result = false;
        result = result || (v.x != 0);
        result = result || (v.y != 0);
        return result;
    }

    public boolean all() {
        return all((Vec2u) this);
    }

    public static boolean all(Vec2u v) {
        boolean result = true;
        result = result && (v.x != 0);
        result = result && (v.y != 0);
        return result;
    }

    public Vec2u not_(Vec2u y) {
        return not((Vec2u) this, new Vec2u());
    }

    public Vec2u not(Vec2u result) {
        return not((Vec2u) this, result);
    }

    public static Vec2u not(Vec2u v, Vec2u result) {
        result.x = v.x == 0 ? 1 : 0;
        result.y = v.y == 0 ? 1 : 0;
        return result;
    }
}
