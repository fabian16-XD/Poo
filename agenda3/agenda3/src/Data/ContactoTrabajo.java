package Data;

import Data.Contacto;

public class ContactoTrabajo extends Contacto {
    //Atributos
    private String empresa;
    private String puesto;

    //Constructor
    public ContactoTrabajo(String empresa, String puesto, String nombre, String telefono) {
        super(nombre, telefono);
        this.empresa = empresa;
        this.puesto = puesto;
    }

    //Getter Setter
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Contacto Trabajo: \nNombre= " + getNombre() +
                "\nTelefono= " + getTelefono() +
                "\nPuesto= " + getPuesto()+
                "\nEmpresa= " + getEmpresa();

    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());
    }

    
    

    
}
