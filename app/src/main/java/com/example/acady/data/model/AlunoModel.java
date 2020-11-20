package com.example.acady.data.model;

public class AlunoModel {

    /*******************************************************
     *         CONSTRUTOR DA CLASSE
     * *******************************************************/

    public AlunoModel(){


    }

    public AlunoModel (

            final String nome,
            final String data,
            final String sexo,
            final String telefone,
            final String email,
            final String observacao,
            final String endereco,
            final String numero,
            final String complemento,
            final String bairro,
            final String cidade,
            final String uf,
            final String pais,
            final String cep
    ) {

        this.nome = nome;
        this.data = data;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.observacao = observacao;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.pais = pais;
        this.cep = cep;



    }

    /*******************************************************
     *         ATRIBUTOS DO BANCO DE DADOS
     * *******************************************************/

    public static final String

    TABELA_NOME = "tb_alunos";

    public static final String
    COLUNA_ID = "_id",
    COLUNA_NOME = "nome",
    COLUNA_DATA = "data",
    COLUNA_SEXO = "sexo",
    COLUNA_TELEFONE = "telefone",
    COLUNA_EMAIL = "email",
    COLUNA_OBSERVACAO = "observacao",
    COLUNA_ENDERECO = "endereco",
    COLUNA_NUMERO = "numero",
    COLUNA_COMPLEMENTO = "complemento",
    COLUNA_BAIRRO = "bairro",
    COLUNA_CIDADE = "cidade",
    COLUNA_UF = "uf",
    COLUNA_PAIS = "pais",
    COLUNA_CEP = "cep";


    /*******************************************************
     *                 CREATE TABLE ALUNO
     * *******************************************************/

    public static final String
            CREATE_TABLE =
            "create table " + TABELA_NOME
                    + "("
                    + COLUNA_ID + " integer primary key autoincrement, "
                    + COLUNA_NOME + " text not null, "
                    + COLUNA_DATA + " text not null, "
                    + COLUNA_SEXO + " text not null, "
                    + COLUNA_TELEFONE + " text not null, "
                    + COLUNA_EMAIL + " text not null, "
                    + COLUNA_OBSERVACAO + " text not null, "
                    + COLUNA_ENDERECO + " text not null, "
                    + COLUNA_NUMERO + " text not null, "
                    + COLUNA_COMPLEMENTO + " text not null, "
                    + COLUNA_BAIRRO + " text not null, "
                    + COLUNA_CIDADE + " text not null, "
                    + COLUNA_UF + " text not null, "
                    + COLUNA_PAIS + " text not null, "
                    + COLUNA_CEP + " text not null "
                    + ");";



    /*******************************************************
     *                 DELETE TABLE
     * *******************************************************/


    public static final String

                DROP_TABLE = "drop table if exists " + TABELA_NOME + ";";




    /*******************************************************
     *                 ATRIBUTOS DA CLASSE ALUNO
     * *******************************************************/


    private long id;
    private String nome;
    private String data;
    private String sexo;
    private String telefone;
    private String email;
    private String observacao;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String pais;
    private String cep;

    /*******************************************************
     *                 GETERS E SETERS
     * *******************************************************/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
