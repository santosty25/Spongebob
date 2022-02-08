package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public abstract class DrawCanvas {

    public abstract void draw(Canvas canvas);

    public abstract int getRed();

    public abstract int getGreen();

    public abstract int getBlue();

    public abstract void setRed(int initRed);

    public abstract void setGreen(int initGreen);

    public abstract void setBlue(int initBlue);

    public abstract void updateColor(int upRed, int upGreen, int upBlue);

    public abstract boolean containsPoint(float xcoord, float ycoord);
}
