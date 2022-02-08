package edu.up.cs301customcoloring_spongebob;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

public class Spongebob extends DrawCanvas{
    private float x;
    private float y;
    private Paint sponge = new Paint();
    private int red;
    private int blue;
    private int green;

    public Spongebob(float initX, float initY) {
        this.x = initX;
        this.y = initY;
        this.red = 247;
        this.green = 235;
        this.blue = 98;

        int spongeColor = Color.rgb(this.red, this.green, this.blue);
        this.sponge.setColor(spongeColor);
        this.sponge.setStyle(Paint.Style.FILL);
    }

    @Override
    public void draw(Canvas canvas) {

        updateColor(this.red, this.green, this.blue);
        Log.d("draw", "draw: done ");
        Paint spot = new Paint();
        int spongeSpot = Color.rgb(187,179,34);
        spot.setColor(spongeSpot);
        spot.setStyle(Paint.Style.FILL);

        Paint shirt = new Paint();
        shirt.setColor(Color.WHITE);
        shirt.setStyle(Paint.Style.FILL);

        Paint pants = new Paint();
        int spongePants  = Color.rgb(139,69,19);
        pants.setColor(spongePants);
        pants.setStyle(Paint.Style.FILL);

        Paint shoes = new Paint();
        shoes.setColor(Color.BLACK);
        shoes.setStyle(Paint.Style.FILL);

        Paint tie = new Paint();
        tie.setColor(Color.RED);
        tie.setStyle(Paint.Style.FILL);

        //draw body
        canvas.drawRect(this.x, this.y, this.x + 150.0f, this.y + 150.0f, sponge);
        //daw shirt and pants
        canvas.drawRect(this.x, this.y + 150.0f, this.x + 150.0f, this.y + 200.0f, pants);
        canvas.drawRect(this.x, this.y + 125.0f, this.x + 150.0f, this.y + 150.0f, shirt);
        //draw legs
        canvas.drawRect(this.x + 20.0f, this.y + 200.0f, this.x + 40.0f, this.y + 250.0f, sponge);
        canvas.drawRect(this.x + 110.0f, this.y + 200.0f, this.x + 130.0f, this.y + 250.0f, sponge);
        //draw socks and shoes
        canvas.drawRect(this.x + 20.0f, this.y + 225.0f, this.x + 40.0f, this.y + 250.0f, shirt);
        canvas.drawRect(this.x + 110.0f, this.y + 225.0f, this.x + 130.0f, this.y + 250.0f, shirt);
        canvas.drawOval(this.x, this.y + 250.0f, this.x + 40.0f, this.y + 270.0f, shoes);
        canvas.drawOval(this.x + 110.0f, this.y + 250.0f, this.x + 150.0f, this.y +270.0f, shoes);
        //draw sleeves and arms
        canvas.drawArc(this.x - 20.0f, this.y + 125.0f, this.x, this.y + 150.0f, 180, 180, true, shirt);
        canvas.drawArc(this.x + 150.0f, this.y + 125.0f, this.x + 170.0f, this.y + 150.0f, 180, 180, true, shirt);
        canvas.drawRect(this.x - 20.0f, this.y + 135.0f, this.x, this.y + 200.0f, sponge);
        canvas.drawRect(this.x + 150.0f, this.y +135.0f, this.x + 170.0f, this.y + 200.0f, sponge);
        canvas.drawOval(this.x - 25.0f, this.y + 170.0f, this.x + 5.0f, this.y + 210.0f, sponge);
        canvas.drawOval(this.x + 145.0f, this.y + 170.0f, this.x + 175.0f, this.y + 210.0f, sponge);
        //draw tie
        canvas.drawRect(this.x + 70.0f, this.y + 125.0f, this.x + 80.0f, this.y + 160.0f, tie);
        //draw spots
        canvas.drawOval(this.x + 10.0f, this.y + 20.0f, this. x + 25.0f, this.y + 40.0f, spot);
        canvas.drawOval(this.x + 90.0f, this.y + 110.0f, this.x + 110.0f, this.y + 120.0f, spot);
        canvas.drawOval(this.x + 40.0f, this.y + 80.0f, this.x + 60.0f, this.y + 100.0f, spot);
        //draw eyes
        canvas.drawOval(this.x + 20.0f, this.y + 20.0f, this.x + 60.0f, this.y + 60.0f, shirt);
        canvas.drawOval(this.x + 90.0f, this.y + 20.0f, this.x + 130.0f, this.y + 60.0f, shirt);
        canvas.drawOval(this.x + 100.0f, this.y + 30.0f, this.x + 120.0f, this.y + 50.0f, shoes);
        canvas.drawOval(this.x + 30.0f, this.y + 30.0f, this.x + 50.0f, this.y + 50.0f, shoes);
        //draw mouth
        canvas.drawArc(this.x + 30.0f, this.y + 80.0f, this.x + 120.0f, this.y + 100.0f, 0, 180, true, shoes);
    }

    @Override
    public int getRed() {
        return this.red;
    }

    @Override
    public int getGreen() {
        return this.green;
    }

    @Override
    public int getBlue() {
        return this.blue;
    }

    @Override
    public void setRed(int initRed) {
        this.red = initRed;
    }

    @Override
    public void setGreen(int initGreen) {
        this.green = initGreen;
    }

    @Override
    public void setBlue(int initBlue) {
        this.blue = initBlue;
    }

    @Override
    public void updateColor(int upRed, int upGreen, int upBlue) {
        int newSpongeCol = Color.rgb(upRed, upGreen, upBlue);
        this.sponge.setColor(newSpongeCol);
        this.sponge.setStyle(Paint.Style.FILL);
    }

    @Override
    public boolean containsPoint(float xcoord, float ycoord) {
        if(xcoord >= this.x - 20.0f && xcoord <= this.x + 170.0f ) {
            if(ycoord >= this.y && ycoord <= this.y + 270.0f) {
                return true;
            }
        }

        return false;
    }



}
