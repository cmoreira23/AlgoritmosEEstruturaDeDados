package algoritmos;

public class ShellSortHelper extends SortHelper{
	
	public ShellSortHelper(int quantity) {
		super(quantity);
		this.name = "ShellSort";
	}

	@Override
	protected void sortElements() {
		long tempoInicial = System.currentTimeMillis();

		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i += gap) {
				int item = array[i];
				int slot = i;
				while (slot >= gap && array[slot - gap] > item) {
					++this.comparacoes;
					++this.trocas;
					array[slot] = array[slot - gap];
					slot -= gap;
				}
				++this.comparacoes;
				array[slot] = item;
			}
		}

		long tempoFinal = System.currentTimeMillis();
		this.time = tempoFinal- tempoInicial;
	}
}
