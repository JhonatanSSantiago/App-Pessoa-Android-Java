package com.jhonssantiago.pessoa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nometxt, idadetxt, sexotxt, escolaridadetxt, pesotxt, alturatxt;
    private Button botao;
    private TextView pessoaTextVIew;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nometxt = findViewById(R.id.nome);
        idadetxt = findViewById(R.id.idade);
        sexotxt = findViewById(R.id.sexo);
        escolaridadetxt = findViewById(R.id.escolaridade);
        pesotxt = findViewById(R.id.peso);
        alturatxt = findViewById(R.id.altura);
        botao = findViewById(R.id.button);
        pessoaTextVIew = findViewById(R.id.pessoa);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pessoa pessoa = conventerDados();
                AlertDialog dialog = new AlertDialog.Builder(getActivity()).create();
                dialog.setTitle("Alerta");
                dialog.setMessage(pessoa.toString());
                dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        pessoaTextVIew.setVisibility(View.VISIBLE);
                        pessoaTextVIew.setText(pessoa.toString());
                    }
                });
                dialog.show();


            }
        });
    }

    public Context getActivity(){ return this; };

    private Pessoa conventerDados() {
        String nome = nometxt.getText().toString();
        int idade = Integer.parseInt(idadetxt.getText().toString());
        Character sexo = sexotxt.getText().toString().toUpperCase().charAt(0);
        String escolaridade = escolaridadetxt.getText().toString().toLowerCase();
        double peso = Double.parseDouble(pesotxt.getText().toString());
        double altura = Double.parseDouble(alturatxt.getText().toString());
        Pessoa pessoa = new Pessoa(nome, idade, sexo, escolaridade, peso, altura);
        return pessoa;
    }
}