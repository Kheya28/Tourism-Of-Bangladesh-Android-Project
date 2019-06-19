package com.example.tourismofbangladesh;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AlertDialog.Builder alertDialogBuilder;
    Intent intent;
    TextView textView;
    Button dhk,ctg,sylt,khulna,mymen,rajsha,barishal,rangpur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dhk=findViewById(R.id.dhaka_id);
        ctg=findViewById(R.id.ctg_id);
        sylt=findViewById(R.id.slt_id);
        khulna=findViewById(R.id.khulna_id);
        mymen=findViewById(R.id.mymen_id);
        rajsha=findViewById(R.id.raj_id);
        barishal=findViewById(R.id.barisal_id);
        rangpur=findViewById(R.id.rang_id);

        dhk.setOnClickListener(this);
        ctg.setOnClickListener(this);
        sylt.setOnClickListener(this);
        khulna.setOnClickListener(this);
        mymen.setOnClickListener(this);
        rajsha.setOnClickListener(this);
        barishal.setOnClickListener(this);
        rangpur.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.dhaka_id)
        {
            intent=new Intent(MainActivity.this,second_Activity.class);
            intent.putExtra("name","Dhaka");
            startActivity(intent);
        }

        if(v.getId()==R.id.ctg_id)
        {
            intent=new Intent(MainActivity.this,second_Activity.class);
            intent.putExtra("name","Chittagong");
            startActivity(intent);

        }

        if(v.getId()==R.id.slt_id)
        {
            intent=new Intent(MainActivity.this,second_Activity.class);
            intent.putExtra("name","Sylhet");
            startActivity(intent);

        }

        if(v.getId()==R.id.khulna_id)
        {
            intent=new Intent(MainActivity.this,second_Activity.class);
            intent.putExtra("name","Khulna");
            startActivity(intent);

        }

        if(v.getId()==R.id.mymen_id)
        {
            intent=new Intent(MainActivity.this,second_Activity.class);
            intent.putExtra("name","Mymensingh");
            startActivity(intent);

        }

        if(v.getId()==R.id.raj_id)
        {
            intent=new Intent(MainActivity.this,second_Activity.class);
            intent.putExtra("name","Rajshahi");
            startActivity(intent);

        }

        if(v.getId()==R.id.barisal_id)
        {
            intent=new Intent(MainActivity.this,second_Activity.class);
            intent.putExtra("name","Barishal");
            startActivity(intent);

        }

        if(v.getId()==R.id.rang_id)
        {
            intent=new Intent(MainActivity.this,second_Activity.class);
            intent.putExtra("name","Rangpur");
            startActivity(intent);

        }
    }

    @Override
    public void onBackPressed() {

        alertDialogBuilder=new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("alertdialog");
        //alertDialogBuilder.setIcon(R.drawable.tour);
        alertDialogBuilder.setMessage("Do u want to exit?");
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alertDialogBuilder.setNeutralButton("Cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }
}
