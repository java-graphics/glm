/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glf;

import glm.vec._2.Vec2;

/**
 *
 * @author GBarbieri
 */
public class Vertex_v2fv2f {

    public static final int SIZE = 2 * Vec2.SIZE;
    
    public Vec2 position;
    public Vec2 texCoord;

    public Vertex_v2fv2f(Vec2 position, Vec2 texCoord) {
        this.position = position;
        this.texCoord = texCoord;
    }
}
