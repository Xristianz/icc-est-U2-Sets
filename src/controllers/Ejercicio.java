package controllers;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio {
    public Ejercicio(){
        System.out.println("Ejercicio 1");
        System.out.println(tieneDuplicados(new int[] {1,2,3,4,5}));
        System.out.println(tieneDuplicados(new int[] {1, 2 ,3 ,4 , 5 ,4 ,3, 2, 45}));
        System.out.println("Ejercicio 2 ");
        System.out.println("La palabra murcielago es Isograma = " + esIsograma("murcielago"));
        System.out.println("La palabra camaleon es Isograma = " + esIsograma("camaleon"));
        System.out.println("ejercicio 3 ");
        String texto = "La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?\n\n" +
"Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.\n\n" +
"En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.";
        System.out.println("Contador de palabras " + contarPalabrasUnicas(texto));
    }
    public boolean tieneDuplicados(int[] numeros){
        Set<Integer> set = new HashSet<>();
        for(int num : numeros ){
            if(!set.add(num)){
                return true;
            }
        }



        return false;
    }
    public boolean esIsograma(String palabra){
        Set<Character> set = new HashSet<>();
        
        for(int i=0 ; i<palabra.length() ; i++){
            char  c = palabra.charAt(i);
            if(!set.add(c)){
                return false;
            }
           
        }
        return true;

    }
    public int contarPalabrasUnicas(String frase){
        String [] palabras =frase.split(" ");
        Set<String> set = new HashSet<>();
        int cont=0;
        for (String palabra : palabras) {
        set.add(palabra.toLowerCase()); 
    }

    return set.size(); 


    }
    
}
