package me.andersonmelo.atmconsultoria.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import me.andersonmelo.atmconsultoria.R;
import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_sobre);
        String descricao = "Nullam volutpat risus nec leo commodo, ut interdum diam laoreet. Sed non consequat odio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis! Não sou faixa preta cumpadi, sou preto inteiris, inteiris.\n \n" +
                "Nullam volutpat risus nec leo commodo, ut interdum diam laoreet. Sed non consequat odio. Si u mundo tá muito paradis? Toma um mé que o mundo vai girarzis! Não sou faixa preta cumpadi, sou preto inteiris, inteiris. ";
        View sobre = new AboutPage(this)
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("fale conosco")
                .addEmail("atmconsultoria@gmail.com", "Envie uma mensagem")
                .addWebsite("http://google.com.br", "Acesse nosso site")
                .addGroup("Visite nossas redes sociais")
                .addFacebook("google", "FaceBook")
                .addTwitter("google", "Twitter")
                .addInstagram("google", "Instagram")
                .create();
        setContentView(sobre);
    }
}
