//We want to print out the numbers 0,1,2,...,9 using a while loop
public class Driver {
    public static void main(String[] args){
	int n = 0; //initialize
	while (n < 10) { //test for termination
	    System.out.println(n);
	    n = n+1; //increment
	    //n += 1; //Mr.Z advises not to use this
	    //N: x++ or ++x is kind of like x=x+1 //Mr.Z advises not to use these
	}
    }
}
