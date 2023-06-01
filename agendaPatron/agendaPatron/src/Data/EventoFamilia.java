package Data;

public class EventoFamilia extends DecoradorAgenda {
    private int cantidadAsistentes;

    public EventoFamilia(ObjAgenda objAgenda, int cantidadAsistentes) {
        super(objAgenda);
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Cantidad de Asistentes: " + cantidadAsistentes);
    }
}
