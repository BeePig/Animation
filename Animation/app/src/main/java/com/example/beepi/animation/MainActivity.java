package com.example.beepi.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // inflate menu
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.zoomInOut:
                ImageView imageView = (ImageView) findViewById(R.id.imageView1);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);
                imageView.startAnimation(animation);
                return true;

            case R.id.rotate360:
                ImageView image1 = (ImageView) findViewById(R.id.imageView1);
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
                image1.startAnimation(animation);
                return true;
            case R.id.fadeInOut:
                ImageView image2 = (ImageView) findViewById(R.id.imageView1);
                Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                image2.startAnimation(animation2);
                return true;
        }
        return false;
    }
}
