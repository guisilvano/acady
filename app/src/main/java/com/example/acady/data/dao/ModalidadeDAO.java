package com.example.acady.data.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.example.acady.data.util.DBOpenHelper;
import com.example.acady.data.model.ModalidadeModel;

import java.util.ArrayList;
import java.util.List;

public class ModalidadeDAO extends com.example.acady.data.dao.AbstractDAO {

    /*******************************************************
     *         CONSTRUTOR DA CLASSE
     * *******************************************************/

    public ModalidadeDAO(Context context) {

        db_helper = new DBOpenHelper(context);

    }

    /*******************************************************
     * ALIMENTA A ARRAY colunas COM AS COLUNAS DO MODELO
     * *******************************************************/

    private final String[]
            colunas =
            {
                    ModalidadeModel.COLUNA_ID,
                    ModalidadeModel.COLUNA_NOME,
                    ModalidadeModel.COLUNA_DATA
            };



    /*******************************************************
     *                   METODO INSERT
     * *******************************************************/

    public Long Insert( final ModalidadeModel model){

        long rowAffect = 0;

        try{

            Open();

            ContentValues values = new ContentValues();
            values.put(ModalidadeModel.COLUNA_NOME, model.getNomeModalidade());
            values.put(ModalidadeModel.COLUNA_DATA, model.getDataCriacao());

            rowAffect = db.insert(ModalidadeModel.TABELA_NOME, null, values);
            System.out.println("Insert: " + rowAffect);


        } finally {

            Close();

        }

        return rowAffect;
    }

    /*******************************************************
     *                   METODO SELECT
     * *******************************************************/

    public List<ModalidadeModel> Select(){

        List<ModalidadeModel> arl_dados = new ArrayList<ModalidadeModel>();

        try {

            Open();
            Cursor cursor = db.query(ModalidadeModel.TABELA_NOME, colunas, null,null,null,null,null);
            cursor.moveToFirst();

            while (!cursor.isAfterLast()){
                arl_dados.add(CursorToStructure(cursor));
                cursor.moveToNext();
            }
            cursor.close();

        }   finally {

            Close();
        }

        return arl_dados;

    }

    /*******************************************************
     *  METODO CursorToStructure (alimenta a lista da classe)
     * *******************************************************/

    private ModalidadeModel CursorToStructure (final Cursor cursor){

        ModalidadeModel model = new ModalidadeModel();

        model.setId(cursor.getLong(0));
        model.setNomeModalidade(cursor.getString(1));
        model.setDataCriacao(cursor.getString(2));

        return model;

    }

}
