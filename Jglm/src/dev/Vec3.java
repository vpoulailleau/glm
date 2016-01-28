/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

/**
 *
 * @author GBarbieri
 */
public class Vec3 {

    public float x, y, z;
    public static final int SIZEOF = 3 * Float.BYTES;

    public Vec3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public float [] toFA(float [] fa ){
        fa[0] = x;
        fa[1] = y;
        fa[2] = z;
        return fa;
    }
}
