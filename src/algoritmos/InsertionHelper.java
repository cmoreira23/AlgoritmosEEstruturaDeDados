package algoritmos;

public class InsertionHelper extends SortHelper{
	
	public InsertionHelper(int quantity) {
		super(quantity);
		this.name = "InsertionSort";
	}

	@Override
	protected void sortElements() {
		long tempoInicial = System.currentTimeMillis();

		int key; int i;
		for (int j = 1; j < array.length; j++) {
			key = array[j];
			this.comparacoes += j;
			for (i = j - 1; i >= 0 && array[i] > key; i--) {
	      array[i + 1] = array[i];
	      this.trocas++;
	    }
	    array[i + 1] = key;
		}

		long tempoFinal = System.currentTimeMillis();
		this.time = tempoFinal- tempoInicial;
	}
}
