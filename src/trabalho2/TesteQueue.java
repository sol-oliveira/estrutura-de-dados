
package trabalho2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TesteQueue {
    
    Queue<String> fila = new LinkedList<String>();
    String pergunta;
    Scanner l = new Scanner(System.in);
    
    public void teste()
    {     
         limpar();
        System.out.println(" Testando estrutura Fila(Queue)\n");
         System.out.println(" Essa é a nossa estrutura Fila de passageiros:\n"
                + " A maneira mais fácil de visualizar uma fila é pensar em fila de\n"
                + " clientes em um embarque \n"
                + " nossa estrutura FILA está preenchida com 03 passageiros: ");
        System.out.println();

        fila.offer("Waldir");
        fila.offer("Luiz");
        fila.offer("Carla");
        System.out.println(fila);

        System.out.println();

        System.out.println(" Geralmente em uma fila a próxima pessoa a ser atendida\n"
                + " é aquela que esperou mais tempo seguindo está lógica, \n"
                + " digite o nome de qual passageiro será removido da nossa estrutura FILA?\n");

        pergunta = l.next();

        System.out.println("Primeiro passagerio a ser removido: ");
        System.out.println(fila.poll());
        System.out.println("\nPassageiros que ainda aguardam na fila:  ");
        System.out.println(fila);
        System.out.println("\nSegundo passagerio a ser removido: ");
        System.out.println(fila.poll());
        System.out.println("\nPassageiro(s) que ainda aguardam na fila:  ");
        System.out.println(fila);
        System.out.println("\nÚltimo passagerio a ser removido: ");
        System.out.println(fila.poll());
        System.out.println("\nAplicação do conceito LIFO(Útimo a entrar, último a sair!) ");
        System.out.println("\nFila vazia: ");
        System.out.println(fila);
       
        limpar();
    }
            
    public void limpar() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
        }

    }
    
}
