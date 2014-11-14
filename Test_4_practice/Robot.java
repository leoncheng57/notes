public class Robot{
    private int[] hall;
    private int pos;
    private boolean facingRight;
   

    private boolean forwardMoveBlocked(){
	if (facingRight==true && pos == hall.length-1){
	    return true;
	}
	if (facingRight == false && pos == 0){ 
	    return true;//got this wrong
	}
	return false;//got this wrong
    }
    
    private void move(){
	if (hall[pos]>0){
	    hall[pos]=hall[pos]-1;
	}
	else{
	    if(forwardMoveBlocked()==true & facingRight==true){
		facingRight=false;
	    }
	    else{
		if (facingRight==true) {pos=pos-1;}
		if (facingRight==false) {pos=pos+1;}
	    }
	}
    }
    
    public int clearHall(){
	int count =0;
	while (hallIsClear()==false){
	    move();
	    count = count+1;
	}
	return count;
    }
    
    private boolean hallIsClear(){
	for (int i=0;i<hall.length;i++){
	    if (hall[i] != 0) {
		return false;
	    }
	}
	return true;
    }

    public void runthis(){
	for (int i=0;i<hall.length;i++){
	    System.out.println(i+": "+hall[i]);
	}
    }


    public static void main(String[] args){
	System.out.println();	
	Robot r = new Robot();
	r.runthis();
    }
}
