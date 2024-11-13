public class Main {
    public static void main(String[] args) {
        // Membuat objek Muzaki dengan konstruktor berparameter
        Muzaki muzaki1 = new Muzaki("RONALD", "Jl. SEMERU NO 43", 250000.0);
        
        // Menampilkan informasi Muzaki
        System.out.println("Informasi Muzaki:");
        muzaki1.displayInfo();

        // Membuat objek Penerima dengan konstruktor berparameter
        Penerima penerima1 = new Penerima("Budi", "Bantuan Sembako");
        
        // Menampilkan informasi Penerima
        System.out.println("\nInformasi Penerima:");
        penerima1.displayInfo();
    }
}
