/*
 * Created by: 21343001_ADELINA SUCIKO
 * Latihan 1
 */

package com.js6;

import java.util.Scanner;

public class PercabanganIF {

	public static void main(String[] args) {
		
		double total_pembelian, diskon = 0;
		
		try (Scanner dataMasuk = new Scanner (System.in)) {
			System.out.print("Masukan Total Pembelian : Rp. ");
			total_pembelian = dataMasuk.nextDouble();
		}
		if (total_pembelian >= 50000)
			diskon = 0.1 * total_pembelian;
		
		System.out.println("Besarnya diskon :Rp. " +diskon);
		

	}

}
