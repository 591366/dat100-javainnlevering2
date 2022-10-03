package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		// TODO
		// throw new UnsupportedOperationException("skrivUt ikke implementert");
		System.out.println("---------");
		// har to tellere, en som teller rader og en som teller kolonner
		for (int r = 0; r <= (matrise.length - 1); r++) {

			for (int k = 0; k <= (matrise[r].length - 1); k++) {

				System.out.print(" " + matrise[r][k]);

			}

			System.out.println("");
		}

		System.out.println("---------");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		// throw new UnsupportedOperationException("tilStreng ikke implementert");
		String matriseTxt = "";
		for (int r = 0; r <= (matrise.length - 1); r++) {

			for (int k = 0; k <= (matrise[r].length - 1); k++) {

				if (k == 0) {
					matriseTxt = matriseTxt + matrise[r][k] + " ";
				} else if (k == (matrise[r].length - 1)) {
					matriseTxt = matriseTxt + matrise[r][k] + " " + "\n";
				} else {
					matriseTxt = matriseTxt + matrise[r][k] + " ";
				}
			}
		}
		return matriseTxt;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		// TODO
		// throw new UnsupportedOperationException("skaler ikke implementert");
		
			int[][] matriseMulti = new int[matrise.length][matrise.length];
		

		for (int r = 0; r <= (matrise.length - 1); r++) {
			matriseMulti[r] = new int[matrise[r].length];

			for (int k = 0; k <= (matrise[r].length - 1); k++) {
				matriseMulti[r][k] = matrise[r][k] * tall;
			}
		}
		return matriseMulti;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		//throw new UnsupportedOperationException("erLik ikke implementert");
		boolean testLik = true;
		try {
		for (int r = 0; r <= (a.length - 1); r++) {
			for (int k = 0; k <= (a[r].length - 1); k++) {
				if(a[r][k] != b[r][k]) {
					testLik = false;
				}
			}
		}
		}
		catch(Exception e){
			testLik = false;
		}
		return testLik;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
