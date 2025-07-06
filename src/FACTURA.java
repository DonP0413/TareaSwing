import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FACTURA  extends JFrame{

    private JPanel Panel3;
    private JButton Calcular;
    private JTextField txtcodigo;
    private JTextField txtproducto;
    private JTextField txtprecio;
    private JTextField txtcantidad;
    private JLabel lblsubtotal;
    private JLabel lbliva;
    private JLabel lbltotal;


    public FACTURA() {
        setVisible(true);
        setTitle("FACTURA");
        setContentPane(Panel3);
        setSize(400, 300);
        setLocationRelativeTo(null);
        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double precio = Double.parseDouble(txtprecio.getText());
                int cantidad = Integer.parseInt(txtcantidad.getText());
                double subtotal = precio * cantidad;
                double iva = subtotal * 0.15;
                double total = subtotal + iva;
                lblsubtotal.setText("Subtotal: " + subtotal);
                lbliva.setText("IVA: " + iva);
                lbltotal.setText("Total: " + total);

            }
        });
    }

    public static void main(String[] args) {
        new FACTURA();
    }
}
