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

    }
}
