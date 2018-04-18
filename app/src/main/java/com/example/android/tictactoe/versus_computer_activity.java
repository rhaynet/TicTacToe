package com.example.android.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class versus_computer_activity extends AppCompatActivity {
    public static String sPlayerLetter;
    public static String sComputerLetter;
    public static String sPlayerName;
    private RadioButton RbuttonO;
    private RadioButton RbuttonX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_with_computer);

        onSelectO();
        onSelectX();
        onSelectBoard3();
        onSelectBoard5();
    }

    //Method listens for event on Button X and Assigns it to
    // player through nPl variable;

    private void onSelectX() {
        RbuttonX = findViewById(R.id.x);
        RbuttonX.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                sPlayerLetter = (String) RbuttonX.getText();
                sComputerLetter = (String) RbuttonO.getText();
            }
        });

    }

    //Method listens for event on Button O and Assigns it to
    // player through nPl variable;

    private void onSelectO() {

        RbuttonO = findViewById(R.id.o);
        RbuttonO.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                sPlayerLetter = (String) RbuttonO.getText();
                sComputerLetter = (String) RbuttonX.getText();

            }
        });
    }


    private void onSelectBoard3() {
        Button button = findViewById(R.id.board_3);
        final EditText editText = findViewById(R.id.playerName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (String.valueOf(editText.getText()).isEmpty()) {
                    Toast.makeText(versus_computer_activity.this, "Enter Player Name ", Toast.LENGTH_LONG).show();

                } else if (RbuttonO.isChecked() || RbuttonX.isChecked() && !String.valueOf(editText.getText()).isEmpty()) {
                    sPlayerName = String.valueOf(editText.getText());
                    Intent intent = new Intent(versus_computer_activity.this, board_size_3x3_versus_comp.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(versus_computer_activity.this, "Select X or O", Toast.LENGTH_LONG).show();

                }
            }
        });


    }


    private void onSelectBoard5() {

        Button button = findViewById(R.id.board_5);
        final EditText editText = findViewById(R.id.playerName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (String.valueOf(editText.getText()).isEmpty()) {
                    Toast.makeText(versus_computer_activity.this, "Enter Player Name ", Toast.LENGTH_LONG).show();

                } else if (RbuttonO.isChecked() || RbuttonX.isChecked() && !String.valueOf(editText.getText()).isEmpty()) {
                    sPlayerName = String.valueOf(editText.getText());
                    Intent intent = new Intent(versus_computer_activity.this, board_size_5x5_versus_comp.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(versus_computer_activity.this, "Select X or O", Toast.LENGTH_LONG).show();

                }
            }
        });

    }

}

