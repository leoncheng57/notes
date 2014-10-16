public class Shapes {

    public String line(String thing, int freq){
	String ret = "";
	for (freq=freq;freq>0;freq=freq-1){
	    ret = ret + thing;
	}	
	return ret; 
    }
    
    public String box(int row, int col) {
	//row = 2; //testing
	String ret = "";
	
	for (int i = 0; i<row; i=i+1){
	    for (int j = 0; j<col; j=j+1){
		ret = ret+"*";
	    }
	    ret = ret+"\n";
	}
	return ret;
    }
    
    public String foo(){
	String ret = "";
	int i = 0;
	while (i<10) {
	    ret = ret + i + "\n";
	    i = i+1;
	}
	return ret;
    }
 
    public String frame(int a, int b){
	String ans = "";
	for (int i = 0; i < a; i++) {
	    for (int x = 0; x < b; x++) {
		if ((x == 0 || x == (b - 1))||(i == 0 ||i == (a-1))) {
		    ans = ans + "*";
		} else {
		    ans = ans + " ";
		}
	    }
	    ans = ans + "\n";
	}
	return ans;
    }
    
    
}
