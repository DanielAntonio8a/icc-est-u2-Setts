import controllers.*;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        runHashSet(sets);
        runLinkedSet(sets);
        runTreeSet(sets);
        runTreeSetConComparador(sets);
        runTreeSetConComparadorInverso(sets);
    }

    public static void runHashSet(Sets sets) {
        System.out.println("HashSet:");
       
        for (String palabra : sets.construirHashSet()) {
            System.out.println("\t"+palabra);
        }
        System.out.println("");
    }

    public static void runLinkedSet(Sets sets) {
        System.out.println("Linked Hash Set:");
       
        for (String palabra : sets.construirLinkedHashSet()) {
            System.out.println("\t"+palabra);
        }
        System.out.println("");
    }

    public static void runTreeSet(Sets sets) {
        System.out.println("Tree Set:");
       
        for (String palabra : sets.construirTreeSet()) {
            System.out.println("\t"+palabra);
        }
        System.out.println("");
    }

    public static void runTreeSetConComparador(Sets sets) {
        System.out.println("Tree Set con Comparador:");
       
        for (String palabra : sets.construirTreeSetConComparador()) {
            System.out.println("\t"+palabra);
        }
    }

    public static void runTreeSetConComparadorInverso(Sets sets) {
        System.out.println("Tree Set con Comparador Inverso:");
       
        for (String palabra : sets.construirTreeSetConComparadorInverso()) {
            System.out.println("\t"+palabra);
        }
    }
}