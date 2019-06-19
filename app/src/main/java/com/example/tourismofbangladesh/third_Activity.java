package com.example.tourismofbangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class third_Activity extends AppCompatActivity {

    ScrollView scrollView;
    ImageView imageView;
    TextView textV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_);

        imageView=findViewById(R.id.image);
        textV=findViewById(R.id.text5);

        Bundle bundl=getIntent().getExtras();
        if(bundl!=null)
        {
            String name=bundl.getString("name1");
            show1(name);

        }
    }

    void show1(String name)
    {
        if(name.equals("Lalbagh Fort"))
        {
            imageView.setImageResource(R.drawable.gggg);
            textV.setText(R.string.dhaka1);
        }

        if(name.equals("dhaka2"))
        {
            imageView.setImageResource(R.drawable.ic_launcher_background);
            textV.setText(R.string.dhaka2);
        }

    }
}
