- Project 1(Basic and Scientific Calculator) due April 5

# Array(in java): A collection of elements of the SAME data type with a fixed size
#####3 ways of Creating an Array/Syntax

	dataType[] nameOfArray = new dataType [size];
					  or
	dataType[] nameOfArray = {element1, element2, element3}; --> variable must be declared
					  or
	dataType[] nameOfArray =  new dataType [] [element1, element2, element3, ..., elementN]
	
##Index: start  at zero, the first element of and array is in index zero

###Accessing Arrays:
	 |> when int is not defined the default is 0
	int [] numbers = new int [100]; 
	 |-> 100 0's: [0, 0, 0, 0, 0,..., 0]
	
	 100 is the size/length of the array 
	
	numbers [2] ---> print the index of the int at 2 ---> '0'
	
	String [] name = {"Maria", "Azis", "Galin", "Galena"}
	names [0]; ---> 'Maria'
	names [2]; ---> 'Galin'
	names [3]; ---> 'Galena'
	
	int [] ages = {12, 13, 25, 24, 32, 50, 47};
	ages[0] ---> 12
	ages[2] ---> 25
	
	double [] balance = new new double [] {2, 56, 12, 36, 57};
	
###Getting the length of the array
	nameOfArray.length;
	
	names.length; ---> 4
	numbers.length; ---> 100
	
###Modifying the element at a specific index:
	nameOfArray[index] = newElement;
	
	names[3] = "Celine Dion"; ---> {"Maria", "Azis", "Galin", "Celine Dion"}

###Last Index
	names.length; ---> 4--|
	lastIndex; ---> 3 ------> lastIndex = length - 1
	
	names[names.length - 1] --> names[3] --> 'Celine Dion'
	
###Print all elements of an array
####Looping
	for(int i = 0; i < names.length; i++){
		System.out.println(names[i]);
	}
	
	for(String name: names){
		System.out.println(name);
	}

#### Displaying the array
	Arrays.toString(names);
	
	
	