package algoritmos;

public abstract class SortHelper  {

	protected int[] array ;

	protected long time;
	
	protected int trocas;
	
	protected int comparacoes;
	
	protected String name;
	
	public SortHelper(int quantity) {
		super();
		this.setArray(quantity);
	}
	
	private void setArray(int quantity) {
		this.array = new int[quantity];
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] = this.array.length - i;
		
	    }
	}
	public void aleatory() {
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] = (int)(Math.random() * this.array.length ) + 1;
		}
		
	}
	public void sort() {
		this.sortElements();
		System.out.println("-------------------------------------");
		System.out.println("Desempenho do algoritmo: "+ this.name );
		System.out.println("Tempo de execução: " + this.time + " ms.");
		System.out.println("Quantidade de trocas: " + this.trocas);
		System.out.println("Quantidades de comparações: "+ this.comparacoes);
		System.out.println("-------------------------------------");
	}
	protected abstract void sortElements();
   
}