public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Advan",4,2.4f);
        perangkat.informasi();
        System.out.println();

        Laptop laptop = new Laptop("Ovation",4,2.0f,false);
        laptop.informasi();
        laptop.bukaGame("3D Pinball");
        laptop.kirimEmail("WrldJuice@rip.com");
        laptop.kirimEmail("MichaelJackson@rip.com", "WhitneyHouston@rip.com");
        System.out.println();
        
        Handphone handphone = new Handphone("Evercoss",4,1.2f,false);
        handphone.informasi();
        handphone.telfon(628123456);
        handphone.kirimSMS(628123456);
        handphone.kirimSMS(62854321, 14045);
    }
}