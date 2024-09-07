package Package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    private JTextField TXNum2;
    private JTextField TFNum1;
    private JButton BTNSuma;
    private JButton BTNDiv;
    private JButton BTNMult;
    private JButton BTNResta;
    private JButton borrarButton;
    private JPanel panelchido;


    public Form1() {

        BTNSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFNum1.getText());
                double num2 = Double.parseDouble(TXNum2.getText());

                JOptionPane.showInputDialog(null, "La Respuesta es: " + (num1 + num2));
            }
        });
        BTNResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFNum1.getText());
                double num2 = Double.parseDouble(TXNum2.getText());

                JOptionPane.showInputDialog(null, "La Respuesta es: " + (num1 - num2));

            }
        });
        BTNMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFNum1.getText());
                double num2 = Double.parseDouble(TXNum2.getText());

                JOptionPane.showInputDialog(null, "La Respuesta es: " + (num1 * num2));


            }
        });
        BTNDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(TFNum1.getText());
                double num2 = Integer.parseInt(TXNum2.getText());

                if (num2 == 0) {
                    JOptionPane.showInputDialog("ERROR");
                }

                JOptionPane.showInputDialog(null, "La Respuesta es: " + (num1 / num2));


            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TFNum1.setText("");
                TXNum2.setText("");
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("PRACTICA 2 Por: Francisco Cardenas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setContentPane(new Form1().panelchido);
        frame.pack();
        frame.setVisible(true);

    }
}



