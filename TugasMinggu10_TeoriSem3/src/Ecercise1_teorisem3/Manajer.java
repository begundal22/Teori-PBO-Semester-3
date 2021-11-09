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
public class Manajer extends Pegawai {

    private int tunjangan;

    public Manajer(String nama, int tunjangan, int gaji) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public int getGaji() {
        return gaji;
    }

    public int getTunjangan() {
        return tunjangan;
    }

}
