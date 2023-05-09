import java.awt.Component;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AdminLogin extends JFrame {
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminLogin frame = new AdminLogin();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public AdminLogin() {
        this.setTitle("Admin Login");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 395, 279);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("Username");
        lblNewLabel.setBounds(43, 46, 106, 13);
        this.contentPane.add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel("Password");
        lblNewLabel_1.setBounds(43, 87, 106, 13);
        this.contentPane.add(lblNewLabel_1);
        this.textField = new JTextField();
        this.textField.setBounds(159, 43, 96, 19);
        this.contentPane.add(this.textField);
        this.textField.setColumns(10);
        this.passwordField = new JPasswordField();
        this.passwordField.setBounds(159, 84, 96, 19);
        this.contentPane.add(this.passwordField);
        JButton btnNewButton = new JButton("Login");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String user = AdminLogin.this.textField.getText();
                String pass = String.valueOf(AdminLogin.this.passwordField.getPassword());
                String ad = "admin";
                if (user.equals(ad) && pass.equals(ad)) {
                    AdminMenu admin = new AdminMenu();
                    admin.setVisible(true);
                    AdminLogin.this.dispose();
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Invalid Username or password!");
                }

            }
        });
        btnNewButton.setBounds(159, 143, 85, 21);
        this.contentPane.add(btnNewButton);
        JButton btnNewButton_1 = new JButton("Close");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AdminLogin.this.dispose();
            }
        });
        btnNewButton_1.setBounds(159, 174, 85, 21);
        this.contentPane.add(btnNewButton_1);
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(""));
        lblNewLabel_2.setBounds(0, 0, 381, 242);
        this.contentPane.add(lblNewLabel_2);
    }
}
