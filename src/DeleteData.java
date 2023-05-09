import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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

public class DeleteData extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DeleteData frame = new DeleteData();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public DeleteData() {
        this.setTitle("DeleteData");
        List<String> colleges = new ArrayList();

        String data;
        String d;
        try {
            File myObj = new File("places.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
                 data = myReader.nextLine();
                if (data.equals("College")) {
                    colleges.add(myReader.nextLine());
                    d = myReader.nextLine();
                    data = myReader.nextLine();
                    d = myReader.nextLine();
                }
            }

            myReader.close();
        } catch (FileNotFoundException var26) {
            System.out.println("An error occurred.");
            var26.printStackTrace();
        }

        String[] collegearray = (String[])colleges.toArray(new String[0]);
        List<String> library = new ArrayList();


        try {
            File myObj = new File("places.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
                data = myReader.nextLine();
                if (data.equals("Library")) {
                    library.add(myReader.nextLine());
                    d = myReader.nextLine();
                    data = myReader.nextLine();
                    d = myReader.nextLine();
                }
            }

            myReader.close();
        } catch (FileNotFoundException var25) {
            System.out.println("An error occurred.");
            var25.printStackTrace();
        }

        String[] libraryarray = (String[])library.toArray(new String[0]);
        List<String> attractions = new ArrayList();


        try {
            File myObj = new File("places.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
                data = myReader.nextLine();
                if (data.equals("Tourist Attraction")) {
                    attractions.add(myReader.nextLine());
                    d = myReader.nextLine();
                    data = myReader.nextLine();
                    d = myReader.nextLine();
                }
            }

            myReader.close();
        } catch (FileNotFoundException var24) {
            System.out.println("An error occurred.");
            var24.printStackTrace();
        }

        String[] attractionarray = (String[])attractions.toArray(new String[0]);
        List<String> hotels = new ArrayList();

        try {
            File myObj = new File("places.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
                data = myReader.nextLine();
                if (data.equals("Hotel")) {
                    hotels.add(myReader.nextLine());
                    d = myReader.nextLine();
                    String e = myReader.nextLine();
                    String var13 = myReader.nextLine();
                }
            }

            myReader.close();
        } catch (FileNotFoundException var23) {
            System.out.println("An error occurred.");
            var23.printStackTrace();
        }

