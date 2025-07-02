import java.nio.channels.Pipe.SourceChannel;
import java.util.Set;

import controllers.ContactoController;
import controllers.Sets;
import util.ContactoComparador;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nNombres: Cristian Moscoso");
        System.out.println(" ");
        Sets setsito = new Sets();
        runHashSet(setsito);
        runLinkedHashSet(setsito);
        runTreeHashSet(setsito);
        runComparador(setsito);
        runComparadorDes(setsito);
        System.out.println("Cristian Moscoso");
        ContactoController comparador = new ContactoController();
        
        


        
    }
    public static void runHashSet(Sets setsito){
         System.out.println("==HashSet==");
        for(String set:setsito.construirHashSet()){
            System.out.println(set);
        }

    }
    public static void runLinkedHashSet(Sets setsito){
    
        System.out.println("==LinkedHashSet==");
        for(String set: setsito.construirLinkedHashSet()){
            System.out.println(set);
        }
    }
    public static void runTreeHashSet(Sets setsito){
         System.out.println("==Tree Hash set==");
         for(String set: setsito.contruirTreeSet()){
            System.out.println(set);
         }

    }
    public static void runComparador(Sets setsito){
        System.out.println("==Comparando por Longitud==");
        for(String set: setsito.construirTreeSetConComparator()){
            System.out.println(set);
        }
        
    }
    public static void runComparadorDes(Sets setsito){
       System.out.println("==Comparando por Longitud Desendente==");
        for(String set: setsito.construirTreeSetConComparatorDes()){
            System.out.println(set);
        } 
    }


}
