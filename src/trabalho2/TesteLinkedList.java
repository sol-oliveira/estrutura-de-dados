
package trabalho2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLinkedList {
        
    public void teste(){ 
    
        Scanner l = new Scanner(System.in);

        List<String> embarque = new ArrayList<String>();
        
        int posicao = 0;
        String nome;

        limpar();

        System.out.println(" TESTANDO NOSSO LINKEDLIST \n");
        System.out.println(" Essa é a nossa estrutura LinkdList de passageiros:\n");
        System.out.println(" Adicione 03 nomes a sua estrutura LinkdList: \n");

        for (int i = 0; i < 3; i++) {
            nome = l.next();
            embarque.add(i, nome);

            System.out.printf("Posição %d - %s\n", i, embarque.get(i));
        }

        System.out.println("\nComo vimos ao remover um elemento de um objeto LinkdList o tamanho diminuirá \n"
                + "automaticamente.\n Os elementos seguintes deslocarão para preencher os espaços vagos do LinkdList\n"
                + "Vamos fazer ao teste!!\n");

        System.out.println("Esse é o nosso ALinkdList preenchido\n");

        for (String c : embarque) {
            System.out.printf(" Posição %d- %s\n", posicao, c);
            posicao++;
        }

        System.out.printf("Informe a posição a ser excluída:\n");
        posicao = l.nextInt();

        try {
            embarque.remove(posicao);

            System.out.println("Tamanho do LinkdList depois da remoção:  " + embarque.size());

        } catch (IndexOutOfBoundsException e) {
            System.out.printf("\nErro: posição inválida (%s).\n" + e.getMessage());
        }

        posicao = 0;
        System.out.printf("Elementos presente no LinkdList\n");
        for (String c : embarque) {
            System.out.printf("Posição %d- %s\n", posicao, c);
            posicao++;
        }

        limpar();
       
    }
    
    public void limpar() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
        }

    }
    
}
