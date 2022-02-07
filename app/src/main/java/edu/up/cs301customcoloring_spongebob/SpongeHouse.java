package edu.up.cs301customcoloring_spongebob;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Canvas;


public class SpongeHouse {

        private float x;
        private float y;
        private Paint spongeHouse = new Paint();
        private int red;
        private int blue;
        private int green;

        public SpongeHouse(float initX, float initY) {
            this.x = initX;
            this.y = initY;
            this.red = 255;
            this.green = 140;
            this.blue = 0;

            int spongeHouseColor = Color.rgb(this.red, this.green, this.blue);
            this.spongeHouse.setColor(spongeHouseColor);
            this.spongeHouse.setStyle(Paint.Style.FILL);
        }

        public void drawSpongeHouse(Canvas canvas) {

            Paint pineappleFrame = new Paint();
            int frame = Color.rgb(173,216,230);
            pineappleFrame.setColor(frame);
            pineappleFrame.setStyle(Paint.Style.FILL);

            Paint window = new Paint();
            int windowCol = Color.rgb(0,191,255);
            window.setColor(windowCol);
            window.setStyle(Paint.Style.FILL);

            Paint leaves = new Paint();
            leaves.setColor(Color.GREEN);
            leaves.setStyle(Paint.Style.FILL);

            //draw pineapple
            canvas.drawArc(this.x, this.y, this.x + 300.0f, this.y + 700.0f, 180, 180, true, spongeHouse);
            //draw leaves
            canvas.drawOval(this.x + 60.0f, this. y - 100.0f, this.x + 120.0f, this.y + 50.0f, leaves);
            canvas.drawOval(this.x + 120.0f, this. y - 100.0f, this.x + 180.0f, this.y + 50.0f, leaves);
            canvas.drawOval(this.x + 180.0f, this. y - 100.0f, this.x + 240.0f, this.y + 50.0f, leaves);
            //draw door
            canvas.drawArc(this.x + 80.0f, this.y + 250.0f, this.x + 220.0f, this.y + 450.0f, 180, 180, true, pineappleFrame);
            //draw window
            canvas.drawOval(this.x + 60.0f, this.y + 80.0f, this.x + 140.0f, this. y + 160.0f, pineappleFrame);
            canvas.drawOval(this.x + 80.0f, this.y + 100.0f, this.x + 120.0f, this.y + 140.0f, window);
        }
}