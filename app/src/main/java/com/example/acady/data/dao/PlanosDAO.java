package com.example.acady.data.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.example.acady.data.util.DBOpenHelper;
import com.example.acady.data.model.PlanosModel;

import java.util.ArrayList;
import java.util.List;

public class PlanosDAO extends com.example.acady.data.dao.AbstractDAO {

    /*******************************************************
     *         CONSTRUTOR DA CLASSE
     * *******************************************************/

    public PlanosDAO(Context context) {

        db_helper = new DBOpenHelper(context);

    }

    /*******************************************************
     * ALIMENTA A ARRAY colunas COM AS COLUNAS DO MODELO
     * *******************************************************/

    private final String[]
            colunas =
            {
                    PlanosModel.COLUNA_ID,
                    PlanosModel.COLUNA_NOME,
                    PlanosModel.COLUNA_DATA
            };


    /*******************************************************
     *                   METODO INSERT
     * *******************************************************/

    public Long Insert( final PlanosModel model){

        long rowAffect = 0;

        try{

            Open();

            ContentValues values = new ContentValues();
            values.put(PlanosModel.COLUNA_NOME, model.getNomePlano());
            values.put(PlanosModel.COLUNA_COD_MODALIDADE, model.getId_modalidade());
            values.put(PlanosModel.COLUNA_DATA, model.getDataCriacao());

            rowAffect = db.insert(PlanosModel.TABELA_NOME, null, values);

        } finally {

            Close();

        }

        return rowAffect;
    }

    /*******************************************************
     *                   METODO SELECT
     * *******************************************************/

    public List<PlanosModel> Select(){

        List<PlanosModel> arl_dados = new ArrayList<PlanosModel>();

        try {

            Open();
            Cursor cursor = db.query(PlanosModel.TABELA_NOME, colunas, null,null,null,null,null);
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

    private PlanosModel CursorToStructure (final Cursor cursor){

        PlanosModel model = new PlanosModel();

        model.setId(cursor.getLong(0));
        model.setNomePlano(cursor.getString(1));
        model.setId_modalidade(cursor.getInt(2));
        model.setDataCriacao(cursor.getString(3));

        return model;

    }



}
