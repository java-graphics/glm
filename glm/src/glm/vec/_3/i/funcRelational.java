/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._3.i;

/**
 *
 * @author fschaefers
 */
abstract class funcRelational extends funcCommon {

    public Vec3i lessThan(Vec3i y) {
        return lessThan((Vec3i) this, y, (Vec3i) this);
    }

    public Vec3i lessThan_(Vec3i y) {
        return lessThan((Vec3i) this, y, new Vec3i());
    }

    public Vec3i lessThan(Vec3i y, Vec3i result) {
        return lessThan((Vec3i) this, y, result);
    }

    public static Vec3i lessThan(Vec3i x, Vec3i y, Vec3i result) {
        result.x = x.x < y.x ? 1 : 0;
        result.y = x.y < y.y ? 1 : 0;
        result.z = x.z < y.z ? 1 : 0;
        return result;
    }

    public Vec3i lessThanEqual(Vec3i y) {
        return lessThan((Vec3i) this, y, (Vec3i) this);
    }

    public Vec3i lessThanEqual_(Vec3i y) {
        return lessThanEqual((Vec3i) this, y, new Vec3i());
    }

    public Vec3i lessThanEqual(Vec3i y, Vec3i result) {
        return lessThanEqual((Vec3i) this, y, result);
    }

    public static Vec3i lessThanEqual(Vec3i x, Vec3i y, Vec3i result) {
        result.x = x.x <= y.x ? 1 : 0;
        result.y = x.y <= y.y ? 1 : 0;
        result.z = x.z <= y.z ? 1 : 0;
        return result;
    }

    public Vec3i greaterThan_(int i) {
        return greaterThan(i, i, i, new Vec3i());
    }

    public Vec3i greaterThan(Vec3i y) {
        return greaterThan((Vec3i) this, y, (Vec3i) this);
    }

    public Vec3i greaterThan_(Vec3i y) {
        return greaterThan((Vec3i) this, y, new Vec3i());
    }

    public Vec3i greaterThan(Vec3i y, Vec3i result) {
        return greaterThan((Vec3i) this, y, result);
    }

    public Vec3i greaterThan(int bx, int by, int bz, Vec3i result) {
        return greaterThan(x, y, z, bx, by, bz, result);
    }

    public Vec3i greaterThan(Vec3i a, Vec3i b, Vec3i result) {
        return greaterThan(a.x, a.y, a.z, b.x, b.y, b.z, result);
    }

    public static Vec3i greaterThan(int aX, int aY, int aZ, int bX, int bY, int bZ, Vec3i result) {
        result.x = aX > bX ? 1 : 0;
        result.y = aY > bY ? 1 : 0;
        result.z = aZ > bZ ? 1 : 0;
        return result;
    }

    public Vec3i greaterThanEqual(Vec3i y) {
        return greaterThanEqual((Vec3i) this, y, (Vec3i) this);
    }

    public Vec3i greaterThanEqual_(Vec3i y) {
        return greaterThanEqual((Vec3i) this, y, new Vec3i());
    }

    public Vec3i greaterThanEqual(Vec3i y, Vec3i result) {
        return greaterThanEqual((Vec3i) this, y, result);
    }

    public static Vec3i greaterThanEqual(Vec3i x, Vec3i y, Vec3i result) {
        result.x = x.x >= y.x ? 1 : 0;
        result.y = x.y >= y.y ? 1 : 0;
        result.z = x.z >= y.z ? 1 : 0;
        return result;
    }

    public Vec3i equal(Vec3i y) {
        return equal((Vec3i) this, y, (Vec3i) this);
    }

    public Vec3i equal_(Vec3i y) {
        return equal((Vec3i) this, y, new Vec3i());
    }

    public Vec3i equal(Vec3i y, Vec3i result) {
        return equal((Vec3i) this, y, result);
    }

    public static Vec3i equal(Vec3i x, Vec3i y, Vec3i result) {
        result.x = (x.x == y.x) ? 1 : 0;
        result.y = (x.y == y.y) ? 1 : 0;
        result.z = (x.z == y.z) ? 1 : 0;
        return result;
    }

    public boolean isEqual(Vec3i y) {

        return (this.x == y.x)
                && (this.y == y.y)
                && (this.z == y.z);

    }

    public Vec3i notEqual(Vec3i y) {
        return notEqual((Vec3i) this, y, (Vec3i) this);
    }

    public Vec3i notEqual_(Vec3i y) {
        return notEqual((Vec3i) this, y, new Vec3i());
    }

    public Vec3i notEqual(Vec3i y, Vec3i result) {
        return notEqual((Vec3i) this, y, result);
    }

    public static Vec3i notEqual(Vec3i x, Vec3i y, Vec3i result) {
        result.x = (x.x != y.x) ? 1 : 0;
        result.y = (x.y != y.y) ? 1 : 0;
        result.z = (x.z != y.z) ? 1 : 0;
        return result;
    }

    public boolean any() {
        return any((Vec3i) this);
    }

    public static boolean any(Vec3i v) {
        boolean result = false;
        result = result || (v.x != 0);
        result = result || (v.y != 0);
        result = result || (v.z != 0);
        return result;
    }

    public boolean all() {
        return all((Vec3i) this);
    }

    public static boolean all(Vec3i v) {
        boolean result = true;
        result = result && (v.x != 0);
        result = result && (v.y != 0);
        result = result && (v.z != 0);
        return result;
    }

    public Vec3i not_(Vec3i y) {
        return not((Vec3i) this, new Vec3i());
    }

    public Vec3i not(Vec3i result) {
        return not((Vec3i) this, result);
    }

    public static Vec3i not(Vec3i v, Vec3i result) {
        result.x = v.x == 0 ? 1 : 0;
        result.y = v.y == 0 ? 1 : 0;
        result.z = v.z == 0 ? 1 : 0;
        return result;
    }
}
