package Data;


import java.util.Date;


public class EventoReunion extends Evento{
    
    private int cantidadAsistentes;

    public EventoReunion(int cantidadAsistentes, Date fecha, String nombre) {
        super(fecha, nombre);
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Evento Familia{" +
                "\nCantidad Asistentes=" +  getCantidadAsistentes()+
                "\nNombre del Evento=" + getNombre()+
                "\nFecha del Evento=" + getFecha()+
                "} ";
    }
}
