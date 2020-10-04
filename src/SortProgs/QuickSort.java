package SortProgs;

public class QuickSort {
	
	int quicklySortThis(int arr[], int low, int high){
		int pivot = arr[(low-high)/2];
		while(low<=high){
		
		while(arr[low]<pivot){
			high--;
		}
		while(arr[high]>pivot){
			high--;
		}
		if(low<=high){
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
		}
		}
		return low;
	}

	public static void main(String[] args) {
	
	}
}
