package com.exercicos.aulas.exercicio01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.exercicos.aulas.exercicio01.R.id.linear_layout;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //recupera A Intent
        Intent intentDisplay = getIntent();
        // recuperao valor de string enviado através da chave
        String messageDisplay = intentDisplay.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //define um novo elemento TextView
        TextView txtView = new TextView(this);
        //define o tamanho da fonte do textView
        txtView.setTextSize(40);
        //define a mensagem de texto do textView
        txtView.setText(messageDisplay);


        //O elemento criado será adicionado ao Layout.
        //O layout Linear não necessita definição do posicionamento
        LinearLayout ll = findViewById(linear_layout);
        ll.addView(txtView);
    }


}