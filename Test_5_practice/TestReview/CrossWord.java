import java.util.*;
import java.io.*;

class CrossWord{
    
    private char[][] board;
    
    public void printWordsInRow(int row){
	ArrayList<String> possibleWords = new ArrayList<String>();
	String temp = "";
	for (int c=0;c<board[0].length;c++){
	    //boolean makingWord = false;
	    if (board[row][c] != ' '){
		//makingWord = true;
		temp += board[row][c]; //cast to String?
		//System.out.println(temp);
		if (c == board[0].length -1){
		    possibleWords.add(temp);
		    //System.out.println(temp);
		}
	    }
	    
	    else{
		//makingWord = false;
		possibleWords.add(temp);
		temp = "";
		//System.out.println("resetting temp");
	    }
	}
	for (int i =0;i<possibleWords.size();i++){
	    if (possibleWords.get(i).length()<=1){
	 	possibleWords.remove(i);
	 	i--;
	    }
	}
	//System.out.println(possibleWords);
	for (int i=0;i<possibleWords.size();i++){
	    System.out.println(possibleWords.get(i));
	}
	if (possibleWords.size() == 0){
	    System.out.println( "FALSE" ); //cannot return?
	}
    }

    //SETUP board
    public CrossWord(){
	board = new char[8][11];
	for (int i = 0;i<board.length;i++){
	    for (int c = 0;c<board[0].length;c++){
	 	board[i][c] = ' ';
	    }
	}
	ins('O',3,1);
	ins('H',3,2);
	ins('B',3,5);
	ins('T',3,7);
	ins('H',3,8);
	ins('E',3,9);
	ins('N',3,10);
    }
    public void ins(char item, int row, int col){
	board[row][col] = item;
    }

    //TOSTRING
    public String toString(){
	String ret = "";
	for (int i =0;i<board.length;i++){
	    ret += Arrays.toString(board[i]);
	    ret+= "\n";
	}
	return ret;
    }

    //MAIN
    public static void main(String[] args){
	CrossWord cw = new CrossWord();
	System.out.println(cw);
	cw.printWordsInRow(3);
    }
}
