import java.awt.Component;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddData extends JFrame {
    public ArrayList<Hotels> hotels = new ArrayList();
    public ArrayList<Libraries> libraries = new ArrayList();
    public ArrayList<TouristAttractions> touristAttractions = new ArrayList();
    public ArrayList<College> colleges = new ArrayList();
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddData frame = new AddData();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public AddData() {
        this.setTitle("AddData");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 470, 496);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        this.textField = new JTextField();
        this.textField.setColumns(10);
        this.textField.setBounds(139, 38, 191, 19);
        this.contentPane.add(this.textField);
        JLabel lblNewLabel = new JLabel("Name");
        lblNewLabel.setBounds(46, 41, 45, 13);
        this.contentPane.add(lblNewLabel);
        final TextArea textArea_1 = new TextArea();
        textArea_1.setBounds(46, 88, 284, 81);
        this.contentPane.add(textArea_1);
        JLabel lblNewLabel_3 = new JLabel("About");
        lblNewLabel_3.setBounds(46, 69, 45, 13);
        this.contentPane.add(lblNewLabel_3);
        this.textField_1 = new JTextField();
        this.textField_1.setColumns(10);
        this.textField_1.setBounds(139, 183, 191, 19);
        this.contentPane.add(this.textField_1);
        JLabel lblNewLabel_1 = new JLabel("Contact Info");
        lblNewLabel_1.setBounds(46, 186, 79, 13);
        this.contentPane.add(lblNewLabel_1);
        JLabel lblNewLabel_2 = new JLabel("Address");
        lblNewLabel_2.setBounds(46, 223, 65, 13);
        this.contentPane.add(lblNewLabel_2);
        final TextArea textArea = new TextArea();
        textArea.setBounds(46, 255, 284, 93);
        this.contentPane.add(textArea);
        final JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"College", "Tourist Attraction", "Library", "Hotel"}));
        comboBox.setBounds(46, 7, 136, 21);
        this.contentPane.add(comboBox);
        JButton btnNewButton = new JButton("Add Data");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String about = textArea_1.getText();
                String contact = AddData.this.textField_1.getText();
                String name = AddData.this.textField.getText();
                String address = textArea.getText();
                String place = comboBox.getSelectedItem().toString();
                if (address.length() > 50) {
                    JOptionPane.showMessageDialog((Component)null, "Address should not exceed 50 characters!");
                } else if (!about.equals("") && !contact.equals("") && !name.equals("") && !address.equals("") && contact.length() == 10) {
                    try {
                        FileWriter myWriter = new FileWriter("places.txt", true);
                        myWriter.write(place + "\n" + name + "\n" + about + "\n" + contact + "\n" + address + "\n");
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException var8) {
                        System.out.println("An error occurred.");
                        var8.printStackTrace();
                    }

                    if (place.equals("College")) {
                        College collxx = new College(name, about, contact, address);
                        AddData.this.colleges.add(collxx);
                        JOptionPane.showMessageDialog((Component)null, "College Added!");
                    }

                    if (place.equals("Tourist Attraction")) {
                        TouristAttractions collxxx = new TouristAttractions(name, about, contact, address);
                        AddData.this.touristAttractions.add(collxxx);
                        JOptionPane.showMessageDialog((Component)null, "Tourist Attraction Added!");
                    }

                    if (place.equals("Library")) {
                        Libraries coll = new Libraries(name, about, contact, address);
                        AddData.this.libraries.add(coll);
                        JOptionPane.showMessageDialog((Component)null, "Library Added!");
                    }

                    if (place.equals("Hotel")) {
                        Hotels collx = new Hotels(name, about, contact, address);
                        AddData.this.hotels.add(collx);
                        JOptionPane.showMessageDialog((Component)null, "Hotel Added!");
                    }
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Invalid Input!");
                }

            }
        });
        btnNewButton.setBounds(46, 381, 85, 21);
        this.contentPane.add(btnNewButton);
        JButton btnNewButton_1 = new JButton("Close");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AddData.this.dispose();
            }
        });
        btnNewButton_1.setBounds(146, 381, 79, 19);
        this.contentPane.add(btnNewButton_1);
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon(""));
        lblNewLabel_4.setBounds(0, 0, 456, 459);
        this.contentPane.add(lblNewLabel_4);
    }
}