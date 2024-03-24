/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class calculator {
    private double operan1;
    private double operan2;
    
    public void isiOperan1(double x){
        this.operan1 = x;
    }
    public void isiOperan2(double x){
        this.operan2 = x;
    }
    public double Tambah(){
        return operan1 + operan2;
    }
    public double Kurang(){
        return operan1 - operan2;
    }
    public double Kali(){
        return operan1 * operan2;
    }
    public double Bagi(){
        if(operan2 !=0){
            return operan1/operan2;
        }else {
        System.out.println("error : pembagian oleh nol");
        return Double.NaN;
                    }
        }
    public double Pangkat(){
        return Math.pow(operan1,operan2);
    }
}

