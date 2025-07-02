import java.util.Set;

import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Sets sets = new Sets();

        System.out.println("Nicolas Cedillo");

        System.out.println("\n----HashSet-----");
        System.out.println("Elementos del HashSet (no garantiza orden):");
        runHashSet(sets);
        System.out.println("\n----LinkedHashSet----");
        System.out.println("Elementos del LinkedHashSet (respeta orden de insercion):");
        runLinkedHashSet(sets);
        System.out.println("\n----TreeSet----");
        System.out.println("Elementos del TreeSet (orden xxx)");
        runTreeSet(sets);
        System.out.println("\n----TreeSet con Comparator----");
        System.out.println("Elementos del TreeSet con comparator:");
        runConstruirTreeSetConComparador(sets);
        System.out.println("\n----TreeSet con Comparator 2----");
        System.out.println("Elementos del TreeSet con comparator 2:");
        runConstruirTreeSetConComparador2(sets);
        
    }

    public static void runHashSet(Sets sets){
        for(String string: sets.construirHashSet()){
            System.out.println(string);
        }
    }

    public static void runLinkedHashSet(Sets sets){
        for(String string: sets.construirLinkedList()){
            System.out.println(string);
        }
    }

    public static void runTreeSet(Sets sets){
        for(String string: sets.TreeSet()){
            System.out.println(string);
        }
    }

    public static void runConstruirTreeSetConComparador(Sets sets){
        for(String string: sets.construirTreeSetConComparador()){
            System.out.println(string);
        }
    }

    public static void runConstruirTreeSetConComparador2(Sets sets){
        for(String string: sets.construirTreeSetConComparador2()){
            System.out.println(string);
        }
    }
}