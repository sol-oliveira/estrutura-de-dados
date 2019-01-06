
package trabalho2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TesteHashMap {
    
    
    public void teste()
    {
       HashMap compra = new HashMap();
         Scanner l = new Scanner(System.in);
       int pergunta;
       
   compra.put(1,"Maria");
   compra.put(2,"João");
   compra.put(3,"Lucia"); 
   
   limpar();
    System.out.println(" TESTE \n");
            System.out.println(" Testando estrutura HashMap \n");
            System.out.println(" Essa é a nossa estrutura HashMap de compras:\n"
                    + " A maneira mais fácil de visualizar uma HashMap é pensar em\n"
                    + " um par de elementos onde o primeiro elemento informa a chave\n"
                    + " que é única e que pertence ao segundo elemento\n"
                    + " Nossa estrutura HashMap  está preenchida com 03 clientes e \n "
                    + " suas respectivas compras:  \n");
      
   
        Set set = compra.entrySet();
       
        Iterator i = set.iterator();

      
        while (i.hasNext()) {
            Map.Entry entrada = (Map.Entry) i.next();
            System.out.println("Chave: " + entrada.getKey()
                    + " - Cliente: " + entrada.getValue());
        }
  
        System.out.println("\n Se você quiser encontrar a cliente Maria basta "
                + "especificar sua chave \n"
                + "Seguindo esse conceito,insira a chave par de  Maria \n");
         
         pergunta = l.nextInt();
         
         compra.put(set, pergunta);
        
         System.out.println("Chave par inserida \n" + pergunta);
         
         System.out.println("Par :  "+compra.put(1,""));
         
        
    limpar();
    }
    
     public void limpar() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
        }

    } 

   
      
    
    
}
