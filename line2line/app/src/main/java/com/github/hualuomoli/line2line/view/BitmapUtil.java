package com.github.hualuomoli.line2line.view;

import android.graphics.Bitmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dean on 2015/9/17.
 */
// 图片工具
public class BitmapUtil {
    private static final Map<Integer, Bitmap> BitmapMap = new HashMap<Integer, Bitmap>();
    private static double bitmapWidth; // 图片宽度
    private static double bitmapHeight; // 图片高度

    public void init(double width, double height, int rows, int cols) {
        bitmapWidth = width / rows;
        bitmapHeight = height / cols;

    }

}
