package com.github.hualuomoli.android.entity;

/**
 * Created by Dean on 2015/9/17.
 */
// 图形
public abstract class Graph {

    protected Point center; // 图形的中心点

    // 点是否在图形内
    protected abstract boolean isInside(Point point);

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
