package com.example.live.molviproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by f on 5/21/2016.
 */
public class Register_Activity extends Activity {

    private EditText euname, ename, password;
    private Spinner bloodg, areea;
    private Button submit;

    private String uname, name, pass, bg, area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_register);

        Initialize();
    }

    protected void Initialize(){
        euname = (EditText) findViewById(R.id.editText);
        ename = (EditText) findViewById(R.id.editText2);
        password = (EditText) findViewById(R.id.editTextpassword);
        bloodg = (Spinner) findViewById(R.id.spinnerblood1);
        areea = (Spinner) findViewById(R.id.spinnerblood);
        submit = (Button)findViewById(R.id.Register);

        getValues();
    }

    protected void getValues(){
        uname = euname.getText().toString();
        name = ename.getText().toString();
        pass = password.getText().toString();
//        bg = bloodg.getSelectedItem().toString();
//        area = areea.getSelectedItem().toString();


        Log.e("User", uname);
        Log.e("Name", name);
//        Log.e("Blood Group", bg);
//        Log.e("Area", area);
        Log.e("Password", pass);
    }


    @Override
    public void onBackPressed() {
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
        return;
    }



}
