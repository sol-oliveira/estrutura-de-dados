
package trabalho2;


import java.util.Scanner;
import java.util.Stack;

public class ClassStack {
              
    public void utilidade() {
        limpar();
        System.out.println(" UTILIDADE \n");
        System.out.println(" As pilhas (STACK), são um tipo abstrato de dado.\n"
                + "O nome “pilha” deriva-se da metáfora de uma pilha de pratos em uma cantina.\n"
                + "Neste caso, as operações envolvem a colocação e retirada de pratos da pilha\n"
                + "Em programação sua propriedade é de que somentente o elemento de\n"
                + "cima pode ser acessado.\n"
                + "Em uma pilha,o elemento de cima é o valor de dado que foi armazenado recentemente\n"                        
                + "Essa política de armazenamento é conhecida como LIFO (Last-In, First-Out)\n"
                + "Último a Entrar Primeiro a Sair" );
        limpar();  
    }

    public void vantagem() {
         limpar();
         System.out.println(" VANTAGEM \n");
         System.out.println(" Usando ARRANJOS:\n"
                + " * Acesso direto indexado a qualquer elemento da lista.\n"
                + " * Economia de memória (não utiliza apontadores).\n\n ");
        	           
         System.out.println(" Usando APONTADORES:\n"
                + " * Permite inserir ou retirar itens do meio da lista a um custo constante\n"
                + " (importante quando a lista tem de ser mantida em ordem).\n" 
                + " * Bom para aplicações em que não existe previsão sobre o crescimento da lista\n "
                + " (o tamanho máximo da lista não precisa ser deﬁnido a priori).");
         limpar();
    }  
      


    public void desvantagem() {
             limpar();
                 System.out.println(" DESVANTAGEM \n");
                 System.out.println(" Usando ARRANJOS:"
                 + " * Custo para inserir ou retirar itens da lista, que pode causar um \n"
                         + "deslocamento de todos os itens, no pior caso;\n" +
                   " * Tamanho máximo da lista pré-estimado (deﬁnido em tempo de compilação).\n\n ");
                 System.out.println("Usando APONTADORES:\n\n"
                 + " * Utilização de memória extra para armazenar os apontadores.\n");  
	       limpar();
    }

    public void funcionamento() {
              limpar();
              System.out.println(" FUNCIONAMENTO \n");
              System.out.println(" Métodos da Interface STACK \n\n"
                + "Como somente o elemento de cima de uma pilha fica visível temos os\n "
                + "seguintes métodos: \n "
                + "empty(): Retorna true se a pilha estiver vazia ou false se o contrário.\n"
                + "peek(): Retorna o objeto do topo da pilha sem removê-lo.\n"
                + "pop(): Retorna o objeto do topo da pilha e remove\n"
                + "push(): Insere um item no topo da pilha e retorna esse item.\n " );
             
             limpar();
    }

    public void aplicada() {
         
        limpar();
           
          System.out.println(" APLICADAS \n");
          System.out.println(" As pilhas são uma estrutura de dados mais usadas na ciência da coputação.\n"
                  + "Por exemplo, durante uma execução do program, uma pilha será usada para  \n"
                  + "armazenar informações sobre parâmetros e pontos de retorno de todos \n"
                  + "os métodos que estiverem sendo executados atualmente.\n"
                  + "os compiladores também usam pilhas para armazenar informações enquanto\n"
                  + "avaliam expressões.");
          
        limpar();
    }
               
    
     public void limpar() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
        }
      
     }
      
}
