
package trabalho2;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    
   Scanner l = new Scanner(System.in);
   
    static int opc, opc1;
    
    public void Titulo(){
        System.out.println("***   ***** ***** ***** ***** ***** ***** ***** ***** *** ");
        System.out.println("***** ESTRUTURA DE DADOS BÁSICAS UTILIZADAS EM JAVA ***** ");
        System.out.println("***   ***** ***** ***** ***** ***** ***** ***** ***** *** ");
        
    }
    
    public void menu()
    {
        System.out.println(" Escolha a opção de menu ");
        System.out.println("1- Queue ");
        System.out.println("2- Stack; ");
        System.out.println("3- ArrayList ");
        System.out.println("4- LinkedList ");
        System.out.println("5- HashSet ");
        System.out.println("6- HashMap ");
        System.out.println("0- Sair ");
        opc = l.nextInt();
    }
 
    
    public void submenu()
    {
          System.out.println(" Escolha a opção de sub-menu ");
          System.out.println("1- Utilidade ");
          System.out.println("2- Vantagens ");
          System.out.println("3- Desvantagens ");
          System.out.println("4- Funcionamento ");
          System.out.println("5- Testar Estrutura ");
          System.out.println("0- Sair ");
          opc1 = l.nextInt(); 
    }
    
    
    
}
