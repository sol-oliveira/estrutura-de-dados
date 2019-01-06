
package trabalho2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClasArrayList {
    
       
   public static ArrayList lista = new ArrayList();
    
    Scanner l = new Scanner(System.in);
    
    String nome;
    
    int posicao;
    
    public void utilidade(){  
        limpar();
        System.out.println(" UTILIDADE \n");
        System.out.println(" ArrayList é uma classe para coleções (classe genérica), que implementam a\n "
                + "interface List, utilizando internamente um array dinâmico de objetos, assim,\n"
                + "caso o tamanho do array interno não atenda a uma nova inserção,\n"
                + "um novo array será alocado dinamicamente.\n"
                + "Segundo Deitel (2010, p.221), o ArrayList pode alterar dinamicamente seu tamanho para\n"
                + "acomodar mais elementos. Quando se declara um novo ArrayList, é necessário informar \n"
                + "o tipo de elementos que ele irá conter.\n");
        limpar();
    }
    
    
    public void vantagem()
    {   
        limpar();
        System.out.println(" VANTAGEM \n");
        System.out.println(" O tamanho de um ArryList aumenta automaticamente conforme\n"
                + "novos elementos são adicionados a ele e diminui conforme elementos são removidos.\n"
                + "Remover um elemento de um objeto ArrayList o tamnho diminuirá\n"
                + "automaticamente. Os elementos seguintes deslocarão para preencher os espaços"
                + "vagos lista\n");
        limpar();
                    }
         
    public void desvantagem()
    {   
        limpar();
        System.out.println(" DESVANTAGEM \n");
        System.out.println("Para inserir ou remover elemetos é necessario redefinir "
                + "sua estrutura. ");
        limpar();
    }
            
      public void funcionamento() {
         limpar();
         System.out.println(" FUNCIONAMENTO \n");
         System.out.println("  Métodos da Interface ArrayList \n\n"                      
                   +"add() – adiciona um elemento ao fim do ArrayList;\n"
                   +"clear() – remove todos os elementos do ArrayList;\n"
                   +"contains() – retorna true se o arrayList contiver o elemento especificado; do contrário, retorna false;\n"
                   +"get() – retorna o elemento no índice especificado;\n"
                   +"indexOf() – retorna o índice da primeira ocorrência do elemento especificado em ArrayList;\n"
                   +"remove() – remove o elemento no índice especificado;\n"
                   +"size() – retorna o número de elementos aramazenados no ArrayList;\n"
                   +"trimToSize() – reduz a capacidade de ArrrayList de acordo com o número e elementos atual." );
                     limpar();     
      }
    
       public void aplicada() {
     
        limpar();
        System.out.println(" APLICADAS \n");
        System.out.println(" Os objetos ArrayList são mais usados quando o programador quer poder\n"
                + "adicionar novos elementos ao fim de uma lista mas também precisa do recurso de \n"
                + "acessar os elemantos armazenados em ordem arbitrária  ");
        limpar();

    }  
     
     public void limpar() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
        }

    }
    
    
    
    
}
    
    

