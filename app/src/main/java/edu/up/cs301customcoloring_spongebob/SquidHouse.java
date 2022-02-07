package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class SquidHouse {
    private float x;
    private float y;
    private Paint squidHouse = new Paint();
    private int red;
    private int blue;
    private int green;

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

    public void drawSquidHouse(Canvas canvas) {
        Paint squidFrame = new Paint();
        int frame = Color.rgb(173,216,230);
        squidFrame.setColor(frame);
        squidFrame.setStyle(Paint.Style.FILL);

        Paint window = new Paint();
        int windowCol = Color.rgb(0,191,255);
        window.setColor(windowCol);
        window.setStyle(Paint.Style.FILL);

        Paint door = new Paint();
        int doorCol = Color.rgb	(210,105,30);
        door.setColor(doorCol);
        door.setStyle(Paint.Style.FILL);

        //draw structure
        canvas.drawRect(this.x, this.y, this.x + 300.0f, this.y + 450.0f, squidHouse);
        //draw door
        canvas.drawArc(this.x + 100.0f, this.y + 350.0f, this.x + 200.0f, this.y + 550.0f, 180, 180, true, door);
        //draw windows
        canvas.drawOval(this.x + 20.0f, this.y + 100.0f, this.x + 120.0f, this.y + 200.0f, squidFrame);
        canvas.drawOval(this.x + 180.0f, this.y + 100.0f, this.x + 280.0f, this.y + 200.0f, squidFrame);
        canvas.drawOval(this.x + 40.0f, this.y + 125.0f, this. x + 100.0f, this.y + 175.0f, window);
        canvas.drawOval(this.x + 200.0f, this.y + 125.0f, this. x + 260.0f, this.y + 175.0f, window);

    }
}
