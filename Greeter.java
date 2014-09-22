/*
This program will have an instance var called greeting that is a greeting that can be changed with setGreeting. Ex of a greeting: "Hello".
Then greetPerson will take the name of a person as a param and return greeting+name. Ex "Hello Tommy".

ex.Hello Tommy
ex.Sup Tommy
 */

public class Greeter {

<<<<<<< HEAD
    private String person;
    public String greetPerson(person){
	return "Hello " + person;
=======
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

    //The following takes a string and returns it with all caps
    public String makeAllCaps(String s){
	return s.toUpperCase();
>>>>>>> cded281069b0998c515eaaf72a76f8d5c58412ac
    }
    
}
