package br.edu.up.modelo;

public class Cliente {
private String nome;
private String username;
private String senha;
private String isAdmin;
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
public String getIsAdmin() {
    return isAdmin;
}
public void setIsAdmin(String isAdmin) {
    this.isAdmin = isAdmin;
}
public Cliente(String nome, String username, String senha, String isAdmin) {
    this.nome = nome;
    this.username = username;
    this.senha = senha;
    this.isAdmin = isAdmin;
}
@Override
public String toString() {
    return "Cliente [nome=" + nome + ", username=" + username + ", senha=" + senha + ", isAdmin=" + isAdmin + "]";
}






}
