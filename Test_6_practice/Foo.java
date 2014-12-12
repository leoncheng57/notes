import java.util.*;
import java.io.*;

public class Foo{
    
    public Foo(){
	for (int i=0;i<5;i++){
	    System.out.println(randGen());
	}
    }

    public int randGen(){
	Random r = new Random();
	return r.nextInt(100);
	
    }


    //MAIN
    public static void main(String[] args){
	Foo f = new Foo();
	int[] a = {1,231,12321,123124531,4325325,325252352};
	Arrays.sort(a,3,6);
	System.out.println(Arrays.toString(a));
    }
}
