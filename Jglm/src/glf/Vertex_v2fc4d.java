/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glf;

import glm.vec._2.Vec2;
import dev.Vec4d;
import java.nio.ByteBuffer;

/**
 *
 * @author elect
 */
public class Vertex_v2fc4d {

    public static final int SIZE = Vec2.SIZE + Vec4d.SIZE;

    public Vec2 position;
    public Vec4d color;

    public Vertex_v2fc4d(Vec2 position, Vec4d color) {
        this.position = position;
        this.color = color;
    }

    public ByteBuffer toBB(ByteBuffer bb) {
        return bb
                .putFloat(0 * Float.BYTES, position.x)
                .putFloat(1 * Float.BYTES, position.y)
                .putDouble(2 * Float.BYTES + 0 * Double.BYTES, color.x)
                .putDouble(2 * Float.BYTES + 1 * Double.BYTES, color.x)
                .putDouble(2 * Float.BYTES + 2 * Double.BYTES, color.x)
                .putDouble(2 * Float.BYTES + 3 * Double.BYTES, color.x);
    }
    
    public ByteBuffer toBB_() {
        return ByteBuffer.allocate(SIZE)
                .putFloat(0 * Float.BYTES, position.x)
                .putFloat(1 * Float.BYTES, position.y)
                .putDouble(2 * Float.BYTES + 0 * Double.BYTES, color.x)
                .putDouble(2 * Float.BYTES + 1 * Double.BYTES, color.x)
                .putDouble(2 * Float.BYTES + 2 * Double.BYTES, color.x)
                .putDouble(2 * Float.BYTES + 3 * Double.BYTES, color.x);
    }

}
