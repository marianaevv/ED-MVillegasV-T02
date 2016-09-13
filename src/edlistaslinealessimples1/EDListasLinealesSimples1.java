/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edlistaslinealessimples1;

/**
 *
 * @author Mariana Villegas
 */
public class EDListasLinealesSimples1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         linealListClass list = new linealListClass();
        list.insertFirst(3);
        list.insertFirst(3.563); 
        list.insertFirst("Hola Compañero"); 
        
        list.insertLast(8);
        
        list.showList();
        
        list.borrarInicio();
        list.borrarFinal();
       list.borrarNodo(3.563);
        System.out.print("");
        
        
        System.out.print("");
        System.out.println("");
        list.showList();
    }
    
}
