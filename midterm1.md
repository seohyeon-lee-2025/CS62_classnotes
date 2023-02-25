#Data Structures

| Data Structures     | Create and initialize | Add item | Delete item | Access item |
| -----------         | -----------           |----------| ----------- |-------------|
| Array               | 1) `int[] myArr = new int[capacity];` and use for loop to initialize each element -> O(n)</br>2) `String[] yourArr = {"midterms", "are", "scary"};` -> O(n) </br>I can only use curly brackets when initializing array   array.length gives capacity. this is a property, not a method like length() since array has fixed capacity. </br> need to make counter variable  to measure size | direct add: Not possible</br> add items by assigning values to indices</br> ArrayOutOfBoundsException if you put index <0 or index >length-1. </br> ex: myArr[i] = 4; </br>
add(item){
myArr[N-1] = item;
count++;}


| ----------- |-------------|
| ArrayList           | Title                 |----------- | ----------- |-------------|
| SLL                 | Title       |----------- | ----------- |-------------|
| DLL                 | Title       |----------- | ----------- |-------------|
