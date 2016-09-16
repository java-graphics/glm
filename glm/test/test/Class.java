/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import glm.Glm;
import glm.mat._4.Mat4;
import glm.vec._2.Vec2;
import glm.vec._3.Vec3;

public class Class {
    
    Mat4 camera(float translate, Vec2 rotate) {
        
        Mat4 projection = Glm.perspective_(45.0f, 4.0f/3.0f, 0.1f, 100.0f);
        Mat4 view = new Mat4(1.0f).translate(new Vec3(0.0f, 0.0f, -translate));
        view.rotate(rotate.y, new Vec3(-1.0f, 0.0f, 0.0f));
        view.rotate(rotate.x, new Vec3(0.0f, 1.0f, 0.0f));
        Mat4 model = new Mat4(1.0f).scale(new Vec3(0.5f));
        
        return projection.mul(view).mul(model);
    }
}
