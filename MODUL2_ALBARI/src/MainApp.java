public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir ta1 = new TransportasiAir(6, 10000);
        ta1.informasi();
        ta1.berlayar();
        ta1.berlabuh();
        System.out.println("");

        Sampan sampan1 = new Sampan(3, 5000, 0);
        sampan1.informasi();
        sampan1.berlayar();
        sampan1.berlabuh();
        sampan1.berlabuh(1);
        System.out.println("");
        
        Kapal kapal1 = new Kapal(10, 25000, "Nuklir");
        kapal1.informasi();
        kapal1.berlayar();
        kapal1.berlayar(20);
        kapal1.berlabuh();
    }
}
