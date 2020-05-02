package com.exercicos.aulas.exercicio01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.exercicos.aulas.exercicio01.R.id.linear_layout;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //recupera o valor enviado
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //define um novo elemento TextView
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        //O elemento criado será adicionado ao Layout.
        //O layout Linear não necessita definição do posicionamento
        LinearLayout ll =(LinearLayout)findViewById(linear_layout);
        ll.addView(textView);
    }
}