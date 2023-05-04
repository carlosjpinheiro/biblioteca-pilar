package org.example;

import org.example.models.clienteModel;
import org.example.models.livroModel;
import org.example.services.biblioServices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //cria objetos de cliente
        clienteModel cliente1 = new clienteModel(1, "Joao", new Date(1990, 1, 01), "joao@bol.com.br", "473216-9874");
        clienteModel cliente2 = new clienteModel(2, "Maria", new Date(1988, 1, 01), "maria@bol.com.br", "4799876-1234");
        //(long clienteId, String nome, Date dataNascimento, String email, String telefone)

        //cria objetos de livros
        livroModel livro1 = new livroModel(1, "Dostoievski", "Crime e Castigo", 50, cliente1, new Date(2023,04,04), new Date(2022,01,01));
        livroModel livro2 = new livroModel(2, "Machado de Assis", "Dom Casmurro", 30, cliente1, new Date(2023,02,01), new Date(2025,01,01));
        livroModel livro3= new livroModel(3, "Clarice Lispector", "Laços de Família", 60, cliente1, new Date(2023,04,24), new Date(2010,01,01));
        livroModel livro4 = new livroModel(4, "George Orwell", "1984", 25, cliente2, new Date(2023,04,01), new Date(2020,01,01));
        livroModel livro5 = new livroModel(5, "Dostoievski", "O Iluminado", 80, cliente2, new Date(2023,01,15), new Date(2015,01,01));
        //(long livroId, String autor, String titulo, double valor, clienteModel locadoPara, Date dataLocado, Date dataLancamento)

        //cria listas e adiciona objetos para simular representação do banco de dados
        List<clienteModel> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        List<livroModel> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        livros.add(livro4);
        livros.add(livro5);

//        biblioServices.calculaMulta(cliente1, livro5, livros);
//        System.out.println(biblioServices.calculaMulta(cliente1, livro5, livros));

//        System.out.println(livros);
        biblioServices.ordenaLivros(livros);

//        System.out.println(biblioServices.ordenaLivros(livros));

        System.out.println(biblioServices.agruparLivrosPorAutor(livros));



    }
}