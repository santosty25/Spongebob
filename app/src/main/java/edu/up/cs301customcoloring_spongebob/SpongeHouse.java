package edu.up.cs301customcoloring_spongebob;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Canvas;

/**
 * SpongeHouse - A class that represents Spongebob's house drawn on
 * a canvas.
 *
 * @author Tyler Santos
 * @version Spring 2022 - 2/8/22
 */
public class SpongeHouse extends DrawCanvas{

        private float x; //x value
        private float y; //y value
        private Paint spongeHouse = new Paint(); //color of Spongebob's house
        private int red; //red color value
        private int blue; //blue color value
        private int green; //green color value

    /**
     * SpongeHouse - Constructor that initializes the instance variables
     * and sets the color of Spongebob's house.
     *
     * @param initX
     * @param initY
     */
    public SpongeHouse(float initX, float initY) {
            this.x = initX;
            this.y = initY;
            this.red = 255;
            this.green = 140;
            this.blue = 0;

            int spongeHouseColor = Color.rgb(this.red, this.green, this.blue);
            this.spongeHouse.setColor(spongeHouseColor);
            this.spongeHouse.setStyle(Paint.Style.FILL);
    }

    /**
     * draw - Method that will draw Spongebob's house
     * on a given canvas.
     *
     * @param canvas
     */
    @Override
    public void draw(Canvas canvas) {

        //update color of Spongebob's house
        this.updateColor(this.red, this.green, this.blue);

        //color of window and door frame
        Paint pineappleFrame = new Paint();
        int frame = Color.rgb(173,216,230);
        pineappleFrame.setColor(frame);
        pineappleFrame.setStyle(Paint.Style.FILL);

        //color of windows
        Paint window = new Paint();
        int windowCol = Color.rgb(0,191,255);
        window.setColor(windowCol);
        window.setStyle(Paint.Style.FILL);

        //color of leaves on top of the pineapple
        Paint leaves = new Paint();
        leaves.setColor(Color.GREEN);
        leaves.setStyle(Paint.Style.FILL);

        //draw pineapple
        canvas.drawArc(this.x, this.y, this.x + 300.0f, this.y + 700.0f, 180, 180, true, spongeHouse);
        //draw leaves
        canvas.drawOval(this.x + 60.0f, this. y - 100.0f, this.x + 120.0f, this.y + 50.0f, leaves);
        canvas.drawOval(this.x + 120.0f, this. y - 100.0f, this.x + 180.0f, this.y + 50.0f, leaves);
        canvas.drawOval(this.x + 180.0f, this. y - 100.0f, this.x + 240.0f, this.y + 50.0f, leaves);
        //draw door
        canvas.drawArc(this.x + 80.0f, this.y + 250.0f, this.x + 220.0f, this.y + 450.0f, 180, 180, true, pineappleFrame);
        //draw window
        canvas.drawOval(this.x + 60.0f, this.y + 80.0f, this.x + 140.0f, this. y + 160.0f, pineappleFrame);
        canvas.drawOval(this.x + 80.0f, this.y + 100.0f, this.x + 120.0f, this.y + 140.0f, window);
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
     * updateColor - Updates the color value to the given rgb color arguments.
     *
     * @param upRed
     * @param upGreen
     * @param upBlue
     */
    @Override
    public void updateColor(int upRed, int upGreen, int upBlue) {
        int newSpongeHouseCol = Color.rgb(upRed, upGreen, upBlue);
        this.spongeHouse.setColor(newSpongeHouseCol);
        this.spongeHouse.setStyle(Paint.Style.FILL);
    }

    /**
     * containsPoint - Checks if the coordinate contains a SpongeHouse object drawn o=
     * on the canvas.
     *
     * @param xcoord
     * @param ycoord
     * @return true/false
     */
    @Override
    public boolean containsPoint(float xcoord, float ycoord) {
        if(xcoord >= this.x && xcoord <= this.x + 300.0f ) {
            if(ycoord >= this.y - 100.0f && ycoord <= this.y + 450.0f) {
                return true;
            }
        }

        return false;
    }

}
