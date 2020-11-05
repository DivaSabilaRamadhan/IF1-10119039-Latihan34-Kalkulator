package divasabilaramadhan.kalkulator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini berisi class Kalkulator
 */
public class Kalkulator {
    public double  value1, value2;
    
    public double tambahBilangan(){
        return value1 + value2;
    }
    
    public double kurangBilangan(){
        return value1 - value2;
    }
    
    public double kaliBilangan(){
        return value1 * value2;
    }
    
    public double bagiBilangan(){
        return value1 / value2;       
    }
    
    public double sisaBilangan(){
        return value1 % value2;
    }
}
