package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;

/**
 * DrawCanvas - An abstract class that represents a drawing on the canvas.
 *
 * @author Tyler Santos
 * @version Spring 2022 - 2/8/2022
 */
public abstract class DrawCanvas {

    /**
     * draw - An abstract method that will draw an element
     * on a given canvas.
     *
     * @param canvas
     */
    public abstract void draw(Canvas canvas);

    /**
     * getRed - Abstract method that will get the red color value.
     */
    public abstract int getRed();

    /**
     * getGreen - Abstract method that will get the green color value.
     */
    public abstract int getGreen();

    /**
     * getBlue - Abstract method that will get the blue color value.
     */
    public abstract int getBlue();

    /**
     * setRed - Abstract method that sets the red color value.
     *
     * @param initRed
     */
    public abstract void setRed(int initRed);

    /**
     * setGreen - Abstract method that sets the green color value.
     *
     * @param initGreen
     */
    public abstract void setGreen(int initGreen);

    /**
     * setBlue - Abstract method that sets the blue color value.
     *
     * @param initBlue
     */
    public abstract void setBlue(int initBlue);

    /**
     * updateColor - Abstract method that will update the
     * rgb color values of a Paint object.
     *
     * @param upRed
     * @param upGreen
     * @param upBlue
     */
    public abstract void updateColor(int upRed, int upGreen, int upBlue);

    /**
     * containsPoint - Abstract method that checks if a given coordinate
     * is contained within an element.
     *
     * @param xcoord
     * @param ycoord
     */
    public abstract boolean containsPoint(float xcoord, float ycoord);
}
