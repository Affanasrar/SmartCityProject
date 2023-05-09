import java.io.FileWriter;
import java.io.IOException;

class UserDetails {
    public String name;
    public String password;
    public int age;
    public String username;
    public String usertype;

    public UserDetails() {
    }

    public UserDetails(String nm, String pass, String usnm, String ustyp, int ag) {
        this.name = nm;
        this.password = pass;
        this.age = ag;
        this.username = usnm;
        this.usertype = ustyp;

        try {
            FileWriter myWriter = new FileWriter("usernames.txt", true);
            myWriter.write(this.username + " " + this.password + " " + this.usertype + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException var7) {
            System.out.println("An error occurred.");
            var7.printStackTrace();
        }

    }
}