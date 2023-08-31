package conversor;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;
//import javax.swing.border.EmptyBorder;

public class monedas extends JFrame implements ActionListener {

    JLabel label1 = new JLabel("Ingresa la cantidad de dinero que deseas convertir");
    JLabel label2 = new JLabel("Elige el tipo de cambio");
    JLabel label3 = new JLabel("");
    JTextField entrada1 = new JTextField();
    JComboBox comboMoneda = new JComboBox();
    JButton ok = new JButton("Ok");
    JButton cancelar = new JButton("Cancelar");
//    JPanel h = new JPanel();

    public monedas() {
        setTitle("Monedas");
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

        comboMoneda.addItem("MXN to USD");
        comboMoneda.addItem("MXN to EUR");
        comboMoneda.addItem("MXN to GBP");
        comboMoneda.addItem("MXN to JPY");
        comboMoneda.addItem("MXN to KRW");
        comboMoneda.addItem("USD to MXN");
        comboMoneda.addItem("EUR to MXN");
        comboMoneda.addItem("GBP to MXN");
        comboMoneda.addItem("JPY to MXN");
        comboMoneda.addItem("KRW to MXN");

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
                double KRW = 0.013;
                double JPY = 0.12;
                double GBP = 21.59;
                double EUR = 18.42;
                double USD = 16.96;
                if (seleccion.equals("MXN to USD")) {
                    var f = Double.parseDouble(entrada1.getText()) / USD;
                    label3.setText("$" + entrada1.getText() + " Pesos Mexicanos son $" + formato1.format(f) + " Dólares Americanos");
                }
                if (seleccion.equals("MXN to EUR")) {
                    var f = Double.parseDouble(entrada1.getText()) / EUR;
                    label3.setText("$" + entrada1.getText() + " Pesos Mexicanos son $" + formato1.format(f) + " Euros");
                }
                if (seleccion.equals("MXN to GBP")) {
                    var f = Double.parseDouble(entrada1.getText()) / GBP;
                    label3.setText("$" + entrada1.getText() + " Pesos Mexicanos son $" + formato1.format(f) + " Libras Esterlinas");
                }
                if (seleccion.equals("MXN to JPY")) {
                    var f = Double.parseDouble(entrada1.getText()) / JPY;
                    label3.setText("$" + entrada1.getText() + " Pesos Mexicanos son $" + formato1.format(f) + " Yenes Japoneses");
                }
                if (seleccion.equals("MXN to KRW")) {
                    var f = Double.parseDouble(entrada1.getText()) / KRW;
                    label3.setText("$" + entrada1.getText() + " Pesos Mexicanos son $" + formato1.format(f) + " Won Surcoreano");
                }
                if (seleccion.equals("USD to MXN")) {
                    var f = Double.parseDouble(entrada1.getText()) * USD;
                    label3.setText("$" + entrada1.getText() + " Dolares Americanos son $" + formato1.format(f) + " Pesos Mexicanos");
                }
                if (seleccion.equals("EUR to MXN")) {
                    var f = Double.parseDouble(entrada1.getText()) * EUR;
                    label3.setText("$" + entrada1.getText() + " Euros son $" + formato1.format(f) + " Pesos Mexicanos");
                }
                if (seleccion.equals("GBP to MXN")) {
                    var f = Double.parseDouble(entrada1.getText()) * GBP;
                    label3.setText("$" + entrada1.getText() + " Libras Esterlinas son $" + formato1.format(f) + " Pesos Mexicanos");
                }
                if (seleccion.equals("JPY to MXN")) {
                    var f = Double.parseDouble(entrada1.getText()) * JPY;
                    label3.setText("$" + entrada1.getText() + " Yenes Japoneses son $" + formato1.format(f) + " Pesos Mexicanos");
                }
                if (seleccion.equals("KRW to MXN")) {
                    var f = Double.parseDouble(entrada1.getText()) * KRW;
                    label3.setText("$" + entrada1.getText() + " Won Surcoreanos son $" + formato1.format(f) + " Pesos Mexicanos");
                }
            }
        }

    }

}
