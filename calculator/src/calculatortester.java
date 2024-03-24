/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class calculatortester {
    public static void main(String[] args) {
        calculator calc = new calculator();

        // Mengisi operan 1 dan 2
        calc.isiOperan1(10);
        calc.isiOperan2(5);

        // Melakukan operasi perhitungan
        System.out.println("Hasil Penambahan: " + calc.Tambah());
        System.out.println("Hasil Pengurangan: " + calc.Kurang());
        System.out.println("Hasil Perkalian: " + calc.Kali());
        System.out.println("Hasil Pembagian: " + calc.Bagi());
        System.out.println("Hasil Pangkat: " + calc.Pangkat());
    }
}

