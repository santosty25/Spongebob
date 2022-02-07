package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class PatrickHouse {

    private float x;
    private float y;
    private int red;
    private int green;
    private int blue;
    private Paint patHouse = new Paint();

    public PatrickHouse(float initX, float initY) {
        this.x = initX;
        this.y = initY;
        this.red = 139;
        this.green = 69;
        this.blue = 19;

        int patHouseCol = Color.rgb(this.red, this.green, this.blue);
        this.patHouse.setColor(patHouseCol);
        this.patHouse.setStyle(Paint.Style.FILL);
    }

    public void drawPatHouse(Canvas canvas) {
        canvas.drawArc(this.x, this.y, this.x + 300.0f, this.y + 300.0f, 180, 180, true, patHouse);
    }

}
