package algoritmos;

public class SelectionSortHelper extends SortHelper{
	
	public SelectionSortHelper(int quantity) {
		super(quantity);
		this.name = "SelectionSort";
	}

	@Override
	protected void sortElements() {
		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < array.length - 1; i++) {
			int first = i;
		 
			for (int i = menor + 1; i < array.length; i++) {
				 if (array[i] < array[menor]) {
					 this.trocas++;
						menor = i;
				 }
				 this.comparacoes++;
			}

			if (menor != fixo) {
				int t = array[fixo];
				array[fixo] = array[menor];
				array[menor] = t;
				this.trocas++;
			}
			this.comparacoes++;
		}

		long tempoFinal = System.currentTimeMillis();
		this.time = tempoFinal- tempoInicial;
	}
}
