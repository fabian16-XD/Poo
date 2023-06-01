package Data;

public abstract class Evento extends DecoradorAgenda {
    private String nombre;

    public Evento(ObjAgenda objAgenda, String nombre) {
        super(objAgenda);
        this.nombre = nombre;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Nombre: " + nombre);
    }
}
