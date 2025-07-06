import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOGIN extends JFrame {
    private JTextField txtusuario;
    private JPasswordField txtclave;
    private JButton Acceder;
    private JButton Limpiar;
    private JPanel JPanel;


    public LOGIN() {
        setVisible(true);
        setTitle("LOGIN");
        setContentPane(JPanel);
        setSize(400, 300);
        setLocationRelativeTo(null);


        Acceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuarior="CENESTUR";
                String claver="C1234";
                String usuario = txtusuario.getText();
                String clave = new String(txtclave.getPassword());
                if (usuario.equals(usuarior) && clave.equals(claver)) {
                    JOptionPane.showMessageDialog(null, "Acceso concedido");
                } else {
                    JOptionPane.showMessageDialog(null, "Acceso denegado");
                }
            }


        });
        Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtusuario.setText("");
                txtclave.setText("");
            }
        });
    }
public static void main(String[] args) {
    new LOGIN();

}
}
