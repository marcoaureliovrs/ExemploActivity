package br.com.marcogorak.exemploactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declarando atributos da classe
    EditText edtTexto;
    Button button;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associando os elementos da tela com os atributos da classe
        edtTexto = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);

        //Implementando o ouvinte de eventos
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //Validando qual o elemento escutado pelo ouvinte
        switch (v.getId()) {
            case R.id.button:
                String texto = edtTexto.getText().toString();
                Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Intent it = new Intent(this, Tela2Activity.class);
                it.putExtra("nome", "Marco");
                it.putExtra("idade", 23);
                startActivity(it);
                break;
            case R.id.button3:
                Cliente cliente = new Cliente(1, "Marco");
                Intent intent = new Intent(this, Tela2Activity.class);
                intent.putExtra("cliente", cliente);
                startActivity(intent);
                break;

        }



    }
}
