/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecercise1_teorisem3;

/**
 *
 * @author Dio
 */
public class TestBayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manajer man = new Manajer("Agus", 800, 50);
        Programer prog = new Programer("Budi", 600, 30);
        Bayaran hr = new Bayaran();

        System.out.println("Bayaran Manajer: " + hr.hitungBayaran(man));
        System.out.println("Bayaran Programer: " + hr.hitungBayaran(prog));
    }

}
