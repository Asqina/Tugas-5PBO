public abstract class Barang {
    private int id, jumlah;
    private String nama;

    public Barang(int id, int jumlah, String nama) {
        this.id = id;
        this.jumlah = jumlah;
        this.nama = nama;
    }
    public int getId() {
        return id;
    }
    public int getJumlah() {
        return jumlah;
    }
    public String getNama() {
        return nama;
    }
    abstract void updateBarang();
}
