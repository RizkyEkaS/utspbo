package uts_A11202113889;

public class MahasiswaLulus extends Mahasiswa{
    int tahunWisuda;
    float ipk;

    //construktor
    public MahasiswaLulus(String nim, String nama, int semester, int usia, String[] krs, int tahunWisuda, float ipk) {
        super(nim, nama, semester, usia, krs);
        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;
    }

    //method
    public boolean ikutWisuda(){
        if (semester >= 8) {
            return true;
        } else {
            return false;
        }
    }
    
    public void infoMahasiswa(){
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda : " + tahunWisuda);
        System.out.println("IPK : " + ipk);
    }


}

