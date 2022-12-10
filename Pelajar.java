public class Pelajar extends Pasien{

    int kelas;
    int NIS;

    public Pelajar(){

    }

    public Pelajar(int idPasien, int umur, String nama, String jk, String penyakit, String tanggal, String waktu, int kelas, int NIS) {
        super(idPasien, umur, nama, jk, penyakit, tanggal, waktu);
        this.kelas = kelas;
        this.NIS = NIS;
    }

    @Override
    void pasienbaru() {
        super.pasienbaru();
        System.out.println("NIS : ");
        NIS = input.nextInt();
        System.out.println("Kelas : ");
        kelas = input.nextInt();
    }

    @Override
    String chek_in() {
        super.chek_in();
        System.out.println("NIS : " + this.NIS);
        System.out.println("Kelas : " + this.kelas);
        return null;
    }

    @Override
    String chek_out() {
        return super.chek_out();
    }

}
