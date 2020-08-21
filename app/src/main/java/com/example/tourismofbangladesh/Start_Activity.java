package com.example.tourismofbangladesh;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Start_Activity extends AppCompatActivity {


    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_);

        textView=findViewById(R.id.textv);
        button=findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Start_Activity.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu manu)
    {
        getMenuInflater().inflate(R.menu.main,manu);
        return  true;
    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        if(id==R.id.about)
        {
            Intent intent=new Intent(Start_Activity.this,About.class);
            startActivity(intent);
            return  true;
        }

        return true;
    }



}
