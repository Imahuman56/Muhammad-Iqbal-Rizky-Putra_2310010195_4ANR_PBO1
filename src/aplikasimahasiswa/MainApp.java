package aplikasimahasiswa;

    import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] daftar = new Mahasiswa[2]; // Array of object

        for (int i = 0; i < daftar.length; i++) {
            try {
                System.out.println("\nMasukkan Data Mahasiswa ke-" + (i + 1));
                System.out.print("Nama    : ");
                String nama = input.nextLine();
                System.out.print("NIM     : ");
                String nim = input.nextLine();
                
                System.out.print("Jurusan : ");
                String jurusan = input.nextLine();
                System.out.print("IPK     : ");
                double ipk = Double.parseDouble(input.nextLine());

                if (i == 1) { // Inheritance dan Polymorphism
                    System.out.print("Kegiatan: ");
                    String kegiatan = input.nextLine();
                    daftar[i] = new MahasiswaAktif(nama, nim, jurusan, ipk, kegiatan);
                } else {
                    daftar[i] = new Mahasiswa(nama, nim, jurusan, ipk);
                }






            } catch (NumberFormatException e) {
                System.out.println("Terjadi kesalahan input. Ulangi data.");
                i--; // ulangi input
            }
        }

        System.out.println("\n=== Data Mahasiswa ===");
        for (Mahasiswa m : daftar) {
            m.tampilkanInfo();
            System.out.println("------------------------");
        }
    }
}