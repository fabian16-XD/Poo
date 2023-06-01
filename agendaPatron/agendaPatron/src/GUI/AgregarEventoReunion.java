package GUI;

import Data.Agenda;
import Data.EventoReunion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarEventoReunion extends JFrame{
    private JTextField txtNombre;
    private JTextField txtFecha;
    private JTextField txtCantidadA;
    private JButton agregarButton;
    private JPanel V1;

    public AgregarEventoReunion(Agenda laAgenda) {
        this.setContentPane(this.V1);//esto es para que no se ponga el layout por defecto.
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.pack();//esto es para que se ajuste al tamaño de los componentes
        //this.setSize(300,300);//esto es para que se ajuste al tamaño de los componentes
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ca = Integer.parseInt(txtCantidadA.getText());
                String n = txtNombre.getText();

                laAgenda.addEvento(new EventoReunion(ca,null,n));
                dispose();

            }
        });
    }
}
