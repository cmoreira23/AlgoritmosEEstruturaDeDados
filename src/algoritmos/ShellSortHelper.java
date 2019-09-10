package algoritmos;

public class ShellSortHelper extends SortHelper{
	
	public ShellSortHelper(int quantity) {
		super(quantity);
		this.name = "ShellSort";
	}

	@Override
	protected void sortElements() {
		long tempoInicial = System.currentTimeMillis();

		int i, j, temp, size = array.length;	    
		int incremento = 1;

		while (incremento < size) {
		  incremento = 3 * incremento + 1;
		}
		 
		while (incremento > 1) {
		  incremento = incremento / 3;
				
			for (i = incremento; i < size; i++) {
				temp = array[i];
				j = i - incremento;
				while (j >= 0 && temp < array[j]) {
					array[j + incremento] = array[j];
					j -= incremento;
				}
				array[j + incremento] = temp;
			}
		}

		long tempoFinal = System.currentTimeMillis();
		this.time = tempoFinal- tempoInicial;
	}
}
