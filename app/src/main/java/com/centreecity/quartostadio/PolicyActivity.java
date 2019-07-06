package com.centreecity.quartostadio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PolicyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

    }


    public void Agreed(View view) {


            Intent intent1 =new Intent(this,MainActivity.class);
            startActivity(intent1);





    }
}
