package kockice;

import java.util.Scanner;

public class Kockica {
	public static void ispisiKockicu(int[] paliBrojevi) {
		for(int i=0; i<paliBrojevi.length; i++) {
			if((i+1)%90 == 0) {
				System.out.print(paliBrojevi[i]);
				System.out.println();
			}
			else {
				System.out.print(paliBrojevi[i] + " ");
			}
		}
		System.out.println();
	}
	public static int prebrojiZbir(int trazenaSuma, int[] paliBrojevi1, int[] paliBrojevi2) {
		int br = 0;
		for(int i=0; i<paliBrojevi1.length; i++) {
			if((paliBrojevi1[i] + paliBrojevi2[i]) == trazenaSuma)
				br++;
		}
		return br;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko puta zelite da rolate kockice: ");
		int brBacanja = sc.nextInt();
		int[] kockica1 = new int[brBacanja];
		int[] kockica2 = new int[brBacanja];
		while(brBacanja>0) {
			int br1 = (int)(Math.random()*6 + 1);
			int br2 = (int)(Math.random()*6 + 1);
			kockica1[brBacanja-1] = br1;
			kockica2[brBacanja-1] = br2;
			brBacanja--;
		}
		System.out.println("Pali brojevi na 1.kockici su: ");
		ispisiKockicu(kockica1);
		System.out.println("Pali brojevi na 2.kockici su: ");
		ispisiKockicu(kockica2);
		int brZbir9 = prebrojiZbir(9, kockica1, kockica2);
		int brZbir10 = prebrojiZbir(10, kockica1, kockica2);
		System.out.println("Zbir na 2 kockice je bio 9, tacno " + brZbir9 + " puta.");
		System.out.println("Zbir na 2 kockice je bio 10, tacno " + brZbir10 + " puta.");
		System.out.println("Relativna frekvencija za zbir 9, pri tacno: " + kockica1.length + " bacanja je: " + (double)brZbir9/(double)kockica1.length);
		System.out.println("Relativna frekvencija za zbir 10, pri tacno: " + kockica2.length + " bacanja je: " + (double)brZbir10/(double)kockica2.length);
		sc.close();
	}
}