package tugastiga.programdua;

import tugastiga.programdua.mahasiswa.Mahasiswa;
import tugastiga.programdua.mahasiswa.MahasiswaService;
import tugastiga.programdua.mahasiswa.MahasiswaServiceImpl;

public class Main {
    public static void main(String[] args) {
        MahasiswaService mhsService = MahasiswaServiceImpl.getInstance();

        try {
            var mahasiswa = new Mahasiswa("Kartika", "Teknik Informatika", 2019);
            var result = mhsService.save(mahasiswa);

            System.out.println(result);
            System.out.println(mahasiswa);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
