package com.tugas3pemlansib;

public class Mahasiswa extends Orang{
    private String NIM;
    private Buku[] bukuPinjaman;
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public void setBukuPinjaman(Buku[] bukuPinjaman) {
        this.bukuPinjaman = bukuPinjaman;
    }

}
