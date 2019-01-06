
package trabalho2;

public class ClassHasSet {
    
    
     public void utilidade() {
        limpar();
         System.out.println(" UTILIDADE \n");
         System.out.println("Segundo Mendes (2011, p.25), a interface Set estende a interface Collection\n"
                 + "e define uma coleção que não permite a inclusão de nenhum objeto duplicado.\n "
                 + "Ou seja, será ignorada a adição de um objeto caso outro objeto equivalente\n"
                 + "já exista na coleção.\n"
                 + "Ela inclue três Interfaces, duas classes abstratas e duas classes reais:\n"
                 + "HashSet e TreeSet.\n"
                 + "HashSet é um conjunto que é implementado com o uso de uma tabela dispersão\n"
                 + "TreeSet é impçementada com o uso de um tipo especial de árvore binária,\n"
                 + "chamada árvore Rubro-Negra\n.");
                
        limpar();
    }
    
    public void vantagem() {

        limpar();
         System.out.println(" VANTAGEM \n");
         System.out.println("O conjuntos que implementarem a Interface Set devem \n"
                 + "conter elementos exclusivos. Diferentemente do método list.add(), \n"
                 + "o método Set.add retornará false de você tentar inserir um item duplicado.");
        limpar();
    }

      public void desvantagem() {

        limpar();
         System.out.println(" DESVANTAGEM \n");
         System.out.println("Diferentemente de um objeto List, um objeto Set não tem um \n"
                 + "método get(). Portanto os elementos não poderm ser acessados pelo índice. \n"
                 + "Logo, se conjuntoA for um objeto Set, a chamada de método conjuntoA.get(0)\n"
                 + "causará o erro de sintaxe method get(int) not found\n");

        limpar();
    }
    
    public void funcionamento() {
        limpar();
        System.out.println(" FUNCIONAMENTO \n");
        System.out.println("add(): Adiciona o item a esse conjunto se ele ainda não estiver\n"
                + " presente retorna true.\n"
                + "retorna false se elemento já existir no conjunto\n"
                + "addAll(): Adiona todos os elementos do conjunto a esse conjunto se eles \n"
                + "ainda não estiverem presentes.\n"
                + "retorna True se o conjunto for alterado.\n"
                + "Implementa a união de conjunto se conj for um objeto Set\n"
                + "contains(): Retorna true se esse conjunto tiver um elemento igual a obj.\n"
                + "Implementa uma verificação de associação ao conjunto\n"
                + "containsAll(): Retorna true se esse conjunto tiver todos os elementos"
                + "do conjunto conj. Se conj for um objeto Set, retorna true se esse \n"
                + "objeto Set for uma subconjunto de Conj\n"
                + "isEmpty(): Retorna true se esse conjunto não tiver elmentos.\n"
                + "iterator(): Retorna um iterator para pesquisa dos elementos desse conjunto.\n"
                + "remove(): Remove o elemento do conjunto que for igual a obj se ele \n"
                + "estiver presente. Retorna true se o objeto for removido.\n"
                + "removeAll(): Remove desse conjunto todos os seus elementos que estiverem\n"
                + "contidos no conjunto conj. Retorna true se esse conjunto for alterado.\n"
                + "Se conj for um obejto Set, executa a operação de diferença de conjuntos.\n"
                + "retainAll(): Retem somente os elementos desse conjunto que estiverem\n"
                + "contidos no conjunto Conj. Retorna true se esse conjunto for alterado.\n"
                + "Se conj for um objeto Set, executa a operação de interseção de conjuntos.\n"
                + "size(): Retorna a quantidade de elementos desse conjunto(sua cardinalidade). ");
       
  
        limpar();
    }
    
     public void aplicada() {
         limpar();
            System.out.println(" APLICADAS \n");
            System.out.println(" Como sugerido por seu nome, essa interface modela \n"
                    + "a abstração matemática conjunto \n "
                    + "O que os matemáticos chamam de conjunto pode ser considerado \n"
                    + "uma reunião de objetos. Há o requisisto adicional de que os elementos\n"
                    + "contidos no conjunto sejam exclusivos. Por exemplo,\n"
                    + "se tivemos o conjunto de frutas { maçãs, larajas, e abacaxis} e adicionarmos\n"
                    + "maças a ele, ainda teremos o mesmo conjunto. Além disso, geralmente queremos\n"
                    + "se um objeto específico é ou não membro do conjunto, em vez de querermos saber\n"
                    + "em que local do conjunto ele está localizado.\n"
                    + "Portanto, se c fosse um cojunto, estaríamos interessados na expressão c.contains(maçãs)\n"
                    + "que retornaria o valor true se o elemento maças existisse no conjunto c e false se não\n"
                    + " existisse  c.indexOf(maçãs) que retornaria o local ou posição de maçãs no conjunto c.\n"
                    + "Também não precisariamos usar a expressão c.get(i) em que i é a posição (índice de um objeto\n"
                    + "no conjunto c)"
                    + "  ");
        limpar();
       
        

    }
        
    public void limpar() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
        }

    }

    
    
    
    
    
}
