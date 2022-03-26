package com.tugas3pemlansib;

public class Perpustakaan {
    private String nama = "Tadika Mesra";
    private Buku[] daftarBuku;
    private Karyawan[] daftarKaryawan;
    private Mahasiswa[] daftarMahasiswa;

   public Perpustakaan(Buku[] daftarBuku, Karyawan[] daftarKaryawan, Mahasiswa[] daftarMahasiswa) {
        this.daftarBuku = daftarBuku;
        this.daftarKaryawan = daftarKaryawan;
        this.daftarMahasiswa = daftarMahasiswa;
    }

    public void displayInfo() {
        System.out.println("Selamat Datang di Perpustakaan " + this.nama);
    }
}
