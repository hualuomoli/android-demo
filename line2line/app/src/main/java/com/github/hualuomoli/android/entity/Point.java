package com.github.hualuomoli.android.entity;

/**
 * Created by Dean on 2015/9/17.
 */
// 点
public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // 当前点与p的距离
    public double distance(Point p) {
        return Math.sqrt((p.getX() - x) * (p.getX() - x) + (p.getY() - y) * (p.getY() - y));
    }

}
