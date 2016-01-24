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

    /**
     * Test of mulPerspective_ method, of class Mat4.
     */
    @Test
    public void testMulPerspective_() {
        System.out.println("mulPerspective_");
        float fovy = (float) Math.PI * 0.25f;
        float aspect = 4f / 3f;
        float zNear = 0.1f;
        float zFar = 100.0f;
        Mat4 instance = new Mat4();
        Mat4 expResult = new Mat4(1.81066f, 0f, 0f, 0f, 0f, 2.41421342f, 0f, 0f,
                0f, 0f, -1.00200200f, -1f, 0f, 0f, -0.200200200f, 0f);
        Mat4 result = instance.mulPerspective_(fovy, aspect, zNear, zFar);
        assertTrue(result.equals(expResult));
    }

    /**
     * Test of mulPerspective method, of class Mat4.
     */
    @Test
    public void testMulPerspective() {
        System.out.println("mulPerspective");
        float fovy = (float) Math.PI * 0.25f;
        float aspect = 4f / 3f;
        float zNear = 0.1f;
        float zFar = 100.0f;
        Mat4 result = new Mat4();
        Mat4 instance = new Mat4();
        Mat4 expResult = new Mat4(1.81066f, 0f, 0f, 0f, 0f, 2.41421342f, 0f, 0f,
                0f, 0f, -1.00200200f, -1f, 0f, 0f, -0.200200200f, 0f);
        instance.mulPerspective(fovy, aspect, zNear, zFar, result);
        assertTrue(result.equals(expResult));
    }

    /**
     * Test of perspective_ method, of class Mat4.
     */
    @Test
    public void testPerspective_() {
        System.out.println("perspective_");
        float fovy = (float) Math.PI * 0.25f;
        float aspect = 4f / 3f;
        float zNear = 0.1f;
        float zFar = 100.0f;
        Mat4 expResult = new Mat4(1.81066f, 0f, 0f, 0f, 0f, 2.41421342f, 0f, 0f,
                0f, 0f, -1.00200200f, -1f, 0f, 0f, -0.200200200f, 0f);
        Mat4 result = Mat4.perspective_(fovy, aspect, zNear, zFar);
        assertTrue(result.equals(expResult));
    }

    /**
     * Test of perspective method, of class Mat4.
     */
    @Test
    public void testPerspective() {
        System.out.println("perspective");
        float fovy = (float) Math.PI * 0.25f;
        float aspect = 4f / 3f;
        float zNear = 0.1f;
        float zFar = 100.0f;
        Mat4 expResult = new Mat4(1.81066f, 0f, 0f, 0f, 0f, 2.41421342f, 0f, 0f,
                0f, 0f, -1.00200200f, -1f, 0f, 0f, -0.200200200f, 0f);
        Mat4 result = new Mat4();
        Mat4.perspective(fovy, aspect, zNear, zFar, result);
        assertTrue(result.equals(expResult));
    }
}
