package org.example.models;

import java.util.Date;

public class livroModel {

    private long livroId;
    private String autor;
    private  String titulo;
    private double valor;
    private clienteModel locadoPara;
    private Date dataLocado;
    private Date dataLancamento;

    public livroModel(long livroId, String autor, String titulo, double valor, clienteModel locadoPara, Date dataLocado, Date dataLancamento) {
        this.livroId = livroId;
        this.autor = autor;
        this.titulo = titulo;
        this.valor = valor;
        this.locadoPara = locadoPara;
        this.dataLocado = dataLocado;
        this.dataLancamento = dataLancamento;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public long getLivroId() {
        return livroId;
    }

    public void setLivroId(long livroId) {
        this.livroId = livroId;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public clienteModel getLocadoPara() {
        return locadoPara;
    }

    public void setLocadoPara(clienteModel locadoPara) {
        this.locadoPara = locadoPara;
    }

    public Date getDataLocado() {
        return dataLocado;
    }

    public void setDataLocado(Date dataLocado) {
        this.dataLocado = dataLocado;
    }

    @Override
    public String toString() {
        return "livroModel{" +
                "livroId=" + livroId +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", valor=" + valor +
                ", locadoPara=" + locadoPara +
                ", dataLocado=" + dataLocado +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}
