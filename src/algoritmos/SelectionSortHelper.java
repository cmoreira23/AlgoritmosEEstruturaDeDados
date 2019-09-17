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
		 
			for (int j = first + 1; j < array.length; j++) {
				++this.comparacoes;

				if (array[j] < array[first]) first = j;
			}

			if (first != i) {
				++this.trocas;
				int temp = array[i];
				array[i] = array[first];
				array[first] = temp;
			}
		}

		long tempoFinal = System.currentTimeMillis();
		this.time = tempoFinal- tempoInicial;
	}
}
