package me.andersonmelo.bancodedadossqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{

            //Criar banco de dados
            SQLiteDatabase bancoDados = openOrCreateDatabase("app,", MODE_PRIVATE, null);

            //Criar tabela
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas ( id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, idade INT(3) )");
            //apagar tabela pessoas
            //bancoDados.execSQL("DROP TABLE pessoas ");

            //Inserir dados
            //bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Joao', 70)");
            //bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Pedro', 0)");

            //Atualizar dados
            //bancoDados.execSQL("UPDATE pessoas SET idade = 29 WHERE nome = 'Anderson' ");
            //bancoDados.execSQL("UPDATE pessoas SET idade = 29, nome = 'Anderson Melo' WHERE nome = 'Anderson'");
            //bancoDados.execSQL("UPDATE pessoas SET idade = 60, nome = 'Joao' WHERE id = 3");
            //bancoDados.execSQL(" DELETE FROM pessoas WHERE id = 1");
            bancoDados.execSQL(" DELETE FROM pessoas");

            //Recuperar pessoas
            /*String consulta =
                    "SELECT nome, idade FROM pessoas " +
                            "WHERE nome = 'Pedro' AND idade = 0";*/

            /*String consulta =
                    "SELECT nome, idade FROM pessoas " +
                            "WHERE idade >= 30 OR idade = 28";*/

            /*String consulta =
                    "SELECT nome, idade FROM pessoas " +
                            "WHERE nome IN ('Pedro')";*/

            /*String consulta =
                    "SELECT nome, idade FROM pessoas " +
                            "WHERE idade BETWEEN 0 AND 40";*/

            /*String consulta =
                    "SELECT nome, idade FROM pessoas " +
                            "WHERE nome LIKE '%mar%' ";*/

            /*String filtro = "mar";
            String consulta =
                    "SELECT nome, idade FROM pessoas " +
                            "WHERE nome LIKE '%" + filtro + "%' ";*/

            /*String consulta =
                    "SELECT nome, idade FROM pessoas " +
                            "WHERE 1=1 ORDER BY nome ASC LIMIT 3 ";*/

            /*String consulta =
                    "SELECT id, nome, idade FROM pessoas " +
                            "WHERE 1=1 ORDER BY idade ";*/

            String consulta =
                    "SELECT * FROM pessoas " +
                            "WHERE 1=1 ORDER BY idade ";

            Cursor cursor = bancoDados.rawQuery(consulta, null);

            //Indices da tabela
            int indiceID = cursor.getColumnIndex("id");
            int indiceNome = cursor.getColumnIndex("nome");
            int indiceIdade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();
            while (cursor != null){

                String id = cursor.getString(indiceID);
                String nome = cursor.getString(indiceNome);
                String idade = cursor.getString(indiceIdade);

                Log.i("RESULTADO - / ID: "+ id +" nome ", nome + " / idade: " + idade );
                cursor.moveToNext();
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
