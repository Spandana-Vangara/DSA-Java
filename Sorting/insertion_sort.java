class insertion_sort{
	public static void main(String[] args){
		int[] arr=new int[]{100,99,86,75,64,53,42,31,22,1};		
		int temp;
		int count=0;
		for(int i=1;i<arr.length;i++){
			temp=arr[i];
			/*for(int j=i-1;j>=0;j--){
				count++;
				if(temp<arr[j]){
					arr[j+1]=arr[j];
				}
				if(temp>arr[j] || j==0){
					arr[j]=temp;
					break;
				}
			}*/ //the blocked code is my implementation. But below block is much smarter than mine.
			int j;
			for(j=i;j>0&&temp<arr[i-1];j--){
				count++;
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
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
3. it's a stable sort. 
4. it does shifting instead of swaping.
*/
