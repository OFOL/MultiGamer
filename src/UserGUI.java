//I changed shit - so what? what's your problem

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.Insets;

public class UserGUI implements ActionListener {

    JFrame          frame;
    JPanel          panel;
    JPasswordField  password;
    JPasswordField  confirmPassword;
    JLabel          warningLabel;
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JLabel lblConfirmPassword;
    private JTextField textField_2;
    private JTextField textField_1;
    private JTextField textField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } 
                catch (Exception e) { e.printStackTrace(); }
                UserGUI window = new UserGUI();
                window.go();
            }
        });
    }

    public void go() {
        panel = new JPanel();
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWeights = new double[]{0.0, 0.0};
        panel.setLayout(gbl_panel);
        panel.setBackground(Color.BLUE);

        frame = new JFrame("Create a new account");
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setUndecorated(true);
        frame.setTitle("Exist!");
        
        
        lblUsername = new JLabel("Username:");
        GridBagConstraints gbc_lblUsername = new GridBagConstraints();
        gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
        gbc_lblUsername.anchor = GridBagConstraints.WEST;
        gbc_lblUsername.gridx = 0;
        gbc_lblUsername.gridy = 1;
        panel.add(lblUsername, gbc_lblUsername);
        
        textField = new JTextField();
        textField.setColumns(10);
        GridBagConstraints gbc_textField = new GridBagConstraints();
        gbc_textField.insets = new Insets(0, 0, 5, 0);
        gbc_textField.anchor = GridBagConstraints.WEST;
        gbc_textField.gridx = 1;
        gbc_textField.gridy = 1;
        panel.add(textField, gbc_textField);
        
        lblPassword = new JLabel("Password:");
        lblPassword.setEnabled(true);
        GridBagConstraints gbc_lblPassword = new GridBagConstraints();
        gbc_lblPassword.anchor = GridBagConstraints.WEST;
        gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
        gbc_lblPassword.gridx = 1;
        gbc_lblPassword.gridy = 4;
        panel.add(lblPassword, gbc_lblPassword);
        
        textField_1 = new JTextField();
        textField_1.setEnabled(true);
        textField_1.setColumns(10);
        GridBagConstraints gbc_textField_1 = new GridBagConstraints();
        gbc_textField_1.anchor = GridBagConstraints.WEST;
        gbc_textField_1.insets = new Insets(0, 0, 5, 0);
        gbc_textField_1.gridx = 2;
        gbc_textField_1.gridy = 4;
        panel.add(textField_1, gbc_textField_1);
        
        lblConfirmPassword = new JLabel("Confirm Password:");
        GridBagConstraints gbc_lblConfirmPassword = new GridBagConstraints();
        gbc_lblConfirmPassword.anchor = GridBagConstraints.WEST;
        gbc_lblConfirmPassword.insets = new Insets(0, 0, 0, 5);
        gbc_lblConfirmPassword.gridx = 0;
        gbc_lblConfirmPassword.gridy = 3;
        panel.add(lblConfirmPassword, gbc_lblConfirmPassword);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        GridBagConstraints gbc_textField_2 = new GridBagConstraints();
        gbc_textField_2.anchor = GridBagConstraints.WEST;
        gbc_textField_2.gridx = 1;
        gbc_textField_2.gridy = 3;
        panel.add(textField_2, gbc_textField_2);

        JButton createAccount = new JButton("Create this account");
        frame.getContentPane().add(BorderLayout.SOUTH, createAccount);
        createAccount.addActionListener(this);

        warningLabel = new JLabel();
        frame.getContentPane().add(BorderLayout.NORTH, warningLabel);

        frame.setSize(300, 250);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
        if (!(Arrays.equals(password.getPassword(), confirmPassword.getPassword()))) { warningLabel.setText("Your passwords do not match! Please try again."); } 
        else if (password.getPassword().length < 1) { warningLabel.setText("That password is not long enough! Please try again!");}
        else {
            try {
//            	User user = new User();
                BufferedWriter writer = new BufferedWriter(new FileWriter("nuserInfo.txt"));
//                writer.write(username.getText() + "/" + new String(password.getPassword()) + "/" + user.getID());
//                user.setName(username.getText());
                writer.close(); }
            catch (IOException e) { e.printStackTrace(); }
        }
    }
}

//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Arrays;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//import javax.swing.SwingUtilities;
//import javax.swing.UIManager;
//
//public class CreateAccount implements ActionListener {
//
//    JFrame          frame;
//    JPanel          panel;
//    JTextField      username;
//    JPasswordField  password;
//    JPasswordField  confirmPassword;
//    JLabel          warningLabel;
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    UIManager.setLookAndFeel(UIManager
//                            .getSystemLookAndFeelClassName());
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                CreateAccount window = new CreateAccount();
//                window.go();
//            }
//        });
//    }
//
//    public void go() {
//        panel = new JPanel();
//        panel.setLayout(new GridBagLayout());
//        panel.setBackground(Color.ORANGE);
//
//        frame = new JFrame("Create a new account");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().add(BorderLayout.CENTER, panel);
//
//        JLabel userLabel = new JLabel("Username:");
//        JLabel passwordLabel = new JLabel("Password:");
//        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
//        username = new JTextField(15);
//        password = new JPasswordField(15);
//        confirmPassword = new JPasswordField(15);
//
//        GridBagConstraints right = new GridBagConstraints();
//        right.anchor = GridBagConstraints.WEST;
//        GridBagConstraints left = new GridBagConstraints();
//        left.anchor = GridBagConstraints.EAST;
//
//        right.weightx = (int) 2;
//        right.fill = GridBagConstraints.REMAINDER;
//        right.gridwidth = GridBagConstraints.REMAINDER;
//        // actual GUI
//
//        panel.add(userLabel, left);
//        panel.add(username, right);
//        panel.add(passwordLabel, left);
//        panel.add(password, right);
//        panel.add(confirmPasswordLabel, left);
//        panel.add(confirmPassword, right);
//
//        JButton createAccount = new JButton("Create this account");
//        frame.getContentPane().add(BorderLayout.SOUTH, createAccount);
//        createAccount.addActionListener(this);
//
//        warningLabel = new JLabel();
//        frame.getContentPane().add(BorderLayout.NORTH, warningLabel);
//
//        frame.setSize(300, 250);
//        frame.setVisible(true);
//    }
//
//    // This is where the problem is!
//    public void actionPerformed(ActionEvent event) {
//        if (!(Arrays.equals(password.getPassword(),
//                confirmPassword.getPassword()))) {
//            warningLabel
//                    .setText("Your passwords do not match! Please try again.");
//        } else if (password.getPassword().length < 1) {
//            warningLabel
//                    .setText("That password is not long enough! Please try again!");
//        } else {
//            try {
//                BufferedWriter writer = new BufferedWriter(new FileWriter(
//                        "nuserInfo.txt"));
//                writer.write(username.getText() + "/"
//                        + new String(password.getPassword()));
//                writer.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

