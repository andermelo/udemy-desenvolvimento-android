package me.andersonmelo.listadetarefas.helper;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper extends SQLiteOpenHelper {

    public static int VERSION = 1;
    public static String NOME_DB = "DB_TAREFAS";
    public static String TABELA_TAREFAS = "tarefas";

    public DbHelper(Context context) {
        super(context, NOME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Apenas uma vez quando usuario insalar app

        String sql = "CREATE TABLE IF NOT EXISTS " + TABELA_TAREFAS
                + " (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " nome TEXT NOT NULL ); ";
        try {
            db.execSQL(sql);
            Log.i("INF DB", "Sucesso ao criar a tabela");
        }catch (Exception e){
            Log.i("INFO DB", "Erro ao criar a tabela" + e.getMessage() );
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Apenas para usuario atualizar o app, quando atualiza o valor de VERSION

        String sql = "DROP TABLE IF EXISTS " + TABELA_TAREFAS + " ;";
        //String sql = "ALTER TABLE " + TABELA_TAREFAS + " ADD COLUMN status VARCHAR(2) ;";

        try {
            db.execSQL(sql);
            onCreate(db);
            Log.i("INF DB", "Sucesso ao atualizar a tabela");
        }catch (Exception e){
            Log.i("INFO DB", "Erro ao atualizar a tabela" + e.getMessage() );
        }

    }

}
