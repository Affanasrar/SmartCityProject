import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AdminMenu extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminMenu frame = new AdminMenu();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public AdminMenu() {
        this.setTitle("AdminMenu");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 395, 309);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("Add Data");
        lblNewLabel.setFont(new Font("Tahoma", 0, 20));
        lblNewLabel.setBounds(35, 39, 97, 33);
        this.contentPane.add(lblNewLabel);
        JButton btnNewButton = new JButton("Add");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AddData a = new AddData();
                a.setVisible(true);
            }
        });
        btnNewButton.setFont(new Font("Tahoma", 0, 14));
        btnNewButton.setBounds(154, 42, 97, 31);
        this.contentPane.add(btnNewButton);
        JLabel lblNewLabel_1 = new JLabel("Delete Data");
        lblNewLabel_1.setFont(new Font("Tahoma", 0, 20));
        lblNewLabel_1.setBounds(35, 113, 129, 33);
        this.contentPane.add(lblNewLabel_1);
        JButton btnNewButton_1 = new JButton("Delete");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                DeleteData d = new DeleteData();
                d.setVisible(true);
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", 0, 14));
        btnNewButton_1.setBounds(154, 115, 97, 33);
        this.contentPane.add(btnNewButton_1);
        JButton btnNewButton_2 = new JButton("Close");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AdminMenu.this.dispose();
            }
        });
        btnNewButton_2.setBounds(47, 207, 97, 21);
        this.contentPane.add(btnNewButton_2);
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(""));
        lblNewLabel_2.setBounds(0, 0, 381, 272);
        this.contentPane.add(lblNewLabel_2);
    }
}
