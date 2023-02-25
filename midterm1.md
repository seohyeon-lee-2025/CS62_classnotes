__Data Structures__

| Data Structures     | Create and initialize | Add item | Delete item | Access item |
| -----------         | -----------           |----------| ----------- |-------------|
| Array               | 1) `int[] myArr = new int[capacity];` and use for loop to initialize each element -> O(n)</br>2) `String[] yourArr = {"midterms", "are", "scary"};` -> O(n) </br>I can only use curly brackets when initializing array   array.length gives capacity. this is a property, not a method like length() since array has fixed capacity. </br> need to make counter variable  to measure size | Direct add: Not possible</br> add items by assigning values to indices</br> ArrayOutOfBoundsException if you put index <0 or index >length-1. </br> ex: myArr[i] = 4; </br> `add(item){ myArr[N-1] = item; count++;}` </br> add item to one end: see `addFrontOfArray` and `addBackOfArray` </br>| Direct delete: not possible </br> ||
| ArrayList           | Title                 |----------- | ----------- |-------------|
| SLL                 | Title       |----------- | ----------- |-------------|
| DLL                 | Title       |----------- | ----------- |-------------|

__Types of Operations on Data Structures__

insertion, deletion, replacement, traversal, check if empty, sorting

__Code Snippets__
1. Add element to index 0 of array: O(n)
```
public void addFrontOfArray (int item){
		if(!isFull()){
			//if array is not full
			//make new array 
			int[] copyArr = new int[cap];
			for(int idx = 0; idx<this.count; idx++ ){
				copyArr[idx+1] = myArr[idx]; //copy everything to right
			}
			myArr[0] = item; //set first index to desired item
			copyArr = myArr; //copyArr now points to myArr
		}
		else{
			throw new ArrayIndexOutOfBoundsException("Array filled to capacity");
		}
	}
``` 

2. Add element to specified index of array: O(n)
```

``` 
2. Add to Back of Array: O(1)
```
public void addBackOfArray (int item){
    idx = count
		if(!isFull()){
			myArr[count] = item;
		}
		else{
			throw new ArrayIndexOutOfBoundsException("Array filled to capacity");
		}
	}
