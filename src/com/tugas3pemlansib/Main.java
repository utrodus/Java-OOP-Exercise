package com.tugas3pemlansib;

public class Main {

    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setJudul("Matematika Dasar");
        buku1.setTahunTerbit(2000);
        buku1.setPenulis("Sukino");
        buku1.setStok(2);

        Buku buku2 = new Buku();
        buku1.setJudul("Fisika Dasar");
        buku1.setTahunTerbit(2009);
        buku1.setPenulis("Marthem");
        buku1.setStok(2);

        Karyawan karyawan1 = new Karyawan();
        karyawan1.setNama("Herman");
        karyawan1.setNIK("123");
        karyawan1.setJenisKelamin("pria");
        karyawan1.setNPWP("345");

        Karyawan karyawan2 = new Karyawan();
        karyawan2.setNama("Angela");
        karyawan2.setNIK("234");
        karyawan2.setJenisKelamin("wanita");
        karyawan2.setNPWP("456");

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Joko");
        mahasiswa1.setNIK("673");
        mahasiswa1.setJenisKelamin("pria");
        mahasiswa1.setNIM("891");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNama("Andi");
        mahasiswa2.setNIK("112");
        mahasiswa2.setJenisKelamin("pria");
        mahasiswa2.setNIM("121");


    }
}
