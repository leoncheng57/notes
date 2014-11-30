public class Driver{
    public static void main(String[] args){
	
	Collection c = new Collection();
	System.out.println(c);
	


	Interval i = new Interval(1.1,1.7);
	System.out.println(i);
	Interval j = new Interval(1.0,9.9);
	System.out.println(j);

	System.out.println(c.Overlap(i,j));
	System.out.println(c.doUnion(i,j));
	c.addInterval(i);
	System.out.println(c);
	
    }


}
