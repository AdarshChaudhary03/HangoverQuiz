package com.example.dharamvirsingh.hangover;

//package com.example.tauphiq.hide__seek;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Hollywood_List extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hollywood__list);

        String level[] = {"Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6", "Level 7", "Level 8", "Level 9", "Level 10", "Level 11", "Level 12", "Level 13", "Level 14", "Level 15", "Level 16", "Level 17", "Level 18", "Level 19", "Level 20"};


        ListAdapter adapter = new CustomAdapter(this,level);
        ListView hollywoodlist = (ListView)findViewById(R.id.hollyList);
        hollywoodlist.setAdapter(adapter);

        hollywoodlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String s = String.valueOf(parent.getItemAtPosition(position));
                switch (s) {
                    case "Level 1":
                        Toast.makeText(Hollywood_List.this, "Level 1 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Hollywood_List.this, HLevel_1.class);
                        startActivity(i);
                        break;
                    case "Level 2":
                        Toast.makeText(Hollywood_List.this, "Level 2 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i1 = new Intent(Hollywood_List.this, HLevel_2.class);
                        startActivity(i1);
                        break;
                    case "Level 3":
                        Toast.makeText(Hollywood_List.this, "Level 3 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i2 = new Intent(Hollywood_List.this, HLevel_3.class);
                        startActivity(i2);
                        break;
                    case "Level 4":
                        Toast.makeText(Hollywood_List.this, "Level 4 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i3 = new Intent(Hollywood_List.this, HLevel_4.class);
                        startActivity(i3);
                        break;
                    case "Level 5":
                        Toast.makeText(Hollywood_List.this, "Level 5 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i4 = new Intent(Hollywood_List.this, HLevel_5.class);
                        startActivity(i4);
                        break;
                    case "Level 6":
                        Toast.makeText(Hollywood_List.this, "Level 6 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i5 = new Intent(Hollywood_List.this, HLevel_6.class);
                        startActivity(i5);
                        break;
                    case "Level 7":
                        Toast.makeText(Hollywood_List.this, "Level 7 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i6 = new Intent(Hollywood_List.this, HLevel_7.class);
                        startActivity(i6);
                        break;
                    case "Level 8":
                        Toast.makeText(Hollywood_List.this, "Level 8 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i7 = new Intent(Hollywood_List.this, HLevel_8.class);
                        startActivity(i7);
                        break;
                    case "Level 9":
                        Toast.makeText(Hollywood_List.this, "Level 9 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i8 = new Intent(Hollywood_List.this, HLevel_9.class);
                        startActivity(i8);
                        break;
                    case "Level 10":
                        Toast.makeText(Hollywood_List.this, "Level 10 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i9 = new Intent(Hollywood_List.this, HLevel_10.class);
                        startActivity(i9);
                        break;
                    case "Level 11":
                        Toast.makeText(Hollywood_List.this, "Level 11 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i10 = new Intent(Hollywood_List.this, HLevel_11.class);
                        startActivity(i10);
                        break;
                    case "Level 12":
                        Toast.makeText(Hollywood_List.this, "Level 12 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i12 = new Intent(Hollywood_List.this, HLevel_12.class);
                        startActivity(i12);
                        break;
                    case "Level 13":
                        Toast.makeText(Hollywood_List.this, "Level 13 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i13 = new Intent(Hollywood_List.this, HLevel_13.class);
                        startActivity(i13);
                        break;
                    case "Level 14":
                        Toast.makeText(Hollywood_List.this, "Level 14 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i14 = new Intent(Hollywood_List.this, HLevel_14.class);
                        startActivity(i14);
                        break;
                    case "Level 15":
                        Toast.makeText(Hollywood_List.this, "Level 15 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i15 = new Intent(Hollywood_List.this, HLevel_15.class);
                        startActivity(i15);
                        break;
                    case "Level 16":
                        Toast.makeText(Hollywood_List.this, "Level 16 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i16 = new Intent(Hollywood_List.this, HLevel_16.class);
                        startActivity(i16);
                        break;
                    case "Level 17":
                        Toast.makeText(Hollywood_List.this, "Level 17 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i17 = new Intent(Hollywood_List.this, HLevel_17.class);
                        startActivity(i17);
                        break;
                    case "Level 18":
                        Toast.makeText(Hollywood_List.this, "Level 18 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i18 = new Intent(Hollywood_List.this, HLevel_18.class);
                        startActivity(i18);
                        break;
                    case "Level 19":
                        Toast.makeText(Hollywood_List.this, "Level 19 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i19 = new Intent(Hollywood_List.this, HLevel_19.class);
                        startActivity(i19);
                        break;
                    case "Level 20":
                        Toast.makeText(Hollywood_List.this, "Level 20 selected",
                                Toast.LENGTH_SHORT).show();
                        Intent i20 = new Intent(Hollywood_List.this, HLevel_20.class);
                        startActivity(i20);
                        break;

                    default:
                }

            }
        });

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this,Play_Game.class);
        startActivity(i);
    }

}
