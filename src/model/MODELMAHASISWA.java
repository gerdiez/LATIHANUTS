/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import javax.swing.JTextField;
/**
 *
 * @author User
 */
public class MODELMAHASISWA {

    String nim, nama;

    public MODELMAHASISWA(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;

    }

    public String getNama() {
        return nama;

    }

}
