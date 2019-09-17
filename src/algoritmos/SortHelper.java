package algoritmos;

public abstract class SortHelper  {

	protected int[] array;

	protected int inicio;

	protected int fim;

	protected long time;
	
	protected int trocas;
	
	protected int comparacoes;
	
	protected String name;
	
	public SortHelper(int quantity) {
		super();
	}
	
	public void setArray(int[] array) {
		this.array = array;
	}

	public void aleatory() {
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] = (int)(Math.random() * this.array.length ) + 1;
		}
	}

	public void debugArray() {
		for (int i = 0; i < this.array.length; i++) {
			System.out.println("Elemento " + i + ": " + this.array[i]);
		}
	}

	public void sort() {
		if (this.array.length > 0) {
			this.sortElements();
			System.out.println("-------------------------------------");
			System.out.println("Desempenho do algoritmo: "+ this.name );
			System.out.println("Para um array com "+ this.array.length + " elementos");
			System.out.println("Tempo de execução: " + this.time + " ms.");
			System.out.println("Quantidade de trocas: " + this.trocas);
			System.out.println("Quantidades de comparações: "+ this.comparacoes);
			System.out.println("-------------------------------------");
		}
	}

	protected abstract void sortElements(); 
}