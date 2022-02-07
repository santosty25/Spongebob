package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Patrick {
    private float x;
    private float y;
    private Paint patrick = new Paint();
    private int red;
    private int blue;
    private int green;

    public Patrick(float initX, float initY) {
        this.x = initX;
        this.y = initY;
        this.red = 255;
        this.green = 128;
        this.blue = 139;

        int patCol = Color.rgb(this.red, this.green, this.blue);
        this.patrick.setColor(patCol);
        this.patrick.setStyle(Paint.Style.FILL);
    }

    public void drawPatrick(Canvas canvas) {

        Paint shorts = new Paint();
        int shortsCol = Color.rgb(173,255,47);
        shorts.setColor(shortsCol);
        shorts.setStyle(Paint.Style.FILL);

        Paint pupil = new Paint();
        pupil.setColor(Color.BLACK);
        pupil.setStyle(Paint.Style.FILL);

        //draw body
        canvas.drawOval(this.x, this.y, this.x + 150.0f, this.y + 150.0f, patrick);
        //draw head
        canvas.drawArc(this.x + 40.0f, this.y - 100.0f, this.x + 110.0f, this.y + 170.0f, 180, 180, true, patrick);
        //draw arms
        canvas.drawOval(this.x - 10.0f, this.y + 50.0f, this.x + 10.0f, this.y + 120.0f, patrick);
        canvas.drawOval(this.x + 140.0f, this.y + 50.0f, this.x + 160.0f, this.y + 120.0f, patrick);
        //draw legs
        canvas.drawOval(this.x + 20.0f, this.y + 130.0f, this.x + 60.0f, this.y + 230.0f, patrick);
        canvas.drawOval(this.x + 90.0f, this.y + 130.00f, this.x + 130.0f, this.y + 230.0f, patrick);
        //draw shorts
        canvas.drawArc(this.x, this.y + 70.0f, this.x + 150.0f, this.y + 170.0f, 0, 180, true, shorts);
        //draw eyes
        canvas.drawOval(this.x + 60.0f, this.y - 60.0f, this.x + 70.0f, this.y - 50.0f, pupil);
        canvas.drawOval(this.x + 90.0f, this.y - 60.0f, this.x + 100.0f, this.y - 50.0f, pupil);
    }
}
