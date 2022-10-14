package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img1, img2;
    Button btnJogar;
    TextView txtVencedor, txtPlacar1, txtPlacar2;
    int cont1 = 0;
    int cont2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = findViewById(R.id.btnJogar);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        txtVencedor = findViewById(R.id.txtVencedor);
        txtPlacar1 = findViewById(R.id.txtPlacar1);
        txtPlacar2 = findViewById(R.id.txtPlacar2);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int jogador1, jogador2;
                int numero1 = new Random().nextInt(3);
                int numero2 = new Random().nextInt(3);
                jogador1 = numero1;
                jogador2 = numero2;

                if(jogador1==1){
                    img1.setImageResource(R.drawable.papel);
                }else {
                    if (jogador1 == 2) {
                        img1.setImageResource(R.drawable.tesoura);
                    }else{
                        img1.setImageResource(R.drawable.pedra);
                    }
                }
                if(jogador2==1){
                    img2.setImageResource(R.drawable.papel2);
                }else {
                    if (jogador2 == 2) {
                        img2.setImageResource(R.drawable.tesoura2);
                    }else{
                        img2.setImageResource(R.drawable.pedra2);
                    }
                }
                if(jogador1==jogador2){
                    txtVencedor.setText("Empatou");
                }else{
                    if (jogador1 == 0){
                        if (jogador2 == 2){
                            txtVencedor.setText("O jogador 1 ganhou");
                            cont1++;
                            txtPlacar1.setText("ganhou "+ cont1 );
                        }else{
                            txtVencedor.setText("O jogador 2 ganhou");
                            cont2++;
                            txtPlacar2.setText("ganhou "+ cont2);
                        }
                    }
                    if (jogador1 == 1){
                        if (jogador2 == 0){
                            txtVencedor.setText("O jogador 1 ganhou");
                            cont1++;
                            txtPlacar1.setText("ganhou "+ cont1);
                        }else{
                            txtVencedor.setText("O jogador 2 ganhou");
                            cont2++;

                            txtPlacar2.setText("ganhou "+ cont2);
                        }
                    }
                    if (jogador1 == 2){
                        if (jogador2 == 1){
                            txtVencedor.setText("O jogador 1 ganhou");
                            cont1++;
                            txtPlacar1.setText("ganhou "+ cont1);
                        }else{
                            txtVencedor.setText("O jogador 2 ganhou");
                            cont2++;
                            String p2 = Integer.toString(cont2);
                            txtPlacar2.setText("ganhou "+ cont2);
                        }
                    }
                }
            }
        });
    };
    }