package controllers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios() {
        System.out.println("Ejercicio 1");
        System.out.println(tieneDuplicados(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(tieneDuplicados(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 45 }));
        System.out.println("\nEjercicio 2");
        System.out.println(esIsograma("murcielago"));
        System.out.println(esIsograma("camaleon"));
        String texto = """
                La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
                        Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
                        En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";
        System.out.println("\n Palabras: " + contadorPalebrasUnicas(texto));
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        System.out.println("\n Palabras: " + contadorPalebrasUnicas(texto1));
        System.out.println("\n Palabras: " + contadorPalebrasUnicas(texto2));
        System.out.println("\n Palabras comunes: ");
        compararTextos(texto1, texto2);
    }

    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> duplicados = new HashSet<Integer>();
        for (int num : numeros) {
            if (duplicados.contains(num)) {
                return true;
            }
            duplicados.add(num);
        }
        return false;
    }

    // murcielago (bien) true (es isograma)
    // camaleon (mal) (repite "a")

    public boolean esIsograma(String palabra) {
        Set<Character> letras = new HashSet<Character>();
        for (char c : palabra.toCharArray()) {
            if (letras.contains(c)) {
                return true; // Se repite la letra
            }
            letras.add(c);
        }
        return false; // No hay letras repetidas
    }

    public int contadorPalebrasUnicas(String texto) {
        int contador = 0;
        Set<String> unico = new HashSet<>();
        for (String palabra : texto.split(" ")) {
            if (!unico.contains(palabra)) {
                contador++;
            }
            unico.add(palabra);
        }
        return contador;
    }

    public void compararTextos(String texto1, String texto2) {
        Set<String> eliminador = new HashSet<>();
        // Convertir los textos a minúsculas para evitar diferencias por
        // mayúsculas/minúsculas
        texto1 = texto1.toLowerCase();
        texto2 = texto2.toLowerCase();

        // Dividir los textos en palabras usando espacios como delimitadores
        Set<String> palabrasTexto1 = new HashSet<>(Arrays.asList(texto1.split("\\s+")));
        Set<String> palabrasTexto2 = new HashSet<>(Arrays.asList(texto2.split("\\s+")));

        // Encontrar la intersección de los conjuntos, que son las palabras comunes
        palabrasTexto1.retainAll(palabrasTexto2);

        System.out.println("textos repetidos:" + palabrasTexto1);

        // -----------------------------
        // Usando el operador +
        String textoConcatenado1 = texto1 + texto2;
        System.out.println("Concatenación con +: " + textoConcatenado1.length());

        double porcentaje = (palabrasTexto1.size() * 100) / textoConcatenado1.length();
        System.out.println("Palabras repetidas: " + palabrasTexto1.size());
        System.out.println("Porcentaje palabras repetidas: " + porcentaje);
    }
}