package com.github.hualuomoli.line2line.view;

import android.content.Context;

import com.github.hualuomoli.android.entity.Point;
import com.github.hualuomoli.line2line.entity.Card;

/**
 * Created by Dean on 2015/9/17.
 */
// 游戏数据
public class Game {

    private Card[][] cards; // 卡片
    private int rows; // 行数
    private int cols; // 列数
    private double width; // 宽度
    private double height; // 高度
    private Point startPoint; // 左上角点

    private Context context;

    public Game(Context context, Point startPoint, double width, double height, int rows, int cols) {
        this.context = context;
        this.startPoint = startPoint;
        this.width = width;
        this.height = height;
        this.rows = rows;
        this.cols = cols;
        // 初始化
        init();
    }

    // 初始化
    private void init() {
        // 初始化卡片
        cards = new Card[rows][cols];
        for (int row = 0; row < rows; row++) { // 行
            for (int col = 0; col < cols; col++) { // 列
//                cards[row][col] = new Card();
            }
        }
    }

    // 开始游戏
    public void startGame() {

    }

}
