#Decision Branching 
can have a single or multiple branches
## if statement
###syntax:
	if(|condition1|){
		statement1
	}

##Condition: Any expression that can only evaluate to "true" or "false"(a boolean)
###ex/ simplist condition
	true
	false
	
##Comparison Operators
	inequality
	>   	greater than
	<		less than
	>=		greater than or equal to
	<=		less than or equal to
	equality
	==		equal to
	!=		not equal to
###examples
	m > n		false
	m < n		true
	m == n 		false
	
##Logical Operators
	&&		and
	||		or
	!		not
**do not confuse these operators with the binary operators
###examples
	((m > n) || (m < n)) - true
	  false	  OR   true   = true
	  
	((m > n) && (m < n)) - false
	 false	  AND   true   = false
	 
	!(m > n) - true
	NOT false = true
	
	
##Bitwise/Binary Operators - for mathematical operations
	&		and
	|		or
	^		exclusive or
binary numbers:
decimal	   binary
	0		   0	or	0000
	1		   1	or	0001
	2 		  10	or	0010
	3 		  11	or	0011
	4 		 100	or	0100
	5		 101	or	0101
	6  		 110	or	0110
	7 		 111	or	0111
	8		1000
	9		1001
	10		1010
	
1 ---> true   0----> false

	10 & 11 = 10 ---> 1 & 1 is 1 and 0 & 1 is 0
	10 | 11 = 11 ---> 1 | 1 is 1 and 0 | 1 is 1
	10 ^ 11 = 01
#Multi-branch(if-statement ex.)	
##else if (|condition|): precedes the if, and cannot stand by itself
##else: precedes if statement and cannot stand by itself

	if(|condition1|){
		statement1
	}
	else if(|condition2|){
		statement2
	}
	else{
		statement3
	}
**if condition 1 is false it will go to condition 2, if condition 2 is also false, it will skip to "else" and statement 3 will be executed
**If both conditions are true, whichever condition comes first will be executed, in this case statement 1 will be executed
