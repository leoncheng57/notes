/*
This program will have an instance var called greeting that is a greeting that can be changed with setGreeting. Ex of a greeting: "Hello".
Then greetPerson will take the name of a person as a param and return greeting+name. Ex "Hello Tommy".

ex.Hello Tommy
ex.Sup Tommy
 */

public class Greeter {

    //public String greeting = new String("Hello ");
    private String greeting;
    
    public void setGreeting(String s){
	greeting = s;
    }
    public String getGreeting(){
	return greeting;
    }

    public String greetPerson(String person){
	return greeting + person;
    }
    
}
