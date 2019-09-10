package algoritmos;

public class SelectionSortHelper extends SortHelper{
	
	public SelectionSortHelper(int quantity) {
		super(quantity);
		this.name = "SelectionSort";
	}

	@Override
	protected void sortElements() {
		long tempoInicial = System.currentTimeMillis();

		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;
		 
			for (int i = menor + 1; i < array.length; i++) {
				 if (array[i] < array[menor]) {
						menor = i;
				 }
			}

			if (menor != fixo) {
				int t = array[fixo];
				array[fixo] = array[menor];
				array[menor] = t;
			}
		}

		long tempoFinal = System.currentTimeMillis();
		this.time = tempoFinal- tempoInicial;
	}
}
