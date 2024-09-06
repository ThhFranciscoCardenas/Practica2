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

    public Form1(){


        BTNSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double num1 = Integer.parseInt(TFNum1.getText());
               double num2 = Integer.parseInt(TXNum2.getText());

               JOptionPane.showInputDialog(null, "La Respuesta es: "+ (num1+num2));
            }
        });
        BTNResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Integer.parseInt(TFNum1.getText());
                double num2 = Integer.parseInt(TXNum2.getText());

                JOptionPane.showInputDialog(null, "La Respuesta es: "+ (num1-num2));

            }
        });
        BTNMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    double num1 = Integer.parseInt(TFNum1.getText());
                    double num2 = Integer.parseInt(TXNum2.getText());

                    JOptionPane.showInputDialog(null, "La Respuesta es: "+ (num1*num2));


                }
        });
        BTNDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    double num1 = Integer.parseInt(TFNum1.getText());
                    double num2 = Integer.parseInt(TXNum2.getText());

                    JOptionPane.showInputDialog(null, "La Respuesta es: "+ (num1/num2));


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
        Form1 form = new Form1();


    }
}


