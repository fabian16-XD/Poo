package Data;

public class Contacto extends DecoradorAgenda {
    private String nombre;
    private String telefono;

    public Contacto(ObjAgenda objAgenda, String nombre, String telefono) {
        super(objAgenda);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
    }
}
