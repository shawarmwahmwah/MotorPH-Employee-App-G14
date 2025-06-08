package g14javaapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class G14javaapplication {

    JFrame frame;

    public G14javaapplication() {
        frame = new JFrame("Payroll System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Welcome to Payroll System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        JLabel userLabel = new JLabel("User:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        JLabel roleLabel = new JLabel("Role:");
        JTextField roleField = new JTextField();

        JLabel empIdLabel = new JLabel("Employee ID:");
        JTextField empIdField = new JTextField();

        formPanel.add(userLabel);
        formPanel.add(userField);
        formPanel.add(passLabel);
        formPanel.add(passField);
        formPanel.add(roleLabel);
        formPanel.add(roleField);
        formPanel.add(empIdLabel);
        formPanel.add(empIdField);

        JButton enterButton = new JButton("Enter");
        enterButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                showDashboard();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(enterButton);

        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private void showDashboard() {
        JFrame dashFrame = new JFrame("Dashboard");
        dashFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dashFrame.setSize(400, 300);
        dashFrame.setLocationRelativeTo(null);

        JPanel dashPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        dashPanel.setBorder(BorderFactory.createEmptyBorder(40, 80, 40, 80));

        JButton empButton = new JButton("Employee");
        JButton attButton = new JButton("Attendance");
        JButton payrollButton = new JButton("Payroll");

        empButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        attButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        payrollButton.setFont(new Font("SansSerif", Font.BOLD, 16));

        dashPanel.add(empButton);
        dashPanel.add(attButton);
        dashPanel.add(payrollButton);

        dashFrame.add(dashPanel);
        dashFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new G14javaapplication();
    }
}
