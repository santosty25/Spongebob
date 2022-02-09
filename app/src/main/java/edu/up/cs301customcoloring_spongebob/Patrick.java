package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Patrick - a class that represents a drawing of Patrick.
 *
 * @author Tyler Santos
 * @version Spring 2022 - 2/8/22
 */
public class Patrick extends DrawCanvas{

    private float x; //x value
    private float y; //y value
    private Paint patrick = new Paint(); //Patrick color
    private int red; //red value
    private int blue; //blue value
    private int green; //green value

    /**
     * Patrick - Constructor that initializes the instance variables
     * and creates a color for Patrick.
     * @param initX
     * @param initY
     */
    public Patrick(float initX, float initY) {
        this.x = initX;
        this.y = initY;
        this.red = 255;
        this.green = 128;
        this.blue = 139;

        int patCol = Color.rgb(this.red, this.green, this.blue);
        this.patrick.setColor(patCol);
        this.patrick.setStyle(Paint.Style.FILL);
    }

    /**
     * draw - Draws patrick on a given canvas and updates the
     * color of Patrick everytime he's drawn.
     *
     * @param canvas
     */
    @Override
    public void draw(Canvas canvas) {

        //update Patrick's color
        this.updateColor(this.red, this.green, this.blue);

        //color of Patrick's shorts
        Paint shorts = new Paint();
        int shortsCol = Color.rgb(173,255,47);
        shorts.setColor(shortsCol);
        shorts.setStyle(Paint.Style.FILL);

        //color of patrick's eyes
        Paint pupil = new Paint();
        pupil.setColor(Color.BLACK);
        pupil.setStyle(Paint.Style.FILL);

        //draw body
        canvas.drawOval(this.x, this.y, this.x + 150.0f, this.y + 150.0f, patrick);
        //draw head
        canvas.drawArc(this.x + 40.0f, this.y - 100.0f, this.x + 110.0f, this.y + 170.0f, 180, 180, true, patrick);
        //draw arms
        canvas.drawOval(this.x - 10.0f, this.y + 50.0f, this.x + 10.0f, this.y + 120.0f, patrick);
        canvas.drawOval(this.x + 140.0f, this.y + 50.0f, this.x + 160.0f, this.y + 120.0f, patrick);
        //draw legs
        canvas.drawOval(this.x + 20.0f, this.y + 130.0f, this.x + 60.0f, this.y + 230.0f, patrick);
        canvas.drawOval(this.x + 90.0f, this.y + 130.00f, this.x + 130.0f, this.y + 230.0f, patrick);
        //draw shorts
        canvas.drawArc(this.x, this.y + 70.0f, this.x + 150.0f, this.y + 170.0f, 0, 180, true, shorts);
        //draw eyes
        canvas.drawOval(this.x + 60.0f, this.y - 60.0f, this.x + 70.0f, this.y - 50.0f, pupil);
        canvas.drawOval(this.x + 90.0f, this.y - 60.0f, this.x + 100.0f, this.y - 50.0f, pupil);
    }

    /**
     * getRed - Gets the red color value.
     *
     * @return this.red;
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
        int newPatCol = Color.rgb(upRed, upGreen, upBlue);
        this.patrick.setColor(newPatCol);
        this.patrick.setStyle(Paint.Style.FILL);
    }

    /**
     * containsPoint - Checks if a given point contains a Patrick object
     * drawn on the canvas.
     *
     * @param xcoord
     * @param ycoord
     * @return
     */
    @Override
    public boolean containsPoint(float xcoord, float ycoord) {
        if(xcoord >= this.x - 10.0f && xcoord <= this.x + 160.0f ) {
            if(ycoord >= this.y - 100.0f && ycoord <= this.y + 150.0f) {
                return true;
            }
        }

        return false;
    }

}
