package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparatorTelefono implements Comparator<Contacto> {
    @Override
    public int compare(Contacto o1, Contacto o2) {
        // 1. Comparar por apellido (ascendente)
        int cmpApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (cmpApellido != 0) return cmpApellido;

        // 2. Comparar por nombre (ascendente)
        int cmpNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if (cmpNombre != 0) return cmpNombre;

        // 3. Comparar por teléfono (descendente alfabético)
        return o2.getTelefono().compareTo(o1.getTelefono()); // inverso
    }
}
