import java.io.*;
import java.util.*;

public class WordList{
    private ArrayList<String> myList; //contains Strings made up of letters

    public int numWordsOfLength(int len){
	int count = 0;
	for (int i=0;i<myList.size();i++){
	    if (myList.get(i).length()==len){
		count = count +1;
	    }
	}
	return count;
    }
    
    public void removeWordsOfLength(int len){
	for (int i=0;i<myList.size();i=i){
	    if (myList.get(i).length()==len){
		myList.remove(i);
	    }
	    else{
		i=i+1;
	    }
	}
    }


    
    public WordList(){
	myList = new ArrayList<String>();
	myList.add("a");
	myList.add("ab");
	myList.add("abc");
	myList.add("abcd");
	myList.add("abcde");
    }
    
    public String toString(){
	return ""+myList; 
    }


    /*--------------MAIN--------------*/
    public static void main(String[] args){
	WordList wl = new WordList();
	System.out.println(wl);
	System.out.println(wl.numWordsOfLength(2));
	wl.removeWordsOfLength(2);
	System.out.println(wl);
    }
   
    
    
}

