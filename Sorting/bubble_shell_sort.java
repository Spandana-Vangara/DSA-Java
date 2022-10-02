class bubble_shell_sort{
	public static void main(String[] args){
		int[] arr=new int[]{100,90,80,70,60,50,40,30,20,10};
		int temp;
		int count=0;
		for(int gap=arr.length;gap>0;gap=gap/2){
			for(int i=0; i<arr.length; i++){
				for (int j=0; j<arr.length-i-gap;j++){
					if(arr[j]>arr[j+gap]){
						count++;
						temp=arr[j];
						arr[j]=arr[j+gap];
						arr[j+gap]=temp;
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("no.of swaps of 10 elements(worst case): "+count);
	}
	
}
/*
1. it uses less swapping
2. But it is unstable sort algo.
*/