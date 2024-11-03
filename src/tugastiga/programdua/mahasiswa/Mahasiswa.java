package tugastiga.programdua.mahasiswa;

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private int angkatan;

    public Mahasiswa(String nama, String jurusan, int angkatan) {
        if (nama == null || jurusan == null) {
            throw new IllegalArgumentException("Data can't be null");
        }

        this.nama = nama;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public String toString() {
        return String.format("Mahasiswa(nama: %s, jurusan: %s, angkatan: %d)", nama, jurusan, angkatan);
    }
}
