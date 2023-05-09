import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DisplayPlaces extends JFrame {
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    public DisplayPlaces(String place, String name) {
        this.setTitle("DisplayPlaces");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 433, 474);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("Name");
        lblNewLabel.setBounds(25, 23, 45, 13);
        this.contentPane.add(lblNewLabel);
        this.textField = new JTextField();
        this.textField.setBounds(118, 20, 191, 19);
        this.contentPane.add(this.textField);
        this.textField.setColumns(10);
        JLabel lblNewLabel_1 = new JLabel("Contact Info");
        lblNewLabel_1.setBounds(25, 168, 79, 13);
        this.contentPane.add(lblNewLabel_1);
        this.textField_1 = new JTextField();
        this.textField_1.setBounds(118, 165, 191, 19);
        this.contentPane.add(this.textField_1);
        this.textField_1.setColumns(10);
        JLabel lblNewLabel_2 = new JLabel("Address");
        lblNewLabel_2.setBounds(25, 205, 65, 13);
        this.contentPane.add(lblNewLabel_2);
        TextArea textArea = new TextArea();
        textArea.setBounds(25, 237, 284, 93);
        this.contentPane.add(textArea);
        JLabel lblNewLabel_3 = new JLabel("About");
        lblNewLabel_3.setBounds(25, 51, 45, 13);
        this.contentPane.add(lblNewLabel_3);
        TextArea textArea_1 = new TextArea();
        textArea_1.setBounds(25, 70, 284, 81);
        this.contentPane.add(textArea_1);

        try {
            File myObj = new File("places.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
                String plc = myReader.nextLine();
                String nm = myReader.nextLine();
                String abt = myReader.nextLine();
                String ctc = myReader.nextLine();
                String addr = myReader.nextLine();
                if (plc.equals(place) && name.equals(nm)) {
                    this.textField.setText(nm);
                    this.textField_1.setText(ctc);
                    textArea.setText(abt);
                    textArea_1.setText(addr);
                }
            }

            myReader.close();
        } catch (FileNotFoundException var16) {
            System.out.println("An error occurred.");
            var16.printStackTrace();
        }

        JButton btnNewButton = new JButton("Close");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                DisplayPlaces.this.dispose();
            }
        });
        btnNewButton.setBounds(226, 354, 83, 19);
        this.contentPane.add(btnNewButton);
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon(""));
        lblNewLabel_4.setBounds(0, 0, 419, 437);
        this.contentPane.add(lblNewLabel_4);
    }
}
