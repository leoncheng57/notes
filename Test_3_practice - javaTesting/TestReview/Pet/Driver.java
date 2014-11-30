public class Driver{
    public static void main(String[] args){
	Cat c = new Cat("sampleCatNamesnuggles");
	System.out.println(c.getName());
	System.out.println(c.speak());
	LoudDog ld = new LoudDog("smapleLoudDogNAme");
	System.out.println(ld.getName());
	System.out.println(ld.speak());
	Kennel k = new Kennel();
        k.allSpeak();
    }
}
