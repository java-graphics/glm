/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GBarbieri
 */
public class Mat4Test {

    public Mat4Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testConstructor_a() {
        System.out.println("constructor_a");
        Mat4 result = new Mat4();
        Mat4 expResult = new Mat4(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
        assertTrue(result.equals(expResult));
    }

    @Test
    public void testConstructor_b() {
        System.out.println("constructor_b");
        Mat4 result = new Mat4(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Mat4 expResult = new Mat4();
        expResult.m00 = 0;
        expResult.m01 = 1;
        expResult.m02 = 2;
        expResult.m03 = 3;
        expResult.m10 = 4;
        expResult.m11 = 5;
        expResult.m12 = 6;
        expResult.m13 = 7;
        expResult.m20 = 8;
        expResult.m21 = 9;
        expResult.m22 = 10;
        expResult.m23 = 11;
        expResult.m30 = 12;
        expResult.m31 = 13;
        expResult.m32 = 14;
        expResult.m33 = 15;
        assertTrue(result.equals(expResult));
    }

    @Test
    public void testIdentity() {
        System.out.println("identity");
        Mat4 instance = new Mat4();
        Mat4 expResult = new Mat4(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
        Mat4 result = instance.identity();
        assertTrue(expResult.equals(result));
    }

    @Test
    public void testMul_a() {
        System.out.println("mul_a");
        Mat4 a = new Mat4(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Mat4 b = new Mat4(15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
        Mat4 expResult = new Mat4(304, 358, 412, 466, 208, 246, 284, 322,
                112, 134, 156, 178, 16, 22, 28, 34);
        Mat4 result = a.mul(b);
        assertTrue(expResult.equals(result));
    }

    @Test
    public void testPerspective_a() {
        System.out.println("perspective_a");
        float fovy = (float) Math.PI * 0.25f;
        float aspect = 4f / 3f;
        float zNear = 0.1f;
        float zFar = 100.0f;
        Mat4 result = new Mat4(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Mat4 expResult = new Mat4(1.81066f, 0f, 0f, 0f, 0f, 2.41421342f, 0f, 0f,
                0f, 0f, -1.00200200f, -1f, 0f, 0f, -0.200200200f, 0f);
        result.perspective(fovy, aspect, zNear, zFar);
        assertTrue(result.equals(expResult));
    }

    @Test
    public void testPerspective_b() {
        System.out.println("perspective_b");
        float fovy = (float) Math.PI * 0.25f;
        float aspect = 4f / 3f;
        float zNear = 0.1f;
        float zFar = 100.0f;
        Mat4 result = new Mat4(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Mat4 expResult = new Mat4(1.81066f, 0f, 0f, 0f, 0f, 2.41421342f, 0f, 0f,
                0f, 0f, -1.00200200f, -1f, 0f, 0f, -0.200200200f, 0f);
        Mat4.perspective(fovy, aspect, zNear, zFar, result);
        assertTrue(result.equals(expResult));
    }

    @Test
    public void testMulPerspective_a() {
        System.out.println("mulPerspective_a");
        float fovy = (float) Math.PI * 0.25f;
        float aspect = 4f / 3f;
        float zNear = 0.1f;
        float zFar = 100.0f;
        Mat4 result = new Mat4(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Mat4 expResult = new Mat4(0f, 1.81066012f, 3.62132025f, 5.43198013f,
                9.65685368f, 12.0710669f, 14.4852810f, 16.8994942f,
                -20.0160160f, -22.0180168f, -24.0200195f, -26.0220222f,
                -1.60160160f, -1.80180180f, -2.00200200f, -2.20220232f);
        result.mulPerspective(fovy, aspect, zNear, zFar);
        assertTrue(result.equals(expResult));
    }

    @Test
    public void testMulPerspective_b() {
        System.out.println("mulPerspective_b");
        float fovy = (float) Math.PI * 0.25f;
        float aspect = 4f / 3f;
        float zNear = 0.1f;
        float zFar = 100.0f;
        Mat4 result = new Mat4();
        Mat4 instance = new Mat4(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Mat4 expResult = new Mat4(0f, 1.81066012f, 3.62132025f, 5.43198013f,
                9.65685368f, 12.0710669f, 14.4852810f, 16.8994942f,
                -20.0160160f, -22.0180168f, -24.0200195f, -26.0220222f,
                -1.60160160f, -1.80180180f, -2.00200200f, -2.20220232f);
        instance.mulPerspective(fovy, aspect, zNear, zFar, result);
        assertTrue(result.equals(expResult));
    }

    @Test
    public void testRotation_a() {
        System.out.println("rotation_a");
        float ang = 1f;
        float x = 2f;
        float y = 3f;
        float z = 4f;
        Mat4 instance = new Mat4();
        Mat4 expResult = new Mat4(0.603708863f, 0.720138788f, -0.341958523f, 0f,
                -0.529919028f, 0.682967067f, 0.502734184f, 0f,
                0.595584869f, -0.122294709f, 0.793928623f, 0f,
                0f, 0f, 0f, 1f);
        Mat4 result = instance.rotation(ang, x, y, z);
        result.print();
        assertTrue(result.equals(expResult));
    }

    @Test
    public void testRotate_a() {
        System.out.println("rotate_a");
        float angle = 1f;
//        float x = 2f;
//        float y = 3f;
//        float z = 4f;
        float x = 0.371390671f;
        float y = 0.557085991f;
        float z = 0.742781341f;
        Mat4 dest = new Mat4();
        Mat4 instance = new Mat4();
        Mat4 expResult = new Mat4(0.603708863f, 0.720138788f, -0.341958523f, 0f,
                -0.529919028f, 0.682967067f, 0.502734184f, 0f,
                0.595584869f, -0.122294709f, 0.793928623f, 0f,
                0f, 0f, 0f, 1f);
        Mat4 result = instance.rotate(angle, x, y, z, dest);
        assertTrue(result.equals(expResult));
    }

    @Test
    public void testTranslation_a() {
        System.out.println("translation_a");
        float x = 1f;
        float y = 2f;
        float z = 3f;
        Mat4 expResult = new Mat4(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, x, y, z, 1);
        Mat4 result = new Mat4().translation(x, y, z);
        assertTrue(result.equals(expResult));
    }

    @Test
    public void testTranslate_a() {
        System.out.println("translate_a");
        float x = 1f;
        float y = 2f;
        float z = 3f;
        Mat4 expResult = new Mat4(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, x, y, z, 1);
        Mat4 result = new Mat4().translate(x, y, z);
        assertTrue(result.equals(expResult));
    }
    /**
     * Test of equals method, of class Mat4.
     */
//    @Test
//    public void testEquals_Mat4() {
//        System.out.println("equals");
//        Mat4 other = null;
//        Mat4 instance = new Mat4();
//        boolean expResult = false;
//        boolean result = instance.equals(other);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of equals method, of class Mat4.
//     */
//    @Test
//    public void testEquals_Mat4_int() {
//        System.out.println("equals");
//        Mat4 other = null;
//        int maxUlps = 0;
//        Mat4 instance = new Mat4();
//        boolean expResult = false;
//        boolean result = instance.equals(other, maxUlps);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of compareFloatEquals method, of class Mat4.
//     */
//    @Test
//    public void testCompareFloatEquals() {
//        System.out.println("compareFloatEquals");
//        float expected = 0.0F;
//        float actual = 0.0F;
//        int maxUlps = 0;
//        boolean expResult = false;
//        boolean result = Mat4.compareFloatEquals(expected, actual, maxUlps);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toFA_ method, of class Mat4.
//     */
//    @Test
//    public void testToFA_() {
//        System.out.println("toFA_");
//        Mat4 instance = new Mat4();
//        float[] expResult = null;
//        float[] result = instance.toFA_();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toFA method, of class Mat4.
//     */
//    @Test
//    public void testToFA_floatArr() {
//        System.out.println("toFA");
//        float[] res = null;
//        Mat4 instance = new Mat4();
//        float[] expResult = null;
//        float[] result = instance.toFA(res);
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toFA method, of class Mat4.
//     */
//    @Test
//    public void testToFA_floatArr_int() {
//        System.out.println("toFA");
//        float[] res = null;
//        int index = 0;
//        Mat4 instance = new Mat4();
//        float[] expResult = null;
//        float[] result = instance.toFA(res, index);
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toFB_ method, of class Mat4.
//     */
//    @Test
//    public void testToFB_() {
//        System.out.println("toFB_");
//        Mat4 instance = new Mat4();
//        ByteBuffer expResult = null;
//        ByteBuffer result = instance.toFB_();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toFB method, of class Mat4.
//     */
//    @Test
//    public void testToFB_ByteBuffer() {
//        System.out.println("toFB");
//        ByteBuffer res = null;
//        Mat4 instance = new Mat4();
//        ByteBuffer expResult = null;
//        ByteBuffer result = instance.toFB(res);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toFB method, of class Mat4.
//     */
//    @Test
//    public void testToFB_ByteBuffer_int() {
//        System.out.println("toFB");
//        ByteBuffer res = null;
//        int index = 0;
//        Mat4 instance = new Mat4();
//        ByteBuffer expResult = null;
//        ByteBuffer result = instance.toFB(res, index);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of print method, of class Mat4.
//     */
//    @Test
//    public void testPrint_0args() {
//        System.out.println("print");
//        Mat4 instance = new Mat4();
//        instance.print();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of print method, of class Mat4.
//     */
//    @Test
//    public void testPrint_String() {
//        System.out.println("print");
//        String title = "";
//        Mat4 instance = new Mat4();
//        instance.print(title);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of print method, of class Mat4.
//     */
//    @Test
//    public void testPrint_boolean() {
//        System.out.println("print");
//        boolean outStream = false;
//        Mat4 instance = new Mat4();
//        instance.print(outStream);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of print method, of class Mat4.
//     */
//    @Test
//    public void testPrint_String_boolean() {
//        System.out.println("print");
//        String title = "";
//        boolean outStream = false;
//        Mat4 instance = new Mat4();
//        instance.print(title, outStream);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
