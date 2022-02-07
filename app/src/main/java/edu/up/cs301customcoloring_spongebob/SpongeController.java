package edu.up.cs301customcoloring_spongebob;

import android.widget.SeekBar;
import android.widget.TextView;

public class SpongeController implements SeekBar.OnSeekBarChangeListener{
    private TextView updateMe = null;

    public SpongeController(TextView initTV) {
        this.updateMe = initTV;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        this.updateMe.setText("" + progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //not used
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //not used
    }
}
