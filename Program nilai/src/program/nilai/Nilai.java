/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.nilai;

/**
 *
 * @author Lenovo
 */
class Nilai {

    double Quis;
    double UTS;
    double UAS;
    double na;
    char index = 0;
    
    void setQuis(double i) {
        QUIS = i;
        
    }

    void setUTS(double i) {
        UTS = i;
    }

    void setUAS(double i) {
        UAS = i;
    }

    double getNA() {
        double na = QUIS*0.20+UTS*0.30+UAS*0.50;
        return na;
    }

    char getIndex() {
        
        if (na>=80 && na<=100){
            index = 'A';
        }else if(na>=68 && na<80){
            index = 'B';
        }else if(na>=56 && na<68){
            index = 'C'; 
        }else if(na>=56 && na<68){
            index = 'D';
        }else if (na>=45 && na<=56){
            index = 'E';
        }    
        {
        return index;
    }

    String getKeterangan() {
        String ket = null;
        if (index == 'A'){
            ket="Sangat Baik";
        }else if (index == 'B'){
            ket="Baik";
        }else if (index =='C'){
            ket="Cukup";
        }else if (index == 'D'){
            ket="Kurang";
        }else if (index == 'E'){
            ket="Sangat Kurang";
        }
        return ket;
        }
    
}
