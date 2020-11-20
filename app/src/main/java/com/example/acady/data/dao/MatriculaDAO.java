package com.example.acady.data.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.example.acady.data.util.DBOpenHelper;
import com.example.acady.data.model.MatriculaModel;


import java.util.ArrayList;
import java.util.List;

public class MatriculaDAO extends com.example.acady.data.dao.AbstractDAO {


    /*******************************************************
     *         CONSTRUTOR DA CLASSE
     * *******************************************************/

    public MatriculaDAO(Context context) {

        db_helper = new DBOpenHelper(context);

    }

    /*******************************************************
     * ALIMENTA A ARRAY colunas COM AS COLUNAS DO MODELO
     * *******************************************************/

    private final String[]
            colunas =
            {

                    MatriculaModel.COLUNA_ID,
                    MatriculaModel.COLUNA_COD_ALUNO,
                    MatriculaModel.COLUNA_DATA,
                    MatriculaModel.COLUNA_VENCIMENTO,
                    MatriculaModel.COLUNA_ENCERRAMENTO

            };




    /*******************************************************
     *                   METODO INSERT
     * *******************************************************/

    public Long Insert( final MatriculaModel model){

        long rowAffect = 0;

        try{

            Open();

            ContentValues values = new ContentValues();
            values.put(MatriculaModel.COLUNA_COD_ALUNO, model.getId_aluno());
            values.put(MatriculaModel.COLUNA_DATA, model.getData());
            values.put(MatriculaModel.COLUNA_VENCIMENTO, model.getVencimento());
            values.put(MatriculaModel.COLUNA_ENCERRAMENTO, model.getEncerramento());


            rowAffect = db.insert(MatriculaModel.TABELA_NOME, null, values);

        } finally {


            Close();

        }

        return rowAffect;
    }


    /*******************************************************
     *                   METODO SELECT
     * *******************************************************/

    public List<MatriculaModel> Select(){

        List<MatriculaModel> arl_dados = new ArrayList<MatriculaModel>();

        try {

            Open();
            Cursor cursor = db.query(MatriculaModel.TABELA_NOME, colunas, null,null,null,null,null);
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

    private MatriculaModel CursorToStructure (final Cursor cursor){

        MatriculaModel model = new MatriculaModel();
        model.setId(cursor.getLong(0));
        model.setId_aluno(cursor.getInt(1));
        model.setData(cursor.getString(2));
        model.setVencimento(cursor.getString(3));
        model.setEncerramento(cursor.getString(4));

        return model;

    }



}
