import java.awt.Component;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SignUp extends JFrame {
    public ArrayList<UserDetails> users = new ArrayList();
    public UserDetails u1 = new UserDetails("affan", "affan", "affanahmed", "Student", 19);
    public UserDetails u2 = new UserDetails("affanahmed", "affan", "affan", "Tourist", 20);
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignUp frame = new SignUp();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public SignUp() {
        this.users.add(this.u1);
        this.users.add(this.u2);
        this.setTitle("Sign Up");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 496, 351);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("Username");
        lblNewLabel.setBounds(70, 31, 129, 13);
        this.contentPane.add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel("Password");
        lblNewLabel_1.setBounds(70, 65, 129, 13);
        this.contentPane.add(lblNewLabel_1);
        JLabel lblNewLabel_2 = new JLabel("Name");
        lblNewLabel_2.setBounds(70, 98, 129, 13);
        this.contentPane.add(lblNewLabel_2);
        JLabel lblNewLabel_3 = new JLabel("Age");
        lblNewLabel_3.setBounds(70, 133, 129, 13);
        this.contentPane.add(lblNewLabel_3);
        JLabel lblNewLabel_4 = new JLabel("Type of User");
        lblNewLabel_4.setBounds(70, 166, 129, 13);
        this.contentPane.add(lblNewLabel_4);
        String[] user_type = new String[]{"Student", "Tourist"};
        final JComboBox comboBox = new JComboBox(user_type);
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Student", "Tourist"}));
        comboBox.setBounds(224, 162, 87, 21);
        this.contentPane.add(comboBox);
        this.textField = new JTextField();
        this.textField.setBounds(224, 28, 151, 19);
        this.contentPane.add(this.textField);
        this.textField.setColumns(10);
        this.textField_1 = new JTextField();
        this.textField_1.setBounds(224, 95, 151, 19);
        this.contentPane.add(this.textField_1);
        this.textField_1.setColumns(10);
        this.textField_2 = new JTextField();
        this.textField_2.setBounds(224, 130, 151, 19);
        this.contentPane.add(this.textField_2);
        this.textField_2.setColumns(10);
        this.passwordField = new JPasswordField();
        this.passwordField.setBounds(224, 62, 151, 19);
        this.contentPane.add(this.passwordField);
        JButton btnNewButton = new JButton("Sign up");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String usnm = SignUp.this.textField.getText();
                String pass = String.valueOf(SignUp.this.passwordField.getPassword());
                String name = SignUp.this.textField_1.getText();
                String agge = SignUp.this.textField_2.getText();
                boolean flag = false;
                char[] chars = name.toCharArray();
                new StringBuilder();
                char[] var14 = chars;
                int var13 = chars.length;

                for(int var12 = 0; var12 < var13; ++var12) {
                    char c = var14[var12];
                    if (Character.isDigit(c)) {
                        flag = true;
                        break;
                    }
                }

                String ustype = comboBox.getSelectedItem().toString();
                if (flag) {
                    JOptionPane.showMessageDialog((Component)null, "Name should not contain numbers!!");
                } else if (!agge.matches("[0-9]+")) {
                    JOptionPane.showMessageDialog((Component)null, "Age should be a whole number!!");
                } else if (!usnm.equals("") && !pass.equals("") && !name.equals("") && !SignUp.this.textField_2.getText().equals("")) {
                    int age = Integer.parseInt(SignUp.this.textField_2.getText());
                    UserDetails u = new UserDetails(name, pass, usnm, ustype, age);
                    SignUp.this.users.add(u);
                    Login login = new Login();
                    login.setVisible(true);
                    SignUp.this.dispose();
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Invalid Input!!");
                }

            }
        });
        btnNewButton.setBounds(226, 227, 85, 21);
        this.contentPane.add(btnNewButton);
        JButton btnNewButton_1 = new JButton("Close");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                SignUp.this.dispose();
            }
        });
        btnNewButton_1.setBounds(321, 227, 76, 21);
        this.contentPane.add(btnNewButton_1);
    }
}

