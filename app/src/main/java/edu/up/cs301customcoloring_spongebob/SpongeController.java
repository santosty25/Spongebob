package edu.up.cs301customcoloring_spongebob;

import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

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

    public SpongeController(TextView initTV, TextView initRedTV, TextView initGreenTV, TextView initBlueTV, SurfaceView canvas, Drawing initDrawing) {
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

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Log.d("bar", "sucess");
        Log.d("id","" + seekBar.getId() + "    " + R.id.redValueTV);
        int red = this.element.getRed();
        int green = this.element.getGreen();
        int blue = this.element.getBlue();

        if(seekBar.getId() == (R.id.redSB)) {
            seekBar.setProgress(progress);
            seekBar.setProgress(red);
        }
        else if(seekBar.getId() == (R.id.greenSB)) {
            seekBar.setProgress(green);
        }
        else if(seekBar.getId() ==  (R.id.blueSB)) {
            seekBar.setProgress(blue);
        }

        Log.d("color", "" + blue);

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

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //not used
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //not used
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.d("touch", "sucess");
        float x = motionEvent.getX();
        float y = motionEvent.getY();


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

        drawing.invalidate();
        return true;
    }

    public DrawCanvas getElement() {
        return this.element;
    }
}
