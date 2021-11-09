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
public class Programer extends Pegawai {

    private int bonus;

    public Programer(int bonus) {
        this.bonus = bonus;
    }

    public Programer(String nama, int bonus, int gaji) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public int getGaji() {
        return gaji;
    }

}
