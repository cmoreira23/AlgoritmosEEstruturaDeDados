package algoritmos;

public class InsertionHelper extends SortHelper{
	
	public InsertionHelper(int quantity) {
		super(quantity);
		this.name = "InsertionSort";
	}

	@Override
	protected void sortElements() {
		long tempoInicial = System.currentTimeMillis();
    
    for (int i = 1; i < array.length; i++) {
      int j = i;      
      while (j > 0 && array[j] < array[j - 1]) {
        int temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
				
				j--;

        ++this.trocas;
        ++this.comparacoes;
      }
      ++this.comparacoes;
    }

		long tempoFinal = System.currentTimeMillis();
		this.time = tempoFinal- tempoInicial;
	}
}
