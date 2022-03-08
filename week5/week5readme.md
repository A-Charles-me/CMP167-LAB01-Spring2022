# Loops : It is a block that repeats itself. COUNTED or DEFINITE loop, and INDEFINITE loops
## While Loop
#### Syntax
	while(|condition|){
	
	}
#### Semantic: 
 1. Evaluate the condition
 2. If condition is true: Execute inner statements and repeat step 1
 3. If condition is false: End the loop

### Sentinel Value 
 - A value the while loop is always keeping an eye for, if the sentinel value is given then at the next iteration, the loop will end

####Example
	while(n != -1){
		//statements
		//n = get input from user
	}

### true
 - it will run forever until there is a breaking condition(using the break statement)

####Example
	while(true){
		//statements
		if(condition){ //if this condition is true the code will break.
			break;
		}
	}

### boolean flag
 - a boolean variable that is first set to true, and there is a condition inside the loop that will change the value of this flag
 
####Example
	while(flag){
		//statements
		if(|condition|){
			flag = false;
		}
	}

### Incrementing 
 - this while loop has a condition that will change as the variable inside(counter) will change every iteration
 
####Example
	while(n < 100){
		//statements
		//n++; ----> same as n = n+1 or n += 1
	}
 
## Do while loops
 - This loop repeats at least once without checking the condition
 
####Syntax
	do {
		//statements
	} while (|condition|);

#### Semantics
 1. Execute inner statements
 2. Check the while condition
 3. If condition is true go to step 1
 4. If condition is false end the loop
 
## For Loop
####Syntax:
	for(start; stop; step;){ //The 3 s
		//statements
	}
	
	//start: could be anything, usually initialization code, assignment code, a variable, etc.
	//stop: a condition; if the condition is false, it will stop
	//step: Incrementing code

####Semantics
 1. Run start code ONCE
 2. Check the stop condition
 3. If condition is true, execute inner statements then go to the step code. go to step 2.
 4. If the condition is false, end the loop
 
####Example using accumulator pattern
	int sum = 0;
	for(int i = 1; i <= 10; i++){
		sum += i; // sum = sum + i
	}
	
## For Each Loop
	String [] names = {"Maria", "", ""};
	
	for(String tempName: names){
		System.out.println(tempName);
	}
	
	
	// String [] names = {"Maria", "", ""};: an Array: assigns multiple value to that variable 
	
	
	