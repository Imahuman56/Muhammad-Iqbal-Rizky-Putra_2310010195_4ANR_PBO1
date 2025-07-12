# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. Class

    Kelas utama: MainApp

    Kelas lain yang digunakan (meskipun tidak ditampilkan di gambar): Mahasiswa, MahasiswaAktif

2. Object

    Objek dari kelas Mahasiswa dibuat dalam array:

    Mahasiswa[] daftar = new Mahasiswa[2];

3. Atribut

    Variabel nama, nim, jurusan, ipk, kegiatan adalah atribut dari objek mahasiswa.

4. Constructor

    Baris:

daftar[i] = new Mahasiswa(nama, nim, jurusan, ipk);

dan

    daftar[i] = new MahasiswaAktif(nama, nim, jurusan, ipk, kegiatan);

    menunjukkan penggunaan constructor untuk mengisi atribut saat objek dibuat.

5. Mutator (Setter)

    Tidak tampak langsung, tapi jika kelas Mahasiswa dan MahasiswaAktif memiliki method setNama(), setNim() dll., itu adalah mutator.

6. Accessor (Getter)

    Tidak tampak di potongan ini, tapi biasanya dipakai saat mengambil nilai atribut misalnya getNama().

7. Encapsulation

    Kemungkinan besar atribut di kelas Mahasiswa dan MahasiswaAktif bersifat private, dan diakses lewat getter/setter. Itu adalah enkapsulasi.

8. Inheritance (Pewarisan)

    MahasiswaAktif kemungkinan besar adalah turunan (subclass) dari Mahasiswa, ditunjukkan dengan:

    new MahasiswaAktif(...)

9. Polymorphism

    Objek daftar[i] bertipe Mahasiswa, tapi bisa diisi dengan instance MahasiswaAktif. Ini adalah polimorfisme.

10. Seleksi

    Penggunaan if:

    if (i == 1) {
      ...
    } else {
      ...
    }

    adalah bentuk seleksi atau percabangan.

11. Perulangan

    Perulangan for digunakan untuk mengulang input data sebanyak panjang array:

    for (int i = 0; i < daftar.length; i++) {

12. IO Sederhana

    Penggunaan System.out.print dan Scanner input merupakan bentuk input-output sederhana:

    Scanner input = new Scanner(System.in);

13. Array

    Penggunaan array dari objek:

    Mahasiswa[] daftar = new Mahasiswa[2];

14. Error Handling

    Penanganan error dengan try:

try {
  ...
} catch (Exception e) {
  ...
}

(walaupun catch tidak terlihat, bisa diasumsikan dipakai di baris setelahnya).

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Iqbal Rizky Putra
NPM: 2310010195
