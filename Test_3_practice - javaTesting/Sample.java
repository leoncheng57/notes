public class Sample{
    //Attributes
    double num = 1.0;
    //Methods
    public int foo(double num){
	return (int)num;
    }
    public int foo2(double num){
	return (int)this.num;
    }

    //main
    public static void main(String[] args){
	System.out.println(4==5);
	System.out.println(4!=5);
	
	Sample s = new Sample();
	System.out.println(s.foo(42.42));
	System.out.println(s.foo2(42.42));
	int[] intArray = new int[3];
	System.out.println(intArray.length);
    }
}
