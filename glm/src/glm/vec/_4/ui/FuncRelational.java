/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.ui;
import glm.Glm;

/**
 *
 * @author fschaefers
 */
abstract class funcRelational extends funcCommon {

    public Vec2ui lessThan(Vec2ui y) {
        return lessThan((Vec2ui) this, y, (Vec2ui) this);
    }

    public Vec2ui lessThan_(Vec2ui y) {
        return lessThan((Vec2ui) this, y, new Vec2ui());
    }

    public Vec2ui lessThan(Vec2ui y, Vec2ui result) {
        return lessThan((Vec2ui) this, y, result);
    }

    public static Vec2ui lessThan(Vec2ui x, Vec2ui y, Vec2ui result) {
        result.x = x.x < y.x ? 1 : 0;
        result.y = x.y < y.y ? 1 : 0;
        return result;
    }

    public Vec2ui lessThanEqual(Vec2ui y) {
        return lessThan((Vec2ui) this, y, (Vec2ui) this);
    }

    public Vec2ui lessThanEqual_(Vec2ui y) {
        return lessThanEqual((Vec2ui) this, y, new Vec2ui());
    }

    public Vec2ui lessThanEqual(Vec2ui y, Vec2ui result) {
        return lessThanEqual((Vec2ui) this, y, result);
    }

    public static Vec2ui lessThanEqual(Vec2ui x, Vec2ui y, Vec2ui result) {
        result.x = x.x <= y.x ? 1 : 0;
        result.y = x.y <= y.y ? 1 : 0;
        return result;
    }

    public Vec2ui greaterThan(Vec2ui y) {
        return greaterThan((Vec2ui) this, y, (Vec2ui) this);
    }

    public Vec2ui greaterThan_(Vec2ui y) {
        return greaterThan((Vec2ui) this, y, new Vec2ui());
    }

    public Vec2ui greaterThan(Vec2ui y, Vec2ui result) {
        return greaterThan((Vec2ui) this, y, result);
    }

    public static Vec2ui greaterThan(Vec2ui x, Vec2ui y, Vec2ui result) {
        result.x = x.x > y.x ? 1 : 0;
        result.y = x.y > y.y ? 1 : 0;
        return result;
    }

    public Vec2ui greaterThanEqual(Vec2ui y) {
        return greaterThanEqual((Vec2ui) this, y, (Vec2ui) this);
    }

    public Vec2ui greaterThanEqual_(Vec2ui y) {
        return greaterThanEqual((Vec2ui) this, y, new Vec2ui());
    }

    public Vec2ui greaterThanEqual(Vec2ui y, Vec2ui result) {
        return greaterThanEqual((Vec2ui) this, y, result);
    }

    public static Vec2ui greaterThanEqual(Vec2ui x, Vec2ui y, Vec2ui result) {
        result.x = x.x >= y.x ? 1 : 0;
        result.y = x.y >= y.y ? 1 : 0;
        return result;
    }

    public Vec2ui equal(Vec2ui y) {
        return equal((Vec2ui) this, y, (Vec2ui) this);
    }

    public Vec2ui equal_(Vec2ui y) {
        return equal((Vec2ui) this, y, new Vec2ui());
    }

    public Vec2ui equal(Vec2ui y, Vec2ui result) {
        return equal((Vec2ui) this, y, result);
    }

    public static Vec2ui equal(Vec2ui x, Vec2ui y, Vec2ui result) {
        result.x = (x.x == y.x) ? 1 : 0;
        result.y = (x.y == y.y) ? 1 : 0;
        return result;
    }

    public boolean isEqual(Vec2ui y) {

        return Glm.compareFloatEquals(this.x, y.x)
                && Glm.compareFloatEquals(this.y, y.y);

    }

    public Vec2ui notEqual(Vec2ui y) {
        return notEqual((Vec2ui) this, y, (Vec2ui) this);
    }

    public Vec2ui notEqual_(Vec2ui y) {
        return notEqual((Vec2ui) this, y, new Vec2ui());
    }

    public Vec2ui notEqual(Vec2ui y, Vec2ui result) {
        return notEqual((Vec2ui) this, y, result);
    }

    public static Vec2ui notEqual(Vec2ui x, Vec2ui y, Vec2ui result) {
        result.x = (x.x != y.x) ? 1 : 0;
        result.y = (x.y != y.y) ? 1 : 0;
        return result;
    }

    public boolean any() {
        return any((Vec2ui) this);
    }

    public static boolean any(Vec2ui v) {
        boolean result = false;
        result = result || (v.x != 0);
        result = result || (v.y != 0);
        return result;
    }

    public boolean all() {
        return all((Vec2ui) this);
    }

    public static boolean all(Vec2ui v) {
        boolean result = true;
        result = result && (v.x != 0);
        result = result && (v.y != 0);
        return result;
    }

    public Vec2ui not_(Vec2ui y) {
        return not((Vec2ui) this, new Vec2ui());
    }

    public Vec2ui not(Vec2ui result) {
        return not((Vec2ui) this, result);
    }

    public static Vec2ui not(Vec2ui v, Vec2ui result) {
        result.x = v.x == 0 ? 1 : 0;
        result.y = v.y == 0 ? 1 : 0;
        return result;
    }
}
