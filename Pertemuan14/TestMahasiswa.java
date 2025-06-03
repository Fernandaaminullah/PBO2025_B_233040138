package Pertemuan14;

// Tugas 5
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("12345", "Fernanda");
        Mahasiswa mhs2 = new Mahasiswa("67890", "Nanda");
        Mahasiswa mhs3 = new Mahasiswa("54321", "Ndaw");

        mhs1.displayInfo();
        mhs2.displayInfo();
        mhs3.displayInfo();

        System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
        System.out.println("Maksimal SKS: " + Mahasiswa.getMaxSks());
    }
}