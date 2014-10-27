import java.util.*;
public class Test {
    public static void main(String[] args){
	//using RANDOM!!
	System.out.println();
	Random rnd = new Random();
	System.out.println(rnd);
	int r = rnd.nextInt(100);
	System.out.println(r);

	//using final
	final String s = "don't change me";
	//s = "try to change";

    }
}


