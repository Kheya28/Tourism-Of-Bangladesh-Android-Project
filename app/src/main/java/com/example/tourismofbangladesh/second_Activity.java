package com.example.tourismofbangladesh;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class second_Activity extends AppCompatActivity {

    AlertDialog.Builder alertDialogBuilder;
    Intent intent;
    TextView textView;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        textView=findViewById(R.id.text2);
        listView=findViewById(R.id.list);


        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String name=bundle.getString("name");
            show(name);
        }
    }

    void show(String name)
    {
        if(name.equals("Dhaka"))
        {
            textView.setText("Dhaka");
            final String[] names=getResources().getStringArray(R.array.dhaka_name);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(second_Activity.this,R.layout.sample_view,R.id.text3,names);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s=names[position];

                    Toast.makeText(second_Activity.this,s+" "+position,Toast.LENGTH_SHORT).show();
                    if(s.equals("Lalbagh Fort")){

                    intent=new Intent(second_Activity.this,third_Activity.class);
                    intent.putExtra("name1",s);
                    startActivity(intent);}
                }
            });

        }

        if(name.equals("Chittagong"))
        {
            textView.setText("Chittagong");
            final String[] names=getResources().getStringArray(R.array.ctg_name);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(second_Activity.this,R.layout.sample_view,R.id.text3,names);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s=names[position];

                    intent=new Intent(second_Activity.this,third_Activity.class);
                    intent.putExtra("name1",s);
                    startActivity(intent);

                }
            });

        }

        if(name.equals("Sylhet"))
        {
            textView.setText("Sylhet");
            final String[] names=getResources().getStringArray(R.array.syl_name);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(second_Activity.this,R.layout.sample_view,R.id.text3,names);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s=names[position];

                    intent=new Intent(second_Activity.this,third_Activity.class);
                    intent.putExtra("name1",s);
                    startActivity(intent);

                }
            });

        }

        if(name.equals("Khulna"))
        {
            textView.setText("Khulna");
            final String[] names=getResources().getStringArray(R.array.khul_name);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(second_Activity.this,R.layout.sample_view,R.id.text3,names);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s=names[position];

                    intent=new Intent(second_Activity.this,third_Activity.class);
                    intent.putExtra("name1",s);
                    startActivity(intent);

                }
            });

        }

        if(name.equals("Mymensingh"))
        {
            textView.setText("Mymensingh");
            final String[] names=getResources().getStringArray(R.array.mymen_name);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(second_Activity.this,R.layout.sample_view,R.id.text3,names);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s=names[position];

                    intent=new Intent(second_Activity.this,third_Activity.class);
                    intent.putExtra("name1",s);
                    startActivity(intent);

                }
            });

        }

        if(name.equals("Rajshahi"))
        {
            name.equals("Rajshahi");
            final String[] names=getResources().getStringArray(R.array.raj_name);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(second_Activity.this,R.layout.sample_view,R.id.text3,names);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s=names[position];

                    intent=new Intent(second_Activity.this,third_Activity.class);
                    intent.putExtra("name1",s);
                    startActivity(intent);

                }
            });

        }

        if(name.equals("Barishal"))
        {
            textView.setText("Barishal");
            final String[] names=getResources().getStringArray(R.array.bari_name);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(second_Activity.this,R.layout.sample_view,R.id.text3,names);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s=names[position];

                    intent=new Intent(second_Activity.this,third_Activity.class);
                    intent.putExtra("name1",s);
                    startActivity(intent);

                }
            });

        }

        if(name.equals("Rangpur"))
        {
            textView.setText("Rangpur");
            final String[] names=getResources().getStringArray(R.array.rang_name);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(second_Activity.this,R.layout.sample_view,R.id.text3,names);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s=names[position];

                    intent=new Intent(second_Activity.this,third_Activity.class);
                    intent.putExtra("name1",s);
                    startActivity(intent);

                }
            });

        }
    }


}
