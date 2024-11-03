package tugastiga.programdua.mahasiswa;

public class MahasiswaServiceImpl implements MahasiswaService {
    private static MahasiswaServiceImpl instance;

    private MahasiswaServiceImpl() {}

    public static MahasiswaServiceImpl getInstance() {
        if (instance == null) {
            instance = new MahasiswaServiceImpl();
        }

        return instance;
    }

    @Override
    public String save(Mahasiswa mahasiswa) {
        if (mahasiswa == null || mahasiswa.getNama().isBlank()) {
            return "Please input student name!";
        } else {
            // save to DB (don't code)
            return "Success";
        }
    }
}