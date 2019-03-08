package com.example.dani.noplanetb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BSplash extends AppCompatActivity {
    ImageView ivrocketSplash;
    TextView tvTituloGuay, tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_bsplash );

        ivrocketSplash = findViewById(R.id.ivRocketSplash);
        tvTituloGuay = findViewById(R.id.tvTituloGuay);
        tv3 = findViewById(R.id.tv3);


        Animation fide = AnimationUtils.loadAnimation(
                this,R.anim.prueba);

        ivrocketSplash.startAnimation(fide);
        tvTituloGuay.startAnimation(fide);
        tv3.startAnimation(fide);
        openApp(true);


    }
    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSplash
                        .this, BLogin.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}
