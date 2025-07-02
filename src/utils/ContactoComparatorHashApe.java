package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparatorHashApe implements Comparator<Contacto> {
       @Override
    public int compare(Contacto o1, Contacto o2) {
        return Integer.compare(o1.getApellido().hashCode(), o2.getApellido().hashCode());
    }
}




