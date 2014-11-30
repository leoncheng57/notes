public class Robot{
    private int[] hall;
    private int pos;
    private boolean facingRight;

    /*----------TEST QUESTIONS------*/
    private boolean forwardMoveBlocked(){
	if (facingRight==true && pos == hall.length-1){
	    return true;
	}
	if (facingRight == false && pos == 0){ 
	    return true;//got this wrong
	}
	return false;//got this wrong
    }
    
    // private void move(){
    // 	if (hall[pos]>0){
    // 	    hall[pos]=hall[pos]-1;
    // 	}
    // 	else{
    // 	    if(forwardMoveBlocked()==true && facingRight==true){
    // 		facingRight=false;
    // 	    }
    // 	    if (forwardMoveBlocked()==true && facingRight == false){
    // 		facingRight = true;
    // 	    }
    // 	    else{
    // 		if (facingRight==true) {pos=pos-1;}
    // 		if (facingRight==false) {pos=pos+1;}
    // 	    }
    // 	}
    // }
    
    private void move(){
	if (hall[pos]>0){
	    hall[pos]=hall[pos]-1;
	}
	else{
	    if (forwardMoveBlocked()==true){
		facingRight = !facingRight;
	    }
	    else{
		if (facingRight==true) {pos=pos+1;}
		if (facingRight==false) {pos=pos-1;}
	    }
	}
    }
    
    public int clearHall(){
	int count =0;
	while (hallIsClear()==false){
	    move();
	    System.out.println(toString()); //a line I added so that I can see what is going on
	    count = count+1;
	}
	return count;
    }

    /*-----------NONTEST QUESTIONS---------*/
    private boolean hallIsClear(){
	for (int i=0;i<hall.length;i++){
	    if (hall[i] != 0) {
		return false;
	    }
	}
	return true;
    }

    public String toString(){
	System.out.println("pos: "+pos);
	System.out.println("facingRight: "+facingRight);
	String ret = "";
	for (int i=0;i<hall.length;i++){
	    ret += hall[i]+"  ";
	}
	ret += "\n";
	return ret;
    }

    public Robot(){
	int[] newArray = {1,1,2,2};
	hall = newArray;
	pos = 1;
	facingRight = true;
    }

    /*---------------MAIN----------------*/
    public static void main(String[] args){
	System.out.println();	
	Robot r = new Robot();
	System.out.println(r);
	System.out.println("Begin Robot Desctruction");
	System.out.println(r.clearHall());
    }
}
