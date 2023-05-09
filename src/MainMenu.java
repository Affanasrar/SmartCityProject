import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainMenu extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainMenu frame = new MainMenu();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public MainMenu() {
        this.setTitle("MainMenu");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 900, 600);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);

        JLabel headingLabel = new JLabel("Smart City Project");
        headingLabel.setFont(new Font("Calibri", Font.BOLD, 36));
        headingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headingLabel.setBounds(200, 50, 500, 50);
        this.contentPane.add(headingLabel);

        JLabel lblNewLabel_1 = new JLabel("New user? Click here to register");
        lblNewLabel_1.setFont(new Font("Calibri", 1, 16));
        lblNewLabel_1.setBounds(98, 130, 241, 21);
        this.contentPane.add(lblNewLabel_1);
        JButton btnNewButton = new JButton("Sign up");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                SignUp signup = new SignUp();
                signup.setVisible(true);
            }
        });
        btnNewButton.setFont(new Font("Tahoma", 0, 13));
        btnNewButton.setBounds(349, 122, 133, 31);
        this.contentPane.add(btnNewButton);
        JLabel lblNewLabel = new JLabel("Existing user? Click here to login");
        lblNewLabel.setFont(new Font("Calibri", 1, 16));
        lblNewLabel.setBounds(98, 190, 229, 36);
        this.contentPane.add(lblNewLabel);
        JButton btnNewButton_1 = new JButton("Login");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Login login = new Login();
                login.setVisible(true);
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", 0, 13));
        btnNewButton_1.setBounds(349, 190, 133, 31);
        this.contentPane.add(btnNewButton_1);
        JButton btnNewButton_3 = new JButton("Admin login");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AdminLogin adminlogin = new AdminLogin();
                adminlogin.setVisible(true);
            }
        });
        btnNewButton_3.setFont(new Font("Tahoma", 0, 13));
        btnNewButton_3.setBounds(688, 122, 133, 29);
        this.contentPane.add(btnNewButton_3);

        JLabel finalYearLabel = new JLabel("SHU Students Final Year Project");
        finalYearLabel.setFont(new Font("Calibri", Font.PLAIN, 12));
        finalYearLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        finalYearLabel.setBounds(700, 550, 180, 15);
        this.contentPane.add(finalYearLabel);

        JLabel Background = new JLabel("Register");
        Background.setIcon(new ImageIcon("E:\\SmartCity Project Final\\SmartCity\\ProjectImages\\Backimg.jpg"));
        Background.setBounds(0, 0, 886, 563);
        this.contentPane.add(Background);

    }
}