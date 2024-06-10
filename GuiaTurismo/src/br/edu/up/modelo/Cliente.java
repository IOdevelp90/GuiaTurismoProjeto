package br.edu.up.modelo;

public class Cliente {
  private String nome;
  private String username;
  private String senha;
  private boolean isAdmin;

  public Cliente(String nome, String username, String senha, boolean isAdmin) {
    this.nome = nome;
    this.username = username;
    this.senha = senha;
    this.isAdmin = isAdmin;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public boolean isAdmin() {
    return isAdmin;
  }

  public void setAdmin(boolean admin) {
    isAdmin = admin;
  }
}
