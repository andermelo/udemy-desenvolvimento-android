package me.andersonmelo.firebaseapp;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.storage.StorageManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.ByteArrayOutputStream;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    //private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    //private FirebaseAuth usuario = FirebaseAuth.getInstance();

    private ImageView imageFoto;
    private Button buttonUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageFoto = findViewById(R.id.imageFoto);
        buttonUpload = findViewById(R.id.buttonUpload);

        buttonUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Configura para imagem ser salva em memória
                imageFoto.setDrawingCacheEnabled(true);
                imageFoto.buildDrawingCache();

                //Recupera bitmap da imagem (image a ser carregada)
                Bitmap bitmap = imageFoto.getDrawingCache();

                //Comprimir bitmap para um formato png/jpeg
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 75, baos );

                //converte o baos para pixel brutos em uma matriz de bytes
                // (dados da imagem)
                byte[] dadosImagem = baos.toByteArray();

                //Define nós para o storage
                StorageReference storageReference = FirebaseStorage.getInstance().getReference();
                StorageReference imagens = storageReference.child("imagens");

                //Download do arquivo
                StorageReference imagemRef = imagens.child("celular.jpeg");
                //usando FirebaseUI
                Glide.with(MainActivity.this)
                        .using(new FirebaseImageLoader())
                        .load(imagemRef)
                        .into(imageFoto);

                //Deletar
                /*StorageReference imagemRef = imagens.child("celular.jpeg");
                imagemRef.delete().addOnFailureListener(MainActivity.this, new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity.this,
                                "Erro ao deletar: " + e.getMessage().toString(),
                                Toast.LENGTH_LONG).show();
                    }
                }).addOnSuccessListener(MainActivity.this, new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(MainActivity.this,
                                "Sucesso em deletar o arquivo",
                                Toast.LENGTH_LONG).show();
                    }
                });*/

                //Adicionar
                //Nome da imagem
                /*String nomeArquivo = UUID.randomUUID().toString();
                StorageReference imagemRef = imagens.child(nomeArquivo + ".jpeg");

                //Retorna objeto que irá controlar o upload
                UploadTask uploadTask = imagemRef.putBytes(dadosImagem);

                uploadTask.addOnFailureListener(MainActivity.this, new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity.this,
                                "Upload da imagem falhou! " + e.getMessage().toString(),
                                Toast.LENGTH_SHORT).show();
                    }
                }).addOnSuccessListener(MainActivity.this, new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        Uri url = taskSnapshot.getUploadSessionUri();
                        Toast.makeText(MainActivity.this,
                                "Sucesso ao fazer upload " + url.toString(),
                                Toast.LENGTH_LONG).show();
                    }
                });*/

            }
        });








        //DatabaseReference usuarios = referencia.child( "usuarios");

        //DatabaseReference usuarioPesquisa = usuarios.child("-LZS36lrf82GGgn5rL7X");
        //Query usuarioPesquisa = usuarios.orderByChild("nome").equalTo("Pedro");
        //Query usuarioPesquisa = usuarios.orderByKey().limitToFirst(3);
        //Query usuarioPesquisa = usuarios.orderByKey().limitToLast(1);
        //Maior ou igual (>=)
        //Query usuarioPesquisa = usuarios.orderByChild("idade").startAt(25);

        //Menor ou igual (<=)
        //Query usuarioPesquisa = usuarios.orderByChild("idade").endAt(28);

        //Entre dois valores
        //Query usuarioPesquisa = usuarios.orderByChild("idade").startAt(0).endAt(18);

        // Filtrar palavras
        /*Query usuarioPesquisa = usuarios.orderByChild("nome").startAt("A").endAt("A" + "\uf8ff" );

        usuarioPesquisa.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                *//*Usuario dadosUsuario = dataSnapshot.getValue(Usuario.class);
                Log.i("Dados usuario: ", "nome: " + dadosUsuario.getNome());*//*
                Log.i("Dados usuario ", dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });*/


        /*Usuario usuario = new Usuario();
        usuario.setNome("Jennifer");
        usuario.setSobrenome("Araújo");
        usuario.setIdade(40);

        //Gerando identificador único com push()
        usuarios.push().setValue( usuario);*/

        //Deslogar usuario
        //usuario.signOut();

        //Logar usuario
        /*usuario.signInWithEmailAndPassword(
                "anderson.91@gmail.com", "a123456b")
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Log.i("signIn", "Sucesso ao logar o usuario");
                        }else {
                            Log.i("signIn", "Erro ao logar o usuario");
                        }
                    }
                });*/

        //Verifica usuario logado
        /*if (usuario.getCurrentUser() != null){
            Log.i("CurrentUser", "Usuario logado");
        }else {
            Log.i("CurrentUser", "Usuario não logado");
        }*/

        //Cadastro de usuario
        /*usuario.createUserWithEmailAndPassword("anderson.91@gmail.com", "a123456b")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Log.i("CreateUser", "Sucesso ao cadastrar o usuario");
                        }else {
                            Log.i("CreateUser", "Erro ao cadastrar o usuario");
                        }
                    }
                });*/



        /*
        //Recuperar dados do firebase
        DatabaseReference usuarios = referencia.child( "usuarios").child("001");
        DatabaseReference produtos = referencia.child( "produtos");

        usuarios.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Log.i("FIREBASE", dataSnapshot.getValue().toString());

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //Salvar dadps mp Firebase

        //referencia.child( "pontos").setValue("100");

        Usuario usuario = new Usuario();
        usuario.setNome("Anderson");
        usuario.setSobrenome("Melo");
        usuario.setIdade(28);

        usuarios.child("001").setValue( usuario );


        // Criando produtos


        Produto produto = new Produto();
        produto.setDescricao("Iphone X");
        produto.setMarca("Apple");
        produto.setPreco(7999.99);

        produtos.child("001").setValue( produto );*/

    }
}
