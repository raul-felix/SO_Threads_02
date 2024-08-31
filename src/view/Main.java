package view;

import controller.ThreadMatriz;

public class Main {
	
	public static void main(String[] args) {
		
		int[][] matriz =  new int[3][5];
		int qtdLinhas = matriz.length;
		int qtdColunas = matriz[0].length;
		int max = 99;
		int min = 10;
		
		for (int i = 0; i < qtdLinhas; i++) {
			for (int j = 0; j < qtdColunas; j++) {
				matriz[i][j] = (int) (Math.random() * (max - min + 1) + min);
			}
		}
		
		for (int i = 0; i < qtdLinhas; i++) {
			Thread threadMatriz = new ThreadMatriz(matriz[i], i);
			threadMatriz.start();
		}
	}
}
