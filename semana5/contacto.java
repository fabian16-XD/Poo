package semana5;
class Contacto {
    private String email;

    public Contacto(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacto [email=" + email + "]";
    }
    
}