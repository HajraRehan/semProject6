package com.example.semproj6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signUp_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        EditText name= (EditText) findViewById(R.id.name);
        EditText pass= (EditText) findViewById(R.id.password);
        Button loginbtn = (Button) findViewById(R.id.login1);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 =name.getText().toString();
                String pass1 =pass.getText().toString();

                Intent intent =new Intent(signUp_Activity.this, )
            }
        });

        Button bfacebook = (Button) findViewById(R.id.facebook);
        Button bgoogle = (Button) findViewById(R.id.google);

        bfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intf= new Intent(signUp_Activity.this, textshown.class );
                intf.putExtra

            }
        });
        bgoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intg=new Intent(signUp_Activity.this, );
            }
        });

    }
}