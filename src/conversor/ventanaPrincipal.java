package conversor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ventanaPrincipal extends JFrame implements ActionListener {
    
    JButton boton1 = new JButton("Ok");
    JButton boton2 = new JButton("Cancelar");
    JComboBox combo1 = new JComboBox();
    
    public ventanaPrincipal() {
        JPanel p = new JPanel();
        JPanel q = new JPanel();
        setTitle("Menu");
        setLayout(new BorderLayout());
        combo1.setBounds(10, 10, 80, 20);
        combo1.addItem("Conversor de Moneda");
        combo1.addItem("Conversor de unidades de Longitud");
        boton1.setBounds(300, 250, 100, 30);
        boton2.setBounds(300, 250, 100, 30);
        q.setBorder(new EmptyBorder(10, 10, 20, 10));
        p.add(combo1);
        q.add(boton1);
        q.add(boton2);
        
        add("North",new JLabel(" "));
        add("Center",p);
        add("South",q);
        boton1.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        ventanaPrincipal nuevaVentana = new ventanaPrincipal();
        nuevaVentana.setBounds(0, 0, 400, 150);
        nuevaVentana.setVisible(true);
        nuevaVentana.setLocationRelativeTo(null);
        nuevaVentana.setResizable(false);
        nuevaVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}