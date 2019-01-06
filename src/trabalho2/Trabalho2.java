package trabalho2;


import java.util.Scanner;

public class Trabalho2 {

    public static void main(String[] args) {
        
       
        int vantagens;
        Scanner l = new Scanner(System.in);
        Sistema ss = new Sistema();
        ClassQueue queue = new ClassQueue();
        ClassStack stack = new ClassStack();
        ClasArrayList array = new ClasArrayList();
        ClassLinkedList link = new ClassLinkedList();
        ClassHasSet hasset = new ClassHasSet();
        ClassMap hasmap = new ClassMap();
        
        TesteArrayList testearray = new TesteArrayList();
        TesteQueue testefila = new TesteQueue();
        TesteStack testestack = new TesteStack();
        TesteHasSet testetree = new TesteHasSet();
        TesteHashMap testehashmap = new TesteHashMap();
        TesteLinkedList testelink = new TesteLinkedList();
        
   do{   
       ss.Titulo();
       ss.menu();
        do {
       
            switch (ss.opc) {
           
                case 1:
                                      
                    ss.submenu();
                    
                    if (ss.opc1 == 1) {

                        queue.utilidade();
                    }
                    if (ss.opc1 == 2) {

                        queue.vantagem();
                    }

                    if (ss.opc1 == 3) {

                        queue.desvantagem();
                    }
                    if (ss.opc1 == 4) {

                       queue.funcionamento();
                    }
                    if (ss.opc1 == 5) {

                     testefila.teste();
                    }
                    if (ss.opc1 == 0) {

                        System.out.println(" Finalizando submenu....\n\n\n");

                        break;
                    }            

                    break;
                case 2:
                    
                    ss.submenu();
                    
                    if (ss.opc1 == 1) {

                        stack.utilidade();
                    }
                    if (ss.opc1 == 2) {

                       stack.vantagem();
                    }

                    if (ss.opc1 == 3) {

                       stack.desvantagem();
                    }
                    if (ss.opc1 == 4) {

                        stack.funcionamento();
                    }
                    if (ss.opc1 == 5) {

                        testestack.teste();
                    }
                    if (ss.opc1 == 0) {

                        System.out.println(" Finalizando submenu....\n\n\n");

                        break;
                    }            
                   break;
                case 3:
                      ss.submenu();
                    
                    if (ss.opc1 == 1) {

                       array.utilidade();
                    }
                    if (ss.opc1 == 2) {

                        array.vantagem();
                    }

                    if (ss.opc1 == 3) {

                        array.desvantagem();
                    }
                    if (ss.opc1 == 4) {

                       array.funcionamento();
                    }
                    if (ss.opc1 == 5) {

                       testearray.teste();  ;
                    }
                    if (ss.opc1 == 0) {

                        System.out.println(" Finalizando submenu....\n\n\n");

                        break;
                    }            
                    break;
                case 4:
                    ss.submenu();
                    
                    if (ss.opc1 == 1) {

                        link.utilidade();
                    }
                    if (ss.opc1 == 2) {

                        link.vantagem();
                    }

                    if (ss.opc1 == 3) {

                        link.desvantagem();
                    }
                    if (ss.opc1 == 4) {

                       link.funcionamento();
                    }
                    if (ss.opc1 == 5) {

                       testelink.teste();
                    }
                    if (ss.opc1 == 0) {

                        System.out.println(" Finalizando submenu....\n\n\n");
                    }
                        break;
                
                case 5:
                    ss.submenu();
                    
                    if (ss.opc1 == 1) {

                       hasset.utilidade();
                    }
                    if (ss.opc1 == 2) {

                       hasset.vantagem();
                    }

                    if (ss.opc1 == 3) {

                        hasset.desvantagem();
                    }
                    if (ss.opc1 == 4) {

                        hasset.funcionamento();
                    }
                    if (ss.opc1 == 5) {

                       testetree.teste();
                    }
                    if (ss.opc1 == 0) {

                        System.out.println(" Finalizando submenu....\n\n\n");
                        break;
                    }            
                    break;

                case 6:
                       ss.submenu();
                    
                    if (ss.opc1 == 1) {

                       hasmap.utilidade();
                    }
                    if (ss.opc1 == 2) {

                        hasmap.vantagem();
                    }

                    if (ss.opc1 == 3) {

                       hasmap.desvantagem();
                    }
                    if (ss.opc1 == 4) {

                      hasmap.funcionamento();
                    }
                    if (ss.opc1 == 5) {

                       testehashmap.teste();
                    }
                    if (ss.opc1 == 0) {

                        System.out.println(" Finalizando submenu....\n\n\n");

                        break;
                    } 
                    break;
                case 0: 
                       System.out.println(" Finalizando ....");
                    break;
                default:
                    System.out.println(" Opção de Menu Inválida !");
                    break;
            }
             } while (ss.opc1 != 0);
            } while (ss.opc != 0);
       
  
     }
      
    }
    

