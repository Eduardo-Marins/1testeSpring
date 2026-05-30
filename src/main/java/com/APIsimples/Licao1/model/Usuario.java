package com.APIsimples.Licao1.model;

// Esta classe representa um usuário.
// Ela funciona como um molde (modelo) para criar objetos Usuario.
public class Usuario {

    private Integer id;

    // Atributo que armazenará o nome do usuário.
    private String nome;

    // Atributo que armazenará a idade do usuário.
    private Integer idade;

    // Atributo que armazenará o e-mail do usuário.
    private String email;

    // Atributo que armazenará a senha do usuário.
    private String senha;

    // Construtor vazio.
    // O Spring utiliza este construtor para criar objetos automaticamente
    // quando recebe um JSON através do @RequestBody.
    public Usuario() {

    }

    // Construtor completo.
    // Permite criar um objeto Usuario já preenchido.
    public Usuario(Integer id, String nome, Integer idade, String email, String senha) {

        // this.nome representa o atributo da classe.
        // nome representa o parâmetro recebido pelo método.
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
    }

    // Getter do id.
    public Integer getId() {
        return id;
    }

    // Setter do id.
    public void setId(Integer id) {
        this.id = id;
    }

    // Getter do nome.
    // Permite ler o valor do atributo nome.
    public String getNome() {
        return nome;
    }

    // Setter do nome.
    // Permite alterar o valor do atributo nome.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter da idade.
    public Integer getIdade() {
        return idade;
    }

    // Setter da idade.
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    // Getter do email.
    public String getEmail() {
        return email;
    }

    // Setter do email.
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter da senha.
    public String getSenha() {
        return senha;
    }

    // Setter da senha.
    public void setSenha(String senha) {
        this.senha = senha;
    }
}