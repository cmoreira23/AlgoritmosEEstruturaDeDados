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
		int pivot = vetor[inicio];
		++this.trocas;
		do {
			while (inicio < fim && vetor[fim] >= pivot) {
				fim--;
				++this.comparacoes;
			}

			if (inicio < fim) {
				vetor[inicio] = vetor[fim];
				++this.trocas;
				while (inicio < fim && vetor[inicio] <= pivot) {
   	 		  inicio++;
					++this.comparacoes;
				}

				if (inicio < fim) {
					vetor[fim] = vetor[inicio];
					++this.trocas;
				}
			}   
		} while (inicio < fim);

		vetor[inicio] = pivot;
		++this.trocas;

		return inicio;
	}
}
