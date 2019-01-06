
package trabalho2;

public class ClassMap {
    
    public void utilidade() {
     limpar();
        System.out.println(" UTILIDADE \n");
        System.out.println("A interface Map não estende a interface Collection, ou seja, tem sua "
                + "própria hierarquia de interfaces e classes que são utilizadas para gerenciar associações"
                + "entre chaves e elementos.  Estas  definem  um  array  associativo, por exemplo, ao "
                + "adicionar um novo elemento ao mapa, este o associa a uma chave que deve implementar \n"
                + "a interface Set, isto é, as chaves são exclusiva"
                + "O segundo conjunto nao e estritamente um objeto  O segundo conjunto nao e "
                + "estritamente um objeto mas um objeto Collection arbitrário chamado valores.\n"
                + "Eles não precisam ser exclusivos ");
          limpar();
    }

    public void vantagem() {
        System.out.println(" VANTAGEM \n");
        limpar();
             System.out.println("Hora de recuperar um objeto “inserido”,\n"
                     + " buscar pela chave referente ao mesmo ");
        limpar();
    }

   public void desvantagem() {
        System.out.println(" DESVANTAGEM \n");
        limpar();
           System.out.println("Não mantém uma ordenação entre seus elementos\n");
        limpar();
    }

    public void funcionamento() {
        limpar();
       System.out.println(" FUNCIONAMENTO \n");
       System.out.println("Métodos da Interface MAP \n\n");
       System.err.println("clear(): Remove todos elementos do mapa;\n" +
              "containsKey(): Retorna true se o mapa contém a chave solicitada;\n" +
              "containsValue(): Retorna true se o mapa contém o valor solicitado;\n" +
              "equals(): Compara um objeto com o mapa para igualdade;\n" +
              "get(): Recupera o valor da chave solicitada;\n" +
              "keySet(): Retorna um conjunto que contém todas as chaves do mapa;\n" +
              "put(): Adiciona o par de chave-valor solicitado no mapa;\n" +
              "remove(): Remove a chave solicitada w seu valor a partir do mapa, se a chave existe \n" +
              "size(): Retorna o número de pares de chave  ");
        limpar();
    }

    public void aplicada() {
        System.out.println(" APLICADAS \n");
        limpar();
            System.out.println(" Implementada na  criação de um Map");
        limpar();

    }

    
    public void limpar() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
        }

    } 
   
}
