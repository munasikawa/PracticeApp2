package com.pensievedesigns.practiceapp2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Toast Message and Edit Text, ImageView, changing Resource, Concatenation, context, getText() and toString()
    public void btnClicked(View v){

        EditText nameEditTxt = findViewById(R.id.nameEditTxt);

        Toast.makeText(this, "Say that again " + nameEditTxt.getText().toString(), Toast.LENGTH_LONG).show();

        ImageView catImageView = findViewById(R.id.catImageView);
        catImageView.setImageResource(R.drawable.cat2);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
