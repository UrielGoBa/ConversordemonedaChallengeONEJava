package conversor;

import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class longitud extends JFrame implements ActionListener {

    JLabel label1 = new JLabel("Ingresa la cantidad de dinero que deseas convertir");
    JLabel label2 = new JLabel("Elige el tipo de cambio");
    JLabel label3 = new JLabel("");
    JTextField entrada1 = new JTextField();
    JComboBox comboMoneda = new JComboBox();
    JButton ok = new JButton("Ok");
    JButton cancelar = new JButton("Cancelar");

    public longitud() {
        setTitle("Longitud");
        setLayout(null);
        label1.setBounds(15, 10, 400, 30);
        entrada1.setBounds(15, 40, 400, 30);
        label2.setBounds(15, 80, 400, 30);
        comboMoneda.setBounds(15, 110, 400, 30);
        ok.setBounds(100, 150, 100, 30);
        cancelar.setBounds(220, 150, 100, 30);
        label3.setBounds(15, 200, 400, 30);
        ok.addActionListener(this);
        cancelar.addActionListener(this);
        entrada1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.')) {
                    e.consume();  // ignore event
                }
            }
        });

        comboMoneda.addItem("Metros a Pulgadas");
        comboMoneda.addItem("Metros a Pies");
        comboMoneda.addItem("Metros a Yardas");
        comboMoneda.addItem("Metros a Millas");
        comboMoneda.addItem("Pulgadas a Metros");
        comboMoneda.addItem("Pies a Metros");
        comboMoneda.addItem("Yardas a Metros");
        comboMoneda.addItem("Millas a Metros");

        add(label1);
        add(entrada1);
        add(label2);
        add(comboMoneda);
        add(ok);
        add(cancelar);
        add(label3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancelar) {
            this.dispose();
        } else if (e.getSource() == ok) {
            if (entrada1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "No se encontró una cantidad válida");
            } else {
                String seleccion = comboMoneda.getSelectedItem().toString();
                DecimalFormat formato1 = new DecimalFormat("#.##");
                double in = 0.0254;
                double ft = 0.3048;
                double yd = 0.9144;
                double mi = 1609.34;
                if (seleccion.equals("Metros a Pulgadas")) {
                    var f = Double.parseDouble(entrada1.getText()) / in;
                    label3.setText(entrada1.getText() + " Metros son " + formato1.format(f) + " Pulgadas");
                }
                if (seleccion.equals("Metros a Pies")) {
                    var f = Double.parseDouble(entrada1.getText()) / ft;
                    label3.setText(entrada1.getText() + " Metros son " + formato1.format(f) + " Pies");
                }
                if (seleccion.equals("Metros a Yardas")) {
                    var f = Double.parseDouble(entrada1.getText()) / yd;
                    label3.setText(entrada1.getText() + " Metros son " + formato1.format(f) + " Yardas");
                }
                if (seleccion.equals("Metros a Millas")) {
                    var f = Double.parseDouble(entrada1.getText()) / mi;
                    label3.setText(entrada1.getText() + " Metros son " + formato1.format(f) + " Millas");
                }
                //------------------------------------
                if (seleccion.equals("Pulgadas a Metros")) {
                    var f = Double.parseDouble(entrada1.getText()) * in;
                    label3.setText(entrada1.getText() + " Pulgadas son " + formato1.format(f) + " Metros");
                }
                if (seleccion.equals("Pies a Metros")) {
                    var f = Double.parseDouble(entrada1.getText()) * ft;
                    label3.setText(entrada1.getText() + " Pies son " + formato1.format(f) + " Metros");
                }
                if (seleccion.equals("Yardas a Metros")) {
                    var f = Double.parseDouble(entrada1.getText()) * yd;
                    label3.setText(entrada1.getText() + " Yardas son " + formato1.format(f) + " Metros");
                }
                if (seleccion.equals("Millas a Metros")) {
                    var f = Double.parseDouble(entrada1.getText()) * mi;
                    label3.setText(entrada1.getText() + " Millas son " + formato1.format(f) + " Metros");
                }
            }
        }
    }
}