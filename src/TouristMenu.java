import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TouristMenu extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TouristMenu frame = new TouristMenu();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public TouristMenu() {
        this.setTitle("TouristMenu");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 637, 411);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("View Hotels");
        lblNewLabel.setFont(new Font("Tahoma", 0, 15));
        lblNewLabel.setBounds(29, 23, 175, 23);
        this.contentPane.add(lblNewLabel);
        List<String> stringListclg = new ArrayList();

        try {
            File myObj = new File("places.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals("Hotel")) {
                    stringListclg.add(myReader.nextLine());
                    String d = myReader.nextLine();
                    String e = myReader.nextLine();
                    String var8 = myReader.nextLine();
                }
            }

            myReader.close();
        } catch (FileNotFoundException var15) {
            System.out.println("An error occurred.");
            var15.printStackTrace();
        }

        String[] stringArrclg = (String[])stringListclg.toArray(new String[0]);
        final JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(stringArrclg));
        comboBox.setBounds(29, 66, 536, 21);
        this.contentPane.add(comboBox);
        JButton btnNewButton = new JButton("View Hotels");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String name = comboBox.getSelectedItem().toString();
                String place = "Hotel";
                DisplayPlaces dp = new DisplayPlaces(place, name);
                dp.setVisible(true);
            }
        });
        btnNewButton.setBounds(29, 110, 123, 21);
        this.contentPane.add(btnNewButton);
        JLabel lblNewLabel_1 = new JLabel("View Attractions");
        lblNewLabel_1.setFont(new Font("Tahoma", 0, 15));
        lblNewLabel_1.setBounds(29, 178, 175, 23);
        this.contentPane.add(lblNewLabel_1);
        List<String> stringListlib = new ArrayList();

        try {
            File myObj = new File("places.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals("Tourist Attraction")) {
                    stringListlib.add(myReader.nextLine());
                    String d = myReader.nextLine();
                    String e = myReader.nextLine();
                    String var13 = myReader.nextLine();
                }
            }

            myReader.close();
        } catch (FileNotFoundException var14) {
            System.out.println("An error occurred.");
            var14.printStackTrace();
        }

        String[] stringArrlib = (String[])stringListlib.toArray(new String[0]);
        final JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(stringArrlib));
        comboBox_1.setBounds(29, 225, 536, 21);
        this.contentPane.add(comboBox_1);
        JButton btnNewButton_1 = new JButton("View Attractions");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String name = comboBox_1.getSelectedItem().toString();
                String place = "Tourist Attraction";
                DisplayPlaces dp = new DisplayPlaces(place, name);
                dp.setVisible(true);
            }
        });
        btnNewButton_1.setBounds(28, 269, 124, 21);
        this.contentPane.add(btnNewButton_1);
        JButton btnNewButton_2 = new JButton("Close");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                TouristMenu.this.dispose();
            }
        });
        btnNewButton_2.setBounds(177, 269, 99, 21);
        this.contentPane.add(btnNewButton_2);
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(""));
        lblNewLabel_2.setBounds(0, 0, 634, 377);
        this.contentPane.add(lblNewLabel_2);
    }
}