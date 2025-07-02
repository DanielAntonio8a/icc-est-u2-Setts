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
        
        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("pera");
        palabras.add("laptop");

        return palabras;
    }

    public Set<String> construirLinkedList(){
        Set<String> palabras = new LinkedHashSet<>();

        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("pera");
        palabras.add("laptop");

        return palabras;
    }

    public Set<String> TreeSet(){
        Set<String> palabras = new TreeSet<>();

        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("pera");
        palabras.add("laptop");

        return palabras;
    }

    public Set<String> construirTreeSetConComparador(){

        //Crear un Comparator

        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1,String s2){
                //Comparamos la longitud
                int result = Integer.compare(s1.length(), s2.length());

                //Si tienen la misma longitud, comparamos alfabeticamente
                if (result == 0) {
                   return s1.compareTo(s2);
                }
                return result;
            }
        };

        Set<String> palabras = new TreeSet<>(comparadorLongitud);

        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("pera");
        palabras.add("laptop");
        palabras.add("celulas");

        return palabras;
    }

        public Set<String> construirTreeSetConComparador2(){

        //Crear un Comparator

        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1,String s2){
                int result = Integer.compare(s2.length(), s1.length());

                if (result == 0) {
                   return s2.compareTo(s1);
                }
                return result;
            }
        };

        Set<String> palabras = new TreeSet<>(comparadorLongitud);

        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("pera");
        palabras.add("laptop");
        palabras.add("celulas");

        return palabras;
    }
}