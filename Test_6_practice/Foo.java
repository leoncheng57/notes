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


    public static String scrambleWord(String word){
	String result = "";
	for (int i=0;i<word.length()-1;i++){
	    if (word.substring(i,i+1).equals("A") && !(word.substring(i+1,i+2).equals("A"))){
		result = result + word.substring(i-1,i+2)+word.substring(i,i+1);
		i+=2;
	    }
	    else{
		result = result + word.substring(i,i+1);
	    }
	}
	result= result+word.substring(word.length()-1);
	return result;
    }


    //MAIN
    public static void main(String[] args){
	Foo f = new Foo();
	System.out.println(f.scrambleWord("AARDVARK"));
	System.out.println(f.scrambleWord("AARDVARKAA"));
	System.out.println(f.scrambleWord("AARDVARK"));

    }
}
