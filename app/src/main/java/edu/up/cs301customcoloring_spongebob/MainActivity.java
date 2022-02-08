package edu.up.cs301customcoloring_spongebob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar redSB;
    private SeekBar greenSB;
    private SeekBar blueSB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drawing drawRef = findViewById(R.id.canvasDraw);
        TextView redTV = findViewById(R.id.redValueTV);
        TextView greenTV = findViewById(R.id.greenValueTV);
        TextView blueTV = findViewById(R.id.blueValueTV);
        TextView elTV = findViewById(R.id.elementTV);
        SurfaceView canvas = findViewById(R.id.canvasDraw);


        SpongeController controller = new SpongeController(elTV, redTV, greenTV, blueTV, drawRef, drawRef);


        drawRef.setOnTouchListener(controller);

        canvas.setOnTouchListener(controller);


        this.redSB = (SeekBar)findViewById(R.id.redSB);
        redSB.setOnSeekBarChangeListener(controller);


        this.greenSB = (SeekBar)findViewById(R.id.greenSB);
        greenSB.setOnSeekBarChangeListener(controller);


        this.blueSB = (SeekBar)findViewById(R.id.blueSB);
        blueSB.setOnSeekBarChangeListener(controller);


    }
}