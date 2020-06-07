package campo_minado;

import java.util.Scanner;

public class Coordenada {
	/**
	 * Tamanho do Tabuleiro
	 */
	private Scanner sc = new Scanner(System.in);
	int linhaTam, colunaTam;

	public void dimensao() {

		do {
			System.out.print("\nN�mero Linhas: ");
			linhaTam = sc.nextInt();
			System.out.print("\nN�mero Colunas: ");
			colunaTam = sc.nextInt();
			if (linhaTam < 8 || colunaTam < 8) {
				System.out.println("\n\t  Tamanho min�mo 8x8");
			}
		} while (linhaTam < 8 || colunaTam < 8);
	}

	public int getLinhaTam() {
		return linhaTam;
	}

	public void setLinhaTam(int linhaTam) {
		this.linhaTam = linhaTam;
	}

	public int getColunaTam() {
		return colunaTam;
	}

	public void setColunaTam(int colunaTam) {
		this.colunaTam = colunaTam;
	}
}
