/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program.nilai;

/**
 *
 * @author Lenovo
 */
public class ProgramNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai n = new Nilai();
        n.setQuis(60);
        n.setUTS(80);
        n.setUAS(75);
        System.out.println("Quis : "+n.Quis);
        System.out.println("UTS : "+n.UTS);
        System.out.println("UAS : "+n.UAS);
        System.out.println("Nilai Akhir :"+n.getNA());
        System.out.println("Index :"+n.getIndex());
        System.out.println("Keterangan :"+n.getKetangan());
    }
    
}
