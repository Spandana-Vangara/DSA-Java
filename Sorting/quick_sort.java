class quick_sort{
	public static void main(String[] arrgs){
		int[] arr=new int[]{100,99,86,75,64,53,42,31,22,1};		
		quickSort(arr,0,arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void quickSort(int[] arr,start,end){
		int pivot=start;
		
	}
}
/*
1. It's an In-place algorithm.
2. time complexity is O(nlogn)base 2. In worst case it is O(n^2) but most cases it works better than merge sort.
3. Divide & conqure. recursive algo. 
4. Stable algorithm.
*/