package GUI;

import Data.Agenda;
import Data.ContactoFamiliar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarContactoFamiliar extends JFrame {
    private JTextField txtNombre;
    private JTextField txtTelefono;
    private JTextField txtParentezco;
    private JButton agregarButton;
    private JPanel V1;
    private JTextField txtCompleaños;

    public AgregarContactoFamiliar(Agenda laAgenda) {
        setContentPane(this.V1);
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = txtNombre.getText();
                String t = txtTelefono.getText();
                String p = txtParentezco.getText();
                laAgenda.addContacto(new ContactoFamiliar(n, t, p, null));
                dispose();
            }
        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }
}
