//this was for HOMEWORK: basically we had to experiment with inheritance

public class Driver {
    public static void main(String[] args){
	Basechar b1,b2;
	Warrior w1,w2;
	Mage m1, m2;
	b1 = new Basechar();
	w1 = new Warrior();
	m1 = new Mage();
	
	//FIRST TESTS
	m2 = m1; //works
	//m2 = b1; //error: incompatible types	
	//m2 = w1; //error: incompatible types	
	System.out.println(m2);
	
	//NEXT TESTS
	b2 = m1; //works
        b2 = m2; //works
	b2 = new Warrior(); //works
	System.out.println(b2);

	/*
	  My conclusion from this hw:
	  For inheritance instance variables, you can only go down a level
	  Cannot go up or side-to-side (subclass to subclass)
	 */
    }
}

