/*
public interface Horse {
	String getName();
	int getWeight();	
}
*/

public class Horse{
	
	public String name;
	public int weight;
	
	String getName(){
		return name;
	}
	
	int getWeight(){
		return weight;
	}
	
	public void setName (String s){
		name = s;
	}

	public void setWeight(int n){
		weight = n;
	}
	
	public Horse(String s, int n){
		setName(s);
		setWeight(n);
	}
	
	public String toString(){
		String ret = "";
		ret += "Name="+name+", Weight="+weight;
		return ret;
	}

}