
package trabalho2;

public class ClassLinkedList {
    
    public void utilidade(){ 
        limpar();
        System.out.println(" UTILIDADE \n");
        System.out.println("Recomenda-se usar LinkedList quando as modificações ( inserção ou deleção)\n "
                + "na coleção são feitas na maioria das vezes no início e no final da lista, e ainda quando \n "
                + "a navegação entre os elementos é feita de forma sequencial por meio de um Iterator \n");
      limpar();
    }
   
    
    public void vantagem()
    {     
        limpar();
        System.out.println(" VANTAGEM \n");
        System.out.println(" São estruturas de dados dinâmicos que alocam a memória necessária enquanto o programa está funcionando;\n"
                + " • operações de inserir e deletar (nodes) são facilmente implementadas;\n"
                + " • estruturas de dados lineares tais como, pilhas e filas são facilmente executadas com uma lista encadeada;\n"
                + " • eles podem reduzir o tempo de acesso e podem aumentar em tempo real sem overhead de memória.");
      limpar();
    }
    
    
    public void desvantagem() {
        limpar();
        System.out.println(" DESVANTAGEM \n");
        System.out.println("• Desperdiçam memória pelo fato dos ponteiros alocarem novos espaços de armazenamento;\n"
                + "• Nós em uma lista encadeada devem ser lidos no início;\n"
                + "• Dificuldades ao percorrer de trás para frente, essa tarefa causa desperdício de memória.");
      limpar();
    }
    
     public void funcionamento() {
           limpar();
          System.out.println(" FUNCIONAMENTO \n");
          System.out.println("  Métodos da Classe java.util.LinkedList \n\n"
                  + "add(): Insere o objeto na lista na posição indice."
                  + "addFirst(): Insere o objeto como o primeiro elemento da lista\n"
                  + "addLast(): Adiciona o objeto ao final da lista.\n"
                  + "get(): Retorna o item da posição indice.\n"
                  + "getFirst(): Captura o primeiro elemento da lista\n"
                  + "Lança uma NoSuchElementExcrption se a lista estiver vazia."
                  + "getLast(): Captura o última elemento da lista.\n"
                  + "remove(): Remove a primeira ocorrência do objeto da lista\n"
                  + "Retorna true se a lista tiver o objto caso contrário\n"
                  + "retorna false.\n"
                  + "size(): retorna a quantidade de objeto contino na lista. ");
           limpar();
    }
     
    public void aplicada() {
        
        limpar();
        System.out.println(" APLICADAS \n");
        limpar();
        
    }

    
    public void limpar() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
        }

    }

}
