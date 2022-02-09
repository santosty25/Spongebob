package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Sun - A class that represents a sun drawn on a canvas.
 *
 * @author Tyler Santos
 * @version Spring 2022
 */
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

    /**
     * draw - Draws a Sun object on a given canvas.
     *
     * @param canvas
     */
    public void draw(Canvas canvas) {
        //update the color of the sun
        this.updateColor(this.red, this.green, this.blue);
        canvas.drawOval(this.x, this.y, this.x + 200.0f, this.y + 200.0f, sun);
    }

    /**
     * getRed- Gets the red color value.
     *
     * @return this.red
     */
    @Override
    public int getRed() {
        return this.red;
    }

    /**
     * getGreen - Gets the green color value.
     *
     * @return this.green
     */
    @Override
    public int getGreen() {
        return this.green;
    }

    /**
     * getBlue - Gets the blue color value.
     *
     * @return this.blue
     */
    @Override
    public int getBlue() {
        return this.blue;
    }

    /**
     * setRed - Sets the red color value to a given argument.
     *
     * @param initRed
     */
    @Override
    public void setRed(int initRed) {
        this.red = initRed;
    }

    /**
     * setGreen - Sets tje green color value to a given argument.
     *
     * @param initGreen
     */
    @Override
    public void setGreen(int initGreen) {
        this.green = initGreen;
    }

    /**
     * setBlue - Sets the blue color value to a given argument.
     *
     * @param initBlue
     */
    @Override
    public void setBlue(int initBlue) {
        this.blue = initBlue;
    }

    /**
     * updateColor - Updates the color of the sun to a given rgb color
     * value.
     *
     * @param upRed
     * @param upGreen
     * @param upBlue
     */
    @Override
    public void updateColor(int upRed, int upGreen, int upBlue) {
        int newSunCol = Color.rgb(upRed, upGreen, upBlue);
        this.sun.setColor(newSunCol);
        this.sun.setStyle(Paint.Style.FILL);
    }

    /**
     * containsPoint - Checks if the coordinate is contained within
     * a Sun object drawn on the canvas.
     *
     * @param xcoord
     * @param ycoord
     * @return true/false
     */
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
