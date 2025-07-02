package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import util.ContactoComparador;
import util.ContactoComparadorTelefonoDesc;

public class ContactoController {
    
    public ContactoController(){
        runTreeContacto();
        crunTreeContactoPorTelefonoDesc();
        
        
    }
    public void runTreeContacto(){
        Set<Contacto>contactos = new TreeSet<>(new ContactoComparador());
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        System.out.println("Comparador 1");
        for (Contacto contacto : contactos){
            System.out.println(contacto);
        }
        
        
    }
    public void crunTreeContactoPorTelefonoDesc(){
        Set<Contacto>contactos = new TreeSet<>(new ContactoComparadorTelefonoDesc());
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        System.out.println("Comparador 2 nombre - apellido - numero descendente");
        for (Contacto contacto : contactos){
            System.out.println(contacto);
        }
        
        
    }
        
}
