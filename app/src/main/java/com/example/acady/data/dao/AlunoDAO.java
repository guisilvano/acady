package com.example.acady.data.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.example.acady.data.util.DBOpenHelper;
import com.example.acady.data.model.AlunoModel;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO extends com.example.acady.data.dao.AbstractDAO {

    /*******************************************************
     *         CONSTRUTOR DA CLASSE
     * *******************************************************/

    public AlunoDAO (Context context) {

        db_helper = new DBOpenHelper(context);

    }

    /*******************************************************
     * ALIMENTA A ARRAY colunas COM AS COLUNAS DO MODELO
     * *******************************************************/

    private final String[]
    colunas =
    {
            AlunoModel.COLUNA_ID,
            AlunoModel.COLUNA_NOME,
            AlunoModel.COLUNA_DATA,
            AlunoModel.COLUNA_SEXO,
            AlunoModel.COLUNA_TELEFONE,
            AlunoModel.COLUNA_EMAIL,
            AlunoModel.COLUNA_OBSERVACAO,
            AlunoModel.COLUNA_ENDERECO,
            AlunoModel.COLUNA_NUMERO,
            AlunoModel.COLUNA_COMPLEMENTO,
            AlunoModel.COLUNA_BAIRRO,
            AlunoModel.COLUNA_CIDADE,
            AlunoModel.COLUNA_UF,
            AlunoModel.COLUNA_PAIS,
            AlunoModel.COLUNA_CEP


    };


    /*******************************************************
     *                   METODO INSERT
     * *******************************************************/

    public Long Insert( final AlunoModel model){

        long rowAffect = 0;

        try{

            Open();

            ContentValues values = new ContentValues();
            values.put(AlunoModel.COLUNA_NOME, model.getNome());
            values.put(AlunoModel.COLUNA_DATA, model.getData());
            values.put(AlunoModel.COLUNA_SEXO, model.getSexo());
            values.put(AlunoModel.COLUNA_TELEFONE, model.getTelefone());
            values.put(AlunoModel.COLUNA_EMAIL, model.getEmail());
            values.put(AlunoModel.COLUNA_OBSERVACAO, model.getObservacao());
            values.put(AlunoModel.COLUNA_ENDERECO, model.getEndereco());
            values.put(AlunoModel.COLUNA_NUMERO, model.getNumero());
            values.put(AlunoModel.COLUNA_COMPLEMENTO, model.getComplemento());
            values.put(AlunoModel.COLUNA_BAIRRO, model.getBairro());
            values.put(AlunoModel.COLUNA_CIDADE, model.getCidade());
            values.put(AlunoModel.COLUNA_UF, model.getUf());
            values.put(AlunoModel.COLUNA_PAIS, model.getPais());
            values.put(AlunoModel.COLUNA_CEP, model.getCep());

            rowAffect = db.insert(AlunoModel.TABELA_NOME, null, values);

        } finally {

            Close();

        }

        return rowAffect;
    }

    /*******************************************************
     *                   METODO SELECT
     * *******************************************************/

    public List<AlunoModel> Select(){

        List<AlunoModel> arl_dados = new ArrayList<AlunoModel>();


        try {
            Open();
            Cursor cursor = db.query(AlunoModel.TABELA_NOME, colunas, null,null,null,null,null);
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
     *                   METODO SELECT
     * *******************************************************/

    /*public List<AlunoModel> SelectOnlyName(){

        List<AlunoModel> arl_dados = new ArrayList<AlunoModel>();


        try {
            Open();
            Cursor cursor = db.query(AlunoModel.TABELA_NOME, colunas, null,null,null,null,null);
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

    }*/



    /*******************************************************
     *  METODO CursorToStructure (alimenta a lista da classe)
     * *******************************************************/

    private AlunoModel CursorToStructure (final Cursor cursor){

        AlunoModel model = new AlunoModel();
        model.setId(cursor.getLong(0));
        model.setNome(cursor.getString(1));
        model.setData(cursor.getString(2));
        model.setSexo(cursor.getString(3));
        model.setTelefone(cursor.getString(4));
        model.setEmail(cursor.getString(5));
        model.setObservacao(cursor.getString(6));
        model.setEndereco(cursor.getString(7));
        model.setNumero(cursor.getString(8));
        model.setComplemento(cursor.getString(9));
        model.setBairro(cursor.getString(10));
        model.setCidade(cursor.getString(11));
        model.setUf(cursor.getString(12));
        model.setPais(cursor.getString(13));
        model.setCep(cursor.getString(14));

        return model;

    }
}
