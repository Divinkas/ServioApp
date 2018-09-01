package com.example.divinkas.servioplacesapp.Model;

import java.util.ArrayList;

public class Places {
    public String Name;
    public String Code;

    public int Left;
    public int Top;
    public int Width;
    public int Height;
    public int Corner;
    public int ShapeType;
    public int ShapeOrient;
    public int Color;
    public int Style;
    public int FrameColor;
    public int FontColor;

    ArrayList<Bills> Bills;

    public Places(){}

    public Places(String name, String code, int left, int top, int width, int height,
                  int corner, int shapeType, int shapeOrient, int color, int style,
                  int frameColor, int fontColor, ArrayList<Bills> Bills) {
        Name = name;
        Code = code;
        Left = left;
        Top = top;
        Width = width;
        Height = height;
        Corner = corner;
        ShapeType = shapeType;
        ShapeOrient = shapeOrient;
        Color = color;
        Style = style;
        FrameColor = frameColor;
        FontColor = fontColor;
        this.Bills = Bills;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public int getLeft() {
        return Left;
    }

    public void setLeft(int left) {
        Left = left;
    }

    public int getTop() {
        return Top;
    }

    public void setTop(int top) {
        Top = top;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getCorner() {
        return Corner;
    }

    public void setCorner(int corner) {
        Corner = corner;
    }

    public int getShapeType() {
        return ShapeType;
    }

    public void setShapeType(int shapeType) {
        ShapeType = shapeType;
    }

    public int getShapeOrient() {
        return ShapeOrient;
    }

    public void setShapeOrient(int shapeOrient) {
        ShapeOrient = shapeOrient;
    }

    public int getColor() {
        return Color;
    }

    public void setColor(int color) {
        Color = color;
    }

    public int getStyle() {
        return Style;
    }

    public void setStyle(int style) {
        Style = style;
    }

    public int getFrameColor() {
        return FrameColor;
    }

    public void setFrameColor(int frameColor) {
        FrameColor = frameColor;
    }

    public int getFontColor() {
        return FontColor;
    }

    public void setFontColor(int fontColor) {
        FontColor = fontColor;
    }

    public ArrayList<Bills> getBills() {
        return Bills;
    }

    public void setBills(ArrayList<Bills> bills) {
        this.Bills = bills;
    }
}
