package com.example.tamz_2_project.PandaStats;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.example.tamz_2_project.MainActivity;

public class Love implements Statistics {
    private int width, x, y;

    public Love(int screenX, int screenY) {
        this.width = (int) (screenX * 0.6);
        this.x = (int) (screenX * 0.25);
        this.y = (int) (screenY * 0.65);
    }

    @Override
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);

        paint.setTextSize(40);
        canvas.drawText("Love: ", this.x - 110,(this.y - this.height/2) + 10, paint);
        // Border
        canvas.drawRect(this.x, this.y - this.height, this.x + this.width, this.y, paint);

        // Health
        float healthWidth =((this.width - 2 * this.margin) * (MainActivity.loveStorage / 100));
        int healthHeight = this.height - 2 * this.margin;
        int healthLeft = this.x + this.margin;
        float healthRight = healthLeft + healthWidth;
        int healthBottom = this.y - this.margin;
        int healthTop = healthBottom - healthHeight;

        paint.setColor(Color.GREEN);
        canvas.drawRect(healthLeft, healthTop, healthRight, healthBottom, paint);
    }

    @Override
    public void update() {
        if(MainActivity.loveStorage == 0) {
            MainActivity.loveStorage = 0;
        } else {
            MainActivity.loveStorage -= 0.1;
        }
    }
}
