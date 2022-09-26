/*
 * Created by : 21343001_ADELINA SUCIKO
 * Tugas 2 bagian a. menggunakan statement if-else
 */

package com.js6;

import javax.swing.JOptionPane;

public class Tugas2 {

	public static void main(String[] args) {
		String angka = " ";
        
        angka = JOptionPane.showInputDialog("Masukkan Angka ");
        int a = Integer.valueOf(angka).intValue();
        
        String hasil = " ";
        
        if((a>=1) && (a <= 10) ) {
        	System.out.println(hasil += "Valid number");
        }
        else {
        	System.out.println(hasil += "Invalid number");
        }
        JOptionPane.showMessageDialog(null, hasil);
	}

}
