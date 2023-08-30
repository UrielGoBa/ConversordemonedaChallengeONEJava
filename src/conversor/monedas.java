package conversor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.border.EmptyBorder;

public class monedas extends JFrame implements ActionListener {
    
    JLabel label1 = new JLabel("Ingresa la cantidad de dinero que deseas convertir");
    JLabel label2 = new JLabel("Elige el tipo de cambio");
    JTextField entrada1 = new JTextField();
    JComboBox comboMoneda = new JComboBox();
    JButton ok = new JButton("Ok");
    JButton cancelar = new JButton("Cancelar");
    JPanel h = new JPanel();
    
    public monedas() {
        setTitle("Monedas");
        setLayout(new GridLayout(6, 1));
        label1.setBounds(10, 10, 400, 30);
        entrada1.setBounds(10, 50, 400, 30);
        label2.setBounds(10, 100, 400, 30);
        comboMoneda.setBounds(10, 150, 400, 30);
        ok.setBounds(300, 250, 100, 30);
        cancelar.setBounds(300, 250, 100, 30);
//        h.setBounds(20,20,400,50);
        h.setLayout(null);
        h.add(entrada1);

//        setBorder(new EmptyBorder(20, 20, 20, 20));
        add(label1);
        add(h);
        add(label2);
        add(comboMoneda);
        add(ok);
        add(cancelar);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
