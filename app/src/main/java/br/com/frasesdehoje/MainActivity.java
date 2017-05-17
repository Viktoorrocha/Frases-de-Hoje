package br.com.frasesdehoje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView TextoNovaFrase;
    private Button botaoNovaFrase;

    private  String[]  frases = {"teste","teste2"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextoNovaFrase = (TextView) findViewById(R.id.TextoNovaFraseId);
        botaoNovaFrase = (Button)findViewById(R.id.botaoNovaFraseId);

        TextoNovaFrase.setText(frases[1]);


    }
}
