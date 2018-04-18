package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VsHuman();
        VsComputer();
    }

    private void VsHuman(){
        Button button= findViewById(R.id.human);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,versus_human_activity.class);
                startActivity(intent);
            }
        });

    }


    private void VsComputer(){
        Button button= findViewById(R.id.vsComputer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,versus_computer_activity.class);
                startActivity(intent);
            }
        });

    }
}
