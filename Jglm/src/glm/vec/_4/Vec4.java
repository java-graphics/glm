/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4;

import glm.vec._2.Vec2;
import glm.vec._3.Vec3;

/**
 *
 * @author GBarbieri
 */
public class Vec4 extends colorSpace {

    public Vec4() {
        x = 0f;
        y = 0f;
        z = 0f;
        w = 0f;
    }

    public Vec4(Vec4 v) {
        x = v.x;
        y = v.y;
        z = v.z;
        w = v.w;
    }

    public Vec4(float f) {
        x = f;
        y = f;
        z = f;
        w = f;
    }

    public Vec4(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public Vec4(float f, Vec3 v) {
        x = f;
        y = v.x;
        z = v.y;
        w = v.z;
    }

    public Vec4(Vec3 v, float f) {
        x = v.x;
        y = v.y;
        z = v.z;
        w = f;
    }

    public Vec4(Vec2 v0, Vec2 v1) {
        x = v0.x;
        y = v0.y;
        z = v1.x;
        w = v1.y;
    }
    
    public Vec4(Vec2 v, float f0, float f1) {
        x = v.x;
        y = v.y;
        z = f0;
        w = f1;
    }

    public Vec4 set(Vec4 v) {
        x = v.x;
        y = v.y;
        z = v.z;
        w = v.w;
        return this;
    }

    public Vec4 set(float f) {
        x = f;
        y = f;
        z = f;
        w = f;
        return this;
    }

    public Vec4 set(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }
        
    public Vec4 set(float[] fa) {
        x = fa[0];
        y = fa[1];
        z = fa[2];
        w = fa[3];
        return this;
    }

    public Vec4 set(float f, Vec3 v) {
        x = f;
        y = v.x;
        z = v.y;
        w = v.z;
        return this;
    }

    public Vec4 set(Vec3 v, float f) {
        x = v.x;
        y = v.y;
        z = v.z;
        w = f;
        return this;
    }

    public Vec4 set(Vec2 v0, Vec2 v1) {
        x = v0.x;
        y = v0.y;
        z = v1.x;
        w = v1.y;
        return this;
    }

    public float[] toFA_() {
        return toFA(new float[4]);
    }

    public float[] toFA(float[] fa) {
        fa[0] = x;
        fa[1] = y;
        fa[2] = z;
        fa[3] = w;
        return fa;
    }
}
