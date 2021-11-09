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
public class Bayaran {

    public int hitungBayaran(Pegawai pg) {
        int uang = pg.getGaji();

        if (pg instanceof Manajer) {
            uang += ((Manajer) pg).getTunjangan();
        } else if (pg instanceof Programer) {
            uang += ((Programer) pg).getBonus();
        }

        return uang;
    }
}
