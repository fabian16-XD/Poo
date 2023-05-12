package Data;

import java.sql.Date;

public class ContactoAmigo extends Contacto {

    //Atributos
    private String apodo;
    private Date fechaN;

    //Constructor
    public ContactoAmigo( String apodo, Date fechaN, String nombre, String telefono) {
        super(nombre, telefono);
        this.apodo = apodo;
        this.fechaN = fechaN;
    }

    //Getter Setter
    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    @Override
    public String toString() {
        return  "Contacto Trabajo: \nNombre= " + getNombre() +
                "\nTelefono= " + getTelefono() +
                "\nApodo= " + getApodo()+
                "\nFecha Nacimiento= " + getFechaN();
    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());
    }

    
   
    
    
}
