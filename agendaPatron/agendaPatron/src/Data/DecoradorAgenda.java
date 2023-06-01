package Data;

public abstract class DecoradorAgenda implements ObjAgenda {
    protected ObjAgenda objAgenda;

    public DecoradorAgenda(ObjAgenda objAgenda) {
        this.objAgenda = objAgenda;
    }

    public void imprimir() {
        objAgenda.imprimir();
    }
}
