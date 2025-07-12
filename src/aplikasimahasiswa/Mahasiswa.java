package aplikasimahasiswa;


public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Mutator
    public void setNama(String nama) { this.nama = nama; }
    public void setIpk(double ipk) { this.ipk = ipk; }

    // Accessor
    public String getNama() { return nama; }
    public double getIpk() { return ipk; }

    // Method tampilan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
        if (ipk >= 3.5) {
            System.out.println("Predikat: Cumlaude");
        } else if (ipk >= 3.0) {
            System.out.println("Predikat: Baik");
        } else {
            System.out.println("Predikat: Cukup");
        }
    }
}