package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTwoNumber{
    public static void main(String[] args) {
        JFrame frame = new JFrame("AddTwoNumber");
        frame.setContentPane(new AddTwoNumber().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JTextArea param1Text;
    private JTextArea param2Text;
    private JTextArea eredmenyText;
    private JRadioButton osszeadRadioButton;
    private JRadioButton kivonRadioButton;
    private JRadioButton szorozRadioButton;
    private JButton szamolButton;
    private JLabel eredmenyLabel;
    private JComboBox comboBox1;


    public AddTwoNumber() {
        szamolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int param1=Integer.parseInt(param1Text.getText());
                int param2=Integer.parseInt(param2Text.getText());
                int result=0;
                if(osszeadRadioButton.isSelected()){
                    result=param1+param2;
                }else if (kivonRadioButton.isSelected()){
                    result=param1-param2;
                }else if (szorozRadioButton.isSelected()) {
                    result = param1 * param2;
                }
                eredmenyText.setText(Integer.toString(result));
            }
        });

        osszeadRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(osszeadRadioButton.isSelected()){
                    eredmenyLabel.setText("Összeg");
                }
            }
        });
        kivonRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(kivonRadioButton.isSelected()){
                    eredmenyLabel.setText("Különbség");
                }

            }
        });

        szorozRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(szorozRadioButton.isSelected()){
                    eredmenyLabel.setText("Szorzat");
                }

            }
        });
    }
}
