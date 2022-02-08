package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Sun extends DrawCanvas{
    private float x;
    private float y;
    private Paint sun = new Paint();
    private int red;
    private int blue;
    private int green;

    public Sun(float initX, float initY) {
        this.x = initX;
        this.y = initY;
        this.red = 255;
        this.green = 215;
        this.blue = 0;

        int sunCol = Color.rgb(this.red, this.green, this.blue);
        this.sun.setColor(sunCol);
        this.sun.setStyle(Paint.Style.FILL);
    }

    public void draw(Canvas canvas) {
        this.updateColor(this.red, this.green, this.blue);
        canvas.drawOval(this.x, this.y, this.x + 200.0f, this.y + 200.0f, sun);
    }

    @Override
    public int getRed() {
        return this.red;
    }

    @Override
    public int getGreen() {
        return this.green;
    }

    @Override
    public int getBlue() {
        return this.blue;
    }

    @Override
    public void setRed(int initRed) {
        this.red = initRed;
    }

    @Override
    public void setGreen(int initGreen) {
        this.green = initGreen;
    }

    @Override
    public void setBlue(int initBlue) {
        this.blue = initBlue;
    }

    @Override
    public void updateColor(int upRed, int upGreen, int upBlue) {
        int newSunCol = Color.rgb(upRed, upGreen, upBlue);
        this.sun.setColor(newSunCol);
        this.sun.setStyle(Paint.Style.FILL);
    }

    @Override
    public boolean containsPoint(float xcoord, float ycoord) {
        if(xcoord >= this.x && xcoord <= this.x + 200.0f ) {
            if(ycoord >= this.y && ycoord <= this.y + 200.0f) {
                return true;
            }
        }

        return false;
    }

}
