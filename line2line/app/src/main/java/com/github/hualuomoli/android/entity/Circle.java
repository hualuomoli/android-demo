package com.github.hualuomoli.android.entity;

/**
 * Created by Dean on 2015/9/17.
 */
// 圆
public class Circle extends Graph {

    private double radius; // 半径

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 点是否在图形内
    @Override
    protected boolean isInside(Point point) {
        return center.distance(point) <= radius;
    }
}
