package com.example.live.molviproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {

    private Button login, reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_login_register);

        Initialize();
    }


    protected void Initialize(){
        login = (Button) findViewById(R.id.login);
        reg = (Button) findViewById(R.id.register);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
//                    Class ourClass = Class.forName("com.example.live.molviproject.Login_Activity");
//                    Intent ourIntent = new Intent(getBaseContext(), ourClass);
//                    startActivity(ourIntent);
                    Intent i = new Intent(getBaseContext(), Login_Activity.class);
                    startActivity(i);
                    finish();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
//                    Class ourClass = Class.forName("com.example.live.molviproject.Register_Activity");
//                    Intent ourIntent = new Intent(getBaseContext(), ourClass);
                    Intent i = new Intent(getBaseContext(), Register_Activity.class);
                    startActivity(i);
                    finish();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }



    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Leave application?");
        alertDialog.setMessage("Are you sure you want to leave the application?");
        alertDialog.setIcon(R.drawable.auth);
        alertDialog.setPositiveButton("YES",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                });
        alertDialog.setNegativeButton("NO",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        alertDialog.show();

        return;
    }


}
