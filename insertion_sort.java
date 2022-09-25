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