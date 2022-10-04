class quick_sort{
	public static void main(String[] arrgs){
		int[] arr=new int[]{100,99,86,75,64,53,42,31,22,1};		
		quickSort(arr,0,arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static void quickSort(int arr[],int start,int end){
		if(start-end<2){
			return;
		}
		int pivot=quickSort_partiton(arr,start,end);
		quickSort(arr,start,pivot);
		quickSort(arr,pivot+1,end);
	}
	
	public static int quickSort_partiton(int[] arr,int start,int end){
		int pivot=arr[start];
		int i=start;
		int j=end;
		while(i<j){
			while(i<j && arr[--j]>pivot);//empty loop, just to hit a j-indexed value which is less than pivot.
			if(i<j){
				arr[i]=arr[j];
			}
			while(i<j && arr[++i]<pivot);
			if(i<j){
				arr[j]=arr[i];
			}
		}
		arr[j]=pivot;
		return j;
	}
}
/*
1. It's an In-place algorithm.
2. time complexity is O(nlogn)base 2. In worst case it is O(n^2) but most cases it works better than merge sort.
3. Divide & conqure. recursive algo. 
4. Unstable algorithm.
*/