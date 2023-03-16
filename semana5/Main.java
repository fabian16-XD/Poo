package semana5;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Alexander", "Zamora", 63);
        Persona persona2 = new Persona("Fabian", "Alfaro", 58);
        Persona persona3 = new Persona("Maria", "Salazar", 63);

        ContactoTelefono contacto1 = new ContactoTelefono("Alex@gmail.com", "12345678", "777-666-555", "506-506-506");
        ContactoTelefono contacto2 = new ContactoTelefono("Fabi@gmail.com", "87654321", "777-666-554", "507-507-507");
        ContactoDireccion contacto3 = new ContactoDireccion("Alexa@gmail.com", "Santa Clara", "12", "estatal");
        ContactoDireccion contacto4 = new ContactoDireccion("Fabiana@gmail.com", "Ciudad Quesada", "13", "urbana");
        ContactoRedSocial contacto5 = new ContactoRedSocial("Fabiana@gmail.com", "facebook", "https://linkedinFabiana@gmail.com/facebook/login");
        ContactoRedSocial contacto6 = new ContactoRedSocial("Alexa@gmail.com", "instagram", "https://linkedinFabiana@gmail.com/instagram/login");

        AgendaContactos agenda = new AgendaContactos();
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);
        agenda.agregarContacto(contacto3);
        agenda.agregarContacto(contacto4);
        agenda.agregarContacto(contacto5);
        agenda.agregarContacto(contacto6);

        System.out.println(agenda);
        
    }
    
}
