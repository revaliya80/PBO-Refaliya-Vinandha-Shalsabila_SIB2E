package Jobsheet2 ;

public class User {
    public String username;
    public String email;
    public String password;
    public String nama;

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Nama: " + nama);
    }

    public User(String username, String email) {
            this.username = username;
            this.email = email;
            this.password = "polinema123";
        }
}
