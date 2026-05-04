/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginform;

/**
 *
 * @author Takal
 */import javax.swing.*;
import java.awt.event.*;
public class LoginForm extends JFrame{
   

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JRadioButton adminBtn, userBtn;
    private JButton loginBtn;
    private ButtonGroup roleGroup;

    public LoginForm() {
        setTitle("Login Form");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Username Label & Field
        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(50, 30, 100, 25);
        add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setBounds(150, 30, 150, 25);
        add(txtUsername);

        // Password Label & Field
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 70, 100, 25);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 70, 150, 25);
        add(txtPassword);

        // Role Label
        JLabel lblRole = new JLabel("Role:");
        lblRole.setBounds(50, 110, 100, 25);
        add(lblRole);

        // Radio Buttons
        adminBtn = new JRadioButton("Admin");
        adminBtn.setBounds(150, 110, 80, 25);

        userBtn = new JRadioButton("User");
        userBtn.setBounds(230, 110, 80, 25);

        roleGroup = new ButtonGroup();
        roleGroup.add(adminBtn);
        roleGroup.add(userBtn);

        add(adminBtn);
        add(userBtn);

        // Login Button
        loginBtn = new JButton("submit");
        loginBtn.setBounds(150, 160, 100, 30);
        add(loginBtn);

    
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());
                String role = "";

                if (adminBtn.isSelected()) {
                    role = "Admin";
                } else if (userBtn.isSelected()) {
                    role = "User";
                } else {
                    role = "No role selected";
                }

                JOptionPane.showMessageDialog(null,
                        "The username is: " + username +
                        "\nThe password is: " + password +
                        "\nYour role is: " + role);
            }
        });

        
        getContentPane().setBackground(java.awt.Color.LIGHT_GRAY);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
