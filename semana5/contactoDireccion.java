package semana5;

class ContactoDireccion extends Contacto {
    private String direccion;
    private String direccionPostal;
    private String avenida;

    

    public ContactoDireccion(String email, String direccion, String direccionPostal, String avenida) {
        super(email);
        this.direccion = direccion;
        this.direccionPostal = direccionPostal;
        this.avenida = avenida;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    @Override
    public String toString() {
        return "Contacto Direccion"+"\n"+"Email= "+"("+getEmail()+")"+ " direccion= " + direccion + ", direccionPostal= " + direccionPostal + ", avenida= "
                + avenida;
    }

 
    
}