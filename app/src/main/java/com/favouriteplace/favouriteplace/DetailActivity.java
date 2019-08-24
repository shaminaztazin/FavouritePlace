package com.favouriteplace.favouriteplace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imgPlace;
    TextView txtName,txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgPlace=findViewById(R.id.img_place);
        txtName=findViewById(R.id.txt_name);
        txtDescription=findViewById(R.id.txt_description);
        //Receive Data

        String getId=getIntent().getExtras().getString("id");

        if(getId.equals("one"))
        {
            imgPlace.setImageResource(R.drawable.maldives);
            txtName.setText("MALDIVES");
            txtDescription.setText(R.string.place1);
        }
        else if(getId.equals("two"))
        {
            imgPlace.setImageResource(R.drawable.switzerland);
            txtName.setText("SWITZERLAND");
            txtDescription.setText(R.string.place2);
        }
        else if(getId.equals("three"))
        {
            imgPlace.setImageResource(R.drawable.nepal);
            txtName.setText("NEPAL");
            txtDescription.setText(R.string.place3);
        }
        else if(getId.equals("four"))
        {
            imgPlace.setImageResource(R.drawable.bali);
            txtName.setText("BALI");
            txtDescription.setText(R.string.place4);
        }
    }

}
