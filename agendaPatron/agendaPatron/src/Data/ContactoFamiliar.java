package Data;

import java.util.Date;

public class ContactoFamiliar extends DecoradorAgenda {
    private String parentesco;
    private Date cumpleaños;

    public ContactoFamiliar(ObjAgenda objAgenda, String parentesco, Date cumpleaños) {
        super(objAgenda);
        this.parentesco = parentesco;
        this.cumpleaños = cumpleaños;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Parentesco: " + parentesco);
        System.out.println("Cumpleaños: " + cumpleaños);
    }
}
