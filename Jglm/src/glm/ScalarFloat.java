/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

/**
 *
 * @author elect
 */
class ScalarFloat {

    public static float abs(float x) {
        return (float) Math.abs(x);
    }

    public static float ceil(float x) {
        return (float) Math.ceil(x);
    }

    public static float clamp(float x, float minVal, float maxVal) {
        return Math.min(Math.max(x, minVal), maxVal);
    }

    public static float floatToIntBits(float x) {
        return Float.floatToIntBits(x);
    }

    public static float floor(float x) {
        return (float) Math.floor(x);
    }

    public static float fma(float a, float b, float c) {
        return a * b + c;
    }

    public static float fract(float x) {
        return (float) (x - Math.floor(x));
    }

    public static boolean isInf(float x) {
        return Float.isInfinite(x);
    }

    public static boolean isNan(float x) {
        return Float.isNaN(x);
    }
}
