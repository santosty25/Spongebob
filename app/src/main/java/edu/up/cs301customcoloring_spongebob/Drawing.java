package edu.up.cs301customcoloring_spongebob;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class Drawing extends SurfaceView {

    private Paint ocean = new Paint();
    private Paint sand = new Paint();
    private PatrickHouse rock = new PatrickHouse(200.0f, 500.0f);
    private Spongebob spongeBob = new Spongebob(1400.0f, 500.0f);
    private SpongeHouse pineapple = new SpongeHouse(1600.0f, 300.0f);
    private SquidHouse squid = new SquidHouse(700.0f, 200.0f);
    private Sun sun = new Sun(100.0f, 100.0f);
    private Patrick patrick = new Patrick(500.0f, 600.0f);

    public Drawing(Context context) {
        super(context);
        setWillNotDraw(false);
        initColors();
    }

    public Drawing(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        initColors();
    }

    public Drawing (Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setWillNotDraw(false);
        initColors();
    }

    private void initColors() {
        int oceanColor = Color.rgb(55,176,201);
        this.ocean.setColor(oceanColor);
        this.ocean.setStyle(Paint.Style.FILL);

        int sandColor = Color.rgb(246,215,176);
        this.sand.setColor(sandColor);
        this.sand.setStyle(Paint.Style.FILL);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, 2000.0f, 900.0f, ocean);
        canvas.drawRect(0.0f, 600.0f, 2000.0f, 900.0f, sand);
        rock.drawPatHouse(canvas);
        spongeBob.drawSpongebob(canvas);
        pineapple.drawSpongeHouse(canvas);
        squid.drawSquidHouse(canvas);
        sun.drawSun(canvas);
        patrick.drawPatrick(canvas);

    }
}
