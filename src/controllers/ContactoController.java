package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorHashApe;
import utils.ContactoComparatorHashNom;
import utils.ContactoComparatorTelefono;

public class ContactoController {
    public ContactoController(){
        runTreeContacto();
        runtreeNumero();
        runTreeContactoHashNom();
        runTreeContactoHashApe();
    }

    public void runTreeContacto(){
        
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
        
        System.out.println("\tAgenda ordenada por Apellido - Nombre");
        for (Contacto c: agenda){
            System.out.println(c);
        }
    }

    public void runtreeNumero(){
               
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorTelefono());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
        
        System.out.println("\tAgenda ordenada por Nombre - Numero de Telefono");
        for (Contacto c: agenda){
            System.out.println(c);
        }
    }

    public void runTreeContactoHashNom(){
                Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorHashNom());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
        
        System.out.println("\tAgenda ordenada por HashCode Nombre");
        for (Contacto c: agenda){
            System.out.println(c);
        }
    }

    public void runTreeContactoHashApe(){
                        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorHashApe());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
        
        System.out.println("\tAgenda ordenada por HashCode Apellido");
        for (Contacto c: agenda){
            System.out.println(c);
        }
    }
    
    
}
