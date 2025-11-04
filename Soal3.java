/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal3;

/**
 *
 * @author IDEAPAD
 */
import java.util.Scanner;
public class Soal3 {

    public static void main(String[] args) {
        System.out.println("Hitung faktorial");
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan positif: ");
        int angka = masukan.nextInt();
        
        if(angka < 0){
            System.out.println("Bilangan harus positif!");
        }else{
            int faktorial = 1;
            
            for(int i = 1; i <=angka; i++){
                faktorial *=i;
            }
            System.out.println("Faktorial dari " + angka + "adalah " + 
                    faktorial);
        }
    }
}
