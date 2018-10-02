/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA : Gandy Christian Situmorang
 * KELAS: PBO-6
 * NIM  : 10116228
 * Deskripsi Program: program ini berisi program yang dapat menggantikan kata
 * dengan menginput kata
 */
public class PBO610116228Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Kalimat;
        String nGanti, nJadi;
        
        System.out.println("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.println("Ganti kata : ");
        nGanti = scanner.nextLine();
        
        System.out.println("Menjadi Kata : ");
        nJadi = scanner.nextLine();
        
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("Adalah : " + ganti);
    }
    
}
