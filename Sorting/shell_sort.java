class shell_sort{
	public static void main(String[] arrgs){
		int[] arr=new int[]{100,99,86,75,64,53,42,31,22,1};		
		int temp;
		int count=0;
		for(int gap=arr.length;gap>0;gap=gap/2){//instead of gap=gap/2 u can use gap/=2
			for(int j=gap; j<arr.length;j++){
				temp=arr[j];
				int i=j;
				while(i>=gap && temp<arr[i-gap]){
					count++;
					arr[i]=arr[i-gap];
					i=i-gap;
				}
				arr[i]=temp;
			}
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
3. It's an improvisation on insertion sort. It's ntg but applying gaps b/w comparing elements of insertion sort algorithm. 
4. it's an unstable sort. cause of sorting using gaps, some duplicate values may missed out in gap and causes change in position.
*/