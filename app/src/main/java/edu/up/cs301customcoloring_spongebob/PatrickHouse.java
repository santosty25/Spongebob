package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class PatrickHouse extends DrawCanvas {

    private float x;
    private float y;
    private int red;
    private int green;
    private int blue;
    private Paint patHouse = new Paint();

    public PatrickHouse(float initX, float initY) {
        this.x = initX;
        this.y = initY;
        this.red = 139;
        this.green = 69;
        this.blue = 19;

        int patHouseCol = Color.rgb(this.red, this.green, this.blue);
        this.patHouse.setColor(patHouseCol);
        this.patHouse.setStyle(Paint.Style.FILL);
    }

    public void draw(Canvas canvas) {
        this.updateColor(this.red, this.green, this.blue);
        canvas.drawArc(this.x, this.y, this.x + 300.0f, this.y + 300.0f, 180, 180, true, patHouse);
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
        int newPatHouseCol = Color.rgb(upRed, upGreen, upBlue);
        this.patHouse.setColor(newPatHouseCol);
        this.patHouse.setStyle(Paint.Style.FILL);
    }

    @Override
    public boolean containsPoint(float xcoord, float ycoord) {
        if(xcoord >= this.x && xcoord <= this.x + 300.0f ) {
            if(ycoord >= this.y && ycoord <= this.y + 300.0f) {
                return true;
            }
        }

        return false;
    }


}
