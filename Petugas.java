public class Petugas {
    int idPetugas;
    String nama;
    String tugas;

    public Petugas(int idPetugas, String nama, String tugas) {
        this.idPetugas = idPetugas;
        this.nama = nama;
        this.tugas = tugas;
    }

    public void membuatlaporan(){
        System.out.println("Laporan hari ini : ");
        System.out.println("Tanggal : ");
        System.out.println("Jumlah pasien :");
        System.out.println();

    }
}
