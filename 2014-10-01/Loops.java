/*
  Write a method that will return a string representing a box of '*'s
  ex. box(4,3) will return a \n in the string to represent a new line
*/
public class Loops {
    public String box(int r, int c) {
	String ret = "";
	while (r>0) {
	    int i = 0;//i will increment through the columns, I am not using c because I need to conserve the value of c to use for all of the rows
	    while (i<c) {
		ret=ret+"*";
		i = i+1;
	    }
	    ret = ret+"\n";
	    r = r-1;
	}
	return ret; 
    }
}

//one style: keep the original parameters, r and c, throughout the entire fxn. If you need to use r or c, make copies of them and work with the copies instead
