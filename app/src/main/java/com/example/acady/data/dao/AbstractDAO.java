package com.example.acady.data.dao;

import android.database.sqlite.SQLiteDatabase;

import com.example.acady.data.util.DBOpenHelper;

public class AbstractDAO {

    /*******************************************************
     *                  ATRIBUTOS
     * *******************************************************/

    protected SQLiteDatabase db;
    protected DBOpenHelper db_helper;


    /*******************************************************
     *                   METODOS
     * *******************************************************/


    protected final void Open(){

        //recebe instancia do banco de dados

        db = db_helper.getWritableDatabase();

    }
    protected final void Close(){

        //fecha a conexão com o banco de dados

        db_helper.close();

    }

}
