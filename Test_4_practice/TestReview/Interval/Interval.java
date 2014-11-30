class Interval{
    private double low, high;
    public Interval(double l,double h){
	low = l; 
	high = h;
    }
    
    public void setLow(double foo){
	low = foo;
    }
    public void setHigh(double foo){
	high = foo;
    }
    public double getLow(){
	return low;
    }
    public double getHigh(){
	return high;
    }
    
    public String toString(){
	String ret = "";		      
	ret += "  ";	
	ret += "low: " + low;
	ret += "  ";
	ret += "high: " + high;
	ret += "  ";	
	return ret;
    }
    

}
