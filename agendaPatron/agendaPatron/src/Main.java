import Data.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Creación de instancias
        ObjAgenda agenda = new Agenda();
        ObjAgenda contacto = new Contacto(agenda, "John Doe", "123456789");
        ObjAgenda contactoAmigo = new ContactoAmigo(contacto, "Johny", new Date());
        ObjAgenda contactoFamiliar = new ContactoFamiliar(contacto, "Familiar", new Date());
        ObjAgenda contactoTrabajo = new ContactoTrabajo(contacto, "OpenAI", "Developer");
        ObjAgenda evento = new Evento(agenda, "Reunión");
        ObjAgenda eventoFamilia = new EventoFamilia(evento, 10);
        ObjAgenda eventoReunion = new EventoReunion(evento, 20);

        // Llamadas a imprimir
        contacto.imprimir();
        System.out.println();
        contactoAmigo.imprimir();
        System.out.println();
        contactoFamiliar.imprimir();
        System.out.println();
        contactoTrabajo.imprimir();
        System.out.println();
        evento.imprimir();
        System.out.println();
        eventoFamilia.imprimir();
        System.out.println();
        eventoReunion.imprimir();
    }
}
