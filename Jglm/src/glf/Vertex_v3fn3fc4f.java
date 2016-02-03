/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glf;

import dev.Vec3;
import dev.Vec4;

/**
 *
 * @author GBarbieri
 */
public class Vertex_v3fn3fc4f {

    public Vec3 position;
    public Vec3 texCoord;
    public Vec4 color;

    public Vertex_v3fn3fc4f(Vec3 position, Vec3 texCoord, Vec4 color) {
        this.position = position;
        this.texCoord = texCoord;
        this.color = color;
    }

    public static final int SIZEOF = 2 * Vec3.SIZEOF + Vec4.SIZEOF;
    public static final int OFFSET_POSITION = 0;
    public static final int OFFSET_NORMAL = Vec3.SIZEOF;
    public static final int OFFSET_COLOR = 2 * Vec3.SIZEOF;
}
