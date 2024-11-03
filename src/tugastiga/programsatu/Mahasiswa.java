package tugastiga.programsatu;

public class Mahasiswa {
    public String nama;
    public String jurusan;
    public int angkatan;

    private Mahasiswa(String nama, String jurusan, int angkatan) {
        if (nama == null || jurusan == null) {
            throw new IllegalArgumentException("Data can't be null");
        }

        this.nama = nama;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    public static void main(String[] args) {
        try {
            Mahasiswa dataMhs = new Mahasiswa("Kartika", "Teknik Informatika", 2019);
            infoMahasiswa(dataMhs);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    static private void infoMahasiswa(Mahasiswa mahasiswa) {
        var toPrint = String.format(
                "Mahasiswa(nama: %s, jurusan: %s, angkatan: %d)",
                mahasiswa.nama,
                mahasiswa.jurusan,
                mahasiswa.angkatan);
        System.out.println(toPrint);
    }
}
