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
            
        System.out.print("Tuliskan alamat tempat tinggal dengan lengkap : ");
            alt = mhs.nextLine();
        
        System.out.print("Ketikkan NIM masing - masing : ");
            nim = mhs.nextInt();
        
        System.out.println("Program Studi apa : ");
            prodi = mhs.nextLine();
        
        System.out.print("Semester berapa saat ini? ");
            smt = mhs.nextInt();
        
        System.out.println("***Biodata terbaru kamu saat ini yaitu sebagai berikut*** ");
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Prodi : "+prodi);
        System.out.println("Semester : "+smt);
        System.out.println("Alamat tempat tinggal : "+alt);
    }     
}                

