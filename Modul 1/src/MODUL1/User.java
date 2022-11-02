package MODUL1;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String Nama;
    int phoneNumber;

    public void setNama(String nama) {
        Nama = nama;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void register(){
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register terlebih dahulu!");
        System.out.println("==================================");
        System.out.println("Name            : " + Nama);
        System.out.println("Phone Number    : " + phoneNumber);
        System.out.println("Register Success!");
    }


}
