package com.github.hualuomoli.line2line.entity;

import android.graphics.Bitmap;

import com.github.hualuomoli.android.entity.Point;
import com.github.hualuomoli.android.entity.Square;

/**
 * Created by Dean on 2015/9/17.
 */
// 游戏卡片
public class Card extends Square {

    private Bitmap bitmap; // 图像
    private Integer value; // 数值

    public Card(Point center, Bitmap bitmap, Integer value) {
        super(center, bitmap.getWidth());
        this.bitmap = bitmap;
        this.value = value;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
