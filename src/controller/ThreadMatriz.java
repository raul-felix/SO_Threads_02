package controller;

public class ThreadMatriz extends Thread {

	int[] vetor;
	int linha;

	public ThreadMatriz(int[] vetor, int linha) {
		this.vetor = vetor;
		this.linha = linha;
	}
	
	@Override
	public void run() {
		int soma = 0;
		
		for (int i : vetor) {
			soma += i;
		}
		System.out.println(String.format("Linha %d: Resultado = %d", linha, soma));
	}
}
