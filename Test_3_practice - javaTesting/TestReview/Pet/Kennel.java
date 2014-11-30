public class Kennel {
    private Pet[] petList;

    public Kennel(){
	Cat c = new Cat("sampleCatNamesnuggles");
	LoudDog ld = new LoudDog("smapleLoudDogNAme");
	Dog d = new Dog("smapleDogNAme");
	Pet[] newArray = {c,d,ld};
	petList = newArray;
    }

    public void allSpeak(){
	for (int i=0;i<petList.length;i=i+1){
	   System.out.println(petList[i].getName()+" "+petList[i].speak());
	}
    }

}
