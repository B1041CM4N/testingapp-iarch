package com.example.iarch.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class AppetitExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appetit_example);
        /* Button lButton;
        EditText emailEditText;
        EditText passEditText; */
        View vista = new View(this);
        System.out.println("VISTA DATA: " + vista.toString());
        Toast.makeText(this, "Este es un msg de ejemplo", Toast.LENGTH_LONG).show();
        // textSender(vista);
    }

    /* public void textSender(View v){
        public void onClick(v){
            Button lButton = (Button)findViewById(R.id.button4);
            EditText emailEditText = (EditText)findViewById(R.id.editText2);
            EditText passEditText = (EditText)findViewById(R.id.editText3);
        }
    } */
}
