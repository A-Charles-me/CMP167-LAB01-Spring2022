#String Formatting
## Fromat specifier
 - **%c** for character
 - **%f** for float and double
 - **%d** for int
 - **%b** for byte
 - **%s** for string
 
### flags: +0-
 - "+" will display + sign in front of the data
 - "-" will left justify 
 - 0 will display in front of a numerical value

### width: minimum amount of characters to display within data
 - data is bigger than the width, nothing will happen to it

###.percision point: only for floats and strings
 - for floating point values: how many decimal places after the point are going to be displayed
 - for string literals: maximum characters you want to display
 	- if the data is bigger,data is going to be truncated(shorten up) 

####Syntax:
	"%(flags)(width)(.percision)specifier"
Examples
	("The toatl is $%2.f", 3.4) - displays 2 decimal points
	----> The total is $3.40



# printf() method
	System.out.printf("The total is $%2.f", 3.4);
		output: $3.40

#format method
	String message = String.formt("The total is $%2.f", 3.4);
	System.out.println(message); - can use any int statement to print
	---> The total is $3.40
	
##String v Print Writer
 - use PrintWriter/Strub



