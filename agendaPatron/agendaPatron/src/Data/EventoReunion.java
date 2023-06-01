package Data;

public class EventoReunion extends DecoradorAgenda {
    private int cantidadAsistentes;

    public EventoReunion(ObjAgenda objAgenda, int cantidadAsistentes) {
        super(objAgenda);
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Cantidad de Asistentes: " + cantidadAsistentes);
    }
}
