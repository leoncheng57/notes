/*
  Write a method that will return a string representing a box of '*'s
  ex. box(4,3) will return a \n in the string to represent a new line
*/
public class Loops {
    public String box(int r, int c) {
	String ret = "";
	while (r>0) {
	    int i = 0;//i will increment through the columns, I am not using c because I need to conserve the value of c to use for all of the rows
	    //this while loop below prints out one row with a number of stars
	    while (i<c) { 
		ret=ret+"*";
		i = i+1;
	    }
	    //for the next row, I have to add \n and subtract 1 from r
	    if (r>1)//this if statement removes the extra /n at end of the group of stars (not necessary for the solution) 
		ret = ret+"\n";
	    r = r-1;
	}
	return ret; 
    }
}

//one style of coding: keep the original parameters, r and c, throughout the entire fxn. If you need to use r or c, make copies of them and work with the copies instead
