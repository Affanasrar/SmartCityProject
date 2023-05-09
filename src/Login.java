import java.awt.Component;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public Login() {
        this.setTitle("Login");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 450, 300);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("Username");
        lblNewLabel.setBounds(55, 47, 116, 13);
        this.contentPane.add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel("Password");
        lblNewLabel_1.setBounds(55, 86, 116, 13);
        this.contentPane.add(lblNewLabel_1);
        this.textField = new JTextField();
        this.textField.setBounds(181, 44, 139, 19);
        this.contentPane.add(this.textField);
        this.textField.setColumns(10);
        this.passwordField = new JPasswordField();
        this.passwordField.setBounds(181, 83, 139, 19);
        this.contentPane.add(this.passwordField);
        JLabel lblNewLabel_2 = new JLabel("User Type");
        lblNewLabel_2.setBounds(56, 132, 115, 13);
        this.contentPane.add(lblNewLabel_2);
        final JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Student", "Tourist"}));
        comboBox.setBounds(181, 128, 139, 21);
        this.contentPane.add(comboBox);
        JButton btnNewButton = new JButton("Login");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String username = Login.this.textField.getText();
                String pass = String.valueOf(Login.this.passwordField.getPassword());
                String usertype = comboBox.getSelectedItem().toString();
                String chk = username + " " + pass + " " + usertype;
                boolean flag = false;

                try {
                    File myObj = new File("usernames.txt");
                    Scanner myReader = new Scanner(myObj);

                    while(myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        if (data.equals(chk)) {
                            flag = true;
                        }
                    }

                    myReader.close();
                } catch (FileNotFoundException var10) {
                    System.out.println("An error occurred.");
                    var10.printStackTrace();
                }

                if (flag && usertype.equals("Student")) {
                    StudentMenu sm = new StudentMenu();
                    sm.setVisible(true);
                    Login.this.dispose();
                }

                if (flag && usertype.equals("Tourist")) {
                    TouristMenu smx = new TouristMenu();
                    smx.setVisible(true);
                    Login.this.dispose();
                }

                if (!flag) {
                    JOptionPane.showMessageDialog((Component)null, "Invalid Username or password!");
                }

            }
        });
        btnNewButton.setBounds(181, 187, 68, 21);
        this.contentPane.add(btnNewButton);
        JButton btnNewButton_1 = new JButton("Close");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Login.this.dispose();
            }
        });
        btnNewButton_1.setBounds(259, 187, 68, 21);
        this.contentPane.add(btnNewButton_1);
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon(""));
        lblNewLabel_3.setBounds(0, 0, 436, 263);
        this.contentPane.add(lblNewLabel_3);
    }
}