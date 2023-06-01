package Data;

public class ContactoTrabajo extends DecoradorAgenda {
    private String empresa;
    private String puesto;

    public ContactoTrabajo(ObjAgenda objAgenda, String empresa, String puesto) {
        super(objAgenda);
        this.empresa = empresa;
        this.puesto = puesto;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Empresa: " + empresa);
        System.out.println("Puesto: " + puesto);
    }
}
