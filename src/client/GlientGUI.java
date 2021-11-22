package client;

import server.IMath;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

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
                textField3.setText("");
                textField3.setText(AllOperationWork("/") );

            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField3.setText("");
                textField3.setText(AllOperationWork("*") );
            }
        });
        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField3.setText("");
                textField3.setText(AllOperationWork("+") );
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new GlientGUI("RMI calculator");
        frame.setVisible(true);

    }

    private String AllOperationWork(String param) {
        int num1 = 0, num2 = 0;
        try {
            String num1S = textField1.getText();
            String num2S = textField2.getText();
            num1 = Integer.parseInt(num1S);
            num2 = Integer.parseInt(num2S);
        } catch (Exception ex) {

            return "Error";
        }
        Client client = new Client();

        try {
            return Integer.toString(client.inquiry(num1, num2, param));
        } catch (NamingException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
            return  ex.toString();
        }
        return "Error";
    }

}
