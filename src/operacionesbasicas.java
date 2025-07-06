import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class operacionesbasicas  extends JFrame{
    private JTextField txtsuma2;
    private JTextField txtresta1;
    private JTextField txtsuma1;
    private JTextField txtresta2;
    private JButton SUMAB;
    private JButton BORRARS;
    private JButton RESTAB;
    private JButton BORRARR;
    private JTextField txtmult1;
    private JTextField txtmult2;
    private JTextField txtdivi1;
    private JTextField txtdivi2;
    private JButton MULTIPLICARB;
    private JButton BORRARM;
    private JButton DIVIDIRB;
    private JButton BORRARD;
    private JPanel Panel2;

    public operacionesbasicas() {
        setVisible(true);
        setTitle("OPERACIONES BASICAS");
        setContentPane(Panel2);
        setSize(500, 500);
        setLocationRelativeTo(null);

        SUMAB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = txtsuma1.getText();
                String num2 = txtsuma2.getText();
                int suma = Integer.parseInt(num1) + Integer.parseInt(num2);
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
            }
        });
        BORRARS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtsuma1.setText(" ");
                txtsuma2.setText(" ");
            }
        });
        RESTAB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = txtresta1.getText();
                String num2 = txtresta2.getText();
                int resta = Integer.parseInt(num1) - Integer.parseInt(num2);
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);
            }
        });
        BORRARR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtresta1.setText("");
                txtresta2.setText("");
            }
        });
        MULTIPLICARB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = txtmult1.getText();
                String num2 = txtmult2.getText();
                int multiplicacion = Integer.parseInt(num1) * Integer.parseInt(num2);
                JOptionPane.showMessageDialog(null, "La multiplicación es: " + multiplicacion);
            }
        });
        BORRARM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtmult1.setText(" ");
                txtmult2.setText(" ");

            }
        });
        DIVIDIRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = txtdivi1.getText();
                String num2 = txtdivi2.getText();
                if (Integer.parseInt(num2) != 0) {
                    double division = (double) Integer.parseInt(num1) / Integer.parseInt(num2);
                    JOptionPane.showMessageDialog(null, "La división es: " + division);
                } else {
                    JOptionPane.showMessageDialog(null, "Error: División por cero no permitida.");
                }

            }
        });
        BORRARD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtdivi1.setText(" ");
                txtdivi2.setText(" ");

            }
        });
    }





    public static void main(String[] args) { // Main method
        new operacionesbasicas();



    }


    }
