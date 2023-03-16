package semana5;
import java.util.ArrayList;

class AgendaContactos {
    private ArrayList<Contacto> contactos;


    public AgendaContactos() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }

    public void modificarContacto(Contacto contacto, String nuevoEmail) {
        contacto.setEmail(nuevoEmail);
    }


    public String toString() {
        String resultado = "";
        for (Contacto contacto : contactos) {
            resultado += contacto.toString() + "\n";
        }

        return resultado;
    }
}