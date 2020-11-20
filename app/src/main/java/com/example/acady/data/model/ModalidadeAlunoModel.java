package com.example.acady.data.model;

public class ModalidadeAlunoModel {

        /*******************************************************
         *         CONSTRUTOR DA CLASSE
         * *******************************************************/

        public ModalidadeAlunoModel ( ){


        }


        /*******************************************************
         *         ATRIBUTOS DO BANCO DE DADOS
         * *******************************************************/

        public static final String

                TABELA_NOME = "tb_modalidade_aluno";


        public static final String

                COLUNA_ID = "_id",
                COLUNA_COD_ALUNO = "id_aluno",
                COLUNA_COD_MODALIDADE = "id_modalidade",
                COLUNA_COD_PLANOS = "id_plano",
                COLUNA_COD_GRADUACAO = "id_graduacao",
                COLUNA_DATA = "data_criacao";




        /*******************************************************
         *              CREATE TABLE MODALIDADE ALUNO
         * *******************************************************/

        public static final String

                CREATE_TABLE =

                "create table " + TABELA_NOME

                        + "("
                        + COLUNA_ID + " integer primary key autoincrement, "
                        + COLUNA_COD_ALUNO + " integer not null,"
                        + COLUNA_COD_MODALIDADE + " integer not null, "
                        + COLUNA_COD_PLANOS + " integer not null, "
                        + COLUNA_COD_GRADUACAO + " integer not null, "
                        + COLUNA_DATA + " text not null );";



        /*******************************************************
         *                 DELETE TABLE
         * *******************************************************/

        public static final String

                DROP_TABLE = "drop table if exists " + TABELA_NOME + ";";



        /*******************************************************
         *         ATRIBUTOS DA CLASSE MODALIDADE ALUNO
         * *******************************************************/


        private long id;
        private int id_aluno;
        private int id_modalidadeAluno;
        private int id_planoAluno;
        private int id_graduacaoAluno;
        private String dataCriacao;



        /*******************************************************
         *                 GETERS E SETERS
         * *******************************************************/


        public int getId_aluno() {
                return id_aluno;
        }

        public void setId_aluno(int id_aluno) {
                this.id_aluno = id_aluno;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public int getId_modalidadeAluno() {
                return id_modalidadeAluno;
        }

        public void setId_modalidadeAluno(int id_modalidadeAluno) {
                this.id_modalidadeAluno = id_modalidadeAluno;
        }

        public int getId_planoAluno() {
                return id_planoAluno;
        }

        public void setId_planoAluno(int id_planoAluno) {
                this.id_planoAluno = id_planoAluno;
        }

        public int getId_graduacaoAluno() {
                return id_graduacaoAluno;
        }

        public void setId_graduacaoAluno(int id_graduacaoAluno) {
                this.id_graduacaoAluno = id_graduacaoAluno;
        }

        public String getDataCriacao() {
                return dataCriacao;
        }

        public void setDataCriacao(String dataCriacao) {
                this.dataCriacao = dataCriacao;
        }
}
