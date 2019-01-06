
package trabalho2;

import java.awt.geom.Path2D;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class TesteHasSet {
    
    
    
    public void teste()
	{		
		
            String pergunta;
            
            Set<String> cores= new HashSet<>();
		
            Scanner l = new Scanner(System.in);
        

            limpar();
            cores.add("azul");
            cores.add("verde");
            cores.add("vermelho");

            System.out.println(" TESTE \n");
            System.out.println(" Testando estrutura HashSet \n");
            System.out.println(" Essa é a nossa estrutura HashSet de cores:\n"
                    + " A maneira mais fácil de visualizar uma HashSet é pensar em\n"
                    + " um conjuto matemático onde os elementos pertencente ao conjunto não se repetem.\n"
                    + " Nossa estrutura HashSet está preenchida com 03 cores \n");

            System.out.println(cores);

            System.out.println("\nSe você inserir uma  cor já existente no conjunto não será permitido\n"               
                    + " Seguindo esse conceito,insira uma das cores já existentes:\n");

            pergunta = l.next();

            System.out.println(" ");

            cores.add(pergunta);
            
            if(cores.contains(pergunta))
            {
                System.out.println(" Cor já pertence ao conjunto \n");
            }              
           else
            {
                 System.out.println(" Esta cor não está contida no conjunto\n");
            }
            
            System.out.printf("\n Cores presentes no conjunto "); 
            System.out.println(cores);
		
		limpar();
		
		
	}
    
    
     public void limpar() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
        }
      
     }
    
    
    
}
