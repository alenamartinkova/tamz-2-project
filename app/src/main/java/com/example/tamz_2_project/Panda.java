package com.example.tamz_2_project;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Panda {
    public static int MAX_HEALTH = 100;
    public static int MAX_FUN = 100;
    public static int MAX_HAPPINESS = 100;
    public static int MAX_LOVE = 100;
    
    public int x, y;
    private Health health;
    private Happiness happiness;
    private Fun fun;
    private Love love;
    public Bitmap logo;

    Panda(Resources res, int screenX, int screenY) {
        this.logo = BitmapFactory.decodeResource(res, R.drawable.panda);
        this.logo = Bitmap.createScaledBitmap(logo, 400, 400, false);
        this.health = new Health(screenX, screenY);
        this.love = new Love(screenX, screenY);
        this.fun = new Fun(screenX, screenY);
        this.happiness = new Happiness(screenX, screenY);
    }

    public void draw(Canvas canvas, Paint paint) {
        canvas.drawBitmap(this.logo, this.x, this.y, paint);
        this.health.draw(canvas);
        this.love.draw(canvas);
        this.fun.draw(canvas);
        this.happiness.draw(canvas);
    }
}