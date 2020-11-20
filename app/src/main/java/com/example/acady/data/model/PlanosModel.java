package com.example.acady.data.model;

public class PlanosModel {

    /*******************************************************
     *         CONSTRUTOR DA CLASSE
     * *******************************************************/
    public PlanosModel(){

    }

    public PlanosModel (final String nomePlano) {

        this.nomePlano = nomePlano;

    }

    /*******************************************************
     *         ATRIBUTOS DO BANCO DE DADOS
     * *******************************************************/

    public static final String

            TABELA_NOME = "tb_planos";

    public static final String
            COLUNA_ID = "_id",
            COLUNA_NOME = "nome_plano",
            COLUNA_COD_MODALIDADE = "id_modalidade",
            COLUNA_DATA = "data_criacao";


    /*******************************************************
     *                  CREATE TABLE tb_planos
     * *******************************************************/

    public static final String
            CREATE_TABLE =
            "create table " + TABELA_NOME
                    + "("
                    + COLUNA_ID + " integer primary key autoincrement, "
                    + COLUNA_NOME + " text not null, "
                    + COLUNA_COD_MODALIDADE + " integer not null, "
                    + COLUNA_DATA + " text not null );";

    /*******************************************************
     *                 DELETE TABLE
     * *******************************************************/

    public static final String
            DROP_TABLE = "drop table if exists " + TABELA_NOME + ";";



    /*******************************************************
     *                 ATRIBUTOS DA CLASSE PLANOS
     * *******************************************************/

    private long id;
    private int id_modalidade;
    private String nomePlano;
    private String dataCriacao;

    /*******************************************************
     *                 GETERS E SETERS
     * *******************************************************/

    public long getId() {
        return id;
    }

    public int getId_modalidade() {
        return id_modalidade;
    }

    public void setId_modalidade(int id_modalidade) {
        this.id_modalidade = id_modalidade;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

}
