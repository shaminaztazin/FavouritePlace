package com.favouriteplace.favouriteplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnPlace1,btnPlace2,btnPlace3,btnPlace4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnPlace1=findViewById(R.id.btn_place1);
        btnPlace2=findViewById(R.id.btn_place2);
        btnPlace3=findViewById(R.id.btn_place3);
        btnPlace4=findViewById(R.id.btn_place4);

        btnPlace1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent (HomeActivity.this,DetailActivity.class);
                intent.putExtra("id","one");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Maldives", Toast.LENGTH_SHORT).show();
            }
        });
        btnPlace2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent (HomeActivity.this,DetailActivity.class);
                intent.putExtra("id","two");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Switzerland", Toast.LENGTH_SHORT).show();
            }
        });
        btnPlace3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent (HomeActivity.this,DetailActivity.class);
                intent.putExtra("id","three");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Nepal", Toast.LENGTH_SHORT).show();
            }
        });
        btnPlace4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent (HomeActivity.this,DetailActivity.class);
                intent.putExtra("id","four");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Bali", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
