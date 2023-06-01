package GUI;




import Data.Agenda;
import Data.ContactoAmigo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AgregarContactoAmigo extends JFrame {
    private JTextField txtNombre;
    private JTextField txtTelefono;
    private JTextField txtApodo;
    private JTextField txtFecha;

    private JButton agregarButton;
    private JPanel V2;


    public AgregarContactoAmigo(Agenda laAgenda) {
        setContentPane(this.V2);
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = txtNombre.getText();
                String t = txtTelefono.getText();
                String a = txtApodo.getText();
                String f = txtFecha.getText();
                laAgenda.addContacto(new ContactoAmigo( a, null, n, t));
                dispose();
            }
        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();

    }

    
}
