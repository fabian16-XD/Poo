package Data;

import java.util.Date;

public class ContactoAmigo extends DecoradorAgenda {
    private String apodo;
    private Date fechaN;

    public ContactoAmigo(ObjAgenda objAgenda, String apodo, Date fechaN) {
        super(objAgenda);
        this.apodo = apodo;
        this.fechaN = fechaN;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Apodo: " + apodo);
        System.out.println("Fecha de Nacimiento: " + fechaN);
    }
}
