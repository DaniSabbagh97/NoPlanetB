package com.example.dani.noplanetb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BLogin extends AppCompatActivity {
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_blogin );
        btnLogin = findViewById( R.id.btnGo );
        btnLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), BMain.class);
                startActivity(i);

            }
        } );
    }
}
