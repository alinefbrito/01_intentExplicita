package com.exercicos.aulas.exercicio01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = ".MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Chamado no click no botão
     */
    public void sendMessage(View view) {
        //Instancia a Intent
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        // Instancia local do elemento que contem o valor a ser utilizado
        EditText editText = (EditText) findViewById(R.id.edit_message);
        //recupera o valor do elemento
        String message = editText.getText().toString();
        //adiciona o valor ao parâmetro
        intent.putExtra(EXTRA_MESSAGE, message);
        //inicia a Intent
        startActivity(intent);
    }
}