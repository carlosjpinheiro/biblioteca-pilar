package org.example.models;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class clienteModel {

    private long clienteId;
    private  String nome;
    private  Date dataNascimento;
    private  String email;
    private   String telefone;

    public clienteModel(long clienteId, String nome, Date dataNascimento, String email, String telefone) {
        this.clienteId = clienteId;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public long getClienteId() {
        return clienteId;
    }

    public void setClienteId(long clienteId) {
        this.clienteId = clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "clienteModel{" +
                "clienteId=" + clienteId +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
