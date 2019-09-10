package algoritmos;

public class HeapSortHelper extends SortHelper{
	
	public HeapSortHelper(int quantity) {
		super(quantity);
		this.name = "HeapSort";
	}

	@Override
	protected void sortElements() {
		long tempoInicial = System.currentTimeMillis();

		for (int i =  array.length/ 2 - 1; i >= 0; i--){
			heapify(array, array.length, i);
		}

		for (int i = array.length - 1; i >= 0; i--){
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			this.heapify(array, i, 0);
		}

		long tempoFinal = System.currentTimeMillis();
		this.time = tempoFinal- tempoInicial;
	}

	private void heapify(int arr[], int arrayLength, int rootElementIndex)
	{
		int leftIndex = 2 * rootElementIndex + 1;  
		int rightIndex = 2 * rootElementIndex + 2;  
		
		int largest = rootElementIndex;
		
		if (leftIndex < arrayLength && arr[leftIndex] > arr[largest])
				largest = leftIndex;
		
		if (rightIndex < arrayLength && arr[rightIndex] > arr[largest])
				largest = rightIndex;
		
		if (largest != rootElementIndex){
				
				int swap = arr[rootElementIndex];
				arr[rootElementIndex] = arr[largest];
				arr[largest] = swap;
				
				this.heapify(arr, arrayLength, largest);
		}
	}
}
