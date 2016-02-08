/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glf;

import dev.Vec4u8;
import glm.vec._3.Vec3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 *
 * @author GBarbieri
 */
public class Vertex_v3fv4u8 {

    public static final int SIZE = Vec3.SIZE + Vec4u8.SIZE;

    public Vec3 position;
    public Vec4u8 color;

    public Vertex_v3fv4u8(Vec3 position, Vec4u8 color) {
        this.position = position;
        this.color = color;
    }

    public ByteBuffer toBB_() {
        return ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder())
                .putFloat(0 * Float.BYTES, position.x)
                .putFloat(1 * Float.BYTES, position.y)
                .putFloat(2 * Float.BYTES, position.z)
                .put(3 * Float.BYTES + 0 * Byte.BYTES, color.x)
                .put(3 * Float.BYTES + 1 * Byte.BYTES, color.y)
                .put(3 * Float.BYTES + 2 * Byte.BYTES, color.z)
                .put(3 * Float.BYTES + 3 * Byte.BYTES, color.w);
    }
}
