package br.com.marcogorak.exemploactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    //Declarando atributos da classe
    Intent it;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        //Associando os elementos da tela com os atributos da classe
        txt = (TextView)findViewById(R.id.txtTexto);

        it = getIntent();
        Cliente cliente = it.getParcelableExtra("cliente");

        if (cliente != null) {
            String texto = String.format("Nome: %s / Código: %d", cliente.nome, cliente.codigo);
            txt.setText(texto);
        } else {
            String nome = it.getStringExtra("nome");
            int idade = it.getIntExtra("idade", -1);
            txt.setText(String.format("Nome: %s / Idade: %d", nome,idade));
        }


    }
}
