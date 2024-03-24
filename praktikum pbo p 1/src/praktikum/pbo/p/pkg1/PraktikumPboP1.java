// /*
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
//  */
// package praktikum.pbo.p.pkg1;

// class Mobil {
//     //
//     //dalam pengolahan sebuah data memerlukan metode agar pemrograman tertata 
//     //atribut -> variabel = hal yg dpt dimiliki 
//     String merek;//atribut-> variabel yang 
//     String warna;
     
    
//     //method -> fungsi = hal yg dapt dilakukan oleh objek/class
//     //void fungsi yng tidak memberikan return atau kosng
//     void bergerak(){
//         System.out.println("ngeng");
//     }
// }
// public class PraktikumPboP1 {
// public class App{    
//     public static void main(String[] args) {
//         // TODO code application logic here
//         Mobil mobill = new Mobil ();
//         mobill.merek = "Pajero";
//         mobill.warna = "black";
        
//         System.out.println("Mobilku"+mobill.merek);
//         System.out.println("mobil ini berwarna :"+mobill.warna);
//         System.out.println(mobil1.merek +"berjalan dengan suara :");
//         mobil1.bergerak();
//     }        
//     }
// }
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23_181_m1_s2;
import java.util.Scanner;
        
/**
 *
 * @author Lenovo
 */
public class Main {
//mendeklrasikan class main
    
    public static void main(String[] args) {
        String nama,alt,prodi;
        int nim,smt;
        
        //menampilkan output yg memberikan pesan kpd user
        Scanner mhs = new Scanner(System.in);    //membuat objek scanner untuk membaca masukan dri user
        System.out.println("---Inputkan data diri kalian--- ");
        
        System.out.print("Masukkan nama kalian : ");
        nama = mhs.nextLine();
        
        System.out.print("Ketikkan NIM masing - masing : ");
        nim = mhs.nextInt();
        
        System.out.println("Program Studi apa : ");
        prodi = mhs.nextLine();
        
        System.out.print("Semester berapa saat ini? ");
        smt = mhs.nextInt();
        
        System.out.println("Tuliskan alamat tempat tinggal dengan lengkap : ");
        alt = mhs.nextLine();
        
        System.out.println("***Biodata terbaru kamu saat ini yaitu sebagai berikut*** ");
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Prodi : "+prodi);
        System.out.println("Se1"
                + "mester : "+smt);
        System.out.println("Alamat tempat tinggal : "+alt);
    }     
}                

