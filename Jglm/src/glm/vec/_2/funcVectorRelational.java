/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2;

import dev.*;

/**
 *
 * @author elect
 */
class funcVectorRelational extends funcExponential {

    public Vec2 lessThan(Vec2 a, Vec2 b) {
        return lessThan(a, b, (Vec2) this);
    }

    public Vec2 lessThan_(Vec2 a, Vec2 b) {
        return lessThan(a, b, new Vec2());
    }

    public Vec2 lessThan(Vec2 a, Vec2 b, Vec2 result) {
        result.x = a.x < b.x ? 1 : 0;
        result.y = a.y < b.y ? 1 : 0;
        return result;
    }
}
