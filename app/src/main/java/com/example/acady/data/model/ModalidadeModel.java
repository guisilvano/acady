package com.example.acady.data.model;

public class ModalidadeModel
{

    /*******************************************************
     *         CONSTRUTOR DA CLASSE
     * *******************************************************/
    public ModalidadeModel(){


    }

    public ModalidadeModel (final String nomeModalidade, final String dataCriacao){

        this.nomeModalidade = nomeModalidade;
        this.dataCriacao = dataCriacao;

    }

    /*******************************************************
     *         ATRIBUTOS DO BANCO DE DADOS
     * *******************************************************/

    public static final String

            TABELA_NOME = "tb_modalidade";

    public static final String
            COLUNA_ID = "_id",
            COLUNA_NOME = "NOME_MODALIDADE",
            COLUNA_DATA = "DATA_CRIACAO";


    /*******************************************************
     *                  CREATE TABLE MODALIDADE
     * *******************************************************/
/*
    public static final String
            CREATE_TABLE =
            "create table " + TABELA_NOME
                    + "("
                    + COLUNA_ID + " integer primary key autoincrement, "
                    + COLUNA_NOME + " text not null, "
                    + COLUNA_DATA + " text not null "
                    + ");";
*/
    /*******************************************************
     *                 DELETE TABLE
     * *******************************************************/

    public static final String
            DROP_TABLE = "drop table if exists " + TABELA_NOME + ";";



    /*******************************************************
     *                 ATRIBUTOS DA CLASSE MODALIDADE
     * *******************************************************/
    private long id;
    private String nomeModalidade;
    private String dataCriacao;

    /*******************************************************
     *                 GETERS E SETERS
     * *******************************************************/


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeModalidade() {
        return nomeModalidade;
    }

    public void setNomeModalidade(String nomeModalidade) {
        this.nomeModalidade = nomeModalidade;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
