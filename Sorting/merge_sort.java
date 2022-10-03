class merge_sort{
	public static void main(String[] arrgs){
		int[] arr=new int[]{100,99,86,75,64,53,42,31,22,1};		
		mergeSort(arr,0,arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void mergeSort(int[] arr, int start, int end){
		if(end-start<2){
			return;
		}
		int mid=(start+end)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid,end);
		merge(arr,start,mid,end);
	}
	
	public static void merge(int[] arr, int start, int mid, int end){
		if(arr[mid-1]<=arr[mid]){//it's an improvisation, we know merge happens b/w two sorted arrays, if last element of left array is less or equal first element of right array, there is no point in sorting. 
			return;
		}
		int i=start;
		int j=mid;
		int tempind=0;
		int[] temp=new int[end-start];
		
		while(i<mid && j<end){
			/*if(arr[i]>arr[j]){
				tempind[tempind]=arr[j]
				j++;
				tempind++;
			}else{
				tempind[tempind]=arr[i]
				i++;
				tempind++;
			}*/ // this is my block of code, but the bellow line is much smarter.
			temp[tempind++]= arr[i]<=arr[j] ? arr[i++] : arr[j++];
		}
		System.arraycopy(arr,i,arr,start+tempind,mid-i);//if no elements in left array then mid-i=0 which means 0 len is copied/ ntg is copied. If right array is empty, there is no point in copying it, cause by fault it will be at crct position.
		
		System.arraycopy(temp,0,arr,start,tempind);
		
	}
}

/*
1. Not an In-place algorithm, uses an array while merging.
2. time complexity is O(nlogn)base 2. base 2 is cause of dividing array into 2 parts.
3. Divide & conqure. recursive algo. 
4. 2 phases, 1 is splitting phase & 2nd is merging phase.
5. Stable algorithm.

Topics ***************************
public static void arraycopy(Object source_arr, int sourcePos,
                            Object dest_arr, int destPos, int len)
Parameters : 
source_arr : array to be copied from
sourcePos : starting position in source array from where to copy
dest_arr : array to be copied in
destPos : starting position in destination array, where to copy in
len : total no. of components to be copied.
*/