package Data;

import java.util.LinkedList;

public class Agenda {
    private LinkedList<ObjAgenda> listaObjetos;

    public Agenda() {
        this.listaObjetos = new LinkedList<>();
    }

    public void addContacto(ObjAgenda objAgenda) {
        this.listaObjetos.add(objAgenda);
    }

    public LinkedList<ObjAgenda> getListaObjetos() {
        return listaObjetos;
    }
}
