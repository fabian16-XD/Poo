package semana5;

class ContactoRedSocial extends Contacto {
    private String redSocial;
    private String linkedin;


    public ContactoRedSocial(String email, String redSocial, String linkedin) {
        super(email);
        this.redSocial = redSocial;
        this.linkedin = linkedin;
    }

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @Override
    public String toString() {
        return "Contacto Red Social"+"\n"+"Email= "+"("+getEmail()+")"+" redSocial= " + redSocial + ", linkedin= " + linkedin;
    }
    
}