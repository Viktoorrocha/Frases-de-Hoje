package br.com.frasesdehoje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView TextoNovaFrase;
    private Button botaoNovaFrase;

    private  String[]  frases = {
            "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.",
            "O ciumento passa a vida a procurar um segredo, cuja descoberta lhe destruiria a felicidade.",
            "Se um homem não descobriu nada pelo qual morreria, não está pronto para viver.",
            "O progresso do homem não é mais do que uma descoberta gradual de que as suas perguntas não têm significado.",
            "Toda a descoberta da ciência pura é potencialmente subversiva; por vezes a ciência deve ser tratada como um inimigo possível.",
            "A maior descoberta de minha geração é que o ser humano pode alterar a sua vida mudando sua atitude mental.",
            "Descobrir consiste em olhar para o que todo mundo está vendo e pensar uma coisa diferente.",
            "É bem difícil descobrir o que gera a felicidade; pobreza e riqueza falharam nisso.",
            "Acredite em si próprio e chegará um dia em que os outros não terão outra escolha senão acreditar com você.",
            "A pessoa inteligente estuda a vida inteira para descobrir que não tem nada melhor do que dar uma de burro",
            "Procure descobrir o seu caminho na vida.\n" +
                    "Ninguém é responsável por nosso destino, a não ser nós mesmos.",
            "Nunca deixe que lhe digam que não vale a pena\n" +
                    "acreditar no sonho que se tem\n" +
                    "ou que os seus planos nunca vão dar certo\n" +
                    "ou que você nunca vai ser alguém...",
            "Eu acredito, eu luto até o fim: não há como perder, não há como não vencer.",
            "A maioria das pessoas só aprende as lições da vida, depois que a mão dura do destino lhe toca no ombro.",
            "Aprendi com as primaveras a deixar-me cortar e a voltar sempre inteira.",
            "Eu aprendi que para crescer como pessoa preciso me cercar de gente mais inteligente do que eu.",
            "Aprendi que são os pequenos acontecimentos diários que tornam a vida espetacular.",
            "Não sei onde estou indo, só sei que não estou perdido, aprendi a viver um dia de cada vez.",
            "Aprendi que as memórias podem ter uma presença física, quase viva.",
            "Tudo que passamos na vida, de bom ou ruim serve como lição. O ruim se guarda na memória e o bom no coração.",
            "A vida não é o problema é batalha desafio\n" +
                    "Cada obstáculo é uma lição eu anuncio.",
            "A vida é uma escola e é nela onde aprendemos que nada acaba sem termos aprendido a lição."
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextoNovaFrase = (TextView) findViewById(R.id.TextoNovaFraseId);
        botaoNovaFrase = (Button)findViewById(R.id.botaoNovaFraseId);

        //TextoNovaFrase.setText(frases[1]);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);



                TextoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });


    }
}
