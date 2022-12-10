import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* System.out.println("===================================================================");
        System.out.println("||                                                               ||");
        System.out.println("||                DATA PASIEN UKS SMA NEGERI 1                   ||");
        System.out.println("||                                                               ||");
        System.out.println("===================================================================");
        System.out.println("||  Menu :                                                       ||");
        System.out.println("||  1. Masukan data pasien                                       ||");
        System.out.println("||  2. Lihat data pasien                                         ||");
        System.out.println("===================================================================");
        System.out.print("Pilih menu : ");
        int menuu = input.nextInt();

        if(menuu == 1){
            System.out.println("Pasien : ");
            System.out.println("1. Pelajar");
            System.out.println("2. Karyawan");
            System.out.print("Kategori pasien : ");
            int ktgri = input.nextInt();
            if(ktgri == 1){
                Pelajar a = new Pelajar();
                a.pasienbaru();
                a.chek_in();
                a.chek_out();
            }
            else {
                Karyawan x = new Karyawan();
                x.pasienbaru();
                x.chek_in();
                x.chek_out();
            }

        }
*/

        //Implementasi Abstract
        System.out.println("===================================================================");
        System.out.println("||                                                               ||");
        System.out.println("||                Data Alat dan Obat UKS SMA NEGERI 1            ||");
        System.out.println("||                                                               ||");
        System.out.println("===================================================================");
        System.out.println("||  Menu :                                                       ||");
        System.out.println("||  1. Data Obat                                                 ||");
        System.out.println("||  2. Data Alat                                                 ||");
        System.out.println("===================================================================");
        System.out.print("Pilih menu : ");
        int menuu = input.nextInt();
        if(menuu == 1){
            System.out.println("Data Obat : ");
            Obat konidin = new Obat(19, 12, "Konidin", "2022", "Obat batuk" );
            Obat Minyakkayuputih = new Obat(20, 12, "Kayu Putih", "2022", "Minyak" );
            Obat Betadin = new Obat(11, 11, "Betadin", "2025", "Antiseptik" );
            Obat[] obat2an = {konidin, Minyakkayuputih, Betadin};
            System.out.println("ID\t\tNama\t\t\tJenis\t\tTanggal Kadaluarsa\t\tJumlah");
            for(int i =0; i< obat2an.length;i++){
                obat2an[i].updateBarang();
            }
        }
        else{
            System.out.println("Data Alat : ");
            Peralatan selimut = new Peralatan(01,9,"Selimut", "Baik");
            Peralatan Bantal = new Peralatan(02,11,"Bantal", "Baik");
            Peralatan Tandu = new Peralatan(03,3,"Tandu", "Baik");
            Peralatan[] alat = {selimut, Bantal, Tandu};
            System.out.println("Kode\tNama\t\t\tKualitas\t\tJumlah");
            for(int i =0; i< alat.length;i++){
                alat[i].updateBarang();
            }
        }


    }

}

