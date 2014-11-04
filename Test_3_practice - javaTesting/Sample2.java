import java.util.*;

public class Sample2{
    public static void main(String[] args){
	System.out.println();
	Random r = new Random(10);
	int n = r.nextInt(100);
	System.out.println(n);

	int p = (int)(Math.random()*100);
	System.out.println(p);

	Scanner sc = new Scanner(System.in);
	String s = "";
	while (!s.equals("42")){
	    s=sc.nextLine();
	    
	}
	System.out.println( "manig of life" );
	System.out.println( (double)42 );
    }
}

