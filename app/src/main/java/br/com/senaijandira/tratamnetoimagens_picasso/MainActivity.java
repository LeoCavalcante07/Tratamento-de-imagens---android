package br.com.senaijandira.tratamnetoimagens_picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imgView;
    String urlImagem = "http:10.0.2.2/INF3M20182/TURMAB/Leonardo/PROJETO/modulo_1/imagens/imgMain.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = findViewById(R.id.imgView);

        //Carrega imagem no imageView
        Picasso.get().load(urlImagem).into(imgView);



    }
}
