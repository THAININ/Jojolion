/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jojolion.entidades;

/**
 *
 * @author gusta
 */
public class Usuario {
    private String nomeCompleto;
    private String email;
    private String nomeUsuario;//ou userName
    private String senha;
    private String avatar;
    //construtor

    public Usuario() {
    }

    public Usuario(String nomeCompleto, String email, String nomeUsuario, String senha, String avatar) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.avatar = avatar;
    }
    //metodos
    public void cadastrar(){
        
    }
    public void deletar(){
        
    }
    //gets e sets

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nomeCompleto=" + nomeCompleto + ", email=" + email + ", nomeUsuario=" + nomeUsuario + ", senha=" + senha + ", avatar=" + avatar + '}';
    }
    
}
