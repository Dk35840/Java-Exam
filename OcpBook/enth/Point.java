package enth;

public class Point {
	 protected int x, y;
	    void warp(javaBrainsLambda.Point3d a) {
	        if (a.z > 0)  // compile-time error: cannot access a.z
	            a.delta(this);
	    }
}
