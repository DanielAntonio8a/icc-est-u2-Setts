package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator <Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        // 1ro comparo por el Apellido alfabeticamente
        int resultComparicionApellido=o1.getApellido().compareToIgnoreCase(o2.getApellido());
        // si los apellidos son iguales, comparare con el nombre
        if (resultComparicionApellido !=0){
            return resultComparicionApellido;
        }

        int resultComparicionNombre= o1.getNombre().compareToIgnoreCase(o2.getNombre());
        return resultComparicionNombre;
    }
    
    
}
