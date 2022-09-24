/*
 * Created by: 21343001_ADELINA SUCIKO
 * Tugas 2 bagian b. Menggunakan statement switch case
 */


package com.js6;

import javax.swing.JOptionPane;

public class Tugas2b {

	public static void main(String[] args) {
		String angka = " ";
        
        angka = JOptionPane.showInputDialog("Masukkan Angka ");
        int a = Integer.valueOf(angka).intValue();
        
        String hasil = " ";
        switch(a) {
        case 1 :hasil += "Valid number";
        break;
        case 2 :hasil += "Valid number";
        break;
        case 3 :hasil += "Valid number";
        break;
        case 4 :hasil += "Valid number";
        break;
        case 5 :hasil += "Valid number";
        break;
        case 6 :hasil += "Valid number";
        break;
        case 7 :hasil += "Valid number";
        break;
        case 8 :hasil += "Valid number";
        break;
        case 9 :hasil += "Valid number";
        break;
        case 10 :hasil += "Valid number";
        break;
        default: hasil += "Invalid number";
        }
        JOptionPane.showMessageDialog(null, hasil);
	}

}
