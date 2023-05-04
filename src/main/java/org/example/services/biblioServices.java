package org.example.services;

import org.example.models.clienteModel;
import org.example.models.livroModel;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class biblioServices {

    //usei uma data fixa porém em um código real retornaria a hora do sistema.
    static Date today = new Date(2023,04,05);

    //calcula a multa passando por cada livro locado para determinado cliente, verificando se passou do prazo e fazendo o calculo, adicionando ao montante da multa
    public static double calculaMulta(clienteModel cliente, livroModel livro, List<livroModel> livrosLista){

        double multa = 0;

        for(livroModel l: livrosLista){
            if (l.getLocadoPara() == cliente) {
                double diff = TimeUnit.DAYS.convert(today.getTime() - l.getDataLocado().getTime(), TimeUnit.MILLISECONDS);
                if(diff > 30) {
                    multa = multa + ((l.getValor() * 0.01) * diff);
                }
            }
        }
        return multa;
    }

    //aqui usei um algoritmo insertion sort que vai percorrendo a lista e posicionando os elementos no lugar correto na area ja percorrida
    public static List<livroModel> ordenaLivros(List<livroModel> livrosLista){

        List<livroModel> novaLista = new ArrayList<>();
        for(livroModel l: livrosLista){
            if(!(l.getDataLancamento().getTime() > today.getTime())){
//                System.out.println(l.getDataLancamento().getTime() > today.getTime());
                novaLista.add(l);
            }
        }
        int tamanho = novaLista.size();
        for(int i = 1; i < tamanho; i++){
            livroModel posicao = novaLista.get(i);
            int j = i - 1;
            while(j >= 0 && (novaLista.get(j).getDataLancamento().getTime() < posicao.getDataLancamento().getTime()) ){
                novaLista.set(j + 1, novaLista.get(j));
                j--;
            }
            novaLista.set(j + 1, posicao);
        }
        return novaLista;

    }

    //este metodo utiliza o Map que gera uma estrutura key:value, armazenando os autores nas keys e uma lista dos titulos de suas obras como value
    public static Map<String, List<String>> agruparLivrosPorAutor(List<livroModel> livros) {
        Map<String, List<String>> livrosPorAutor = new HashMap<>();
        for (livroModel livro : livros) {
            String autor = livro.getAutor();
            if (livrosPorAutor.containsKey(autor)) {
                livrosPorAutor.get(autor).add(livro.getTitulo());
            } else {
                List<String> titulos = new ArrayList<>();
                titulos.add(livro.getTitulo());
                livrosPorAutor.put(autor, titulos);
            }
        }
        return livrosPorAutor;
    }


}
