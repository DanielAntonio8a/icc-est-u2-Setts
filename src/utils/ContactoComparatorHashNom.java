package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparatorHashNom implements Comparator<Contacto> {

     @Override
    public int compare(Contacto o1, Contacto o2) {
        return Integer.compare(o1.getNombre().hashCode(), o2.getNombre().hashCode());
    }

}
