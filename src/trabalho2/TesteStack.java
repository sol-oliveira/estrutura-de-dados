
package trabalho2;

import java.util.Scanner;
import java.util.Stack;

public class TesteStack {
    
    public void teste()
    {
       String pergunta;
      
       Stack <String> pilha = new Stack<String>();

        Scanner l = new Scanner(System.in);
  
        limpar();
        pilha.push("JAVA");
        pilha.push("DEITEL");
        pilha.push("GUEDES");
        pilha.push("AOO");

        System.out.println(" TESTE \n");
        System.out.println(" Testando estrutura Pilha(Stack)\n");
        System.out.println(" Essa é a nossa estrutura Pilha de livros:\n"
                + " A maneira mais fácil de visualizar uma pilha é pensar em\n"
                + " uma pilha de objetos.\n"
                + " nossa estrutura PILHA está preenchida com 04 livors \n");
     
        System.out.println(pilha);      
    

        System.out.println(" Você só terá acesso ao primeiro objeto\n"
                + " se tirar os objetos de cima dessa objeto \n."
                + " Seguindo esse conceito,digite o nome de qual livro\n"
                + " será removido da nossa estrutura PILHA?\n");

        pergunta = l.next();
        
        System.out.println();
        System.out.println("Primeiro objeto(livro) ser removido: ");
        pilha.peek();
        pilha.pop();
        System.out.println("\nLivros que ainda estão na pilha:  ");
        System.out.println(pilha);        
        System.out.println("Segundo objeto(livro) ser removido: ");
        pilha.pop();
        System.out.println("\nLivros que ainda estão na pilha:   ");
        System.out.println(pilha);
        System.out.println("Terceiro objeto(livro) ser removido: ");
        pilha.pop();
        System.out.println("\nLivros que ainda estão na pilha:  ");
        System.out.println(pilha);
        System.out.println("Quarto objeto(livro) ser removido: ");
        pilha.pop();
        System.out.println("\nLivros que ainda estão na pilha:  ");
        System.out.println(pilha);

        limpar();
       
    }

      public void limpar() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
        }
      
     }
    
    
}


    
    
    
    

