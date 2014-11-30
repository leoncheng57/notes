import java.util.*;
import java.io.*;

class Collection {
    private ArrayList<Interval> collection;
    private int lastInterval;

    //Constructor 
    public Collection(){
	Interval a = new Interval(1.5,2.0);
	Interval b = new Interval(2.5,3.0);
	Interval c = new Interval(3.5,4.0);
	collection = new ArrayList<Interval>();
	collection.add(a);
	collection.add(b);
	collection.add(c);
    }
    public String toString(){
	return ""+collection;
    }

    public boolean Overlap(Interval a, Interval b){
	double p = a.getLow();
	double q = a.getHigh();
	double r = b.getLow();
	double s = b.getHigh();
	// if ( (p<r && q<s) ||
	//      (p<r && q>s) ||
	//      (p>r && q<s) ||
	//      (p>r && q>s) ){
	//     return true;
	// }
	// return false;
	if ( q<r || p>s ){
	    return false;
	}
	return true;
    }

    public Interval doUnion(Interval a, Interval b){
	if (Overlap( a,  b)==false){
	    return null;
	}
	else{
	    double newLow = 0;
	    double newHigh = 0;
	    if (a.getLow()<b.getLow()){newLow=a.getLow();}
	    else{newLow=b.getLow();}
	    if(a.getHigh()>b.getHigh()){newHigh=a.getHigh();}
	    else{newHigh=b.getHigh();}
	    Interval ret = new Interval(newLow, newHigh);
	    return ret;
	}
    }

    public void addInterval(Interval n){ //I didn't include reordering the list so that n is added in the right order, but that is easy
	int i=0;
	while (i<collection.size()){
	    if (Overlap(n, collection.get(i))){
		n = doUnion(n,collection.get(i));
		collection.remove(i);
	    }
	    else{
		i=i+1;
	    }
	   
	}
	collection.add(n);
    }
}
