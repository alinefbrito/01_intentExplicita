package com.exercicos.aulas.exercicio01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //constantes devem ser declaradas sempre em CAIXA ALTA
    //define a constante que será utilizada como chave
    public final static String EXTRA_MESSAGE = ".MESSAGE";

    //declara um elemento edit Text
    EditText elemento_edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instância local do elemento EditText que contem o valor a ser utilizado
        elemento_edit = findViewById(R.id.edit_message);
    }

    /**
     * Chamado no click no botão
     */
    public void sendMessage(View view) {
        //Instancia a Intent
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        //recupera o valor do elemento já instanciado
        String message = elemento_edit.getText().toString();

        //adiciona o valor ao parâmetro
        intent.putExtra(EXTRA_MESSAGE, message);

        //inicia a Intent
        startActivity(intent);
    }

}