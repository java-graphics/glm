/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

import glm.vec._3.Vec3;
import glm.vec._4.Vec4;
import glm.glm.*;

/**
 *
 * @author GBarbieri
 */
class noise extends matrixTransform {

    public static float simplex_(Vec4 v) {

        Vec4 c = new Vec4(
                +0.138196601125011f, // (5 - sqrt(5))/20  G4
                +0.276393202250021f, // 2 * G4
                +0.414589803375032f, // 3 * G4
                -0.447213595499958f); // -1 + 4 * G4

        // (sqrt(5) - 1)/4 = F4, used once below
        float f4 = 0.309016994374947451f;

        // First corner
        Vec4 i = v.add_(v.dot(new Vec4(f4))).floor_();
        Vec4 x0 = v.sub_(i).add(i.dot(new Vec4(c.x)));

        // Other corners
        // Rank sorting originally contributed by Bill Licea-Kane, AMD (formerly ATI)
        Vec4 i0;
        Vec3 isX = new Vec3(x0.y, x0.z, x0.w).step(new Vec3(x0.x));
        Vec3 isYZ = new Vec3(x0.z, x0.w, x0.w).step(new Vec3(x0.y, x0.y, x0.z));
        //  i0.x = dot(isX, vec3(1.0));
        //i0.x = isX.x + isX.y + isX.z;
        //i0.yzw = static_cast<T>(1) - isX;
        i0 = new Vec4(isX.x + isX.y + isX.z, new Vec3(1).sub(isX));
        //  i0.y += dot(isYZ.xy, vec2(1.0));
        i0.y += isYZ.x + isYZ.y;
        //i0.zw += 1.0 - tvec2<T, P>(isYZ.x, isYZ.y);
        i0.z += 1 - isYZ.x;
        i0.w += 1 - isYZ.y;
        i0.z += isYZ.z;
        i0.w += 1 - isYZ.z;

        // i0 now contains the unique values 0,1,2,3 in each channel
        Vec4 i3 = i0.clamp_(0, 1);
        Vec4 i2 = i0.sub_(1).clamp_(0, 1);
        Vec4 i1 = i0.sub_(2).clamp_(0, 1);

        //  x0 = x0 - 0.0 + 0.0 * C.xxxx
        //  x1 = x0 - i1  + 0.0 * C.xxxx
        //  x2 = x0 - i2  + 0.0 * C.xxxx
        //  x3 = x0 - i3  + 0.0 * C.xxxx
        //  x4 = x0 - 1.0 + 4.0 * C.xxxx
        Vec4 x1 = x0.sub_(i1).add(c.x);
        Vec4 x2 = x0.sub_(i2).add(c.y);
        Vec4 x3 = x0.sub_(i3).add(c.z);
        Vec4 x4 = x0.add(c.w);

        // Permutations
        i.mod_(new Vec4(289));
        float j0 = permute(permute(permute(permute(i.w) + i.z) + i.y) + i.x);
        Vec4 j1 = permute_(permute_(permute_(permute_(
                new Vec4(i.w).add(i1.w, i2.w, i3.w, 1))
                .add(i.z).add(i1.z, i2.z, i3.z, 1))
                .add(i.y).add(i1.y, i2.y, i3.y, 1))
                .add(i.x).add(i1.x, i2.x, i3.x, 1));

        // Gradients: 7x7x6 points over a cube, mapped onto a 4-cross polytope
        // 7*7*6 = 294, which is close to the ring size 17*17 = 289.
        Vec4 ip = new Vec4(1f / 294, 1f / 49, 1f / 7, 0);

        Vec4 p0 = grad4_(j0, ip);
//        float[] p1 = grad4(j1[0], ip);
//        float[] p2 = grad4(j1[1], ip);
//        float[] p3 = grad4(j1[2], ip);
//        float[] p4 = grad4(j1[3], ip);
//
//        // Normalise gradients
//        float[] norm = taylorInvSqrt(new float[]{dot(p0, p0), dot(p1, p1), dot(p2, p2), dot(p3, p3)});
//        p0 = mult(p0, norm[0]);
//        p1 = mult(p1, norm[1]);
//        p2 = mult(p2, norm[2]);
//        p3 = mult(p3, norm[3]);
//        p4 = mult(p4, taylorInvSqrt(dot(p4, p4)));
//
//        // Mix contributions from the five corners
//        float[] m0 = max(subtr(0.6f, new float[]{dot(x0, x0), dot(x1, x1), dot(x2, x2)}), new float[]{0, 0, 0});
//        float[] m1 = max(subtr(0.6f, new float[]{dot(x3, x3), dot(x4, x4)}), new float[]{0, 0});
//
//        m0 = mult(m0, m0);
//        m1 = mult(m1, m1);
//
//        return 49 * (dot(mult(m0, m0), new float[]{dot(p0, x0), dot(p1, x1), dot(p2, x2)})
//                + dot(mult(m1, m1), new float[]{dot(p3, x3), dot(p4, x4)}));
        return 0;
    }
    
//    private static Vec3 fract_(Vec3 x) {
//        return subtr(x.su, floor(x));
//    }
//    
    private static Vec4 grad4_(float j, Vec4 ip) {
        Vec3 pXYZ = new Vec3(j).mul(new Vec3(ip)).mul(7).fract().mul(ip.z).sub(1);
        float pW = 1.5f - pXYZ.abs().dot(new Vec3(1));
//        Vec4 s = new Vec4;
//        pXYZ = add(pXYZ, mult(subtr(mult(new float[]{s[0], s[1], s[2]}, 2), 1), s[3]));
//        return new float[]{pXYZ[0], pXYZ[1], pXYZ[2], pW};
return null;
    }

    private static float permute(float x) {
        return mod289((x * 34 + 1) * x);
    }

    private static float mod289(float x) {
        return x - floor(x * 1 / 289) * 289;
    }

    private static Vec4 permute_(Vec4 x) {
        return mod289_(new Vec4(x).mul(34).add(1).mul(x));
    }

    private static Vec4 mod289_(Vec4 v) {
        Vec4 result = new Vec4();
        result.x = v.x - floor(v.x * 1 / 289) * 289;
        result.y = v.y - floor(v.y * 1 / 289) * 289;
        result.z = v.z - floor(v.z * 1 / 289) * 289;
        result.w = v.w - floor(v.w * 1 / 289) * 289;
        return result;
    }
}
