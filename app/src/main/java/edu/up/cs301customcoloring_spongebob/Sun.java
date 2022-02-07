package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Sun {
    private float x;
    private float y;
    private Paint sun = new Paint();
    private int red;
    private int blue;
    private int green;

    public Sun(float initX, float initY) {
        this.x = initX;
        this.y = initY;
        this.red = 255;
        this.green = 215;
        this.blue = 0;

        int sunCol = Color.rgb(this.red, this.green, this.blue);
        this.sun.setColor(sunCol);
        this.sun.setStyle(Paint.Style.FILL);
    }

    public void drawSun(Canvas canvas) {
        canvas.drawOval(this.x, this.y, this.x + 200.0f, this.y + 200.0f, sun);
    }
}
