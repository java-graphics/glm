/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

import glm.Glm;
import glm.Glm;
import glm.vec._2.Vec2;
import glm.vec._2.b.Vec2b;
import glm.vec._2.bool.Vec2bool;
import glm.vec._2.d.Vec2d;
import glm.vec._2.i.Vec2i;
import glm.vec._2.l.Vec2l;
import glm.vec._2.s.Vec2s;
import glm.vec._2.ub.Vec2ub;
import glm.vec._2.ui.Vec2ui;
import glm.vec._2.ul.Vec2ul;
import glm.vec._2.us.Vec2us;
import glm.vec._3.Vec3;
import glm.vec._3.b.Vec3b;
import glm.vec._3.bool.Vec3bool;
import glm.vec._3.d.Vec3d;
import glm.vec._3.i.Vec3i;
import glm.vec._3.l.Vec3l;
import glm.vec._3.s.Vec3s;
import glm.vec._3.ub.Vec3ub;
import glm.vec._3.ui.Vec3ui;
import glm.vec._3.ul.Vec3ul;
import glm.vec._3.us.Vec3us;
import glm.vec._4.Vec4;
import glm.vec._4.b.Vec4b;
import glm.vec._4.bool.Vec4bool;
import glm.vec._4.d.Vec4d;
import glm.vec._4.i.Vec4i;
import glm.vec._4.l.Vec4l;
import glm.vec._4.s.Vec4s;
import glm.vec._4.ub.Vec4ub;
import glm.vec._4.ui.Vec4ui;
import glm.vec._4.ul.Vec4ul;
import glm.vec._4.us.Vec4us;
import joou.UByte;
import joou.UInt;
import joou.ULong;
import joou.UShort;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author GBarbieri
 */
public class _FuncRelational {

    @Test
    public void lessThan_Scalar() {

        assertTrue(Glm.lessThan((byte) 0, (byte) 1));
        assertFalse(Glm.lessThan((byte) 1, (byte) 0));
        assertFalse(Glm.lessThan((byte) 0, (byte) 0));
        assertFalse(Glm.lessThan((byte) 1, (byte) 1));

        assertTrue(Glm.lessThan(0.0, 1.0));
        assertFalse(Glm.lessThan(1.0, 0.0));
        assertFalse(Glm.lessThan(0.0, 0.0));
        assertFalse(Glm.lessThan(1.0, 1.0));

        assertTrue(Glm.lessThan(0.0f, 1.0f));
        assertFalse(Glm.lessThan(1.0f, 0.0f));
        assertFalse(Glm.lessThan(0.0f, 0.0f));
        assertFalse(Glm.lessThan(1.0f, 1.0f));

        assertTrue(Glm.lessThan(0, 1));
        assertFalse(Glm.lessThan(1, 0));
        assertFalse(Glm.lessThan(0, 0));
        assertFalse(Glm.lessThan(1, 1));

        assertTrue(Glm.lessThan((long) 0, 1));
        assertFalse(Glm.lessThan((long) 1, 0));
        assertFalse(Glm.lessThan((long) 0, 0));
        assertFalse(Glm.lessThan((long) 1, 1));

        assertTrue(Glm.lessThan((short) 0, 1));
        assertFalse(Glm.lessThan((short) 1, 0));
        assertFalse(Glm.lessThan((short) 0, 0));
        assertFalse(Glm.lessThan((short) 1, 1));

        assertTrue(Glm.lessThan(new UByte(0), new UByte(1)));
        assertFalse(Glm.lessThan(new UByte(1), new UByte(0)));
        assertFalse(Glm.lessThan(new UByte(0), new UByte(0)));
        assertFalse(Glm.lessThan(new UByte(1), new UByte(1)));

        assertTrue(Glm.lessThan(new UInt(0), new UInt(1)));
        assertFalse(Glm.lessThan(new UInt(1), new UInt(0)));
        assertFalse(Glm.lessThan(new UInt(0), new UInt(0)));
        assertFalse(Glm.lessThan(new UInt(1), new UInt(1)));

        assertTrue(Glm.lessThan(new ULong(0), new ULong(1)));
        assertFalse(Glm.lessThan(new ULong(1), new ULong(0)));
        assertFalse(Glm.lessThan(new ULong(0), new ULong(0)));
        assertFalse(Glm.lessThan(new ULong(1), new ULong(1)));

        assertTrue(Glm.lessThan(new UShort(0), new UShort(1)));
        assertFalse(Glm.lessThan(new UShort(1), new UShort(0)));
        assertFalse(Glm.lessThan(new UShort(0), new UShort(0)));
        assertFalse(Glm.lessThan(new UShort(1), new UShort(1)));

        assertTrue(Glm.lessThan(new UShort(0), new UShort(1)));
        assertFalse(Glm.lessThan(new UShort(1), new UShort(0)));
        assertFalse(Glm.lessThan(new UShort(0), new UShort(0)));
        assertFalse(Glm.lessThan(new UShort(1), new UShort(1)));

    }

