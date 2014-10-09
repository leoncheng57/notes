//NOTE: THIS WAS DONE FOR HW 10 CLASS FUN PART 2
//(experimenting with constructors in inheritance)
public class Driver {

    public static void main(String[] args){
	Basechar c = new Basechar(),c2;
	Warrior w = new Warrior(),w2;
	Mage m = new Mage(),m2;

	w.setName("Groo");
	m.setName("Mr. Sage");

	w.attack(m);
	m.attack(w);
	w.attack(w);

	System.out.println(w.toString());
	System.out.println(w);
    }


}
