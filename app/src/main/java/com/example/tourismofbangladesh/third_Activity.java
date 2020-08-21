package com.example.tourismofbangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class third_Activity extends AppCompatActivity {

    Button button;
    ScrollView scrollView;
    ImageView imageView;
    TextView textV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_);

        imageView=findViewById(R.id.image);
        textV=findViewById(R.id.text5);
        button=findViewById(R.id.btn_map);

        Bundle bundl=getIntent().getExtras();
        if(bundl!=null)
        {
            String name=bundl.getString("name1");
            show1(name);

        }
    }

    void show1(String name) {

        if (name.equals("Lalbagh Fort")) {
            imageView.setImageResource(R.drawable.lalbag);
            textV.setText(R.string.dhaka1);

        }

        if (name.equals("dhaka2")) {
            imageView.setImageResource(R.drawable.ic_launcher_background);
            textV.setText(R.string.dhaka2);
        }

        if (name.equals("Khan Jahan Ali Bridge")) {

            imageView.setImageResource(R.drawable.rupsa_bridge);
            textV.setText(R.string.rupsa_bridge);
           button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s="Khan";
                    Intent intent=new Intent(third_Activity.this,Google_Map.class);
                    intent.putExtra("name2",s);
                    startActivity(intent);
                }
            });

        }
        if (name.equals("Khan Jahan Ali's Tank")) {
            imageView.setImageResource(R.drawable.khan_tank);
            textV.setText(R.string.khanTank);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s="Khan_Tank";
                    Intent intent=new Intent(third_Activity.this,Google_Map.class);
                    intent.putExtra("name2",s);
                    startActivity(intent);
                }
            });


        }

        if (name.equals("Khulna Shipyard")) {
            imageView.setImageResource(R.drawable.khulna_ship);
            textV.setText(R.string.khulna_shipyeard);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s="Shipyard";
                    Intent intent=new Intent(third_Activity.this,Google_Map.class);
                    intent.putExtra("name2",s);
                    startActivity(intent);
                }
            });

        }

        if (name.equals("Mazar Of Lalon")) {
            imageView.setImageResource(R.drawable.mazar_lalon);
            textV.setText(R.string.mazar_lalon);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s="Mazar";
                    Intent intent=new Intent(third_Activity.this,Google_Map.class);
                    intent.putExtra("name2",s);
                    startActivity(intent);
                }
            });

        }
    }
}
