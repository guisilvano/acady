package com.example.acady.data.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.acady.data.model.AlunoModel;

public class DBOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NOME = "banco.db";
    private static final int DATABASE_VERSAO = 5;


    public DBOpenHelper (Context context) {

        super(context, DATABASE_NOME, null, DATABASE_VERSAO);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

       // db.execSQL(ModalidadeModel.CREATE_TABLE);

        //db.execSQL(ModalidadeAlunoModel.CREATE_TABLE);

       // db.execSQL(PlanosModel.CREATE_TABLE);

        db.execSQL(AlunoModel.CREATE_TABLE);

        //db.execSQL(MatriculaModel.CREATE_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
/*
        db.execSQL(ModalidadeModel.DROP_TABLE);
        db.execSQL(ModalidadeModel.CREATE_TABLE);


        db.execSQL(ModalidadeAlunoModel.CREATE_TABLE);
        db.execSQL(ModalidadeAlunoModel.DROP_TABLE);

        db.execSQL(PlanosModel.CREATE_TABLE);
        db.execSQL(PlanosModel.DROP_TABLE);

        db.execSQL(MatriculaModel.CREATE_TABLE);
        db.execSQL(MatriculaModel.DROP_TABLE);
*/
        db.execSQL(AlunoModel.CREATE_TABLE);
        db.execSQL(AlunoModel.DROP_TABLE);
    }
}
