class selection_sort{
	public static void main(String[] args){
		int[] arr=new int[]{100,99,86,75,64,53,42,31,22,1};		
		int temp;
		int count=0;
		for(int i=0;i<arr.length;i++){
			int large=0;
			for(int j=1;j<arr.length-i;j++){
				count++;
				if(arr[j]>arr[large]){
					large=j;
				}	
			}
				temp=arr[large];
				arr[large]=arr[arr.length-i-1];
				arr[arr.length-i-1]=temp;			
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("no.of loops of 10 elements(worst case): "+count);
	}
}
/*
1. In-place algorithm, which means no extra array is needed to sort. in actuall array itself by swaping we achive sorting. (though we use a single extra memory, and this memory dosent depend on no.of elements we need to sort, we can say it's in-place algo).
2. time complexity is O(n^2)(quadratic).
3.  better than bubble cause it takes less swaps.
4. it's an unstable sort. its possible to swap bigger value to its twin value just cause we didn't find it's twin as lesser one.
*/