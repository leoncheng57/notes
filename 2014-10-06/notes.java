
//hw examaple: https://github.com/Vtan1/apcshw/blob/master/08-frame/Frame.java
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
