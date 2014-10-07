
//hw example: https://github.com/Vtan1/apcshw/blob/master/08-frame/Frame.java
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

//hw example: https://github.com/Gredoz/APCS-Homework/blob/master/HW8-%20Frame/frame.java

public String frame(int h, int l){
	String ans = "";
	int first;
	int last;
	int mid;
	for(first=0; first<l; first++){
	    ans += "*";
	}
	ans += "\n";
	for(mid=0; mid< (h-2); mid++){
	    ans += "*";
	    int space;
	    for(space=0; space< (l-2); space++){
		ans += " ";
	    }
	    ans += "*"; 
	    ans += "\n";
	}
	for(last=0; last<l; last++){
	    ans += "*";
	}
	return ans;

