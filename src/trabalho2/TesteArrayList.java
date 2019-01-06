
package trabalho2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TesteArrayList {
    
    public void teste()
	{ 	
		Scanner l = new Scanner(System.in);
                
		ArrayList<String> embarque = new ArrayList<String>();
		int posicao = 0;
                String nome;
                
               	 limpar();
                 
                System.out.println(" TESTANDO NOSSO ARRAYLIST \n");
                System.out.println(" Essa é a nossa estrutura ArrayList de passageiros:\n");                  
		System.out.println(" Adicione 03 nomes a sua estrutura ArrayList: \n");             
                
		for (int i = 0; i < 3; i++)
		{
                        nome = l.next();
                        embarque.add(i,nome);
                        
			System.out.printf("Posição %d - %s\n", i, embarque.get(i));
		}
	
            System.out.println("\nComo vimos ao remover um elemento de um objeto ArrayList o tamanho diminuirá \n"
                    + "automaticamente.\n Os elementos seguintes deslocarão para preencher os espaços vagos do Array\n"
                    + "Vamos fazer ao teste!!\n");
            
            
             System.out.println("Esse é o nosso ArrayList preenchido\n");
            
            
            for (String c: embarque)
		{
			System.out.printf(" Posição %d- %s\n", posicao, c);
			posicao++;
		}
            
                                                             
		System.out.printf("Informe a posição a ser excluída:\n");
		posicao = l.nextInt();
		
		try
		{
			embarque.remove(posicao);
                        
                         System.out.println("Tamanho do Array depois da remoção:  " + embarque.size());
                       
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.printf("\nErro: posição inválida (%s).\n" + e.getMessage());
		} 		
		
		posicao = 0;
		System.out.printf("Elementos presente no Arry\n");
		for (String c: embarque)
		{
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
