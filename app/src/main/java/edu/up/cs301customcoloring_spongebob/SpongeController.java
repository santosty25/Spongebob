package edu.up.cs301customcoloring_spongebob;

import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * SpongeController - This class represents the controller for the SeekBar
 * and the SurfaceView using OnSeekBarChangeListener and OnTouchListener.
 * The touch listener will track which element was touched and adjust
 * the seekbars to the element's rgb values. The seekbars will
 * adjust a certain rgb color value and change the element's color
 * which will be shown on the canvas.
 *
 * @author Tyler Santos
 * @version Spring 2022 - 2/8/22
 */
public class SpongeController implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    private TextView updateMe = null;
    private TextView updateRed = null;
    private TextView updateGreen = null;
    private TextView updateBlue = null;
    private Drawing drawing;
    private Spongebob spongebob;
    private SpongeHouse pineapple;
    private PatrickHouse boulder;
    private SquidHouse squidHouse;
    private Patrick patrick;
    private Sun theSun;
    private DrawCanvas element;
    private SurfaceView updateCan = null;
    private SeekBar redSB = null;
    private SeekBar blueSB = null;
    private SeekBar greenSB = null;

    /**
     * SponegController - Constructor that initializes the instance variables.
     *
     * @param initTV
     * @param initRedTV
     * @param initGreenTV
     * @param initBlueTV
     * @param canvas
     * @param initDrawing
     * @param initRed
     * @param initGreen
     * @param initBlue
     */
    public SpongeController(TextView initTV, TextView initRedTV, TextView initGreenTV, TextView initBlueTV,
                            SurfaceView canvas, Drawing initDrawing, SeekBar initRed, SeekBar initGreen,
                            SeekBar initBlue) {
        this.updateMe = initTV;
        this.drawing = initDrawing.getDrawing();
        this.updateRed = initRedTV;
        this.updateGreen = initGreenTV;
        this.updateBlue = initBlueTV;
        this.spongebob = this.drawing.getSponge();
        this.pineapple = this.drawing.getSpongeHouse();
        this.boulder = this.drawing.getPatHouse();
        this.squidHouse = this.drawing.getSquidHouse();
        this.patrick = this.drawing.getPatrick();
        this.theSun = this.drawing.getSun();
        this.redSB = initRed;
        this.blueSB = initBlue;
        this.greenSB = initGreen;

    }

    /**
     * onProgressChanged - Changes the progress of the seekbar when the
     * seekbar is being used.
     *
     * @param seekBar
     * @param progress
     * @param fromUser
     */
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        /**
         External Citation
         Date: 7 February 2022
         Problem: Could not get the id of the given seekbar
         to compare with the rgb seekbars.
         Resource:
         https://www.tabnine.com/code/java/methods/android.widget.SeekBar/getId
         Solution: I used the example code from this post.
         */
        //Checks which seekbar is being used.
        if(seekBar.getId() == (R.id.redSB)) {
            element.setRed(progress);
            Log.d("bar", "" + progress);
            this.updateRed.setText("" + progress);
        }
        else if(seekBar.getId() == (R.id.greenSB)) {
            element.setGreen(progress);
            this.updateGreen.setText("" + progress);
        }
        else if(seekBar.getId() ==  (R.id.blueSB)) {
            element.setBlue(progress);
            this.updateBlue.setText("" + progress);
        }

        drawing.invalidate();
    }

    /**
     * onStartTrackingTouch - Method is not being used.
     *
     * @param seekBar
     */
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //not used
    }

    /**
     * onStopTrackingTouch - Method is not being used.
     *
     * @param seekBar
     */
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //not used
    }

    /**
     * onTouch - Checks which element is being touched and
     * sets the seekbars to the rgb values according to
     * the element.
     *
     * @param view
     * @param motionEvent
     */
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();

        /**
         External Citation
         Date: 7 February 2022
         Problem: Could not figure out how to set text for
         the TextView outside of activity_main.xml.
         Resource:
         https://www.youtube.com/watch?v=LmEjBJJ-iX0
         Solution: I used the example code from this post.
         */
        //Checks which element got touched and sets the
        //text of elementTV to the name of the element
        //that was touched.
        if (spongebob.containsPoint(x, y) == true) {
            this.element = spongebob;
            updateMe.setText("Spongebob");
        }
        else if(pineapple.containsPoint(x, y) == true) {
            this.element = pineapple;
            updateMe.setText("Spongebob's House");
        }
        else if(boulder.containsPoint(x, y) == true) {
            this.element = boulder;
            updateMe.setText("Patrick's House");
        }
        else if(squidHouse.containsPoint(x, y) == true) {
            this.element = squidHouse;
            updateMe.setText("Squidward's House");
        }
        else if(patrick.containsPoint(x, y) == true) {
            this.element = patrick;
            updateMe.setText("Patrick");
        }
        else if(theSun.containsPoint(x, y) == true) {
            this.element = theSun;
            updateMe.setText("Sun");
        }

        //get the rgb values of the element
        int red = this.element.getRed();
        int green = this.element.getGreen();
        int blue = this.element.getBlue();

        //set the seekbars progress to the element's rgb color values
        this.redSB.setProgress(red);
        this.greenSB.setProgress(green);
        this.blueSB.setProgress(blue);

        drawing.invalidate();
        return true;
    }
}
