import java.sql.SQLOutput;
import java.util.Scanner;

public class Pasien {
    int idPasien, umur;
    String nama, jk, penyakit, tanggal, waktu;
    Scanner input = new Scanner(System.in);
    public Pasien(){

    }

    public Pasien(int idPasien, int umur, String nama, String jk, String penyakit, String tanggal, String waktu) {
        this.idPasien = idPasien;
        this.umur = umur;
        this.nama = nama;
        this.jk = jk;
        this.penyakit = penyakit;
        this.tanggal = tanggal;
        this.waktu = waktu;
    }

    void pasienbaru() {
        System.out.println("===================================================================");
        System.out.println("Masukan Identitas pasien : ");
        System.out.print("Nama          : ");
        nama = input.nextLine();
        System.out.print("Umur          : ");
        umur = input.nextInt();
        System.out.print("Jenis kelamin : ");
        jk = input.next();
        System.out.print("Keluhan     : ");
        penyakit = input.nextLine();
        System.out.println();
        System.out.println("");
    }
    String chek_in() {
        System.out.println("Chek-in : ");
        System.out.println("Id Pasien       : "+this.idPasien);
        System.out.println("Nama            : " + this.nama);
        System.out.println("Tanggal         : "+ this.tanggal);
        System.out.println("Waktu           : " + this.waktu);
        System.out.println("Penyakit        : " + this.penyakit);
        return null;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    String chek_out() {
        System.out.println("Chek-out : ");
        System.out.println("Id Pasien       : "+this.idPasien);
       /* System.out.println("Tanggal         : ");
        this.tanggal = setTanggal();*/
        this.setWaktu("2 jam setelah masuk");
        System.out.println("Waktu  pulang   : " +getWaktu());
        return null;
    }

}

