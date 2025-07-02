package util;

import java.util.Comparator;


import models.Contacto;

public class ContactoComparador implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        // primero el apellido en orden alfabetico
        int comparacionApellido= o1.getApellido().compareTo(o2.getApellido());
                // si tienen la misma longitud no tiene que comparar entonces ocmparamos alfabaticamente
        if(comparacionApellido != 0){
            return comparacionApellido;
        }

        // Segundo si son iguales comparo por el nombre orden alfabetico
        int comparacionNombre= o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if(comparacionNombre!=0){
            return comparacionNombre;
        }
        return 0;
    }



    
    
}
