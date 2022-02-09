package edu.up.cs301customcoloring_spongebob;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * Drawing - A class that represents a SurfaceView and
 * is where the drawings are drawn.
 *
 * @author Tyler Santos
 * @version Spring 2022 - 2/8/22
 */
public class Drawing extends SurfaceView {

    private Paint ocean = new Paint(); //color of ocean
    private Paint sand = new Paint(); //color of sand
    private PatrickHouse rock = new PatrickHouse(200.0f, 500.0f);  //PatrickHouse object
    private Spongebob spongeBob = new Spongebob(1400.0f, 500.0f); //Spongebob object
    private SpongeHouse pineapple = new SpongeHouse(1600.0f, 300.0f); //SpongebobHouse object
    private SquidHouse squid = new SquidHouse(700.0f, 200.0f); //SquidHouse object
    private Sun sun = new Sun(100.0f, 100.0f); //Sun object
    private Patrick patrick = new Patrick(500.0f, 600.0f); //Patrick object

    /**
     * Drawing - Constructor that takes in a Context object, initializes
     * the colors and calls setWillNotDraw(false).
     *
     * @param context
     */
    public Drawing(Context context) {
        super(context);
        setWillNotDraw(false);
        initColors();
    }

    /**
     * Drawing - Constructor that takes in a Context and AttributeSet
     * object, initializes the colors, and calls setWillNotDraw(false).
     *
     * @param context
     * @param attrs
     */
    public Drawing(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        initColors();
    }

    /**
     * Drawing - Constructor that takes in a Context and AttributeSet
     * object, and an int to define the style attribute, initializes the
     * colors, and calls setWillNotDraw(false).
     *
     * @param context
     * @param attrs
     * @param defStyleAttr
     */
    public Drawing (Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setWillNotDraw(false);
        initColors();
    }

    /**
     * initColors - Initializes the colors of the instance variables in
     * a Drawing object.
     */
    private void initColors() {
        int oceanColor = Color.rgb(55,176,201);
        this.ocean.setColor(oceanColor);
        this.ocean.setStyle(Paint.Style.FILL);

        int sandColor = Color.rgb(246,215,176);
        this.sand.setColor(sandColor);
        this.sand.setStyle(Paint.Style.FILL);
    }

    /**
     * onDraw - Draws on a given canvas.
     * @param canvas
     */
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //draw ocean
        canvas.drawRect(0.0f, 0.0f, 2000.0f, 900.0f, ocean);
        //draw sky
        canvas.drawRect(0.0f, 600.0f, 2000.0f, 900.0f, sand);

        //Draw different elements
        rock.draw(canvas);
        spongeBob.draw(canvas);
        pineapple.draw(canvas);
        squid.draw(canvas);
        sun.draw(canvas);
        patrick.draw(canvas);

    }

    /**
     * getDrawing - Gets a drawing object.
     *
     * @return this
     */
    public Drawing getDrawing() {
        return this;
    }

    /**
     * getPatHouse - Gets a PatrickHouse object
     *
     * @return this.rock
     */
    public PatrickHouse getPatHouse() {
        return this.rock;
    }

    /**
     * getSponge - Gets a Spongebob object.
     *
     * @return this.spongeBob
     */
    public Spongebob getSponge() {
        return this.spongeBob;
    }

    /**
     * getSpongeHouse - Gets a SpongeHouse object.
     *
     * @return this.pineapple
     */
    public SpongeHouse getSpongeHouse() {
        return this.pineapple;
    }

    /**
     * getSquidHouse - Gets a SquidHouse object.
     *
     * @return this.squid
     */
    public SquidHouse getSquidHouse() {
        return this.squid;
    }

    /**
     * getSun - Gets a Sun object.
     *
     * @return this.sun
     */
    public Sun getSun() {
        return this.sun;
    }

    /**
     * getPatrick - Gets a Patrick object.
     *
     * @return this.patrick
     */
    public Patrick getPatrick() {
        return this.patrick;
    }
}
