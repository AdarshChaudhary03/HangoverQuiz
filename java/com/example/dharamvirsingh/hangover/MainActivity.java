package com.example.dharamvirsingh.hangover;

        import android.content.Intent;
        import android.provider.Settings;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton ib,ib2,ib3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ib = (ImageButton)findViewById(R.id.ib);
        ib2 = (ImageButton)findViewById(R.id.ib2);
        ib3 = (ImageButton)findViewById(R.id.ib3);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Play_Game.class);
                startActivity(i);
            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,About_Activity.class);
                startActivity(i);
            }
        });

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.exit(0);
            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        System.exit(0);
    }

    @Override
    protected void onDestroy() {


        super.onDestroy();
    }
}
