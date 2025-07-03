package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Sets {
    public Sets(){
       
    }
    public Set<String> construirHashSet(){
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        return palabras;
    }
    public Set<String> construirLinkedHashSet(){
        LinkedHashSet<String> palabras = new LinkedHashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        return palabras;

    }

    public Set<String> contruirTreeSet(){
        TreeSet<String> palabras = new TreeSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        return palabras;

        

    }
    public Set<String> construirTreeSetConComparator(){
        // Crear comparador
        Comparator<String> comparadorLongitud = new Comparator<String>(){
            @Override
            public int compare(String s1 ,String s2){
                // comparamos la longitud
                int result= Integer.compare(s1.length(), s2.length());
                // si tienen la misma longitud no tiene que comparar entonces ocmparamos alfabaticamente
                if(result == 0){
                    return s1.compareToIgnoreCase(s2);
                }
                return result;

            }
        };
       TreeSet<String> palabras = new TreeSet<>(comparadorLongitud);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        palabras.add("celulas");
        return palabras;
    }
    public Set<String> construirTreeSetConComparatorDes(){
        // Crear comparador
        Comparator<String> comparadorLongitud = new Comparator<String>(){
            @Override
            public int compare(String s1 ,String s2){
                // comparamos la longitud
                int result= Integer.compare(s2.length(), s1.length());
                // si tienen la misma longitud no tiene que comparar entonces ocmparamos alfabaticamente
                if(result == 0){
                    return s2.compareToIgnoreCase(s1);
                }
                return result;

            }
        };
       TreeSet<String> palabras = new TreeSet<>(comparadorLongitud);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        palabras.add("celulas");
        return palabras;
    }

    
}
