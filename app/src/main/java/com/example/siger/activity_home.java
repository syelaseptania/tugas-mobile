package com.example.siger;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_home extends AppCompatActivity implements View.OnClickListener {
    public CardView card1 , card2 , card3 , card4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.c1 :
                i = new Intent(this,Activity_Negeri.class);
                startActivity(i);
                break;

            case R.id.c2 :
                i = new Intent (this,Activity_Swasta.class);
                startActivity(i);
                break;


        }
    }

}