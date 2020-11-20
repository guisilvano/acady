package com.example.acady.data.model;

public class MatriculaModel {

    /*******************************************************
     *         CONSTRUTOR DA CLASSE
     * *******************************************************/

    public MatriculaModel(){


    }

    public MatriculaModel (final String data, final String vencimento) {

        this.data = data;
        this.vencimento = vencimento;

    }

    /*******************************************************
     *         ATRIBUTOS DO BANCO DE DADOS
     * *******************************************************/

    public static final String

            TABELA_NOME = "tb_matricula";


    public static final String

            COLUNA_ID = "_id",
            COLUNA_COD_ALUNO = "id_aluno",
            COLUNA_DATA = "data",
            COLUNA_VENCIMENTO = "dia_vencimento",
            COLUNA_ENCERRAMENTO = "dia_encerramento";



    /*******************************************************
     *         CREATE TABLE MATRICULA
     * *******************************************************/


    public static final String

            CREATE_TABLE =
            "create table " + TABELA_NOME
                    + "("
                    + COLUNA_ID + " integer primary key autoincrement, "
                    + COLUNA_COD_ALUNO + " integer not null, "
                    + COLUNA_DATA + " text not null, "
                    + COLUNA_VENCIMENTO + " text not null, "
                    + COLUNA_ENCERRAMENTO + " text );";



    /*******************************************************
     *                 DELETE TABLE
     * *******************************************************/

    public static final String

            DROP_TABLE = "drop table if exists " + TABELA_NOME + ";";






    /*******************************************************
     *         ATRIBUTOS DA CLASSE MATRICULA
     * *******************************************************/

    private long id;
    private int id_aluno;
    private String data;
    private String vencimento;
    private String encerramento;

    /*******************************************************
     *                 GETERS E SETERS
     * *******************************************************/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getEncerramento() {
        return encerramento;
    }

    public void setEncerramento(String encerramento) {
        this.encerramento = encerramento;
    }
}
