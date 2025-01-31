public class Muzaki {
    // Atribut untuk Muzaki
    private String nama;
    private String alamat;
    private double jumlahZakat;

    // Konstruktor berparameter
    public Muzaki(String nama, String alamat, double jumlahZakat) {
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahZakat = jumlahZakat;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter dan Setter untuk jumlahZakat
    public double getJumlahZakat() {
        return jumlahZakat;
    }

    public void setJumlahZakat(double jumlahZakat) {
        this.jumlahZakat = jumlahZakat;
    }

    // Metode untuk menampilkan informasi Muzaki
    public void displayInfo() {
        System.out.println("Nama Muzaki: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jumlah Zakat: " + jumlahZakat);
    }
}
