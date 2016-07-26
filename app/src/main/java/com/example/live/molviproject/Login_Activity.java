package com.example.live.molviproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by f on 5/21/2016.
 */
public class Login_Activity extends Activity {

    private EditText user, pass;
    private Button login;
    private String username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_login);

        Initialize();
    }

    protected void Initialize(){
        user = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValues();
                if(username.equals("")&& password.equals("")){
                    try {
                        Intent ourIntent = new Intent(getBaseContext(), Home_Activity.class);
                        startActivity(ourIntent);
                        finish();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    protected void getValues(){
        username = user.getText().toString();
        password = pass.getText().toString();
    }



    @Override
    public void onBackPressed() {
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
        return;
    }

}
