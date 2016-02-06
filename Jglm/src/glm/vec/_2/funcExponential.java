/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2;

/**
 *
 * @author elect
 */
class funcExponential extends funcCommon {

    public Vec2 exp() {
        return exp((Vec2) this, (Vec2) this);
    }

    public Vec2 exp_() {
        return exp((Vec2) this);
    }

    public Vec2 exp(Vec2 result) {
        return exp((Vec2) this, result);
    }

    public static Vec2 exp(Vec2 x, Vec2 result) {
        result.x = (float) Math.exp(x.x);
        result.y = (float) Math.exp(x.y);
        return result;
    }

    public Vec2 exp2() {
        return exp2((Vec2) this, (Vec2) this);
    }

    public Vec2 exp2_() {
        return exp2((Vec2) this);
    }

    public Vec2 exp2(Vec2 result) {
        return exp2((Vec2) this, result);
    }

    public static Vec2 exp2(Vec2 x, Vec2 result) {
        result.x = (float) Math.pow(2, x.x);
        result.y = (float) Math.pow(2, x.y);
        return result;
    }

    public Vec2 log2() {
        return log2((Vec2) this);
    }

    public Vec2 log2_() {
        return log2(new Vec2());
    }

    public Vec2 log2(Vec2 result) {
        result.x = (float) (Math.log(result.x) / Math.log(2));
        result.y = (float) (Math.log(result.y) / Math.log(2));
        return result;
    }
}
