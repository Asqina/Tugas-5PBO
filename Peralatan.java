public class Peralatan extends Barang{
    String kualitas;
    public Peralatan(int id, int jumlah, String nama, String kualitas) {
        super(id, jumlah, nama);
        this.kualitas = kualitas;
    }

    @Override
    void updateBarang() {
        System.out.println(this.getId() + "\t\t"+ this.getNama() + "\t\t\t"+ this.kualitas + "\t\t"+ "\t\t"+ this.getJumlah());
    }
}