        String[] hotelarray = (String[])hotels.toArray(new String[0]);
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 427, 476);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("College");
        lblNewLabel.setBounds(24, 22, 65, 13);
        this.contentPane.add(lblNewLabel);
        final JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(collegearray));
        comboBox.setBounds(24, 45, 356, 21);
        this.contentPane.add(comboBox);
        JButton btnNewButton = new JButton("Delete");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    String name = comboBox.getSelectedItem().toString();
                    String place = "College";
                    File myObj = new File("places.txt");
                    Scanner myReader = new Scanner(myObj);

                    while(true) {
                        String plc;
                        String nm;
                        String abt;
                        String ctc;
                        String addr;
                        do {
                            if (!myReader.hasNextLine()) {
                                myReader.close();
                                return;
                            }

                            plc = myReader.nextLine();
                            nm = myReader.nextLine();
                            abt = myReader.nextLine();
                            ctc = myReader.nextLine();
                            addr = myReader.nextLine();
                        } while(plc.equals(place) && name.equals(nm));

                        try {
                            FileWriter myWriter = new FileWriter("places.txt");
                            myWriter.write(plc + "\n" + nm + "\n" + abt + "\n" + ctc + "\n" + addr + "\n");
                            myWriter.close();
                            System.out.println("Successfully wrote to the file.");
                        } catch (IOException var12) {
                            System.out.println("An error occurred.");
                            var12.printStackTrace();
                        }
                    }
                } catch (FileNotFoundException var13) {
                    System.out.println("An error occurred.");
                    var13.printStackTrace();
                }
            }
        });
        btnNewButton.setBounds(24, 76, 85, 21);
        this.contentPane.add(btnNewButton);
        JLabel lblNewLabel_1 = new JLabel("Library");
        lblNewLabel_1.setBounds(24, 121, 45, 13);
        this.contentPane.add(lblNewLabel_1);
        final JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(libraryarray));
        comboBox_1.setBounds(24, 144, 349, 21);
        this.contentPane.add(comboBox_1);
        JButton btnNewButton_1 = new JButton("Delete");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    String name = comboBox_1.getSelectedItem().toString();
                    String place = "Library";
                    File myObj = new File("places.txt");
                    Scanner myReader = new Scanner(myObj);

                    while(true) {
                        String plc;
                        String nm;
                        String abt;
                        String ctc;
                        String addr;
                        do {
                            if (!myReader.hasNextLine()) {
                                myReader.close();
                                return;
                            }

                            plc = myReader.nextLine();
                            nm = myReader.nextLine();
                            abt = myReader.nextLine();
                            ctc = myReader.nextLine();
                            addr = myReader.nextLine();
                        } while(plc.equals(place) && name.equals(nm));

                        try {
                            FileWriter myWriter = new FileWriter("places2.txt");
                            myWriter.write(plc + "\n" + nm + "\n" + abt + "\n" + ctc + "\n" + addr + "\n");
                            myWriter.close();
                            System.out.println("Successfully wrote to the file.");
                        } catch (IOException var12) {
                            System.out.println("An error occurred.");
                            var12.printStackTrace();
                        }
                    }
                } catch (FileNotFoundException var13) {
                    System.out.println("An error occurred.");
                    var13.printStackTrace();
                }
            }
        });
        btnNewButton_1.setBounds(24, 175, 85, 21);
        this.contentPane.add(btnNewButton_1);
        JLabel lblNewLabel_2 = new JLabel("Tourist Attractions");
        lblNewLabel_2.setBounds(24, 219, 105, 13);
        this.contentPane.add(lblNewLabel_2);
        final JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setModel(new DefaultComboBoxModel(attractionarray));
        comboBox_2.setBounds(24, 242, 349, 21);
        this.contentPane.add(comboBox_2);
        JButton btnNewButton_2 = new JButton("Delete");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    String name = comboBox_2.getSelectedItem().toString();
                    String place = "Tourist Attraction";
                    File myObj = new File("places.txt");
                    Scanner myReader = new Scanner(myObj);

                    while(true) {
                        String plc;
                        String nm;
                        String abt;
                        String ctc;
                        String addr;
                        do {
                            if (!myReader.hasNextLine()) {
                                myReader.close();
                                return;
                            }

                            plc = myReader.nextLine();
                            nm = myReader.nextLine();
                            abt = myReader.nextLine();
                            ctc = myReader.nextLine();
                            addr = myReader.nextLine();
                        } while(plc.equals(place) && name.equals(nm));

                        try {
                            FileWriter myWriter = new FileWriter("places2.txt");
                            myWriter.write(plc + "\n" + nm + "\n" + abt + "\n" + ctc + "\n" + addr + "\n");
                            myWriter.close();
                            System.out.println("Successfully wrote to the file.");
                        } catch (IOException var12) {
                            System.out.println("An error occurred.");
                            var12.printStackTrace();
                        }
                    }
                } catch (FileNotFoundException var13) {
                    System.out.println("An error occurred.");
                    var13.printStackTrace();
                }
            }
        });
        btnNewButton_2.setBounds(24, 273, 85, 21);
        this.contentPane.add(btnNewButton_2);
        JLabel lblNewLabel_3 = new JLabel("Hotels");
        lblNewLabel_3.setBounds(24, 317, 45, 13);
        this.contentPane.add(lblNewLabel_3);
        final JComboBox comboBox_3 = new JComboBox();
        comboBox_3.setModel(new DefaultComboBoxModel(hotelarray));
        comboBox_3.setBounds(24, 340, 349, 21);
        this.contentPane.add(comboBox_3);
        JButton btnNewButton_3 = new JButton("Delete");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    String name = comboBox_3.getSelectedItem().toString();
                    String place = "Hotel";
                    File myObj = new File("places.txt");
                    Scanner myReader = new Scanner(myObj);

                    while(true) {
                        String plc;
                        String nm;
                        String abt;
                        String ctc;
                        String addr;
                        do {
                            if (!myReader.hasNextLine()) {
                                myReader.close();
                                return;
                            }

                            plc = myReader.nextLine();
                            nm = myReader.nextLine();
                            abt = myReader.nextLine();
                            ctc = myReader.nextLine();
                            addr = myReader.nextLine();
                        } while(plc.equals(place) && name.equals(nm));

                        try {
                            FileWriter myWriter = new FileWriter("places2.txt");
                            myWriter.write(plc + "\n" + nm + "\n" + abt + "\n" + ctc + "\n" + addr + "\n");
                            myWriter.close();
                            System.out.println("Successfully wrote to the file.");
                        } catch (IOException var12) {
                            System.out.println("An error occurred.");
                            var12.printStackTrace();
                        }
                    }
                } catch (FileNotFoundException var13) {
                    System.out.println("An error occurred.");
                    var13.printStackTrace();
                }
            }
        });
        btnNewButton_3.setBounds(24, 371, 85, 21);
        this.contentPane.add(btnNewButton_3);
        JButton btnNewButton_4 = new JButton("Close");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                DeleteData.this.dispose();
            }
        });
        btnNewButton_4.setBounds(119, 371, 83, 21);
        this.contentPane.add(btnNewButton_4);
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon(""));
        lblNewLabel_4.setBounds(0, 0, 492, 450);
        this.contentPane.add(lblNewLabel_4);
    }
}