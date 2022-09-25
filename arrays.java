class arrays{
	public static void main(String[] arg){
		int[] n;         //declaration
		n=new int[5];    //memory allocation or initialization with 0's
		int[] z={6,7,8,9,10}; //declare & initiate.
		n[0]=1;
		for(int i=0;i<5;i++){
		System.out.println(n[i]);
		System.out.println(z[i]);
		}
	}
}

/*
1. arrays are continues block of memory.
2. every element of an array occupies same amount of space in memory.
3. array of objects stores reference to those objects, ex: array of strings, each string will be of diff len...& its array will be holding string reference but not actuall string.
4. if an array's(with each element size as 'n') address starts at i position in memory, then j element's address starts at i+j*n.
5. to retrive an elements(when u have its index) from an array, big-O is O(1).
6. to retrive an element(when we don't know index), time is O(n). cause we need to search first and get element.
7. insert/update/delete a specific element in an array (known index), time is O(1).
*/