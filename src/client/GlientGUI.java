package client;

import server.IMath;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GlientGUI extends JFrame {

    private JPanel mainPanel;
    private JTextField textField2;
    private JTextField textField1;
    private JTextField textField3;
    private JButton divisionButton;
    private JButton multiplicationButton;
    private JButton additionButton;

    public GlientGUI(String title) {
        super(title);
        this.setContentPane(mainPanel);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1S= textField1.getText();
                String num2S= textField2.getText();
                int num1=Integer.parseInt(num1S);
                int num2=Integer.parseInt(num2S);



            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new GlientGUI("RMI calculator");
        frame.setVisible(true);

    }
}
