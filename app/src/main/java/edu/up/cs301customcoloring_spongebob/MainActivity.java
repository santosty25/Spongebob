package edu.up.cs301customcoloring_spongebob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * MainActivity - A class that represents the framework
 * of the user interface.
 *
 * @author Tyler Santos
 * @version Spring 2022 - 2/8/22
 */
public class MainActivity extends AppCompatActivity {

    private SeekBar redSB;
    private SeekBar greenSB;
    private SeekBar blueSB;

    /**
     * onCreate - Creates an activity.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create View objects
        Drawing drawRef = findViewById(R.id.canvasDraw);
        TextView redTV = findViewById(R.id.redValueTV);
        TextView greenTV = findViewById(R.id.greenValueTV);
        TextView blueTV = findViewById(R.id.blueValueTV);
        TextView elTV = findViewById(R.id.elementTV);
        SurfaceView canvas = findViewById(R.id.canvasDraw);
        this.redSB = (SeekBar)findViewById(R.id.redSB);
        this.greenSB = (SeekBar)findViewById(R.id.greenSB);
        this.blueSB = (SeekBar)findViewById(R.id.blueSB);

        SpongeController controller = new SpongeController(elTV, redTV, greenTV, blueTV, drawRef,
                drawRef, this.redSB, this.greenSB, this.blueSB);

        //Set listeners
        drawRef.setOnTouchListener(controller);

        canvas.setOnTouchListener(controller);

        redSB.setOnSeekBarChangeListener(controller);

        greenSB.setOnSeekBarChangeListener(controller);

        blueSB.setOnSeekBarChangeListener(controller);


    }
}