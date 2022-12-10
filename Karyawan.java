public class Karyawan extends Pasien{

    int  NIP;
    String jabatan;

    public Karyawan() {

    }

    public Karyawan(int idPasien, int umur, String nama, String jk, String penyakit, String tanggal, String waktu, int NIP, String jabatan) {
        super(idPasien, umur, nama, jk, penyakit, tanggal, waktu);
        this.NIP = NIP;
        this.jabatan = jabatan;
    }

    @Override
    void pasienbaru() {
        super.pasienbaru();
        System.out.println("NIP : ");
        NIP = input.nextInt();
        System.out.println("Jabatan : ");
        jabatan = input.next();
    }

    @Override
    String chek_in() {
        super.chek_in();
        System.out.println("NIP : " + this.NIP);
        System.out.println("Jabatan : " + this.jabatan);
        return null;
    }

    @Override
    String chek_out() {
        return super.chek_out();
    }
}
