package com.github.hualuomoli.android.entity;

/**
 * Created by Dean on 2015/9/17.
 */
// 长方形
public class Rectangle extends Graph {

    private double height; // 高度
    private double width; // 宽度

    public Rectangle(Point center, double height, double width) {
        this.center = center;
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    // 点是否在长方形中
    @Override
    public boolean isInside(Point point) {
        double offsetX = Math.abs(center.getX() - point.getX());
        double offsetY = Math.abs(center.getY() - point.getY());

        // 偏移小于长度
        return offsetX < width / 2 && offsetY < height / 2;
    }
}
