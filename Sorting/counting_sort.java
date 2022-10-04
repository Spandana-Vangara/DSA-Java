class counting_sort{
	public static void main(String[] agrs){
		int[] arr=new int[]{6,2,5,8,3,10,4,5,8,4,6,3,8,11,11,9};
		int min=2;
		int max=11; //Here we assume/know the range of numbers present in array.
		int[] counter=new int[max-min+1]; //initiating a counter array for the known range of elements
		
		for(int i=0;i<arr.length;i++){
			counter[arr[i]-min]++;//counting no.of occurance of each number in the known range values.
		}
		
		int i=0;
		int j=0;
		while(i<counter.length){
			while(counter[i]>0){
				counter[i]--;
				arr[j++]=i+min;//adding values in actuall arr based on the occurance of my counter.
			}
			i++;
		}
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
/*
1. not an inplace algorithm. in makes assumption and don't use comparision.
2. O(n) is possible, cause we made an assumption of range of values/know the range of values.
3. this implementation is un-stable, but it need extra steps to make it stable.
4. Suitable only for non-negative discrete values. can't work with floats and strings.
5. Values must be with-in a specific range and of small range.
*/