package trabalho2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ClassQueue {

    Queue fila = new LinkedList();

    String carro, pergunta;

    Scanner l = new Scanner(System.in);

    public void utilidade() {
        limpar();
        System.out.println(" UTILIDADE \n");
        System.out.println(" As Filas (QUEUE), são um tipo abstrato de dado,\n"
                + " estruturas de dados dinâmicas que admitem remoção \n"
                + " de elementos e inserção de novos objetos.\n"
                + " Sempre que uma remoção for feita, o primeiro objeto inserido \n na fila é o primeiro a ser removido. \n"
                + " Essa política é conhecida pela sigla FIFO ( First-In-First-Out)\n");
        limpar();
    }

    public void vantagem() {

        limpar();
        System.out.println(" VANTAGEM \n");
        System.out.println(" Usando ARRANJOS: \n"
                + " * Acesso direto indexado a qualquer elemento da lista.\n"
                + " * Economia de memória (não utiliza apontadores)\n\n");

        System.out.println(" Usando APONTADORES: \n"
                + " * Permite inserir ou retirar itens do meio da lista a um custo constante \n"
                + " (importante quando a lista tem de ser mantida em ordem).\n"
                + " * Bom para aplicações em que não existe previsão sobre o crescimento da lista \n"
                + " (o tamanho máximo da lista não precisa ser deﬁnido a priori).");
        limpar();
    }
 
    public void desvantagem() {

        limpar();
        System.out.println(" DESVANTAGEM \n");
        System.out.println(" Utilização de memória extra para armazenar os apontadores.");

        limpar();
    }

    public void funcionamento() {

        limpar();
        System.out.println(" FUNCIONAMENTO \n");
        System.out.println("  Métodos da Interface QUEUE \n\n"
                + " offer() : Insere o elemento  no fim da fila. \n"
                + " remove(): Remove a entrada da frente da fila e retorna. \n"
                + " Se a fila estiver vazia, lança uma NoSuchElementException(Erro!)\n "
                + " poll(): Remove a entrada da frente da fila e a retorna. \n"
                + " retorna null se a fila estiver vazia \n "
                + " peek(): Remove a entrada da frente da fila sem removê-la \n"
                + " retorna null sa a flla estiver vazia \n "
                + " element(): Remove a entrada da frente da fila sem removê-la \n"
                + " Se a fila estiver vazia lança uma NoSuchETementException ");
        limpar();
    }

    public void aplicada() {

        limpar();
        System.out.println(" APLICADAS \n");
        System.out.println(" As filas (queue), são utilizadas em sistemas operacionais para controlar tarefas \n"
                + " que estão esperando por um recurso escasso e para assegurar que as tarefas sejam \n"
                + " executadas na ordem em que foram geradas.\n");

        System.out.println(" Existem várias possibilidades de aplicações para fila. "
                + " Lojas, teatros, centrais de reservas e outros serviços similares normalmente \n"
                + " processam as requisições dos clientes de acordo com o princípio  FIFO.” \n");
        limpar();

    }   

    public void limpar() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
        }

    }

}