    @Test
    public void lessThan_Vec2() {

        Vec2bool vec2bool;

        vec2bool = Glm.lessThan__(new Vec2b(0, 1), new Vec2b(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThan__(new Vec2b(0, 1), new Vec2b(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.lessThan__(new Vec2d(0, 1), new Vec2d(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThan__(new Vec2d(0, 1), new Vec2d(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.lessThan__(new Vec2(0, 1), new Vec2(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThan__(new Vec2(0, 1), new Vec2(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.lessThan__(new Vec2i(0, 1), new Vec2i(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThan__(new Vec2i(0, 1), new Vec2i(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.lessThan__(new Vec2l(0, 1), new Vec2l(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThan__(new Vec2l(0, 1), new Vec2l(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.lessThan__(new Vec2s(0, 1), new Vec2s(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThan__(new Vec2s(0, 1), new Vec2s(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.lessThan__(new Vec2ub(0, 1), new Vec2ub(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThan__(new Vec2ub(0, 1), new Vec2ub(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.lessThan__(new Vec2ui(0, 1), new Vec2ui(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThan__(new Vec2ui(0, 1), new Vec2ui(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.lessThan__(new Vec2ul(0, 1), new Vec2ul(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThan__(new Vec2ul(0, 1), new Vec2ul(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.lessThan__(new Vec2us(0, 1), new Vec2us(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThan__(new Vec2us(0, 1), new Vec2us(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        Vec2b vec2b;

        vec2b = Glm.lessThan_(new Vec2b(0, 1), new Vec2b(1, 0));
        assertEquals(vec2b.x, 1);
        assertEquals(vec2b.y, 0);
        vec2b = Glm.lessThan_(new Vec2b(0, 1), new Vec2b(0, 1));
        assertEquals(vec2b.x, 0);
        assertEquals(vec2b.y, 0);

        Vec2d vec2d;

        vec2d = Glm.lessThan_(new Vec2d(0, 1), new Vec2d(1, 0));
        assertEquals(vec2d.x, 1, 0);
        assertEquals(vec2d.y, 0, 0);
        vec2d = Glm.lessThan_(new Vec2d(0, 1), new Vec2d(0, 1));
        assertEquals(vec2d.x, 0, 0);
        assertEquals(vec2d.y, 0, 0);

        Vec2 vec2;

        vec2 = Glm.lessThan_(new Vec2(0, 1), new Vec2(1, 0));
        assertEquals(vec2.x, 1, 0);
        assertEquals(vec2.y, 0, 0);
        vec2 = Glm.lessThan_(new Vec2(0, 1), new Vec2(0, 1));
        assertEquals(vec2.x, 0, 0);
        assertEquals(vec2.y, 0, 0);

        Vec2i vec2i;

        vec2i = Glm.lessThan_(new Vec2i(0, 1), new Vec2i(1, 0));
        assertEquals(vec2i.x, 1);
        assertEquals(vec2i.y, 0);
        vec2i = Glm.lessThan_(new Vec2i(0, 1), new Vec2i(0, 1));
        assertEquals(vec2i.x, 0);
        assertEquals(vec2i.y, 0);

        Vec2l vec2l;

        vec2l = Glm.lessThan_(new Vec2l(0, 1), new Vec2l(1, 0));
        assertEquals(vec2l.x, 1);
        assertEquals(vec2l.y, 0);
        vec2l = Glm.lessThan_(new Vec2l(0, 1), new Vec2l(0, 1));
        assertEquals(vec2l.x, 0);
        assertEquals(vec2l.y, 0);

        Vec2s vec2s;

        vec2s = Glm.lessThan_(new Vec2s(0, 1), new Vec2s(1, 0));
        assertEquals(vec2s.x, 1);
        assertEquals(vec2s.y, 0);
        vec2s = Glm.lessThan_(new Vec2s(0, 1), new Vec2s(0, 1));
        assertEquals(vec2s.x, 0);
        assertEquals(vec2s.y, 0);

        Vec2ub vec2ub;

        vec2ub = Glm.lessThan_(new Vec2ub(0, 1), new Vec2ub(1, 0));
        assertEquals(vec2ub.x.value, 1);
        assertEquals(vec2ub.y.value, 0);
        vec2ub = Glm.lessThan_(new Vec2ub(0, 1), new Vec2ub(0, 1));
        assertEquals(vec2ub.x.value, 0);
        assertEquals(vec2ub.y.value, 0);

        Vec2ui vec2ui;

        vec2ui = Glm.lessThan_(new Vec2ui(0, 1), new Vec2ui(1, 0));
        assertEquals(vec2ui.x.value, 1);
        assertEquals(vec2ui.y.value, 0);
        vec2ui = Glm.lessThan_(new Vec2ui(0, 1), new Vec2ui(0, 1));
        assertEquals(vec2ui.x.value, 0);
        assertEquals(vec2ui.y.value, 0);

        Vec2ul vec2ul;

        vec2ul = Glm.lessThan_(new Vec2ul(0, 1), new Vec2ul(1, 0));
        assertEquals(vec2ul.x.value, 1);
        assertEquals(vec2ul.y.value, 0);
        vec2ul = Glm.lessThan_(new Vec2ul(0, 1), new Vec2ul(0, 1));
        assertEquals(vec2ul.x.value, 0);
        assertEquals(vec2ul.y.value, 0);

        Vec2us vec2us;

        vec2us = Glm.lessThan_(new Vec2us(0, 1), new Vec2us(1, 0));
        assertEquals(vec2us.x.value, 1);
        assertEquals(vec2us.y.value, 0);
        vec2us = Glm.lessThan_(new Vec2us(0, 1), new Vec2us(0, 1));
        assertEquals(vec2us.x.value, 0);
        assertEquals(vec2us.y.value, 0);
    }

    @Test
    public void lessThan_Vec3() {

        Vec3bool vec3bool;

        vec3bool = Glm.lessThan__(new Vec3b(0, 1, 0), new Vec3b(1, 0, 0));
        assertTrue(vec3bool.x);
        assertFalse(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThan__(new Vec3d(0, 1, 0), new Vec3d(1, 0, 0));
        assertTrue(vec3bool.x);
        assertFalse(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThan__(new Vec3(0, 1, 0), new Vec3(1, 0, 0));
        assertTrue(vec3bool.x);
        assertFalse(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThan__(new Vec3i(0, 1, 0), new Vec3i(1, 0, 0));
        assertTrue(vec3bool.x);
        assertFalse(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThan__(new Vec3l(0, 1, 0), new Vec3l(1, 0, 0));
        assertTrue(vec3bool.x);
        assertFalse(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThan__(new Vec3s(0, 1, 0), new Vec3s(1, 0, 0));
        assertTrue(vec3bool.x);
        assertFalse(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThan__(new Vec3ub(0, 1, 0), new Vec3ub(1, 0, 0));
        assertTrue(vec3bool.x);
        assertFalse(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThan__(new Vec3ui(0, 1, 0), new Vec3ui(1, 0, 0));
        assertTrue(vec3bool.x);
        assertFalse(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThan__(new Vec3ul(0, 1, 0), new Vec3ul(1, 0, 0));
        assertTrue(vec3bool.x);
        assertFalse(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThan__(new Vec3us(0, 1, 0), new Vec3us(1, 0, 0));
        assertTrue(vec3bool.x);
        assertFalse(vec3bool.y);
        assertFalse(vec3bool.z);

        Vec3b vec3b;

        vec3b = Glm.lessThan_(new Vec3b(0, 1, 0), new Vec3b(1, 0, 0));
        assertEquals(vec3b.x, 1);
        assertEquals(vec3b.y, 0);
        assertEquals(vec3b.z, 0);

        Vec3d vec3d;

        vec3d = Glm.lessThan_(new Vec3d(0, 1, 0), new Vec3d(1, 0, 0));
        assertEquals(vec3d.x, 1, 0);
        assertEquals(vec3d.y, 0, 0);
        assertEquals(vec3d.z, 0, 0);

        Vec3 vec3;

        vec3 = Glm.lessThan_(new Vec3(0, 1, 0), new Vec3(1, 0, 0));
        assertEquals(vec3.x, 1, 0);
        assertEquals(vec3.y, 0, 0);
        assertEquals(vec3.z, 0, 0);

        Vec3i vec3i;

        vec3i = Glm.lessThan_(new Vec3i(0, 1, 0), new Vec3i(1, 0, 0));
        assertEquals(vec3i.x, 1);
        assertEquals(vec3i.y, 0);
        assertEquals(vec3i.z, 0);

        Vec3l vec3l;

        vec3l = Glm.lessThan_(new Vec3l(0, 1, 0), new Vec3l(1, 0, 0));
        assertEquals(vec3l.x, 1);
        assertEquals(vec3l.y, 0);
        assertEquals(vec3l.z, 0);

        Vec3s vec3s;

        vec3s = Glm.lessThan_(new Vec3s(0, 1, 0), new Vec3s(1, 0, 0));
        assertEquals(vec3s.x, 1);
        assertEquals(vec3s.y, 0);
        assertEquals(vec3s.z, 0);

        Vec3ub vec3ub;

        vec3ub = Glm.lessThan_(new Vec3ub(0, 1, 0), new Vec3ub(1, 0, 0));
        assertEquals(vec3ub.x.value, 1);
        assertEquals(vec3ub.y.value, 0);
        assertEquals(vec3ub.z.value, 0);

        Vec3ui vec3ui;

        vec3ui = Glm.lessThan_(new Vec3ui(0, 1, 0), new Vec3ui(1, 0, 0));
        assertEquals(vec3ui.x.value, 1);
        assertEquals(vec3ui.y.value, 0);
        assertEquals(vec3ui.z.value, 0);

        Vec3ul vec3ul;

        vec3ul = Glm.lessThan_(new Vec3ul(0, 1, 0), new Vec3ul(1, 0, 0));
        assertEquals(vec3ul.x.value, 1);
        assertEquals(vec3ul.y.value, 0);
        assertEquals(vec3ul.z.value, 0);

        Vec3us vec3us;

        vec3us = Glm.lessThan_(new Vec3us(0, 1, 0), new Vec3us(1, 0, 0));
        assertEquals(vec3us.x.value, 1);
        assertEquals(vec3us.y.value, 0);
        assertEquals(vec3us.z.value, 0);
    }

    @Test
    public void lessThan_Vec4() {

        Vec4bool vec4bool;

        vec4bool = Glm.lessThan__(new Vec4b(0, 1, 0, 1), new Vec4b(1, 0, 0, 0));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.lessThan__(new Vec4d(0, 1, 0, 1), new Vec4d(1, 0, 0, 0));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.lessThan__(new Vec4(0, 1, 0, 1), new Vec4(1, 0, 0, 0));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.lessThan__(new Vec4i(0, 1, 0, 1), new Vec4i(1, 0, 0, 0));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.lessThan__(new Vec4l(0, 1, 0, 1), new Vec4l(1, 0, 0, 0));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.lessThan__(new Vec4s(0, 1, 0, 1), new Vec4s(1, 0, 0, 0));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.lessThan__(new Vec4ub(0, 1, 0, 1), new Vec4ub(1, 0, 0, 0));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.lessThan__(new Vec4ui(0, 1, 0, 1), new Vec4ui(1, 0, 0, 0));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.lessThan__(new Vec4ul(0, 1, 0, 1), new Vec4ul(1, 0, 0, 0));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.lessThan__(new Vec4us(0, 1, 0, 1), new Vec4us(1, 0, 0, 0));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        Vec4b vec4b;

        vec4b = Glm.lessThan_(new Vec4b(0, 1, 0, 1), new Vec4b(1, 0, 0, 0));
        assertEquals(vec4b.x, 1);
        assertEquals(vec4b.y, 0);
        assertEquals(vec4b.z, 0);
        assertEquals(vec4b.w, 0);

        Vec4d vec4d;

        vec4d = Glm.lessThan_(new Vec4d(0, 1, 0, 1), new Vec4d(1, 0, 0, 0));
        assertEquals(vec4d.x, 1, 0);
        assertEquals(vec4d.y, 0, 0);
        assertEquals(vec4d.z, 0, 0);
        assertEquals(vec4d.w, 0, 0);

        Vec4 vec4;

        vec4 = Glm.lessThan_(new Vec4(0, 1, 0, 1), new Vec4(1, 0, 0, 0));
        assertEquals(vec4.x, 1, 0);
        assertEquals(vec4.y, 0, 0);
        assertEquals(vec4.z, 0, 0);
        assertEquals(vec4.w, 0, 0);

        Vec4i vec4i;

        vec4i = Glm.lessThan_(new Vec4i(0, 1, 0, 1), new Vec4i(1, 0, 0, 0));
        assertEquals(vec4i.x, 1);
        assertEquals(vec4i.y, 0);
        assertEquals(vec4i.z, 0);
        assertEquals(vec4i.w, 0);

        Vec4l vec4l;

        vec4l = Glm.lessThan_(new Vec4l(0, 1, 0, 1), new Vec4l(1, 0, 0, 0));
        assertEquals(vec4l.x, 1);
        assertEquals(vec4l.y, 0);
        assertEquals(vec4l.z, 0);
        assertEquals(vec4l.w, 0);

        Vec4s vec4s;

        vec4s = Glm.lessThan_(new Vec4s(0, 1, 0, 1), new Vec4s(1, 0, 0, 0));
        assertEquals(vec4s.x, 1);
        assertEquals(vec4s.y, 0);
        assertEquals(vec4s.z, 0);
        assertEquals(vec4s.w, 0);

        Vec4ub vec4ub;

        vec4ub = Glm.lessThan_(new Vec4ub(0, 1, 0, 1), new Vec4ub(1, 0, 0, 0));
        assertEquals(vec4ub.x.value, 1);
        assertEquals(vec4ub.y.value, 0);
        assertEquals(vec4ub.z.value, 0);
        assertEquals(vec4ub.w.value, 0);

        Vec4ui vec4ui;

        vec4ui = Glm.lessThan_(new Vec4ui(0, 1, 0, 1), new Vec4ui(1, 0, 0, 0));
        assertEquals(vec4ui.x.value, 1);
        assertEquals(vec4ui.y.value, 0);
        assertEquals(vec4ui.z.value, 0);
        assertEquals(vec4ui.w.value, 0);

        Vec4ul vec4ul;

        vec4ul = Glm.lessThan_(new Vec4ul(0, 1, 0, 1), new Vec4ul(1, 0, 0, 0));
        assertEquals(vec4ul.x.value, 1);
        assertEquals(vec4ul.y.value, 0);
        assertEquals(vec4ul.z.value, 0);
        assertEquals(vec4ul.w.value, 0);

        Vec4us vec4us;

        vec4us = Glm.lessThan_(new Vec4us(0, 1, 0, 1), new Vec4us(1, 0, 0, 0));
        assertEquals(vec4us.x.value, 1);
        assertEquals(vec4us.y.value, 0);
        assertEquals(vec4us.z.value, 0);
        assertEquals(vec4us.w.value, 0);
    }

    @Test
    public void lessThanEqual_Scalar() {

        assertTrue(Glm.lessThanEqual((byte) 0, (byte) 1));
        assertFalse(Glm.lessThanEqual((byte) 1, (byte) 0));
        assertTrue(Glm.lessThanEqual((byte) 0, (byte) 0));
        assertTrue(Glm.lessThanEqual((byte) 1, (byte) 1));

        assertTrue(Glm.lessThanEqual(0.0, 1.0));
        assertFalse(Glm.lessThanEqual(1.0, 0.0));
        assertTrue(Glm.lessThanEqual(0.0, 0.0));
        assertTrue(Glm.lessThanEqual(1.0, 1.0));

        assertTrue(Glm.lessThanEqual(0.0f, 1.0f));
        assertFalse(Glm.lessThanEqual(1.0f, 0.0f));
        assertTrue(Glm.lessThanEqual(0.0f, 0.0f));
        assertTrue(Glm.lessThanEqual(1.0f, 1.0f));

        assertTrue(Glm.lessThanEqual(0, 1));
        assertFalse(Glm.lessThanEqual(1, 0));
        assertTrue(Glm.lessThanEqual(0, 0));
        assertTrue(Glm.lessThanEqual(1, 1));

        assertTrue(Glm.lessThanEqual((long) 0, 1));
        assertFalse(Glm.lessThanEqual((long) 1, 0));
        assertTrue(Glm.lessThanEqual((long) 0, 0));
        assertTrue(Glm.lessThanEqual((long) 1, 1));

        assertTrue(Glm.lessThanEqual((short) 0, 1));
        assertFalse(Glm.lessThanEqual((short) 1, 0));
        assertTrue(Glm.lessThanEqual((short) 0, 0));
        assertTrue(Glm.lessThanEqual((short) 1, 1));

        assertTrue(Glm.lessThanEqual(new UByte(0), new UByte(1)));
        assertFalse(Glm.lessThanEqual(new UByte(1), new UByte(0)));
        assertTrue(Glm.lessThanEqual(new UByte(0), new UByte(0)));
        assertTrue(Glm.lessThanEqual(new UByte(1), new UByte(1)));

        assertTrue(Glm.lessThanEqual(new UInt(0), new UInt(1)));
        assertFalse(Glm.lessThanEqual(new UInt(1), new UInt(0)));
        assertTrue(Glm.lessThanEqual(new UInt(0), new UInt(0)));
        assertTrue(Glm.lessThanEqual(new UInt(1), new UInt(1)));

        assertTrue(Glm.lessThanEqual(new ULong(0), new ULong(1)));
        assertFalse(Glm.lessThanEqual(new ULong(1), new ULong(0)));
        assertTrue(Glm.lessThanEqual(new ULong(0), new ULong(0)));
        assertTrue(Glm.lessThanEqual(new ULong(1), new ULong(1)));

        assertTrue(Glm.lessThanEqual(new UShort(0), new UShort(1)));
        assertFalse(Glm.lessThanEqual(new UShort(1), new UShort(0)));
        assertTrue(Glm.lessThanEqual(new UShort(0), new UShort(0)));
        assertTrue(Glm.lessThanEqual(new UShort(1), new UShort(1)));

        assertTrue(Glm.lessThanEqual(new UShort(0), new UShort(1)));
        assertFalse(Glm.lessThanEqual(new UShort(1), new UShort(0)));
        assertTrue(Glm.lessThanEqual(new UShort(0), new UShort(0)));
        assertTrue(Glm.lessThanEqual(new UShort(1), new UShort(1)));
    }

    @Test
    public void lessThanEqual_Vec2() {

        Vec2bool vec2bool;

        vec2bool = Glm.lessThanEqual__(new Vec2b(0, 1), new Vec2b(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThanEqual__(new Vec2b(0, 1), new Vec2b(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.lessThanEqual__(new Vec2d(0, 1), new Vec2d(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThanEqual__(new Vec2d(0, 1), new Vec2d(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.lessThanEqual__(new Vec2(0, 1), new Vec2(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThanEqual__(new Vec2(0, 1), new Vec2(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.lessThanEqual__(new Vec2i(0, 1), new Vec2i(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThanEqual__(new Vec2i(0, 1), new Vec2i(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.lessThanEqual__(new Vec2l(0, 1), new Vec2l(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThanEqual__(new Vec2l(0, 1), new Vec2l(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.lessThanEqual__(new Vec2s(0, 1), new Vec2s(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThanEqual__(new Vec2s(0, 1), new Vec2s(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.lessThanEqual__(new Vec2ub(0, 1), new Vec2ub(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThanEqual__(new Vec2ub(0, 1), new Vec2ub(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.lessThanEqual__(new Vec2ui(0, 1), new Vec2ui(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThanEqual__(new Vec2ui(0, 1), new Vec2ui(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.lessThanEqual__(new Vec2ul(0, 1), new Vec2ul(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThanEqual__(new Vec2ul(0, 1), new Vec2ul(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.lessThanEqual__(new Vec2us(0, 1), new Vec2us(1, 0));
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.lessThanEqual__(new Vec2us(0, 1), new Vec2us(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        Vec2b vec2b;

        vec2b = Glm.lessThanEqual_(new Vec2b(0, 1), new Vec2b(1, 0));
        assertEquals(vec2b.x, 1);
        assertEquals(vec2b.y, 0);
        vec2b = Glm.lessThanEqual_(new Vec2b(0, 1), new Vec2b(0, 1));
        assertEquals(vec2b.x, 1);
        assertEquals(vec2b.y, 1);

        Vec2d vec2d;

        vec2d = Glm.lessThanEqual_(new Vec2d(0, 1), new Vec2d(1, 0));
        assertEquals(vec2d.x, 1, 0);
        assertEquals(vec2d.y, 0, 0);
        vec2d = Glm.lessThanEqual_(new Vec2d(0, 1), new Vec2d(0, 1));
        assertEquals(vec2d.x, 1, 0);
        assertEquals(vec2d.y, 1, 0);

        Vec2 vec2;

        vec2 = Glm.lessThanEqual_(new Vec2(0, 1), new Vec2(1, 0));
        assertEquals(vec2.x, 1, 0);
        assertEquals(vec2.y, 0, 0);
        vec2 = Glm.lessThanEqual_(new Vec2(0, 1), new Vec2(0, 1));
        assertEquals(vec2.x, 1, 0);
        assertEquals(vec2.y, 1, 0);

        Vec2i vec2i;

        vec2i = Glm.lessThanEqual_(new Vec2i(0, 1), new Vec2i(1, 0));
        assertEquals(vec2i.x, 1);
        assertEquals(vec2i.y, 0);
        vec2i = Glm.lessThanEqual_(new Vec2i(0, 1), new Vec2i(0, 1));
        assertEquals(vec2i.x, 1);
        assertEquals(vec2i.y, 1);

        Vec2l vec2l;

        vec2l = Glm.lessThanEqual_(new Vec2l(0, 1), new Vec2l(1, 0));
        assertEquals(vec2l.x, 1);
        assertEquals(vec2l.y, 0);
        vec2l = Glm.lessThanEqual_(new Vec2l(0, 1), new Vec2l(0, 1));
        assertEquals(vec2l.x, 1);
        assertEquals(vec2l.y, 1);

        Vec2s vec2s;

        vec2s = Glm.lessThanEqual_(new Vec2s(0, 1), new Vec2s(1, 0));
        assertEquals(vec2s.x, 1);
        assertEquals(vec2s.y, 0);
        vec2s = Glm.lessThanEqual_(new Vec2s(0, 1), new Vec2s(0, 1));
        assertEquals(vec2s.x, 1);
        assertEquals(vec2s.y, 1);

        Vec2ub vec2ub;

        vec2ub = Glm.lessThanEqual_(new Vec2ub(0, 1), new Vec2ub(1, 0));
        assertEquals(vec2ub.x.value, 1);
        assertEquals(vec2ub.y.value, 0);
        vec2ub = Glm.lessThanEqual_(new Vec2ub(0, 1), new Vec2ub(0, 1));
        assertEquals(vec2ub.x.value, 1);
        assertEquals(vec2ub.y.value, 1);

        Vec2ui vec2ui;

        vec2ui = Glm.lessThanEqual_(new Vec2ui(0, 1), new Vec2ui(1, 0));
        assertEquals(vec2ui.x.value, 1);
        assertEquals(vec2ui.y.value, 0);
        vec2ui = Glm.lessThanEqual_(new Vec2ui(0, 1), new Vec2ui(0, 1));
        assertEquals(vec2ui.x.value, 1);
        assertEquals(vec2ui.y.value, 1);

        Vec2ul vec2ul;

        vec2ul = Glm.lessThanEqual_(new Vec2ul(0, 1), new Vec2ul(1, 0));
        assertEquals(vec2ul.x.value, 1);
        assertEquals(vec2ul.y.value, 0);
        vec2ul = Glm.lessThanEqual_(new Vec2ul(0, 1), new Vec2ul(0, 1));
        assertEquals(vec2ul.x.value, 1);
        assertEquals(vec2ul.y.value, 1);

        Vec2us vec2us;

        vec2us = Glm.lessThanEqual_(new Vec2us(0, 1), new Vec2us(1, 0));
        assertEquals(vec2us.x.value, 1);
        assertEquals(vec2us.y.value, 0);
        vec2us = Glm.lessThanEqual_(new Vec2us(0, 1), new Vec2us(0, 1));
        assertEquals(vec2us.x.value, 1);
        assertEquals(vec2us.y.value, 1);
    }

    @Test
    public void lessThanEqual_Vec3() {

        Vec3bool vec3bool;

        vec3bool = Glm.lessThanEqual__(new Vec3b(0, 1, 1), new Vec3b(1, 1, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThanEqual__(new Vec3d(0, 1, 1), new Vec3d(1, 1, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThanEqual__(new Vec3(0, 1, 1), new Vec3(1, 1, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThanEqual__(new Vec3i(0, 1, 1), new Vec3i(1, 1, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThanEqual__(new Vec3l(0, 1, 1), new Vec3l(1, 1, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThanEqual__(new Vec3s(0, 1, 1), new Vec3s(1, 1, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThanEqual__(new Vec3ub(0, 1, 1), new Vec3ub(1, 1, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThanEqual__(new Vec3ui(0, 1, 1), new Vec3ui(1, 1, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThanEqual__(new Vec3ul(0, 1, 1), new Vec3ul(1, 1, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.lessThanEqual__(new Vec3us(0, 1, 1), new Vec3us(1, 1, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        Vec3b vec3b;

        vec3b = Glm.lessThanEqual_(new Vec3b(0, 1, 1), new Vec3b(1, 1, 0));
        assertEquals(vec3b.x, 1);
        assertEquals(vec3b.y, 1);
        assertEquals(vec3b.z, 0);

        Vec3d vec3d;

        vec3d = Glm.lessThanEqual_(new Vec3d(0, 1, 1), new Vec3d(1, 1, 0));
        assertEquals(vec3d.x, 1, 0);
        assertEquals(vec3d.y, 1, 0);
        assertEquals(vec3d.z, 0, 0);

        Vec3 vec3;

        vec3 = Glm.lessThanEqual_(new Vec3(0, 1, 1), new Vec3(1, 1, 0));
        assertEquals(vec3.x, 1, 0);
        assertEquals(vec3.y, 1, 0);
        assertEquals(vec3.z, 0, 0);

        Vec3i vec3i;

        vec3i = Glm.lessThanEqual_(new Vec3i(0, 1, 1), new Vec3i(1, 1, 0));
        assertEquals(vec3i.x, 1);
        assertEquals(vec3i.y, 1);
        assertEquals(vec3i.z, 0);

        Vec3l vec3l;

        vec3l = Glm.lessThanEqual_(new Vec3l(0, 1, 1), new Vec3l(1, 1, 0));
        assertEquals(vec3l.x, 1);
        assertEquals(vec3l.y, 1);
        assertEquals(vec3l.z, 0);

        Vec3s vec3s;

        vec3s = Glm.lessThanEqual_(new Vec3s(0, 1, 1), new Vec3s(1, 1, 0));
        assertEquals(vec3s.x, 1);
        assertEquals(vec3s.y, 1);
        assertEquals(vec3s.z, 0);

        Vec3ub vec3ub;

        vec3ub = Glm.lessThanEqual_(new Vec3ub(0, 1, 1), new Vec3ub(1, 1, 0));
        assertEquals(vec3ub.x.value, 1);
        assertEquals(vec3ub.y.value, 1);
        assertEquals(vec3ub.z.value, 0);

        Vec3ui vec3ui;

        vec3ui = Glm.lessThanEqual_(new Vec3ui(0, 1, 1), new Vec3ui(1, 1, 0));
        assertEquals(vec3ui.x.value, 1);
        assertEquals(vec3ui.y.value, 1);
        assertEquals(vec3ui.z.value, 0);

        Vec3ul vec3ul;

        vec3ul = Glm.lessThanEqual_(new Vec3ul(0, 1, 1), new Vec3ul(1, 1, 0));
        assertEquals(vec3ul.x.value, 1);
        assertEquals(vec3ul.y.value, 1);
        assertEquals(vec3ul.z.value, 0);

        Vec3us vec3us;

        vec3us = Glm.lessThanEqual_(new Vec3us(0, 1, 1), new Vec3us(1, 1, 0));
        assertEquals(vec3us.x.value, 1);
        assertEquals(vec3us.y.value, 1);
        assertEquals(vec3us.z.value, 0);
    }

    @Test
    public void lessThanEqual_Vec4() {

        Vec4bool vec4bool;

        vec4bool = Glm.lessThanEqual__(new Vec4b(0, 1, 0, 1), new Vec4b(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.lessThanEqual__(new Vec4d(0, 1, 0, 1), new Vec4d(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.lessThanEqual__(new Vec4(0, 1, 0, 1), new Vec4(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.lessThanEqual__(new Vec4i(0, 1, 0, 1), new Vec4i(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.lessThanEqual__(new Vec4l(0, 1, 0, 1), new Vec4l(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.lessThanEqual__(new Vec4s(0, 1, 0, 1), new Vec4s(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.lessThanEqual__(new Vec4ub(0, 1, 0, 1), new Vec4ub(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.lessThanEqual__(new Vec4ui(0, 1, 0, 1), new Vec4ui(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.lessThanEqual__(new Vec4ul(0, 1, 0, 1), new Vec4ul(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.lessThanEqual__(new Vec4us(0, 1, 0, 1), new Vec4us(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        Vec4b vec4b;

        vec4b = Glm.lessThanEqual_(new Vec4b(0, 1, 0, 1), new Vec4b(1, 0, 0, 1));
        assertEquals(vec4b.x, 1);
        assertEquals(vec4b.y, 0);
        assertEquals(vec4b.z, 1);
        assertEquals(vec4b.w, 1);

        Vec4d vec4d;

        vec4d = Glm.lessThanEqual_(new Vec4d(0, 1, 0, 1), new Vec4d(1, 0, 0, 1));
        assertEquals(vec4d.x, 1, 0);
        assertEquals(vec4d.y, 0, 0);
        assertEquals(vec4d.z, 1, 0);
        assertEquals(vec4d.w, 1, 0);

        Vec4 vec4;

        vec4 = Glm.lessThanEqual_(new Vec4(0, 1, 0, 1), new Vec4(1, 0, 0, 1));
        assertEquals(vec4.x, 1, 0);
        assertEquals(vec4.y, 0, 0);
        assertEquals(vec4.z, 1, 0);
        assertEquals(vec4.w, 1, 0);

        Vec4i vec4i;

        vec4i = Glm.lessThanEqual_(new Vec4i(0, 1, 0, 1), new Vec4i(1, 0, 0, 1));
        assertEquals(vec4i.x, 1);
        assertEquals(vec4i.y, 0);
        assertEquals(vec4i.z, 1);
        assertEquals(vec4i.w, 1);

        Vec4l vec4l;

        vec4l = Glm.lessThanEqual_(new Vec4l(0, 1, 0, 1), new Vec4l(1, 0, 0, 1));
        assertEquals(vec4l.x, 1);
        assertEquals(vec4l.y, 0);
        assertEquals(vec4l.z, 1);
        assertEquals(vec4l.w, 1);

        Vec4s vec4s;

        vec4s = Glm.lessThanEqual_(new Vec4s(0, 1, 0, 1), new Vec4s(1, 0, 0, 1));
        assertEquals(vec4s.x, 1);
        assertEquals(vec4s.y, 0);
        assertEquals(vec4s.z, 1);
        assertEquals(vec4s.w, 1);

        Vec4ub vec4ub;

        vec4ub = Glm.lessThanEqual_(new Vec4ub(0, 1, 0, 1), new Vec4ub(1, 0, 0, 1));
        assertEquals(vec4ub.x.value, 1);
        assertEquals(vec4ub.y.value, 0);
        assertEquals(vec4ub.z.value, 1);
        assertEquals(vec4ub.w.value, 1);

        Vec4ui vec4ui;

        vec4ui = Glm.lessThanEqual_(new Vec4ui(0, 1, 0, 1), new Vec4ui(1, 0, 0, 1));
        assertEquals(vec4ui.x.value, 1);
        assertEquals(vec4ui.y.value, 0);
        assertEquals(vec4ui.z.value, 1);
        assertEquals(vec4ui.w.value, 1);

        Vec4ul vec4ul;

        vec4ul = Glm.lessThanEqual_(new Vec4ul(0, 1, 0, 1), new Vec4ul(1, 0, 0, 1));
        assertEquals(vec4ul.x.value, 1);
        assertEquals(vec4ul.y.value, 0);
        assertEquals(vec4ul.z.value, 1);
        assertEquals(vec4ul.w.value, 1);

        Vec4us vec4us;

        vec4us = Glm.lessThanEqual_(new Vec4us(0, 1, 0, 1), new Vec4us(1, 0, 0, 1));
        assertEquals(vec4us.x.value, 1);
        assertEquals(vec4us.y.value, 0);
        assertEquals(vec4us.z.value, 1);
        assertEquals(vec4us.w.value, 1);
    }

    @Test
    public void greaterThan_Scalar() {

        assertFalse(Glm.greaterThan((byte) 0, (byte) 1));
        assertTrue(Glm.greaterThan((byte) 1, (byte) 0));
        assertFalse(Glm.greaterThan((byte) 0, (byte) 0));
        assertFalse(Glm.greaterThan((byte) 1, (byte) 1));

        assertFalse(Glm.greaterThan(0.0, 1.0));
        assertTrue(Glm.greaterThan(1.0, 0.0));
        assertFalse(Glm.greaterThan(0.0, 0.0));
        assertFalse(Glm.greaterThan(1.0, 1.0));

        assertFalse(Glm.greaterThan(0.0f, 1.0f));
        assertTrue(Glm.greaterThan(1.0f, 0.0f));
        assertFalse(Glm.greaterThan(0.0f, 0.0f));
        assertFalse(Glm.greaterThan(1.0f, 1.0f));

        assertFalse(Glm.greaterThan(0, 1));
        assertTrue(Glm.greaterThan(1, 0));
        assertFalse(Glm.greaterThan(0, 0));
        assertFalse(Glm.greaterThan(1, 1));

        assertFalse(Glm.greaterThan((long) 0, 1));
        assertTrue(Glm.greaterThan((long) 1, 0));
        assertFalse(Glm.greaterThan((long) 0, 0));
        assertFalse(Glm.greaterThan((long) 1, 1));

        assertFalse(Glm.greaterThan((short) 0, 1));
        assertTrue(Glm.greaterThan((short) 1, 0));
        assertFalse(Glm.greaterThan((short) 0, 0));
        assertFalse(Glm.greaterThan((short) 1, 1));

        assertFalse(Glm.greaterThan(new UByte(0), new UByte(1)));
        assertTrue(Glm.greaterThan(new UByte(1), new UByte(0)));
        assertFalse(Glm.greaterThan(new UByte(0), new UByte(0)));
        assertFalse(Glm.greaterThan(new UByte(1), new UByte(1)));

        assertFalse(Glm.greaterThan(new UInt(0), new UInt(1)));
        assertTrue(Glm.greaterThan(new UInt(1), new UInt(0)));
        assertFalse(Glm.greaterThan(new UInt(0), new UInt(0)));
        assertFalse(Glm.greaterThan(new UInt(1), new UInt(1)));

        assertFalse(Glm.greaterThan(new ULong(0), new ULong(1)));
        assertTrue(Glm.greaterThan(new ULong(1), new ULong(0)));
        assertFalse(Glm.greaterThan(new ULong(0), new ULong(0)));
        assertFalse(Glm.greaterThan(new ULong(1), new ULong(1)));

        assertFalse(Glm.greaterThan(new UShort(0), new UShort(1)));
        assertTrue(Glm.greaterThan(new UShort(1), new UShort(0)));
        assertFalse(Glm.greaterThan(new UShort(0), new UShort(0)));
        assertFalse(Glm.greaterThan(new UShort(1), new UShort(1)));

        assertFalse(Glm.greaterThan(new UShort(0), new UShort(1)));
        assertTrue(Glm.greaterThan(new UShort(1), new UShort(0)));
        assertFalse(Glm.greaterThan(new UShort(0), new UShort(0)));
        assertFalse(Glm.greaterThan(new UShort(1), new UShort(1)));

    }

    @Test
    public void greaterThan_Vec2() {

        Vec2bool vec2bool;

        vec2bool = Glm.greaterThan__(new Vec2b(0, 1), new Vec2b(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThan__(new Vec2b(0, 1), new Vec2b(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.greaterThan__(new Vec2d(0, 1), new Vec2d(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThan__(new Vec2d(0, 1), new Vec2d(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.greaterThan__(new Vec2(0, 1), new Vec2(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThan__(new Vec2(0, 1), new Vec2(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.greaterThan__(new Vec2i(0, 1), new Vec2i(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThan__(new Vec2i(0, 1), new Vec2i(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.greaterThan__(new Vec2l(0, 1), new Vec2l(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThan__(new Vec2l(0, 1), new Vec2l(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.greaterThan__(new Vec2s(0, 1), new Vec2s(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThan__(new Vec2s(0, 1), new Vec2s(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.greaterThan__(new Vec2ub(0, 1), new Vec2ub(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThan__(new Vec2ub(0, 1), new Vec2ub(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.greaterThan__(new Vec2ui(0, 1), new Vec2ui(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThan__(new Vec2ui(0, 1), new Vec2ui(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.greaterThan__(new Vec2ul(0, 1), new Vec2ul(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThan__(new Vec2ul(0, 1), new Vec2ul(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.greaterThan__(new Vec2us(0, 1), new Vec2us(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThan__(new Vec2us(0, 1), new Vec2us(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        Vec2b vec2b;

        vec2b = Glm.greaterThan_(new Vec2b(0, 1), new Vec2b(1, 0));
        assertEquals(vec2b.x, 0);
        assertEquals(vec2b.y, 1);
        vec2b = Glm.greaterThan_(new Vec2b(0, 1), new Vec2b(0, 1));
        assertEquals(vec2b.x, 0);
        assertEquals(vec2b.y, 0);

        Vec2d vec2d;

        vec2d = Glm.greaterThan_(new Vec2d(0, 1), new Vec2d(1, 0));
        assertEquals(vec2d.x, 0, 0);
        assertEquals(vec2d.y, 1, 0);
        vec2d = Glm.greaterThan_(new Vec2d(0, 1), new Vec2d(0, 1));
        assertEquals(vec2d.x, 0, 0);
        assertEquals(vec2d.y, 0, 0);

        Vec2 vec2;

        vec2 = Glm.greaterThan_(new Vec2(0, 1), new Vec2(1, 0));
        assertEquals(vec2.x, 0, 0);
        assertEquals(vec2.y, 1, 0);
        vec2 = Glm.greaterThan_(new Vec2(0, 1), new Vec2(0, 1));
        assertEquals(vec2.x, 0, 0);
        assertEquals(vec2.y, 0, 0);

        Vec2i vec2i;

        vec2i = Glm.greaterThan_(new Vec2i(0, 1), new Vec2i(1, 0));
        assertEquals(vec2i.x, 0);
        assertEquals(vec2i.y, 1);
        vec2i = Glm.greaterThan_(new Vec2i(0, 1), new Vec2i(0, 1));
        assertEquals(vec2i.x, 0);
        assertEquals(vec2i.y, 0);

        Vec2l vec2l;

        vec2l = Glm.greaterThan_(new Vec2l(0, 1), new Vec2l(1, 0));
        assertEquals(vec2l.x, 0);
        assertEquals(vec2l.y, 1);
        vec2l = Glm.greaterThan_(new Vec2l(0, 1), new Vec2l(0, 1));
        assertEquals(vec2l.x, 0);
        assertEquals(vec2l.y, 0);

        Vec2s vec2s;

        vec2s = Glm.greaterThan_(new Vec2s(0, 1), new Vec2s(1, 0));
        assertEquals(vec2s.x, 0);
        assertEquals(vec2s.y, 1);
        vec2s = Glm.greaterThan_(new Vec2s(0, 1), new Vec2s(0, 1));
        assertEquals(vec2s.x, 0);
        assertEquals(vec2s.y, 0);

        Vec2ub vec2ub;

        vec2ub = Glm.greaterThan_(new Vec2ub(0, 1), new Vec2ub(1, 0));
        assertEquals(vec2ub.x.value, 0);
        assertEquals(vec2ub.y.value, 1);
        vec2ub = Glm.greaterThan_(new Vec2ub(0, 1), new Vec2ub(0, 1));
        assertEquals(vec2ub.x.value, 0);
        assertEquals(vec2ub.y.value, 0);

        Vec2ui vec2ui;

        vec2ui = Glm.greaterThan_(new Vec2ui(0, 1), new Vec2ui(1, 0));
        assertEquals(vec2ui.x.value, 0);
        assertEquals(vec2ui.y.value, 1);
        vec2ui = Glm.greaterThan_(new Vec2ui(0, 1), new Vec2ui(0, 1));
        assertEquals(vec2ui.x.value, 0);
        assertEquals(vec2ui.y.value, 0);

        Vec2ul vec2ul;

        vec2ul = Glm.greaterThan_(new Vec2ul(0, 1), new Vec2ul(1, 0));
        assertEquals(vec2ul.x.value, 0);
        assertEquals(vec2ul.y.value, 1);
        vec2ul = Glm.greaterThan_(new Vec2ul(0, 1), new Vec2ul(0, 1));
        assertEquals(vec2ul.x.value, 0);
        assertEquals(vec2ul.y.value, 0);

        Vec2us vec2us;

        vec2us = Glm.greaterThan_(new Vec2us(0, 1), new Vec2us(1, 0));
        assertEquals(vec2us.x.value, 0);
        assertEquals(vec2us.y.value, 1);
        vec2us = Glm.greaterThan_(new Vec2us(0, 1), new Vec2us(0, 1));
        assertEquals(vec2us.x.value, 0);
        assertEquals(vec2us.y.value, 0);
    }

    @Test
    public void greaterThan_Vec3() {

        Vec3bool vec3bool;

        vec3bool = Glm.greaterThan__(new Vec3b(0, 1, 0), new Vec3b(1, 0, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.greaterThan__(new Vec3d(0, 1, 0), new Vec3d(1, 0, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.greaterThan__(new Vec3(0, 1, 0), new Vec3(1, 0, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.greaterThan__(new Vec3i(0, 1, 0), new Vec3i(1, 0, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.greaterThan__(new Vec3l(0, 1, 0), new Vec3l(1, 0, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.greaterThan__(new Vec3s(0, 1, 0), new Vec3s(1, 0, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.greaterThan__(new Vec3ub(0, 1, 0), new Vec3ub(1, 0, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.greaterThan__(new Vec3ui(0, 1, 0), new Vec3ui(1, 0, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.greaterThan__(new Vec3ul(0, 1, 0), new Vec3ul(1, 0, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.greaterThan__(new Vec3us(0, 1, 0), new Vec3us(1, 0, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        Vec3b vec3b;

        vec3b = Glm.greaterThan_(new Vec3b(0, 1, 0), new Vec3b(1, 0, 0));
        assertEquals(vec3b.x, 0);
        assertEquals(vec3b.y, 1);
        assertEquals(vec3b.z, 0);

        Vec3d vec3d;

        vec3d = Glm.greaterThan_(new Vec3d(0, 1, 0), new Vec3d(1, 0, 0));
        assertEquals(vec3d.x, 0, 0);
        assertEquals(vec3d.y, 1, 0);
        assertEquals(vec3d.z, 0, 0);

        Vec3 vec3;

        vec3 = Glm.greaterThan_(new Vec3(0, 1, 0), new Vec3(1, 0, 0));
        assertEquals(vec3.x, 0, 0);
        assertEquals(vec3.y, 1, 0);
        assertEquals(vec3.z, 0, 0);

        Vec3i vec3i;

        vec3i = Glm.greaterThan_(new Vec3i(0, 1, 0), new Vec3i(1, 0, 0));
        assertEquals(vec3i.x, 0);
        assertEquals(vec3i.y, 1);
        assertEquals(vec3i.z, 0);

        Vec3l vec3l;

        vec3l = Glm.greaterThan_(new Vec3l(0, 1, 0), new Vec3l(1, 0, 0));
        assertEquals(vec3l.x, 0);
        assertEquals(vec3l.y, 1);
        assertEquals(vec3l.z, 0);

        Vec3s vec3s;

        vec3s = Glm.greaterThan_(new Vec3s(0, 1, 0), new Vec3s(1, 0, 0));
        assertEquals(vec3s.x, 0);
        assertEquals(vec3s.y, 1);
        assertEquals(vec3s.z, 0);

        Vec3ub vec3ub;

        vec3ub = Glm.greaterThan_(new Vec3ub(0, 1, 0), new Vec3ub(1, 0, 0));
        assertEquals(vec3ub.x.value, 0);
        assertEquals(vec3ub.y.value, 1);
        assertEquals(vec3ub.z.value, 0);

        Vec3ui vec3ui;

        vec3ui = Glm.greaterThan_(new Vec3ui(0, 1, 0), new Vec3ui(1, 0, 0));
        assertEquals(vec3ui.x.value, 0);
        assertEquals(vec3ui.y.value, 1);
        assertEquals(vec3ui.z.value, 0);

        Vec3ul vec3ul;

        vec3ul = Glm.greaterThan_(new Vec3ul(0, 1, 0), new Vec3ul(1, 0, 0));
        assertEquals(vec3ul.x.value, 0);
        assertEquals(vec3ul.y.value, 1);
        assertEquals(vec3ul.z.value, 0);

        Vec3us vec3us;

        vec3us = Glm.greaterThan_(new Vec3us(0, 1, 0), new Vec3us(1, 0, 0));
        assertEquals(vec3us.x.value, 0);
        assertEquals(vec3us.y.value, 1);
        assertEquals(vec3us.z.value, 0);
    }

    @Test
    public void greaterThan_Vec4() {

        Vec4bool vec4bool;

        vec4bool = Glm.greaterThan__(new Vec4b(0, 1, 0, 1), new Vec4b(1, 0, 0, 0));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThan__(new Vec4d(0, 1, 0, 1), new Vec4d(1, 0, 0, 0));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThan__(new Vec4(0, 1, 0, 1), new Vec4(1, 0, 0, 0));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThan__(new Vec4i(0, 1, 0, 1), new Vec4i(1, 0, 0, 0));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThan__(new Vec4l(0, 1, 0, 1), new Vec4l(1, 0, 0, 0));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThan__(new Vec4s(0, 1, 0, 1), new Vec4s(1, 0, 0, 0));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThan__(new Vec4ub(0, 1, 0, 1), new Vec4ub(1, 0, 0, 0));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThan__(new Vec4ui(0, 1, 0, 1), new Vec4ui(1, 0, 0, 0));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThan__(new Vec4ul(0, 1, 0, 1), new Vec4ul(1, 0, 0, 0));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThan__(new Vec4us(0, 1, 0, 1), new Vec4us(1, 0, 0, 0));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertTrue(vec4bool.w);

        Vec4b vec4b;

        vec4b = Glm.greaterThan_(new Vec4b(0, 1, 0, 1), new Vec4b(1, 0, 0, 0));
        assertEquals(vec4b.x, 0);
        assertEquals(vec4b.y, 1);
        assertEquals(vec4b.z, 0);
        assertEquals(vec4b.w, 1);

        Vec4d vec4d;

        vec4d = Glm.greaterThan_(new Vec4d(0, 1, 0, 1), new Vec4d(1, 0, 0, 0));
        assertEquals(vec4d.x, 0, 0);
        assertEquals(vec4d.y, 1, 0);
        assertEquals(vec4d.z, 0, 0);
        assertEquals(vec4d.w, 1, 0);

        Vec4 vec4;

        vec4 = Glm.greaterThan_(new Vec4(0, 1, 0, 1), new Vec4(1, 0, 0, 0));
        assertEquals(vec4.x, 0, 0);
        assertEquals(vec4.y, 1, 0);
        assertEquals(vec4.z, 0, 0);
        assertEquals(vec4.w, 1, 0);

        Vec4i vec4i;

        vec4i = Glm.greaterThan_(new Vec4i(0, 1, 0, 1), new Vec4i(1, 0, 0, 0));
        assertEquals(vec4i.x, 0);
        assertEquals(vec4i.y, 1);
        assertEquals(vec4i.z, 0);
        assertEquals(vec4i.w, 1);

        Vec4l vec4l;

        vec4l = Glm.greaterThan_(new Vec4l(0, 1, 0, 1), new Vec4l(1, 0, 0, 0));
        assertEquals(vec4l.x, 0);
        assertEquals(vec4l.y, 1);
        assertEquals(vec4l.z, 0);
        assertEquals(vec4l.w, 1);

        Vec4s vec4s;

        vec4s = Glm.greaterThan_(new Vec4s(0, 1, 0, 1), new Vec4s(1, 0, 0, 0));
        assertEquals(vec4s.x, 0);
        assertEquals(vec4s.y, 1);
        assertEquals(vec4s.z, 0);
        assertEquals(vec4s.w, 1);

        Vec4ub vec4ub;

        vec4ub = Glm.greaterThan_(new Vec4ub(0, 1, 0, 1), new Vec4ub(1, 0, 0, 0));
        assertEquals(vec4ub.x.value, 0);
        assertEquals(vec4ub.y.value, 1);
        assertEquals(vec4ub.z.value, 0);
        assertEquals(vec4ub.w.value, 1);

        Vec4ui vec4ui;

        vec4ui = Glm.greaterThan_(new Vec4ui(0, 1, 0, 1), new Vec4ui(1, 0, 0, 0));
        assertEquals(vec4ui.x.value, 0);
        assertEquals(vec4ui.y.value, 1);
        assertEquals(vec4ui.z.value, 0);
        assertEquals(vec4ui.w.value, 1);

        Vec4ul vec4ul;

        vec4ul = Glm.greaterThan_(new Vec4ul(0, 1, 0, 1), new Vec4ul(1, 0, 0, 0));
        assertEquals(vec4ul.x.value, 0);
        assertEquals(vec4ul.y.value, 1);
        assertEquals(vec4ul.z.value, 0);
        assertEquals(vec4ul.w.value, 1);

        Vec4us vec4us;

        vec4us = Glm.greaterThan_(new Vec4us(0, 1, 0, 1), new Vec4us(1, 0, 0, 0));
        assertEquals(vec4us.x.value, 0);
        assertEquals(vec4us.y.value, 1);
        assertEquals(vec4us.z.value, 0);
        assertEquals(vec4us.w.value, 1);
    }

    @Test
    public void greaterThanEqual_Scalar() {

        assertFalse(Glm.greaterThanEqual((byte) 0, (byte) 1));
        assertTrue(Glm.greaterThanEqual((byte) 1, (byte) 0));
        assertTrue(Glm.greaterThanEqual((byte) 0, (byte) 0));
        assertTrue(Glm.greaterThanEqual((byte) 1, (byte) 1));

        assertFalse(Glm.greaterThanEqual(0.0, 1.0));
        assertTrue(Glm.greaterThanEqual(1.0, 0.0));
        assertTrue(Glm.greaterThanEqual(0.0, 0.0));
        assertTrue(Glm.greaterThanEqual(1.0, 1.0));

        assertFalse(Glm.greaterThanEqual(0.0f, 1.0f));
        assertTrue(Glm.greaterThanEqual(1.0f, 0.0f));
        assertTrue(Glm.greaterThanEqual(0.0f, 0.0f));
        assertTrue(Glm.greaterThanEqual(1.0f, 1.0f));

        assertFalse(Glm.greaterThanEqual(0, 1));
        assertTrue(Glm.greaterThanEqual(1, 0));
        assertTrue(Glm.greaterThanEqual(0, 0));
        assertTrue(Glm.greaterThanEqual(1, 1));

        assertFalse(Glm.greaterThanEqual((long) 0, 1));
        assertTrue(Glm.greaterThanEqual((long) 1, 0));
        assertTrue(Glm.greaterThanEqual((long) 0, 0));
        assertTrue(Glm.greaterThanEqual((long) 1, 1));

        assertFalse(Glm.greaterThanEqual((short) 0, 1));
        assertTrue(Glm.greaterThanEqual((short) 1, 0));
        assertTrue(Glm.greaterThanEqual((short) 0, 0));
        assertTrue(Glm.greaterThanEqual((short) 1, 1));

        assertFalse(Glm.greaterThanEqual(new UByte(0), new UByte(1)));
        assertTrue(Glm.greaterThanEqual(new UByte(1), new UByte(0)));
        assertTrue(Glm.greaterThanEqual(new UByte(0), new UByte(0)));
        assertTrue(Glm.greaterThanEqual(new UByte(1), new UByte(1)));

        assertFalse(Glm.greaterThanEqual(new UInt(0), new UInt(1)));
        assertTrue(Glm.greaterThanEqual(new UInt(1), new UInt(0)));
        assertTrue(Glm.greaterThanEqual(new UInt(0), new UInt(0)));
        assertTrue(Glm.greaterThanEqual(new UInt(1), new UInt(1)));

        assertFalse(Glm.greaterThanEqual(new ULong(0), new ULong(1)));
        assertTrue(Glm.greaterThanEqual(new ULong(1), new ULong(0)));
        assertTrue(Glm.greaterThanEqual(new ULong(0), new ULong(0)));
        assertTrue(Glm.greaterThanEqual(new ULong(1), new ULong(1)));

        assertFalse(Glm.greaterThanEqual(new UShort(0), new UShort(1)));
        assertTrue(Glm.greaterThanEqual(new UShort(1), new UShort(0)));
        assertTrue(Glm.greaterThanEqual(new UShort(0), new UShort(0)));
        assertTrue(Glm.greaterThanEqual(new UShort(1), new UShort(1)));

        assertFalse(Glm.greaterThanEqual(new UShort(0), new UShort(1)));
        assertTrue(Glm.greaterThanEqual(new UShort(1), new UShort(0)));
        assertTrue(Glm.greaterThanEqual(new UShort(0), new UShort(0)));
        assertTrue(Glm.greaterThanEqual(new UShort(1), new UShort(1)));
    }

    @Test
    public void greaterThanEqual_Vec2() {

        Vec2bool vec2bool;

        vec2bool = Glm.greaterThanEqual__(new Vec2b(0, 1), new Vec2b(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThanEqual__(new Vec2b(0, 1), new Vec2b(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.greaterThanEqual__(new Vec2d(0, 1), new Vec2d(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThanEqual__(new Vec2d(0, 1), new Vec2d(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.greaterThanEqual__(new Vec2(0, 1), new Vec2(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThanEqual__(new Vec2(0, 1), new Vec2(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.greaterThanEqual__(new Vec2i(0, 1), new Vec2i(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThanEqual__(new Vec2i(0, 1), new Vec2i(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.greaterThanEqual__(new Vec2l(0, 1), new Vec2l(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThanEqual__(new Vec2l(0, 1), new Vec2l(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.greaterThanEqual__(new Vec2s(0, 1), new Vec2s(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThanEqual__(new Vec2s(0, 1), new Vec2s(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.greaterThanEqual__(new Vec2ub(0, 1), new Vec2ub(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThanEqual__(new Vec2ub(0, 1), new Vec2ub(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.greaterThanEqual__(new Vec2ui(0, 1), new Vec2ui(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThanEqual__(new Vec2ui(0, 1), new Vec2ui(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.greaterThanEqual__(new Vec2ul(0, 1), new Vec2ul(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThanEqual__(new Vec2ul(0, 1), new Vec2ul(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.greaterThanEqual__(new Vec2us(0, 1), new Vec2us(1, 0));
        assertFalse(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.greaterThanEqual__(new Vec2us(0, 1), new Vec2us(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        Vec2b vec2b;

        vec2b = Glm.greaterThanEqual_(new Vec2b(0, 1), new Vec2b(1, 0));
        assertEquals(vec2b.x, 0);
        assertEquals(vec2b.y, 1);
        vec2b = Glm.greaterThanEqual_(new Vec2b(0, 1), new Vec2b(0, 1));
        assertEquals(vec2b.x, 1);
        assertEquals(vec2b.y, 1);

        Vec2d vec2d;

        vec2d = Glm.greaterThanEqual_(new Vec2d(0, 1), new Vec2d(1, 0));
        assertEquals(vec2d.x, 0, 0);
        assertEquals(vec2d.y, 1, 0);
        vec2d = Glm.greaterThanEqual_(new Vec2d(0, 1), new Vec2d(0, 1));
        assertEquals(vec2d.x, 1, 0);
        assertEquals(vec2d.y, 1, 0);

        Vec2 vec2;

        vec2 = Glm.greaterThanEqual_(new Vec2(0, 1), new Vec2(1, 0));
        assertEquals(vec2.x, 0, 0);
        assertEquals(vec2.y, 1, 0);
        vec2 = Glm.greaterThanEqual_(new Vec2(0, 1), new Vec2(0, 1));
        assertEquals(vec2.x, 1, 0);
        assertEquals(vec2.y, 1, 0);

        Vec2i vec2i;

        vec2i = Glm.greaterThanEqual_(new Vec2i(0, 1), new Vec2i(1, 0));
        assertEquals(vec2i.x, 0);
        assertEquals(vec2i.y, 1);
        vec2i = Glm.greaterThanEqual_(new Vec2i(0, 1), new Vec2i(0, 1));
        assertEquals(vec2i.x, 1);
        assertEquals(vec2i.y, 1);

        Vec2l vec2l;

        vec2l = Glm.greaterThanEqual_(new Vec2l(0, 1), new Vec2l(1, 0));
        assertEquals(vec2l.x, 0);
        assertEquals(vec2l.y, 1);
        vec2l = Glm.greaterThanEqual_(new Vec2l(0, 1), new Vec2l(0, 1));
        assertEquals(vec2l.x, 1);
        assertEquals(vec2l.y, 1);

        Vec2s vec2s;

        vec2s = Glm.greaterThanEqual_(new Vec2s(0, 1), new Vec2s(1, 0));
        assertEquals(vec2s.x, 0);
        assertEquals(vec2s.y, 1);
        vec2s = Glm.greaterThanEqual_(new Vec2s(0, 1), new Vec2s(0, 1));
        assertEquals(vec2s.x, 1);
        assertEquals(vec2s.y, 1);

        Vec2ub vec2ub;

        vec2ub = Glm.greaterThanEqual_(new Vec2ub(0, 1), new Vec2ub(1, 0));
        assertEquals(vec2ub.x.value, 0);
        assertEquals(vec2ub.y.value, 1);
        vec2ub = Glm.greaterThanEqual_(new Vec2ub(0, 1), new Vec2ub(0, 1));
        assertEquals(vec2ub.x.value, 1);
        assertEquals(vec2ub.y.value, 1);

        Vec2ui vec2ui;

        vec2ui = Glm.greaterThanEqual_(new Vec2ui(0, 1), new Vec2ui(1, 0));
        assertEquals(vec2ui.x.value, 0);
        assertEquals(vec2ui.y.value, 1);
        vec2ui = Glm.greaterThanEqual_(new Vec2ui(0, 1), new Vec2ui(0, 1));
        assertEquals(vec2ui.x.value, 1);
        assertEquals(vec2ui.y.value, 1);

        Vec2ul vec2ul;

        vec2ul = Glm.greaterThanEqual_(new Vec2ul(0, 1), new Vec2ul(1, 0));
        assertEquals(vec2ul.x.value, 0);
        assertEquals(vec2ul.y.value, 1);
        vec2ul = Glm.greaterThanEqual_(new Vec2ul(0, 1), new Vec2ul(0, 1));
        assertEquals(vec2ul.x.value, 1);
        assertEquals(vec2ul.y.value, 1);

        Vec2us vec2us;

        vec2us = Glm.greaterThanEqual_(new Vec2us(0, 1), new Vec2us(1, 0));
        assertEquals(vec2us.x.value, 0);
        assertEquals(vec2us.y.value, 1);
        vec2us = Glm.greaterThanEqual_(new Vec2us(0, 1), new Vec2us(0, 1));
        assertEquals(vec2us.x.value, 1);
        assertEquals(vec2us.y.value, 1);
    }

    @Test
    public void greaterThanEqual_Vec3() {

        Vec3bool vec3bool;

        vec3bool = Glm.greaterThanEqual__(new Vec3b(0, 1, 1), new Vec3b(1, 1, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.greaterThanEqual__(new Vec3d(0, 1, 1), new Vec3d(1, 1, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.greaterThanEqual__(new Vec3(0, 1, 1), new Vec3(1, 1, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.greaterThanEqual__(new Vec3i(0, 1, 1), new Vec3i(1, 1, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.greaterThanEqual__(new Vec3l(0, 1, 1), new Vec3l(1, 1, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.greaterThanEqual__(new Vec3s(0, 1, 1), new Vec3s(1, 1, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.greaterThanEqual__(new Vec3ub(0, 1, 1), new Vec3ub(1, 1, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.greaterThanEqual__(new Vec3ui(0, 1, 1), new Vec3ui(1, 1, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.greaterThanEqual__(new Vec3ul(0, 1, 1), new Vec3ul(1, 1, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.greaterThanEqual__(new Vec3us(0, 1, 1), new Vec3us(1, 1, 0));
        assertFalse(vec3bool.x);
        assertTrue(vec3bool.y);
        assertTrue(vec3bool.z);

        Vec3b vec3b;

        vec3b = Glm.greaterThanEqual_(new Vec3b(0, 1, 1), new Vec3b(1, 1, 0));
        assertEquals(vec3b.x, 0);
        assertEquals(vec3b.y, 1);
        assertEquals(vec3b.z, 1);

        Vec3d vec3d;

        vec3d = Glm.greaterThanEqual_(new Vec3d(0, 1, 1), new Vec3d(1, 1, 0));
        assertEquals(vec3d.x, 0, 0);
        assertEquals(vec3d.y, 1, 0);
        assertEquals(vec3d.z, 1, 0);

        Vec3 vec3;

        vec3 = Glm.greaterThanEqual_(new Vec3(0, 1, 1), new Vec3(1, 1, 0));
        assertEquals(vec3.x, 0, 0);
        assertEquals(vec3.y, 1, 0);
        assertEquals(vec3.z, 1, 0);

        Vec3i vec3i;

        vec3i = Glm.greaterThanEqual_(new Vec3i(0, 1, 1), new Vec3i(1, 1, 0));
        assertEquals(vec3i.x, 0);
        assertEquals(vec3i.y, 1);
        assertEquals(vec3i.z, 1);

        Vec3l vec3l;

        vec3l = Glm.greaterThanEqual_(new Vec3l(0, 1, 1), new Vec3l(1, 1, 0));
        assertEquals(vec3l.x, 0);
        assertEquals(vec3l.y, 1);
        assertEquals(vec3l.z, 1);

        Vec3s vec3s;

        vec3s = Glm.greaterThanEqual_(new Vec3s(0, 1, 1), new Vec3s(1, 1, 0));
        assertEquals(vec3s.x, 0);
        assertEquals(vec3s.y, 1);
        assertEquals(vec3s.z, 1);

        Vec3ub vec3ub;

        vec3ub = Glm.greaterThanEqual_(new Vec3ub(0, 1, 1), new Vec3ub(1, 1, 0));
        assertEquals(vec3ub.x.value, 0);
        assertEquals(vec3ub.y.value, 1);
        assertEquals(vec3ub.z.value, 1);

        Vec3ui vec3ui;

        vec3ui = Glm.greaterThanEqual_(new Vec3ui(0, 1, 1), new Vec3ui(1, 1, 0));
        assertEquals(vec3ui.x.value, 0);
        assertEquals(vec3ui.y.value, 1);
        assertEquals(vec3ui.z.value, 1);

        Vec3ul vec3ul;

        vec3ul = Glm.greaterThanEqual_(new Vec3ul(0, 1, 1), new Vec3ul(1, 1, 0));
        assertEquals(vec3ul.x.value, 0);
        assertEquals(vec3ul.y.value, 1);
        assertEquals(vec3ul.z.value, 1);

        Vec3us vec3us;

        vec3us = Glm.greaterThanEqual_(new Vec3us(0, 1, 1), new Vec3us(1, 1, 0));
        assertEquals(vec3us.x.value, 0);
        assertEquals(vec3us.y.value, 1);
        assertEquals(vec3us.z.value, 1);
    }

    @Test
    public void greaterThanEqual_Vec4() {

        Vec4bool vec4bool;

        vec4bool = Glm.greaterThanEqual__(new Vec4b(0, 1, 0, 1), new Vec4b(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThanEqual__(new Vec4d(0, 1, 0, 1), new Vec4d(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThanEqual__(new Vec4(0, 1, 0, 1), new Vec4(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThanEqual__(new Vec4i(0, 1, 0, 1), new Vec4i(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThanEqual__(new Vec4l(0, 1, 0, 1), new Vec4l(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThanEqual__(new Vec4s(0, 1, 0, 1), new Vec4s(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThanEqual__(new Vec4ub(0, 1, 0, 1), new Vec4ub(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThanEqual__(new Vec4ui(0, 1, 0, 1), new Vec4ui(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThanEqual__(new Vec4ul(0, 1, 0, 1), new Vec4ul(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.greaterThanEqual__(new Vec4us(0, 1, 0, 1), new Vec4us(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertTrue(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        Vec4b vec4b;

        vec4b = Glm.greaterThanEqual_(new Vec4b(0, 1, 0, 1), new Vec4b(1, 0, 0, 1));
        assertEquals(vec4b.x, 0);
        assertEquals(vec4b.y, 1);
        assertEquals(vec4b.z, 1);
        assertEquals(vec4b.w, 1);

        Vec4d vec4d;

        vec4d = Glm.greaterThanEqual_(new Vec4d(0, 1, 0, 1), new Vec4d(1, 0, 0, 1));
        assertEquals(vec4d.x, 0, 0);
        assertEquals(vec4d.y, 1, 0);
        assertEquals(vec4d.z, 1, 0);
        assertEquals(vec4d.w, 1, 0);

        Vec4 vec4;

        vec4 = Glm.greaterThanEqual_(new Vec4(0, 1, 0, 1), new Vec4(1, 0, 0, 1));
        assertEquals(vec4.x, 0, 0);
        assertEquals(vec4.y, 1, 0);
        assertEquals(vec4.z, 1, 0);
        assertEquals(vec4.w, 1, 0);

        Vec4i vec4i;

        vec4i = Glm.greaterThanEqual_(new Vec4i(0, 1, 0, 1), new Vec4i(1, 0, 0, 1));
        assertEquals(vec4i.x, 0);
        assertEquals(vec4i.y, 1);
        assertEquals(vec4i.z, 1);
        assertEquals(vec4i.w, 1);

        Vec4l vec4l;

        vec4l = Glm.greaterThanEqual_(new Vec4l(0, 1, 0, 1), new Vec4l(1, 0, 0, 1));
        assertEquals(vec4l.x, 0);
        assertEquals(vec4l.y, 1);
        assertEquals(vec4l.z, 1);
        assertEquals(vec4l.w, 1);

        Vec4s vec4s;

        vec4s = Glm.greaterThanEqual_(new Vec4s(0, 1, 0, 1), new Vec4s(1, 0, 0, 1));
        assertEquals(vec4s.x, 0);
        assertEquals(vec4s.y, 1);
        assertEquals(vec4s.z, 1);
        assertEquals(vec4s.w, 1);

        Vec4ub vec4ub;

        vec4ub = Glm.greaterThanEqual_(new Vec4ub(0, 1, 0, 1), new Vec4ub(1, 0, 0, 1));
        assertEquals(vec4ub.x.value, 0);
        assertEquals(vec4ub.y.value, 1);
        assertEquals(vec4ub.z.value, 1);
        assertEquals(vec4ub.w.value, 1);

        Vec4ui vec4ui;

        vec4ui = Glm.greaterThanEqual_(new Vec4ui(0, 1, 0, 1), new Vec4ui(1, 0, 0, 1));
        assertEquals(vec4ui.x.value, 0);
        assertEquals(vec4ui.y.value, 1);
        assertEquals(vec4ui.z.value, 1);
        assertEquals(vec4ui.w.value, 1);

        Vec4ul vec4ul;

        vec4ul = Glm.greaterThanEqual_(new Vec4ul(0, 1, 0, 1), new Vec4ul(1, 0, 0, 1));
        assertEquals(vec4ul.x.value, 0);
        assertEquals(vec4ul.y.value, 1);
        assertEquals(vec4ul.z.value, 1);
        assertEquals(vec4ul.w.value, 1);

        Vec4us vec4us;

        vec4us = Glm.greaterThanEqual_(new Vec4us(0, 1, 0, 1), new Vec4us(1, 0, 0, 1));
        assertEquals(vec4us.x.value, 0);
        assertEquals(vec4us.y.value, 1);
        assertEquals(vec4us.z.value, 1);
        assertEquals(vec4us.w.value, 1);
    }

    @Test
    public void equal_Scalar() {

        assertFalse(Glm.equal((byte) 0, (byte) 1));
        assertFalse(Glm.equal((byte) 1, (byte) 0));
        assertTrue(Glm.equal((byte) 0, (byte) 0));
        assertTrue(Glm.equal((byte) 1, (byte) 1));

        assertFalse(Glm.equal(0.0, 1.0));
        assertFalse(Glm.equal(1.0, 0.0));
        assertTrue(Glm.equal(0.0, 0.0));
        assertTrue(Glm.equal(1.0, 1.0));

        assertFalse(Glm.equal(0.0f, 1.0f));
        assertFalse(Glm.equal(1.0f, 0.0f));
        assertTrue(Glm.equal(0.0f, 0.0f));
        assertTrue(Glm.equal(1.0f, 1.0f));

        assertFalse(Glm.equal(0, 1));
        assertFalse(Glm.equal(1, 0));
        assertTrue(Glm.equal(0, 0));
        assertTrue(Glm.equal(1, 1));

        assertFalse(Glm.equal((long) 0, 1));
        assertFalse(Glm.equal((long) 1, 0));
        assertTrue(Glm.equal((long) 0, 0));
        assertTrue(Glm.equal((long) 1, 1));

        assertFalse(Glm.equal((short) 0, 1));
        assertFalse(Glm.equal((short) 1, 0));
        assertTrue(Glm.equal((short) 0, 0));
        assertTrue(Glm.equal((short) 1, 1));

        assertFalse(Glm.equal(new UByte(0), new UByte(1)));
        assertFalse(Glm.equal(new UByte(1), new UByte(0)));
        assertTrue(Glm.equal(new UByte(0), new UByte(0)));
        assertTrue(Glm.equal(new UByte(1), new UByte(1)));

        assertFalse(Glm.equal(new UInt(0), new UInt(1)));
        assertFalse(Glm.equal(new UInt(1), new UInt(0)));
        assertTrue(Glm.equal(new UInt(0), new UInt(0)));
        assertTrue(Glm.equal(new UInt(1), new UInt(1)));

        assertFalse(Glm.equal(new ULong(0), new ULong(1)));
        assertFalse(Glm.equal(new ULong(1), new ULong(0)));
        assertTrue(Glm.equal(new ULong(0), new ULong(0)));
        assertTrue(Glm.equal(new ULong(1), new ULong(1)));

        assertFalse(Glm.equal(new UShort(0), new UShort(1)));
        assertFalse(Glm.equal(new UShort(1), new UShort(0)));
        assertTrue(Glm.equal(new UShort(0), new UShort(0)));
        assertTrue(Glm.equal(new UShort(1), new UShort(1)));

        assertFalse(Glm.equal(new UShort(0), new UShort(1)));
        assertFalse(Glm.equal(new UShort(1), new UShort(0)));
        assertTrue(Glm.equal(new UShort(0), new UShort(0)));
        assertTrue(Glm.equal(new UShort(1), new UShort(1)));
    }

    @Test
    public void equal_Vec2() {

        Vec2bool vec2bool;

        vec2bool = Glm.equal__(new Vec2b(0, 1), new Vec2b(1, 0));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.equal__(new Vec2b(0, 1), new Vec2b(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.equal__(new Vec2d(0, 1), new Vec2d(1, 0));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.equal__(new Vec2d(0, 1), new Vec2d(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.equal__(new Vec2(0, 1), new Vec2(1, 0));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.equal__(new Vec2(0, 1), new Vec2(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.equal__(new Vec2i(0, 1), new Vec2i(1, 0));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.equal__(new Vec2i(0, 1), new Vec2i(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.equal__(new Vec2l(0, 1), new Vec2l(1, 0));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.equal__(new Vec2l(0, 1), new Vec2l(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.equal__(new Vec2s(0, 1), new Vec2s(1, 0));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.equal__(new Vec2s(0, 1), new Vec2s(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.equal__(new Vec2ub(0, 1), new Vec2ub(1, 0));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.equal__(new Vec2ub(0, 1), new Vec2ub(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.equal__(new Vec2ui(0, 1), new Vec2ui(1, 0));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.equal__(new Vec2ui(0, 1), new Vec2ui(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.equal__(new Vec2ul(0, 1), new Vec2ul(1, 0));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.equal__(new Vec2ul(0, 1), new Vec2ul(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        vec2bool = Glm.equal__(new Vec2us(0, 1), new Vec2us(1, 0));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);
        vec2bool = Glm.equal__(new Vec2us(0, 1), new Vec2us(0, 1));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);

        Vec2b vec2b;

        vec2b = Glm.equal_(new Vec2b(0, 1), new Vec2b(1, 0));
        assertEquals(vec2b.x, 0);
        assertEquals(vec2b.y, 0);
        vec2b = Glm.equal_(new Vec2b(0, 1), new Vec2b(0, 1));
        assertEquals(vec2b.x, 1);
        assertEquals(vec2b.y, 1);

        Vec2d vec2d;

        vec2d = Glm.equal_(new Vec2d(0, 1), new Vec2d(1, 0));
        assertEquals(vec2d.x, 0, 0);
        assertEquals(vec2d.y, 0, 0);
        vec2d = Glm.equal_(new Vec2d(0, 1), new Vec2d(0, 1));
        assertEquals(vec2d.x, 1, 0);
        assertEquals(vec2d.y, 1, 0);

        Vec2 vec2;

        vec2 = Glm.equal_(new Vec2(0, 1), new Vec2(1, 0));
        assertEquals(vec2.x, 0, 0);
        assertEquals(vec2.y, 0, 0);
        vec2 = Glm.equal_(new Vec2(0, 1), new Vec2(0, 1));
        assertEquals(vec2.x, 1, 0);
        assertEquals(vec2.y, 1, 0);

        Vec2i vec2i;

        vec2i = Glm.equal_(new Vec2i(0, 1), new Vec2i(1, 0));
        assertEquals(vec2i.x, 0);
        assertEquals(vec2i.y, 0);
        vec2i = Glm.equal_(new Vec2i(0, 1), new Vec2i(0, 1));
        assertEquals(vec2i.x, 1);
        assertEquals(vec2i.y, 1);

        Vec2l vec2l;

        vec2l = Glm.equal_(new Vec2l(0, 1), new Vec2l(1, 0));
        assertEquals(vec2l.x, 0);
        assertEquals(vec2l.y, 0);
        vec2l = Glm.equal_(new Vec2l(0, 1), new Vec2l(0, 1));
        assertEquals(vec2l.x, 1);
        assertEquals(vec2l.y, 1);

        Vec2s vec2s;

        vec2s = Glm.equal_(new Vec2s(0, 1), new Vec2s(1, 0));
        assertEquals(vec2s.x, 0);
        assertEquals(vec2s.y, 0);
        vec2s = Glm.equal_(new Vec2s(0, 1), new Vec2s(0, 1));
        assertEquals(vec2s.x, 1);
        assertEquals(vec2s.y, 1);

        Vec2ub vec2ub;

        vec2ub = Glm.equal_(new Vec2ub(0, 1), new Vec2ub(1, 0));
        assertEquals(vec2ub.x.value, 0);
        assertEquals(vec2ub.y.value, 0);
        vec2ub = Glm.equal_(new Vec2ub(0, 1), new Vec2ub(0, 1));
        assertEquals(vec2ub.x.value, 1);
        assertEquals(vec2ub.y.value, 1);

        Vec2ui vec2ui;

        vec2ui = Glm.equal_(new Vec2ui(0, 1), new Vec2ui(1, 0));
        assertEquals(vec2ui.x.value, 0);
        assertEquals(vec2ui.y.value, 0);
        vec2ui = Glm.equal_(new Vec2ui(0, 1), new Vec2ui(0, 1));
        assertEquals(vec2ui.x.value, 1);
        assertEquals(vec2ui.y.value, 1);

        Vec2ul vec2ul;

        vec2ul = Glm.equal_(new Vec2ul(0, 1), new Vec2ul(1, 0));
        assertEquals(vec2ul.x.value, 0);
        assertEquals(vec2ul.y.value, 0);
        vec2ul = Glm.equal_(new Vec2ul(0, 1), new Vec2ul(0, 1));
        assertEquals(vec2ul.x.value, 1);
        assertEquals(vec2ul.y.value, 1);

        Vec2us vec2us;

        vec2us = Glm.equal_(new Vec2us(0, 1), new Vec2us(1, 0));
        assertEquals(vec2us.x.value, 0);
        assertEquals(vec2us.y.value, 0);
        vec2us = Glm.equal_(new Vec2us(0, 1), new Vec2us(0, 1));
        assertEquals(vec2us.x.value, 1);
        assertEquals(vec2us.y.value, 1);
    }

    @Test
    public void equal_Vec3() {

        Vec3bool vec3bool;

        vec3bool = Glm.equal__(new Vec3b(0, 1, 0), new Vec3b(1, 0, 0));
        assertFalse(vec3bool.x);
        assertFalse(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.equal__(new Vec3d(0, 1, 0), new Vec3d(1, 0, 0));
        assertFalse(vec3bool.x);
        assertFalse(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.equal__(new Vec3(0, 1, 0), new Vec3(1, 0, 0));
        assertFalse(vec3bool.x);
        assertFalse(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.equal__(new Vec3i(0, 1, 0), new Vec3i(1, 0, 0));
        assertFalse(vec3bool.x);
        assertFalse(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.equal__(new Vec3l(0, 1, 0), new Vec3l(1, 0, 0));
        assertFalse(vec3bool.x);
        assertFalse(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.equal__(new Vec3s(0, 1, 0), new Vec3s(1, 0, 0));
        assertFalse(vec3bool.x);
        assertFalse(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.equal__(new Vec3ub(0, 1, 0), new Vec3ub(1, 0, 0));
        assertFalse(vec3bool.x);
        assertFalse(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.equal__(new Vec3ui(0, 1, 0), new Vec3ui(1, 0, 0));
        assertFalse(vec3bool.x);
        assertFalse(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.equal__(new Vec3ul(0, 1, 0), new Vec3ul(1, 0, 0));
        assertFalse(vec3bool.x);
        assertFalse(vec3bool.y);
        assertTrue(vec3bool.z);

        vec3bool = Glm.equal__(new Vec3us(0, 1, 0), new Vec3us(1, 0, 0));
        assertFalse(vec3bool.x);
        assertFalse(vec3bool.y);
        assertTrue(vec3bool.z);

        Vec3b vec3b;

        vec3b = Glm.equal_(new Vec3b(0, 1, 0), new Vec3b(1, 0, 0));
        assertEquals(vec3b.x, 0);
        assertEquals(vec3b.y, 0);
        assertEquals(vec3b.z, 1);

        Vec3d vec3d;

        vec3d = Glm.equal_(new Vec3d(0, 1, 0), new Vec3d(1, 0, 0));
        assertEquals(vec3d.x, 0, 0);
        assertEquals(vec3d.y, 0, 0);
        assertEquals(vec3d.z, 1, 0);

        Vec3 vec3;

        vec3 = Glm.equal_(new Vec3(0, 1, 0), new Vec3(1, 0, 0));
        assertEquals(vec3.x, 0, 0);
        assertEquals(vec3.y, 0, 0);
        assertEquals(vec3.z, 1, 0);

        Vec3i vec3i;

        vec3i = Glm.equal_(new Vec3i(0, 1, 0), new Vec3i(1, 0, 0));
        assertEquals(vec3i.x, 0);
        assertEquals(vec3i.y, 0);
        assertEquals(vec3i.z, 1);

        Vec3l vec3l;

        vec3l = Glm.equal_(new Vec3l(0, 1, 0), new Vec3l(1, 0, 0));
        assertEquals(vec3l.x, 0);
        assertEquals(vec3l.y, 0);
        assertEquals(vec3l.z, 1);

        Vec3s vec3s;

        vec3s = Glm.equal_(new Vec3s(0, 1, 0), new Vec3s(1, 0, 0));
        assertEquals(vec3s.x, 0);
        assertEquals(vec3s.y, 0);
        assertEquals(vec3s.z, 1);

        Vec3ub vec3ub;

        vec3ub = Glm.equal_(new Vec3ub(0, 1, 0), new Vec3ub(1, 0, 0));
        assertEquals(vec3ub.x.value, 0);
        assertEquals(vec3ub.y.value, 0);
        assertEquals(vec3ub.z.value, 1);

        Vec3ui vec3ui;

        vec3ui = Glm.equal_(new Vec3ui(0, 1, 0), new Vec3ui(1, 0, 0));
        assertEquals(vec3ui.x.value, 0);
        assertEquals(vec3ui.y.value, 0);
        assertEquals(vec3ui.z.value, 1);

        Vec3ul vec3ul;

        vec3ul = Glm.equal_(new Vec3ul(0, 1, 0), new Vec3ul(1, 0, 0));
        assertEquals(vec3ul.x.value, 0);
        assertEquals(vec3ul.y.value, 0);
        assertEquals(vec3ul.z.value, 1);

        Vec3us vec3us;

        vec3us = Glm.equal_(new Vec3us(0, 1, 0), new Vec3us(1, 0, 0));
        assertEquals(vec3us.x.value, 0);
        assertEquals(vec3us.y.value, 0);
        assertEquals(vec3us.z.value, 1);
    }

    @Test
    public void equal_Vec4() {

        Vec4bool vec4bool;

        vec4bool = Glm.equal__(new Vec4b(0, 1, 0, 1), new Vec4b(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.equal__(new Vec4d(0, 1, 0, 1), new Vec4d(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.equal__(new Vec4(0, 1, 0, 1), new Vec4(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.equal__(new Vec4i(0, 1, 0, 1), new Vec4i(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.equal__(new Vec4l(0, 1, 0, 1), new Vec4l(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.equal__(new Vec4s(0, 1, 0, 1), new Vec4s(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.equal__(new Vec4ub(0, 1, 0, 1), new Vec4ub(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.equal__(new Vec4ui(0, 1, 0, 1), new Vec4ui(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.equal__(new Vec4ul(0, 1, 0, 1), new Vec4ul(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        vec4bool = Glm.equal__(new Vec4us(0, 1, 0, 1), new Vec4us(1, 0, 0, 1));
        assertFalse(vec4bool.x);
        assertFalse(vec4bool.y);
        assertTrue(vec4bool.z);
        assertTrue(vec4bool.w);

        Vec4b vec4b;

        vec4b = Glm.equal_(new Vec4b(0, 1, 0, 1), new Vec4b(1, 0, 0, 1));
        assertEquals(vec4b.x, 0);
        assertEquals(vec4b.y, 0);
        assertEquals(vec4b.z, 1);
        assertEquals(vec4b.w, 1);

        Vec4d vec4d;

        vec4d = Glm.equal_(new Vec4d(0, 1, 0, 1), new Vec4d(1, 0, 0, 1));
        assertEquals(vec4d.x, 0, 0);
        assertEquals(vec4d.y, 0, 0);
        assertEquals(vec4d.z, 1, 0);
        assertEquals(vec4d.w, 1, 0);

        Vec4 vec4;

        vec4 = Glm.equal_(new Vec4(0, 1, 0, 1), new Vec4(1, 0, 0, 1));
        assertEquals(vec4.x, 0, 0);
        assertEquals(vec4.y, 0, 0);
        assertEquals(vec4.z, 1, 0);
        assertEquals(vec4.w, 1, 0);

        Vec4i vec4i;

        vec4i = Glm.equal_(new Vec4i(0, 1, 0, 1), new Vec4i(1, 0, 0, 1));
        assertEquals(vec4i.x, 0);
        assertEquals(vec4i.y, 0);
        assertEquals(vec4i.z, 1);
        assertEquals(vec4i.w, 1);

        Vec4l vec4l;

        vec4l = Glm.equal_(new Vec4l(0, 1, 0, 1), new Vec4l(1, 0, 0, 1));
        assertEquals(vec4l.x, 0);
        assertEquals(vec4l.y, 0);
        assertEquals(vec4l.z, 1);
        assertEquals(vec4l.w, 1);

        Vec4s vec4s;

        vec4s = Glm.equal_(new Vec4s(0, 1, 0, 1), new Vec4s(1, 0, 0, 1));
        assertEquals(vec4s.x, 0);
        assertEquals(vec4s.y, 0);
        assertEquals(vec4s.z, 1);
        assertEquals(vec4s.w, 1);

        Vec4ub vec4ub;

        vec4ub = Glm.equal_(new Vec4ub(0, 1, 0, 1), new Vec4ub(1, 0, 0, 1));
        assertEquals(vec4ub.x.value, 0);
        assertEquals(vec4ub.y.value, 0);
        assertEquals(vec4ub.z.value, 1);
        assertEquals(vec4ub.w.value, 1);

        Vec4ui vec4ui;

        vec4ui = Glm.equal_(new Vec4ui(0, 1, 0, 1), new Vec4ui(1, 0, 0, 1));
        assertEquals(vec4ui.x.value, 0);
        assertEquals(vec4ui.y.value, 0);
        assertEquals(vec4ui.z.value, 1);
        assertEquals(vec4ui.w.value, 1);

        Vec4ul vec4ul;

        vec4ul = Glm.equal_(new Vec4ul(0, 1, 0, 1), new Vec4ul(1, 0, 0, 1));
        assertEquals(vec4ul.x.value, 0);
        assertEquals(vec4ul.y.value, 0);
        assertEquals(vec4ul.z.value, 1);
        assertEquals(vec4ul.w.value, 1);

        Vec4us vec4us;

        vec4us = Glm.equal_(new Vec4us(0, 1, 0, 1), new Vec4us(1, 0, 0, 1));
        assertEquals(vec4us.x.value, 0);
        assertEquals(vec4us.y.value, 0);
        assertEquals(vec4us.z.value, 1);
        assertEquals(vec4us.w.value, 1);
    }

    @Test
    public void notEqual_Scalar() {

        assertTrue(Glm.notEqual((byte) 0, (byte) 1));
        assertTrue(Glm.notEqual((byte) 1, (byte) 0));
        assertFalse(Glm.notEqual((byte) 0, (byte) 0));
        assertFalse(Glm.notEqual((byte) 1, (byte) 1));

        assertTrue(Glm.notEqual(0.0, 1.0));
        assertTrue(Glm.notEqual(1.0, 0.0));
        assertFalse(Glm.notEqual(0.0, 0.0));
        assertFalse(Glm.notEqual(1.0, 1.0));

        assertTrue(Glm.notEqual(0.0f, 1.0f));
        assertTrue(Glm.notEqual(1.0f, 0.0f));
        assertFalse(Glm.notEqual(0.0f, 0.0f));
        assertFalse(Glm.notEqual(1.0f, 1.0f));

        assertTrue(Glm.notEqual(0, 1));
        assertTrue(Glm.notEqual(1, 0));
        assertFalse(Glm.notEqual(0, 0));
        assertFalse(Glm.notEqual(1, 1));

        assertTrue(Glm.notEqual((long) 0, 1));
        assertTrue(Glm.notEqual((long) 1, 0));
        assertFalse(Glm.notEqual((long) 0, 0));
        assertFalse(Glm.notEqual((long) 1, 1));

        assertTrue(Glm.notEqual((short) 0, 1));
        assertTrue(Glm.notEqual((short) 1, 0));
        assertFalse(Glm.notEqual((short) 0, 0));
        assertFalse(Glm.notEqual((short) 1, 1));

        assertTrue(Glm.notEqual(new UByte(0), new UByte(1)));
        assertTrue(Glm.notEqual(new UByte(1), new UByte(0)));
        assertFalse(Glm.notEqual(new UByte(0), new UByte(0)));
        assertFalse(Glm.notEqual(new UByte(1), new UByte(1)));

        assertTrue(Glm.notEqual(new UInt(0), new UInt(1)));
        assertTrue(Glm.notEqual(new UInt(1), new UInt(0)));
        assertFalse(Glm.notEqual(new UInt(0), new UInt(0)));
        assertFalse(Glm.notEqual(new UInt(1), new UInt(1)));

        assertTrue(Glm.notEqual(new ULong(0), new ULong(1)));
        assertTrue(Glm.notEqual(new ULong(1), new ULong(0)));
        assertFalse(Glm.notEqual(new ULong(0), new ULong(0)));
        assertFalse(Glm.notEqual(new ULong(1), new ULong(1)));

        assertTrue(Glm.notEqual(new UShort(0), new UShort(1)));
        assertTrue(Glm.notEqual(new UShort(1), new UShort(0)));
        assertFalse(Glm.notEqual(new UShort(0), new UShort(0)));
        assertFalse(Glm.notEqual(new UShort(1), new UShort(1)));

        assertTrue(Glm.notEqual(new UShort(0), new UShort(1)));
        assertTrue(Glm.notEqual(new UShort(1), new UShort(0)));
        assertFalse(Glm.notEqual(new UShort(0), new UShort(0)));
        assertFalse(Glm.notEqual(new UShort(1), new UShort(1)));
    }

    @Test
    public void notEqual_Vec2() {

        Vec2bool vec2bool;

        vec2bool = Glm.notEqual__(new Vec2b(0, 1), new Vec2b(1, 0));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.notEqual__(new Vec2b(0, 1), new Vec2b(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.notEqual__(new Vec2d(0, 1), new Vec2d(1, 0));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.notEqual__(new Vec2d(0, 1), new Vec2d(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.notEqual__(new Vec2(0, 1), new Vec2(1, 0));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.notEqual__(new Vec2(0, 1), new Vec2(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.notEqual__(new Vec2i(0, 1), new Vec2i(1, 0));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.notEqual__(new Vec2i(0, 1), new Vec2i(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.notEqual__(new Vec2l(0, 1), new Vec2l(1, 0));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.notEqual__(new Vec2l(0, 1), new Vec2l(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.notEqual__(new Vec2s(0, 1), new Vec2s(1, 0));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.notEqual__(new Vec2s(0, 1), new Vec2s(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.notEqual__(new Vec2ub(0, 1), new Vec2ub(1, 0));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.notEqual__(new Vec2ub(0, 1), new Vec2ub(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.notEqual__(new Vec2ui(0, 1), new Vec2ui(1, 0));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.notEqual__(new Vec2ui(0, 1), new Vec2ui(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.notEqual__(new Vec2ul(0, 1), new Vec2ul(1, 0));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.notEqual__(new Vec2ul(0, 1), new Vec2ul(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        vec2bool = Glm.notEqual__(new Vec2us(0, 1), new Vec2us(1, 0));
        assertTrue(vec2bool.x);
        assertTrue(vec2bool.y);
        vec2bool = Glm.notEqual__(new Vec2us(0, 1), new Vec2us(0, 1));
        assertFalse(vec2bool.x);
        assertFalse(vec2bool.y);

        Vec2b vec2b;

        vec2b = Glm.notEqual_(new Vec2b(0, 1), new Vec2b(1, 0));
        assertEquals(vec2b.x, 1);
        assertEquals(vec2b.y, 1);
        vec2b = Glm.notEqual_(new Vec2b(0, 1), new Vec2b(0, 1));
        assertEquals(vec2b.x, 0);
        assertEquals(vec2b.y, 0);

        Vec2d vec2d;

        vec2d = Glm.notEqual_(new Vec2d(0, 1), new Vec2d(1, 0));
        assertEquals(vec2d.x, 1, 0);
        assertEquals(vec2d.y, 1, 0);
        vec2d = Glm.notEqual_(new Vec2d(0, 1), new Vec2d(0, 1));
        assertEquals(vec2d.x, 0, 0);
        assertEquals(vec2d.y, 0, 0);

        Vec2 vec2;

        vec2 = Glm.notEqual_(new Vec2(0, 1), new Vec2(1, 0));
        assertEquals(vec2.x, 1, 0);
        assertEquals(vec2.y, 1, 0);
        vec2 = Glm.notEqual_(new Vec2(0, 1), new Vec2(0, 1));
        assertEquals(vec2.x, 0, 0);
        assertEquals(vec2.y, 0, 0);

        Vec2i vec2i;

        vec2i = Glm.notEqual_(new Vec2i(0, 1), new Vec2i(1, 0));
        assertEquals(vec2i.x, 1);
        assertEquals(vec2i.y, 1);
        vec2i = Glm.notEqual_(new Vec2i(0, 1), new Vec2i(0, 1));
        assertEquals(vec2i.x, 0);
        assertEquals(vec2i.y, 0);

        Vec2l vec2l;

        vec2l = Glm.notEqual_(new Vec2l(0, 1), new Vec2l(1, 0));
        assertEquals(vec2l.x, 1);
        assertEquals(vec2l.y, 1);
        vec2l = Glm.notEqual_(new Vec2l(0, 1), new Vec2l(0, 1));
        assertEquals(vec2l.x, 0);
        assertEquals(vec2l.y, 0);

        Vec2s vec2s;

        vec2s = Glm.notEqual_(new Vec2s(0, 1), new Vec2s(1, 0));
        assertEquals(vec2s.x, 1);
        assertEquals(vec2s.y, 1);
        vec2s = Glm.notEqual_(new Vec2s(0, 1), new Vec2s(0, 1));
        assertEquals(vec2s.x, 0);
        assertEquals(vec2s.y, 0);

        Vec2ub vec2ub;

        vec2ub = Glm.notEqual_(new Vec2ub(0, 1), new Vec2ub(1, 0));
        assertEquals(vec2ub.x.value, 1);
        assertEquals(vec2ub.y.value, 1);
        vec2ub = Glm.notEqual_(new Vec2ub(0, 1), new Vec2ub(0, 1));
        assertEquals(vec2ub.x.value, 0);
        assertEquals(vec2ub.y.value, 0);

        Vec2ui vec2ui;

        vec2ui = Glm.notEqual_(new Vec2ui(0, 1), new Vec2ui(1, 0));
        assertEquals(vec2ui.x.value, 1);
        assertEquals(vec2ui.y.value, 1);
        vec2ui = Glm.notEqual_(new Vec2ui(0, 1), new Vec2ui(0, 1));
        assertEquals(vec2ui.x.value, 0);
        assertEquals(vec2ui.y.value, 0);

        Vec2ul vec2ul;

        vec2ul = Glm.notEqual_(new Vec2ul(0, 1), new Vec2ul(1, 0));
        assertEquals(vec2ul.x.value, 1);
        assertEquals(vec2ul.y.value, 1);
        vec2ul = Glm.notEqual_(new Vec2ul(0, 1), new Vec2ul(0, 1));
        assertEquals(vec2ul.x.value, 0);
        assertEquals(vec2ul.y.value, 0);

        Vec2us vec2us;

        vec2us = Glm.notEqual_(new Vec2us(0, 1), new Vec2us(1, 0));
        assertEquals(vec2us.x.value, 1);
        assertEquals(vec2us.y.value, 1);
        vec2us = Glm.notEqual_(new Vec2us(0, 1), new Vec2us(0, 1));
        assertEquals(vec2us.x.value, 0);
        assertEquals(vec2us.y.value, 0);
    }

    @Test
    public void notEqual_Vec3() {

        Vec3bool vec3bool;

        vec3bool = Glm.notEqual__(new Vec3b(0, 1, 0), new Vec3b(1, 0, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.notEqual__(new Vec3d(0, 1, 0), new Vec3d(1, 0, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.notEqual__(new Vec3(0, 1, 0), new Vec3(1, 0, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.notEqual__(new Vec3i(0, 1, 0), new Vec3i(1, 0, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.notEqual__(new Vec3l(0, 1, 0), new Vec3l(1, 0, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.notEqual__(new Vec3s(0, 1, 0), new Vec3s(1, 0, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.notEqual__(new Vec3ub(0, 1, 0), new Vec3ub(1, 0, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.notEqual__(new Vec3ui(0, 1, 0), new Vec3ui(1, 0, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.notEqual__(new Vec3ul(0, 1, 0), new Vec3ul(1, 0, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        vec3bool = Glm.notEqual__(new Vec3us(0, 1, 0), new Vec3us(1, 0, 0));
        assertTrue(vec3bool.x);
        assertTrue(vec3bool.y);
        assertFalse(vec3bool.z);

        Vec3b vec3b;

        vec3b = Glm.notEqual_(new Vec3b(0, 1, 0), new Vec3b(1, 0, 0));
        assertEquals(vec3b.x, 1);
        assertEquals(vec3b.y, 1);
        assertEquals(vec3b.z, 0);

        Vec3d vec3d;

        vec3d = Glm.notEqual_(new Vec3d(0, 1, 0), new Vec3d(1, 0, 0));
        assertEquals(vec3d.x, 1, 0);
        assertEquals(vec3d.y, 1, 0);
        assertEquals(vec3d.z, 0, 0);

        Vec3 vec3;

        vec3 = Glm.notEqual_(new Vec3(0, 1, 0), new Vec3(1, 0, 0));
        assertEquals(vec3.x, 1, 0);
        assertEquals(vec3.y, 1, 0);
        assertEquals(vec3.z, 0, 0);

        Vec3i vec3i;

        vec3i = Glm.notEqual_(new Vec3i(0, 1, 0), new Vec3i(1, 0, 0));
        assertEquals(vec3i.x, 1);
        assertEquals(vec3i.y, 1);
        assertEquals(vec3i.z, 0);

        Vec3l vec3l;

        vec3l = Glm.notEqual_(new Vec3l(0, 1, 0), new Vec3l(1, 0, 0));
        assertEquals(vec3l.x, 1);
        assertEquals(vec3l.y, 1);
        assertEquals(vec3l.z, 0);

        Vec3s vec3s;

        vec3s = Glm.notEqual_(new Vec3s(0, 1, 0), new Vec3s(1, 0, 0));
        assertEquals(vec3s.x, 1);
        assertEquals(vec3s.y, 1);
        assertEquals(vec3s.z, 0);

        Vec3ub vec3ub;

        vec3ub = Glm.notEqual_(new Vec3ub(0, 1, 0), new Vec3ub(1, 0, 0));
        assertEquals(vec3ub.x.value, 1);
        assertEquals(vec3ub.y.value, 1);
        assertEquals(vec3ub.z.value, 0);

        Vec3ui vec3ui;

        vec3ui = Glm.notEqual_(new Vec3ui(0, 1, 0), new Vec3ui(1, 0, 0));
        assertEquals(vec3ui.x.value, 1);
        assertEquals(vec3ui.y.value, 1);
        assertEquals(vec3ui.z.value, 0);

        Vec3ul vec3ul;

        vec3ul = Glm.notEqual_(new Vec3ul(0, 1, 0), new Vec3ul(1, 0, 0));
        assertEquals(vec3ul.x.value, 1);
        assertEquals(vec3ul.y.value, 1);
        assertEquals(vec3ul.z.value, 0);

        Vec3us vec3us;

        vec3us = Glm.notEqual_(new Vec3us(0, 1, 0), new Vec3us(1, 0, 0));
        assertEquals(vec3us.x.value, 1);
        assertEquals(vec3us.y.value, 1);
        assertEquals(vec3us.z.value, 0);
    }

    @Test
    public void notEqual_Vec4() {

        Vec4bool vec4bool;

        vec4bool = Glm.notEqual__(new Vec4b(0, 1, 0, 1), new Vec4b(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.notEqual__(new Vec4d(0, 1, 0, 1), new Vec4d(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.notEqual__(new Vec4(0, 1, 0, 1), new Vec4(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.notEqual__(new Vec4i(0, 1, 0, 1), new Vec4i(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.notEqual__(new Vec4l(0, 1, 0, 1), new Vec4l(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.notEqual__(new Vec4s(0, 1, 0, 1), new Vec4s(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.notEqual__(new Vec4ub(0, 1, 0, 1), new Vec4ub(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.notEqual__(new Vec4ui(0, 1, 0, 1), new Vec4ui(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.notEqual__(new Vec4ul(0, 1, 0, 1), new Vec4ul(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        vec4bool = Glm.notEqual__(new Vec4us(0, 1, 0, 1), new Vec4us(1, 0, 0, 1));
        assertTrue(vec4bool.x);
        assertTrue(vec4bool.y);
        assertFalse(vec4bool.z);
        assertFalse(vec4bool.w);

        Vec4b vec4b;

        vec4b = Glm.notEqual_(new Vec4b(0, 1, 0, 1), new Vec4b(1, 0, 0, 1));
        assertEquals(vec4b.x, 1);
        assertEquals(vec4b.y, 1);
        assertEquals(vec4b.z, 0);
        assertEquals(vec4b.w, 0);

        Vec4d vec4d;

        vec4d = Glm.notEqual_(new Vec4d(0, 1, 0, 1), new Vec4d(1, 0, 0, 1));
        assertEquals(vec4d.x, 1, 0);
        assertEquals(vec4d.y, 1, 0);
        assertEquals(vec4d.z, 0, 0);
        assertEquals(vec4d.w, 0, 0);

        Vec4 vec4;

        vec4 = Glm.notEqual_(new Vec4(0, 1, 0, 1), new Vec4(1, 0, 0, 1));
        assertEquals(vec4.x, 1, 0);
        assertEquals(vec4.y, 1, 0);
        assertEquals(vec4.z, 0, 0);
        assertEquals(vec4.w, 0, 0);

        Vec4i vec4i;

        vec4i = Glm.notEqual_(new Vec4i(0, 1, 0, 1), new Vec4i(1, 0, 0, 1));
        assertEquals(vec4i.x, 1);
        assertEquals(vec4i.y, 1);
        assertEquals(vec4i.z, 0);
        assertEquals(vec4i.w, 0);

        Vec4l vec4l;

        vec4l = Glm.notEqual_(new Vec4l(0, 1, 0, 1), new Vec4l(1, 0, 0, 1));
        assertEquals(vec4l.x, 1);
        assertEquals(vec4l.y, 1);
        assertEquals(vec4l.z, 0);
        assertEquals(vec4l.w, 0);

        Vec4s vec4s;

        vec4s = Glm.notEqual_(new Vec4s(0, 1, 0, 1), new Vec4s(1, 0, 0, 1));
        assertEquals(vec4s.x, 1);
        assertEquals(vec4s.y, 1);
        assertEquals(vec4s.z, 0);
        assertEquals(vec4s.w, 0);

        Vec4ub vec4ub;

        vec4ub = Glm.notEqual_(new Vec4ub(0, 1, 0, 1), new Vec4ub(1, 0, 0, 1));
        assertEquals(vec4ub.x.value, 1);
        assertEquals(vec4ub.y.value, 1);
        assertEquals(vec4ub.z.value, 0);
        assertEquals(vec4ub.w.value, 0);

        Vec4ui vec4ui;

        vec4ui = Glm.notEqual_(new Vec4ui(0, 1, 0, 1), new Vec4ui(1, 0, 0, 1));
        assertEquals(vec4ui.x.value, 1);
        assertEquals(vec4ui.y.value, 1);
        assertEquals(vec4ui.z.value, 0);
        assertEquals(vec4ui.w.value, 0);

        Vec4ul vec4ul;

        vec4ul = Glm.notEqual_(new Vec4ul(0, 1, 0, 1), new Vec4ul(1, 0, 0, 1));
        assertEquals(vec4ul.x.value, 1);
        assertEquals(vec4ul.y.value, 1);
        assertEquals(vec4ul.z.value, 0);
        assertEquals(vec4ul.w.value, 0);

        Vec4us vec4us;

        vec4us = Glm.notEqual_(new Vec4us(0, 1, 0, 1), new Vec4us(1, 0, 0, 1));
        assertEquals(vec4us.x.value, 1);
        assertEquals(vec4us.y.value, 1);
        assertEquals(vec4us.z.value, 0);
        assertEquals(vec4us.w.value, 0);
    }

    @Test
    public void any() {

        assertTrue(Glm.any(new Vec2b(0, 1)));
        assertFalse(Glm.any(new Vec2b(0, 0)));

        assertTrue(Glm.any(new Vec2bool(false, true)));
        assertFalse(Glm.any(new Vec2bool(false, false)));

        assertTrue(Glm.any(new Vec2d(0, 1)));
        assertFalse(Glm.any(new Vec2d(0, 0)));

        assertTrue(Glm.any(new Vec2i(0, 1)));
        assertFalse(Glm.any(new Vec2i(0, 0)));

        assertTrue(Glm.any(new Vec2l(0, 1)));
        assertFalse(Glm.any(new Vec2l(0, 0)));

        assertTrue(Glm.any(new Vec2s(0, 1)));
        assertFalse(Glm.any(new Vec2s(0, 0)));

        assertTrue(Glm.any(new Vec2ub(0, 1)));
        assertFalse(Glm.any(new Vec2ub(0, 0)));

        assertTrue(Glm.any(new Vec2ui(0, 1)));
        assertFalse(Glm.any(new Vec2ui(0, 0)));

        assertTrue(Glm.any(new Vec2ul(0, 1)));
        assertFalse(Glm.any(new Vec2ul(0, 0)));

        assertTrue(Glm.any(new Vec2us(0, 1)));
        assertFalse(Glm.any(new Vec2us(0, 0)));

        assertTrue(Glm.any(new Vec2(0, 1)));
        assertFalse(Glm.any(new Vec2(0, 0)));

        assertTrue(Glm.any(new Vec3b(0, 1, 0)));
        assertFalse(Glm.any(new Vec3b(0, 0, 0)));

        assertTrue(Glm.any(new Vec3bool(false, true, false)));
        assertFalse(Glm.any(new Vec3bool(false, false, false)));

        assertTrue(Glm.any(new Vec3d(0, 1, 0)));
        assertFalse(Glm.any(new Vec3d(0, 0, 0)));

        assertTrue(Glm.any(new Vec3i(0, 1, 0)));
        assertFalse(Glm.any(new Vec3i(0, 0, 0)));

        assertTrue(Glm.any(new Vec3l(0, 1, 0)));
        assertFalse(Glm.any(new Vec3l(0, 0, 0)));

        assertTrue(Glm.any(new Vec3s(0, 1, 0)));
        assertFalse(Glm.any(new Vec3s(0, 0, 0)));

        assertTrue(Glm.any(new Vec3ub(0, 1, 0)));
        assertFalse(Glm.any(new Vec3ub(0, 0, 0)));

        assertTrue(Glm.any(new Vec3ui(0, 1, 0)));
        assertFalse(Glm.any(new Vec3ui(0, 0, 0)));

        assertTrue(Glm.any(new Vec3ul(0, 1, 0)));
        assertFalse(Glm.any(new Vec3ul(0, 0, 0)));

        assertTrue(Glm.any(new Vec3us(0, 1, 0)));
        assertFalse(Glm.any(new Vec3us(0, 0, 0)));

        assertTrue(Glm.any(new Vec3(0, 1, 0)));
        assertFalse(Glm.any(new Vec3(0, 0, 0)));

        assertTrue(Glm.any(new Vec4b(0, 1, 0, 0)));
        assertFalse(Glm.any(new Vec4b(0, 0, 0, 0)));

        assertTrue(Glm.any(new Vec4bool(false, true, false, false)));
        assertFalse(Glm.any(new Vec4bool(false, false, false, false)));

        assertTrue(Glm.any(new Vec4d(0, 1, 0, 0)));
        assertFalse(Glm.any(new Vec4d(0, 0, 0, 0)));

        assertTrue(Glm.any(new Vec4i(0, 1, 0, 0)));
        assertFalse(Glm.any(new Vec4i(0, 0, 0, 0)));

        assertTrue(Glm.any(new Vec4l(0, 1, 0, 0)));
        assertFalse(Glm.any(new Vec4l(0, 0, 0, 0)));

        assertTrue(Glm.any(new Vec4s(0, 1, 0, 0)));
        assertFalse(Glm.any(new Vec4s(0, 0, 0, 0)));

        assertTrue(Glm.any(new Vec4ub(0, 1, 0, 0)));
        assertFalse(Glm.any(new Vec4ub(0, 0, 0, 0)));

        assertTrue(Glm.any(new Vec4ui(0, 1, 0, 0)));
        assertFalse(Glm.any(new Vec4ui(0, 0, 0, 0)));

        assertTrue(Glm.any(new Vec4ul(0, 1, 0, 0)));
        assertFalse(Glm.any(new Vec4ul(0, 0, 0, 0)));

        assertTrue(Glm.any(new Vec4us(0, 1, 0, 0)));
        assertFalse(Glm.any(new Vec4us(0, 0, 0, 0)));

        assertTrue(Glm.any(new Vec4(0, 1, 0, 0)));
        assertFalse(Glm.any(new Vec4(0, 0, 0, 0)));
    }

    @Test
    public void all() {

        assertTrue(Glm.all(new Vec2b(1, 1)));
        assertFalse(Glm.all(new Vec2b(0, 1)));

        assertTrue(Glm.all(new Vec2bool(true, true)));
        assertFalse(Glm.all(new Vec2bool(false, true)));

        assertTrue(Glm.all(new Vec2d(1, 1)));
        assertFalse(Glm.all(new Vec2d(0, 1)));

        assertTrue(Glm.all(new Vec2i(1, 1)));
        assertFalse(Glm.all(new Vec2i(0, 1)));

        assertTrue(Glm.all(new Vec2l(1, 1)));
        assertFalse(Glm.all(new Vec2l(0, 1)));

        assertTrue(Glm.all(new Vec2s(1, 1)));
        assertFalse(Glm.all(new Vec2s(0, 1)));

        assertTrue(Glm.all(new Vec2ub(1, 1)));
        assertFalse(Glm.all(new Vec2ub(0, 1)));

        assertTrue(Glm.all(new Vec2ui(1, 1)));
        assertFalse(Glm.all(new Vec2ui(0, 1)));

        assertTrue(Glm.all(new Vec2ul(1, 1)));
        assertFalse(Glm.all(new Vec2ul(0, 1)));

        assertTrue(Glm.all(new Vec2us(1, 1)));
        assertFalse(Glm.all(new Vec2us(0, 1)));

        assertTrue(Glm.all(new Vec2(1, 1)));
        assertFalse(Glm.all(new Vec2(0, 1)));

        assertTrue(Glm.all(new Vec3b(1, 1, 1)));
        assertFalse(Glm.all(new Vec3b(0, 1, 1)));

        assertTrue(Glm.all(new Vec3bool(true, true, true)));
        assertFalse(Glm.all(new Vec3bool(false, true, true)));

        assertTrue(Glm.all(new Vec3d(1, 1, 1)));
        assertFalse(Glm.all(new Vec3d(0, 1, 1)));

        assertTrue(Glm.all(new Vec3i(1, 1, 1)));
        assertFalse(Glm.all(new Vec3i(0, 1, 1)));

        assertTrue(Glm.all(new Vec3l(1, 1, 1)));
        assertFalse(Glm.all(new Vec3l(0, 1, 1)));

        assertTrue(Glm.all(new Vec3s(1, 1, 1)));
        assertFalse(Glm.all(new Vec3s(0, 1, 1)));

        assertTrue(Glm.all(new Vec3ub(1, 1, 1)));
        assertFalse(Glm.all(new Vec3ub(0, 1, 1)));

        assertTrue(Glm.all(new Vec3ui(1, 1, 1)));
        assertFalse(Glm.all(new Vec3ui(0, 1, 1)));

        assertTrue(Glm.all(new Vec3ul(1, 1, 1)));
        assertFalse(Glm.all(new Vec3ul(0, 1, 1)));

        assertTrue(Glm.all(new Vec3us(1, 1, 1)));
        assertFalse(Glm.all(new Vec3us(0, 1, 1)));

        assertTrue(Glm.all(new Vec3(1, 1, 1)));
        assertFalse(Glm.all(new Vec3(0, 1, 1)));

        assertTrue(Glm.all(new Vec4b(1, 1, 1, 1)));
        assertFalse(Glm.all(new Vec4b(0, 1, 1, 1)));

        assertTrue(Glm.all(new Vec4bool(true, true, true, true)));
        assertFalse(Glm.all(new Vec4bool(false, true, true, true)));

        assertTrue(Glm.all(new Vec4d(1, 1, 1, 1)));
        assertFalse(Glm.all(new Vec4d(0, 1, 1, 1)));

        assertTrue(Glm.all(new Vec4i(1, 1, 1, 1)));
        assertFalse(Glm.all(new Vec4i(0, 1, 1, 1)));

        assertTrue(Glm.all(new Vec4l(1, 1, 1, 1)));
        assertFalse(Glm.all(new Vec4l(0, 1, 1, 1)));

        assertTrue(Glm.all(new Vec4s(1, 1, 1, 1)));
        assertFalse(Glm.all(new Vec4s(0, 1, 1, 1)));

        assertTrue(Glm.all(new Vec4ub(1, 1, 1, 1)));
        assertFalse(Glm.all(new Vec4ub(0, 1, 1, 1)));

        assertTrue(Glm.all(new Vec4ui(1, 1, 1, 1)));
        assertFalse(Glm.all(new Vec4ui(0, 1, 1, 1)));

        assertTrue(Glm.all(new Vec4ul(1, 1, 1, 1)));
        assertFalse(Glm.all(new Vec4ul(0, 1, 1, 1)));

        assertTrue(Glm.all(new Vec4us(1, 1, 1, 1)));
        assertFalse(Glm.all(new Vec4us(0, 1, 1, 1)));

        assertTrue(Glm.all(new Vec4(1, 1, 1, 1)));
        assertFalse(Glm.all(new Vec4(0, 1, 1, 1)));
    }

    public void not() {

        Vec2 vec2 = new Vec2(0, 1).not();
        assertEquals(vec2.x, 1, 0);
        assertEquals(vec2.y, 0, 0);

        Vec2bool vec2bool = new Vec2bool(false, true).not();
        assertTrue(vec2bool.x);
        assertFalse(vec2bool.y);

        Vec2b vec2b = new Vec2b(0, 1).not();
        assertEquals(vec2b.x, 1);
        assertEquals(vec2b.y, 0);

        Vec2d vec2d = new Vec2d(0, 1).not();
        assertEquals(vec2d.x, 1, 0);
        assertEquals(vec2d.y, 0, 0);

        Vec2i vec2i = new Vec2i(0, 1).not();
        assertEquals(vec2i.x, 1);
        assertEquals(vec2i.y, 0);

        Vec2l vec2l = new Vec2l(0, 1).not();
        assertEquals(vec2l.x, 1);
        assertEquals(vec2l.y, 0);

        Vec2s vec2s = new Vec2s(0, 1).not();
        assertEquals(vec2s.x, 1);
        assertEquals(vec2s.y, 0);

        Vec2ub vec2ub = new Vec2ub(0, 1).not();
        assertEquals(vec2ub.x, 1);
        assertEquals(vec2ub.y, 0);

        Vec2ui vec2ui = new Vec2ui(0, 1).not();
        assertEquals(vec2ui.x, 1);
        assertEquals(vec2ui.y, 0);

        Vec2ul vec2ul = new Vec2ul(0, 1).not();
        assertEquals(vec2ul.x, 1);
        assertEquals(vec2ul.y, 0);

        Vec2us vec2us = new Vec2us(0, 1).not();
        assertEquals(vec2us.x, 1);
        assertEquals(vec2us.y, 0);

        Vec3 vec3 = new Vec3(0, 1, 0).not();
        assertEquals(vec3.x, 1, 0);
        assertEquals(vec3.y, 0, 0);
        assertEquals(vec3.z, 1, 0);

        Vec3bool vec3bool = new Vec3bool(false, true, false).not();
        assertTrue(vec3bool.x);
        assertFalse(vec3bool.y);
        assertTrue(vec3bool.z);

        Vec3b vec3b = new Vec3b(0, 1, 0).not();
        assertEquals(vec3b.x, 1);
        assertEquals(vec3b.y, 0);
        assertEquals(vec3b.z, 1);

        Vec3d vec3d = new Vec3d(0, 1, 0).not();
        assertEquals(vec3d.x, 1, 0);
        assertEquals(vec3d.y, 0, 0);
        assertEquals(vec3d.z, 1, 0);

        Vec3i vec3i = new Vec3i(0, 1, 0).not();
        assertEquals(vec3i.x, 1);
        assertEquals(vec3i.y, 0);
        assertEquals(vec3i.z, 1);

        Vec3l vec3l = new Vec3l(0, 1, 0).not();
        assertEquals(vec3l.x, 1);
        assertEquals(vec3l.y, 0);
        assertEquals(vec3l.z, 1);

        Vec3s vec3s = new Vec3s(0, 1, 0).not();
        assertEquals(vec3s.x, 1);
        assertEquals(vec3s.y, 0);
        assertEquals(vec3s.z, 1);

        Vec3ub vec3ub = new Vec3ub(0, 1, 0).not();
        assertEquals(vec3ub.x, 1);
        assertEquals(vec3ub.y, 0);
        assertEquals(vec3ub.z, 1);

        Vec3ui vec3ui = new Vec3ui(0, 1, 0).not();
        assertEquals(vec3ui.x, 1);
        assertEquals(vec3ui.y, 0);
        assertEquals(vec3ui.z, 1);

        Vec3ul vec3ul = new Vec3ul(0, 1, 0).not();
        assertEquals(vec3ul.x, 1);
        assertEquals(vec3ul.y, 0);
        assertEquals(vec3ul.z, 1);

        Vec3us vec3us = new Vec3us(0, 1, 0).not();
        assertEquals(vec3us.x, 1);
        assertEquals(vec3us.y, 0);
        assertEquals(vec3us.z, 1);
    }
}
