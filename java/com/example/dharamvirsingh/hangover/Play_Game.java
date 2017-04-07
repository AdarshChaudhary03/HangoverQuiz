package com.example.dharamvirsingh.hangover;


        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.Toast;

public class Play_Game extends AppCompatActivity implements View.OnClickListener {

    ImageView iv1,iv2,iv3,iv4,iv5,iv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play__game);

        iv1 = (ImageView)findViewById(R.id.iv1);
        iv2 = (ImageView)findViewById(R.id.iv2);
        iv3 = (ImageView)findViewById(R.id.iv3);
        iv4 = (ImageView)findViewById(R.id.iv4);
        iv5 = (ImageView)findViewById(R.id.iv5);
        iv6 = (ImageView)findViewById(R.id.iv6);

        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);
        iv4.setOnClickListener(this);
        iv5.setOnClickListener(this);
        iv6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.iv1:
                Toast.makeText(Play_Game.this, "Welcome To Bollywood..!!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Play_Game.this,Bollywood_List.class);
                startActivity(i);
                break;
            case R.id.iv2:
                Toast.makeText(Play_Game.this, "Welcome To Hollywood..!!", Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(Play_Game.this,Hollywood_List.class);
                startActivity(i1);
                break;
            case R.id.iv3:
                Toast.makeText(Play_Game.this, "Welcome To Tollywood..!!", Toast.LENGTH_SHORT).show();
                Intent i2 = new Intent(Play_Game.this,Tollywood_List.class);
                startActivity(i2);
                break;
            case R.id.iv4:
                Toast.makeText(Play_Game.this, "Welcome To Tv Series..!!", Toast.LENGTH_SHORT).show();
                Intent i3 = new Intent(Play_Game.this,Tv_Series_List.class);
                startActivity(i3);
                break;
            case R.id.iv5:
                Toast.makeText(Play_Game.this, "Welcome To Music..!!", Toast.LENGTH_SHORT).show();
                Intent i4 = new Intent(Play_Game.this,Music_List.class);
                startActivity(i4);
                break;
            case R.id.iv6:
                Toast.makeText(Play_Game.this, "Thanks For Playing..!!", Toast.LENGTH_SHORT).show();
                Intent i5 = new Intent(Play_Game.this,MainActivity.class);
                startActivity(i5);
                break;


        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
