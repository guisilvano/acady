package com.example.acady.data.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.example.acady.data.util.DBOpenHelper;
import com.example.acady.data.model.ModalidadeAlunoModel;

import java.util.ArrayList;
import java.util.List;

public class ModalidadeAlunoDAO extends com.example.acady.data.dao.AbstractDAO {

    /*******************************************************
     *         CONSTRUTOR DA CLASSE
     * *******************************************************/

    public ModalidadeAlunoDAO(Context context) {

        db_helper = new DBOpenHelper(context);

    }

    /*******************************************************
     * ALIMENTA A ARRAY colunas COM AS COLUNAS DO MODELO
     * *******************************************************/

    private final String[]
            colunas =
            {

                    ModalidadeAlunoModel.COLUNA_ID,
                    ModalidadeAlunoModel.COLUNA_COD_MODALIDADE,
                    ModalidadeAlunoModel.COLUNA_COD_PLANOS,
                    ModalidadeAlunoModel.COLUNA_COD_GRADUACAO,
                    ModalidadeAlunoModel.COLUNA_DATA

            };


    /*******************************************************
     *                   METODO INSERT
     * *******************************************************/

    public Long Insert( final ModalidadeAlunoModel model){

        long rowAffect = 0;

        try{

            Open();

            ContentValues values = new ContentValues();
            values.put(ModalidadeAlunoModel.COLUNA_COD_MODALIDADE, model.getId_modalidadeAluno());
            values.put(ModalidadeAlunoModel.COLUNA_COD_PLANOS, model.getId_planoAluno());
            values.put(ModalidadeAlunoModel.COLUNA_COD_GRADUACAO, model.getId_graduacaoAluno());
            values.put(ModalidadeAlunoModel.COLUNA_DATA, model.getDataCriacao());

            rowAffect = db.insert(ModalidadeAlunoModel.TABELA_NOME, null, values);

        } finally {


            Close();

        }

        return rowAffect;
    }

    /*******************************************************
     *                   METODO SELECT
     * *******************************************************/

    public List<ModalidadeAlunoModel> Select(){

        List<ModalidadeAlunoModel> arl_dados = new ArrayList<ModalidadeAlunoModel>();

        try {

            Open();
            Cursor cursor = db.query(ModalidadeAlunoModel.TABELA_NOME, colunas, null,null,null,null,null);
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

    private ModalidadeAlunoModel CursorToStructure (final Cursor cursor){

        ModalidadeAlunoModel model = new ModalidadeAlunoModel();
        model.setId(cursor.getLong(0));
        model.setId_modalidadeAluno(cursor.getInt(1));
        model.setId_planoAluno(cursor.getInt(2));
        model.setId_graduacaoAluno(cursor.getInt(3));
        model.setDataCriacao(cursor.getString(4));

        return model;

    }

}
