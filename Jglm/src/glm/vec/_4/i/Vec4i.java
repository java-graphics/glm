/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.i;

import glm.vec._3.i.Vec3i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/**
 *
 * @author GBarbieri
 */
public class Vec4i {

    public static final int SIZE = 4 * Integer.BYTES;

    public int x, y, z, w;

    public Vec4i() {
        x = 0;
        y = 0;
        z = 0;
        w = 0;
    }

    public Vec4i(int x, int y, int z, int w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
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
    
    public IntBuffer toDib_() {
        return toDib(ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder()).asIntBuffer());
    }

    public IntBuffer toDib(IntBuffer ib) {
        return toDib(ib, 0);
    }

    public IntBuffer toDib(IntBuffer ib, int index) {
        return ib
                .put(index + 0, x)
                .put(index + 1, y)
                .put(index + 2, z)
                .put(index + 3, w);
    }

    public ByteBuffer toDbb_() {
        return toDbb(ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder()));
    }

    public ByteBuffer toDbb(ByteBuffer bb) {
        return toDbb(bb, 0);
    }

    public ByteBuffer toDbb(ByteBuffer bb, int index) {
        return bb
                .putInt(index + 0 * Integer.BYTES, x)
                .putInt(index + 1 * Integer.BYTES, y)
                .putInt(index + 2 * Integer.BYTES, z)
                .putInt(index + 3 * Integer.BYTES, w);
    }
}
