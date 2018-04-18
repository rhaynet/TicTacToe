package com.example.android.tictactoe;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class versus_human_activity extends AppCompatActivity {
    public static String playerTwo;
    public static String playerOne;
    private EditText editText;
    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_with_human);
        editText=findViewById(R.id.playerTwo);
        editText1=findViewById(R.id.playerOne);

        onSelectBoard3();
        onSelectBoard5();
    }


    private void onSelectBoard3(){
        Button button = findViewById(R.id.board_3);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                if (String.valueOf(editText.getText()).isEmpty() || String.valueOf(editText1.getText()).isEmpty()) {

                    Toast.makeText(versus_human_activity.this, "Enter players Name", Toast.LENGTH_SHORT).show();
                } else {

                    playerOne= String.valueOf(editText1.getText());
                    playerTwo= String.valueOf(editText.getText());
                    Intent intent = new Intent(versus_human_activity.this,board_size_3x3_versus_human.class);
                    startActivity(intent);
                }
            }
        });

    }


    private void onSelectBoard5(){

        Button button = findViewById(R.id.board_5);



        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (String.valueOf(editText.getText()).isEmpty() || String.valueOf(editText1.getText()).isEmpty()) {

                    Toast.makeText(versus_human_activity.this, "Enter players Name", Toast.LENGTH_SHORT).show();
                } else {

                    playerOne= String.valueOf(editText1.getText());
                    playerTwo= String.valueOf(editText.getText());
                    Intent intent = new Intent(versus_human_activity.this, board_size_5x5_versus_human.class);
                    startActivity(intent);

                }
            }
        });

    }

}
