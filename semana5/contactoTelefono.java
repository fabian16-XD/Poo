package semana5;
class ContactoTelefono extends Contacto {
    private String telefono;
    private String telefono_Empresarial;
    private String telefono_Casa;


    public ContactoTelefono(String email, String telefono, String telefono_Empresarial, String telefono_Casa) {
        super(email);
        this.telefono = telefono;
        this.telefono_Empresarial = telefono_Empresarial;
        this.telefono_Casa = telefono_Casa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono_Empresarial() {
        return telefono_Empresarial;
    }

    public void setTelefono_Empresarial(String telefono_Empresarial) {
        this.telefono_Empresarial = telefono_Empresarial;
    }

    public String getTelefono_Casa() {
        return telefono_Casa;
    }

    public void setTelefono_Casa(String telefono_Casa) {
        this.telefono_Casa = telefono_Casa;
    }


    @Override
    public String toString() {
        return "Contacto Telefono"+"\n"+"Email= "+"("+getEmail()+")"+" telefono= " + telefono + ", telefono Empresarial= " + telefono_Empresarial
                + ", telefono Casa= " + telefono_Casa ;
    }

    
}
