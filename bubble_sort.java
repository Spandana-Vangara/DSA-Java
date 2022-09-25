class bubble_sort{
	public static void main(String[] args){
		int[] arr=new int[]{100,90,80,70,60,50,40,30,20,10};//in descending order to check worst case to sort ascending
		int temp;
		int count=0;
		for(int i=0; i<arr.length; i++){
			for (int j=0; j<arr.length-i-1;j++){
				count++;
				if(arr[j]>arr[j+1]){
					
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
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
Stable Vs Unstable sort:
3. Stable sorting algorithms preserve the relative order of equal elements, while unstable sorting algorithms don't
	Bubble sort is a stable sort algorithm.
Example:
First step – compute the word count:

Input:

how much wood would woodchuck chuck if woodchuck could chuck wood

Output:

how       1
much      1
wood      2
would     1
woodchuck 2
chuck     2
if        1
could     1
Second step – sort the whole list lexicographically, then by word count:

First pass, sorted lexicographically:

(chuck, 2)
(could, 1)
(how, 1)
(if, 1)
(much, 1)
(wood, 2)
(woodchuck, 2)
(would, 1)
Second pass, sorted by count using an unstable sort:

(wood, 2)
(chuck, 2)
(woodchuck, 2)
(could, 1)
(how, 1)
(if, 1)
(would, 1)
(much, 1)
As we have used an unstable sort, the second pass does not maintain the lexicographical order.

That’s where the stable sort comes into the picture. Since we already had sorted the list lexicographically, using a stable sort to by word count does not change the order of equal elements anymore. As a result words with the same word count remain sorted lexicographically.

Second pass, sorted by count using a stable sort:

(chuck, 2)
(wood, 2)
(woodchuck, 2)
(could, 1)
(how, 1)
(if, 1)
(much, 1)
(would, 1)
*/