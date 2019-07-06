package com.centreecity.quartostadio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UserActivity extends AppCompatActivity {

    EditText editTextUsername;
    EditText editTextName;
    EditText editTextLastname;
    Button buttonProceed;

    DatabaseReference databaseUser;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_user);

            databaseUser = FirebaseDatabase.getInstance().getReference("User");

             editTextUsername = (EditText) findViewById(R.id.editTextUsername);
             editTextName = (EditText) findViewById(R.id.editTextName);
             editTextLastname = (EditText) findViewById(R.id.editTextLastname);
             buttonProceed = (Button)findViewById(R.id.buttonProceed);

            buttonProceed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    addUser();
                }

            });

        }

    public void addUser() {

            String username = editTextUsername.getText().toString().trim();
            String name = editTextName.getText().toString().trim();
            String lastname = editTextLastname.getText().toString().trim();

            if(!TextUtils.isEmpty(name)){


                Intent intent =new Intent(this,LogoutActivity.class);
                startActivity(intent);

            } else {
                Toast.makeText(this, "You should enter a name", Toast.LENGTH_SHORT).show();
            }


    }
}


