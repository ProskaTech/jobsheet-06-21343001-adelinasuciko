/*
 * Created by: 21343001_ADELINA SUCIKO
 * Tugas 1 bagian b. menggunakan JOptionPane
 */

package com.js6;

import javax.swing.JOptionPane;

public class Tugas1b {

	public static void main(String[] args) {
		String a =  " ", b = " ", c = " ";
	
        a = JOptionPane.showInputDialog("Nilai pertama");
        int angka1 = Integer.valueOf(a).intValue();
        b = JOptionPane.showInputDialog("Nilai kedua");
        int angka2 = Integer.valueOf(b).intValue();
        c= JOptionPane.showInputDialog("Nilai ketiga");
        int angka3 = Integer.valueOf(c).intValue();
        
		
		double rata_rata = (angka1 + angka2 + angka3)/ 3;
		
		String hasil = "";
		hasil += "Nilai pertama : " +angka1;
		hasil += "\nNilai kedua : " +angka2;
		hasil += "\nNilai ketiga : " +angka3;
		hasil += "\nNilai rata-rata adalah : " +rata_rata;
		
		if ((rata_rata <= 90)  && (rata_rata >= 60)) {
			System.out.println(hasil += "\nGood Job :-)");
		}
		else {
			System.out.println(hasil += "\nNot failed :-(");
		}
        JOptionPane.showMessageDialog(null, hasil);
	}
}
