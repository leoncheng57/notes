public class Sarray{

    /*<----------------Notes------------------->*/
    /*
      lists are not the same as arrays
      lists are made form arrays
      lists are like the things we used in Python (easier to use than Arrays)
     */

    
    /*<----------------Attributes------------------->*/
    private int[] data; //should be Object[]
    private int last; //last index of the list

    /*----------constructor-------*/
    public Sarray(){
	//start array @ size 10 (arbitrary)
    }

    /*<----------------Methods------------------->*/
    add (int i); //add an item to the end
    add(int index, int i);//add at location index, shift everying else down
    get(int index);
    set(int index, int i);
    size();
    remove(int index);//must shift things over aftter removing
}
