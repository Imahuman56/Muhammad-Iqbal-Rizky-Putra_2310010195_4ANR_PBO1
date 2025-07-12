
package aplikasimahasiswa;



    public class MahasiswaAktif extends Mahasiswa {
    private final String kegiatan;

    public MahasiswaAktif(String nama, String nim, String jurusan, double ipk, String kegiatan) {
        super(nama, nim, jurusan, ipk);
        this.kegiatan = kegiatan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Aktivitas: " + kegiatan);
    }
}