/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author elect
 */
public class func_common {

    public static boolean isNan(float x) {
        return x != x;
    }

    public static boolean isInf(float x) {
        return x < Float.NEGATIVE_INFINITY || x > Float.POSITIVE_INFINITY;
    }
}
