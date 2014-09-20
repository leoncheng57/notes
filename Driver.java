public class Driver {
    public static void main(String[] args){
	
	Greeter object1 = new Greeter();
	System.out.println( object1.greetPerson("Tommy") );

	object1.setGreeting("Sup ");
	System.out.println("After Greeting is set..." );
	System.out.println( object1.greetPerson("Tommy") );

	System.out.println("Get the greeting..." );
   	System.out.println( object1.getGreeting() );

/*
The following takes String and make it all caps
 */

	System.out.println( "all caps..." );
	System.out.println( "Hello".toUpperCase() );
	System.out.println( object1.getGreeting().toUpperCase() );

//The following does the same as above, but using the method makeAllCaps

	System.out.println("all caps...");
	System.out.println(object1.makeAllCaps("Hello"));
	
    }
}
