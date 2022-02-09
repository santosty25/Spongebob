package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * SquidHouse - A class that represents a drawing of Squidward's
 * house.
 *
 * @author Tyler Santos
 * @version Spring 2022 - 2/8/2022
 */
public class SquidHouse extends DrawCanvas{
    private float x; //x value
    private float y; //y value
    private Paint squidHouse = new Paint(); //color of Squidward's house
    private int red; //red value
    private int blue; //blue value
    private int green; //green value

    /**
     * SquidHouse - Constructor that initializes the instance variables
     * and sets the color of Squidward's house.
     *
     * @param initX
     * @param initY
     */
    public SquidHouse(float initX, float initY) {
        this.x = initX;
        this.y = initY;
        this.red = 70;
        this.green = 130;
        this.blue = 180;

        int spongeColor = Color.rgb(this.red, this.green, this.blue);
        this.squidHouse.setColor(spongeColor);
        this.squidHouse.setStyle(Paint.Style.FILL);
    }

    /**
     * draw - Draws Squidward's house on a given canvas.
     *
     * @param canvas
     */
    public void draw(Canvas canvas) {

        //update the color of Squidward's house
        this.updateColor(this.red, this.green, this.blue);

        //color of window frames
        Paint squidFrame = new Paint();
        int frame = Color.rgb(173,216,230);
        squidFrame.setColor(frame);
        squidFrame.setStyle(Paint.Style.FILL);

        //color of window pane
        Paint window = new Paint();
        int windowCol = Color.rgb(0,191,255);
        window.setColor(windowCol);
        window.setStyle(Paint.Style.FILL);

        //color of the door
        Paint door = new Paint();
        int doorCol = Color.rgb	(210,105,30);
        door.setColor(doorCol);
        door.setStyle(Paint.Style.FILL);

        //draw structure
        canvas.drawRect(this.x, this.y, this.x + 300.0f, this.y + 450.0f, squidHouse);
        //draw door
        canvas.drawArc(this.x + 100.0f, this.y + 350.0f, this.x + 200.0f,
                this.y + 550.0f, 180, 180, true, door);
        //draw windows
        canvas.drawOval(this.x + 20.0f, this.y + 100.0f, this.x + 120.0f,
                this.y + 200.0f, squidFrame);
        canvas.drawOval(this.x + 180.0f, this.y + 100.0f, this.x + 280.0f,
                this.y + 200.0f, squidFrame);
        canvas.drawOval(this.x + 40.0f, this.y + 125.0f, this. x + 100.0f,
                this.y + 175.0f, window);
        canvas.drawOval(this.x + 200.0f, this.y + 125.0f, this. x + 260.0f,
                this.y + 175.0f, window);

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
     * @return thisblue
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
     * updateColor - Updates the color value to the given arguments.
     *
     * @param upRed
     * @param upGreen
     * @param upBlue
     */
    @Override
    public void updateColor(int upRed, int upGreen, int upBlue) {
        int newSquidCol = Color.rgb(upRed, upGreen, upBlue);
        this.squidHouse.setColor(newSquidCol);
        this.squidHouse.setStyle(Paint.Style.FILL);
    }

    /**
     * containsPoint - Checks if a given point contains an object
     * of Squidward's house drawn on a canvas.
     *
     * @param xcoord
     * @param ycoord
     * @return true/false
     */
    @Override
    public boolean containsPoint(float xcoord, float ycoord) {
        if(xcoord >= this.x && xcoord <= this.x + 300.0f ) {
            if(ycoord >= this.y && ycoord <= this.y + 450.0f) {
                return true;
            }
        }

        return false;
    }

}
