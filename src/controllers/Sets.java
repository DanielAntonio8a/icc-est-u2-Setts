package controllers;
import java.util.*;

public class Sets {
   
    public Set<String> construirHashSet(){
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop"); // No se agrega porque ya existe
        palabras.add("Celular"); // No se agrega porque ya existe
       
        return palabras;
    }

    public Set<String> construirLinkedHashSet(){
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop"); // No se agrega porque ya existe
        palabras.add("Celular"); // No se agrega porque ya existe
       
        return palabras;
    }

    public Set<String> construirTreeSet(){
        Set<String> palabras = new TreeSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop"); // No se agrega porque ya existe
        palabras.add("Celular"); // No se agrega porque ya existe
       
        return palabras;
    }

    public Set<String> construirTreeSetConComparador(){

        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int result = Integer.compare(s1.length(), s2.length());
                if (result == 0) {
                    return s1.compareTo(s2); // Si tienen la misma longitud, ordena alfabéticamente
                }

                return result; // Ordena alfabéticamente
            }
        };

        Set<String> palabras = new TreeSet<>(comparador);

        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop"); // No se agrega porque ya existe
        palabras.add("Celular");
        palabras.add("Celulas"); // No se agrega porque ya existe
       
        return palabras;
    }

    public Set<String> construirTreeSetConComparadorInverso(){

        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int result = Integer.compare(s2.length(), s1.length());
                if (result == 0) {
                    return s2.compareTo(s1); // Si tienen la misma longitud, ordena alfabéticamente en orden inverso
                }

                return result; // Ordena alfabéticamente en orden inverso
            }
        };

        Set<String> palabras = new TreeSet<>(comparador);

        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop"); // No se agrega porque ya existe
        palabras.add("Celular");
        palabras.add("Celulas"); // No se agrega porque ya existe
       
        return palabras;
    }
}