package util;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparadorTelefonoDesc implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        int comparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (comparacionApellido != 0) {
            return comparacionApellido;
        }

        int comparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if (comparacionNombre != 0) {
            return comparacionNombre;
        }

        
        return o2.getTelefono().compareTo(o1.getTelefono());
    }
}
