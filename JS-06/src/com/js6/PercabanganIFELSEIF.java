/*
 * Created by: 21343001_ADELINA SUCIKO
 * Latihan 3
 */

package com.js6;

public class PercabanganIFELSEIF {

	public static void main(String[] args) {
		double grade = 92.0;
		
		if (grade >= 90) {
			System.out.println("Excellent!");
		}
		/*untuk menentukan kondisi yayng mempunyai nilai rentangan maka
		 * tentukan nilai atas dan batas bawah setelah itu digabungkan dengan logika AND (&&
		 */
		
		else if((grade < 90) && (grade >= 80)) { //80 s.d 89
			System.out.println("Good job!");
		}
		else if((grade < 80) && (grade >=60)) { //60 s.d 79
			System.out.println("Study harder!");
		}
		else {
			System.out.println("Sorry, you failed.!");
		}

	}

}
