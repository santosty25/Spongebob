package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * PatrickHouse - A class that represents a drawing of Patrick's
 * house on a canvas.
 *
 * @author Tyler Santos
 * @version Spring 2022 - 2/8/22
 */
public class PatrickHouse extends DrawCanvas {

    private float x; //x value
    private float y; //y value
    private int red; //red value
    private int green; //green value
    private int blue; //blue value
    private Paint patHouse = new Paint(); //color of Patrick's house

    /**
     * PatrickHouse - A constructor that initializes the instance variables
     * and creates the color for Patrick's house.
     *
     * @param initX
     * @param initY
     */
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

    /**
     * draw - Draws Patrick's House on a given canvas.
     *
     * @param canvas
     */
    @Override
    public void draw(Canvas canvas) {
        //update the color of Patrick's house.
        this.updateColor(this.red, this.green, this.blue);
        canvas.drawArc(this.x, this.y, this.x + 300.0f, this.y + 300.0f, 180, 180, true, patHouse);
    }

    /**
     * getRed - Gets the red color value.
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
     * @return this.green
     */
    @Override
    public int getBlue() {
        return this.blue;
    }

    /**
     * setRed - Sets the red golor value to a given argument.
     *
     * @param initRed
     */
    @Override
    public void setRed(int initRed) {
        this.red = initRed;
    }

    /**
     * setGreen - Sets the green color value to a given argument.
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
     * updateColor - Updates the rgb color values to a given argument.
     *
     * @param upRed
     * @param upGreen
     * @param upBlue
     */
    @Override
    public void updateColor(int upRed, int upGreen, int upBlue) {
        int newPatHouseCol = Color.rgb(upRed, upGreen, upBlue);
        this.patHouse.setColor(newPatHouseCol);
        this.patHouse.setStyle(Paint.Style.FILL);
    }

    /**
     * Checks if a given point contains a PatrickHouse object.
     *
     * @param xcoord
     * @param ycoord
     *
     * @return true/false
     */
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
