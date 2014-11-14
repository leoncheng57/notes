import java.util.*;

public class TokenPass{
    private int[] board;
    private int currentPlayer;
    
    public TokenPass(int playerCount){
	int[] intArray = new int[playerCount];
	Random r = new Random();
	for (int i=0;i<intArray.length;i++){
	    intArray[i]=r.nextInt(10)+1;
	}
	board = intArray;
	currentPlayer = r.nextInt(playerCount);
    }
    
    public void distributeCurrentPlayerTokens(){
	int numTokens = board[currentPlayer];
	board[currentPlayer] = 0;
	int i = currentPlayer+1;
	//int i = currentPlayer++;
	while (numTokens>0){
	    if (i==board.length){i=0;}
	    board[i]++;
	    numTokens=numTokens-1;
	    i++;       
	}
    }

    public void print(){
	for (int i=0;i<board.length;i++){
	    System.out.println("board["+i+"]="+board[i]);
	}
	System.out.println("currentPlayer="+currentPlayer);
    }
   
    public static void main(String[] args){
	TokenPass tp = new TokenPass(10);
	tp.print();
	System.out.println();
	tp.distributeCurrentPlayerTokens();
	tp.print();
   	tp.distributeCurrentPlayerTokens();
	tp.print();
   	tp.distributeCurrentPlayerTokens();
	tp.print();
   	tp.distributeCurrentPlayerTokens();
	tp.print();

    }
}
