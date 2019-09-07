package algoritmos;

public class QuickSortHelper extends SortHelper{
	
	public QuickSortHelper(int quantity, int inicio, int fim) {
		super(quantity);
		this.name = "QuickSort";
		this.inicio = inicio;
		this.fim = fim;
	}

	@Override
	protected void sortElements() {
		long tempoInicial = System.currentTimeMillis();
	
		this.quickSort(this.array, this.inicio, this.fim);
		
		long tempoFinal = System.currentTimeMillis();
		this.time = tempoFinal- tempoInicial;
	}

	private void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = this.separar(vetor, inicio, fim);
			this.quickSort(vetor, inicio, posicaoPivo - 1);
			this.quickSort(vetor, posicaoPivo + 1, fim);
		}
	}

	private int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			this.comparacoes++;
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[f])
				f--;
			else {
				this.trocas++;
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}
}
