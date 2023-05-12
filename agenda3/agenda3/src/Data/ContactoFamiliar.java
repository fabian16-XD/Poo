package Data;


import java.util.Date;

public class ContactoFamiliar extends Contacto{

    //Atributos
    private String parentesco;
    private Date cumpleaños;

    
    //Constructor
    public ContactoFamiliar(String nombre, String telefono, String parentesco, Date cumpleaños) {
        super(nombre, telefono);
        this.parentesco = parentesco;
        this.cumpleaños = cumpleaños;
    }
    
    //Getter Setter
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Date getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(Date cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    @Override
    public String toString() {
        return "Contacto Trabajo: \nNombre= " + getNombre() +
                "\nTelefono= " + getTelefono() +
                "\nParenteco= " + getParentesco()+
                "\nComplueaños= " + getCumpleaños();

    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());
    }
    
    
    
}
