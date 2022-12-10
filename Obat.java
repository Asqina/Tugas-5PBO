public class Obat extends Barang{
        String Exp, jenis;

        public Obat(int id, int jumlah, String nama, String exp, String jenis) {
            super(id, jumlah, nama);
            this.Exp = exp;
            this.jenis = jenis;
        }

        @Override
        void updateBarang() {
            System.out.println(this.getId() + "\t\t"+ this.getNama() + "\t\t\t"+ this.jenis + "\t\t"+ this.Exp +"\t\t\t\t"+ this.getJumlah() );
        }
    }

