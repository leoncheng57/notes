import java.util.*;
import java.io.*;

////2
//int[] a = {
//  0, 2, 4, 1, 3
//};
//for (int i =0; i<a.length; i++)
//a[i]=a[(a[i]+3)%a.length];
//println(Arrays.toString(a));


////3
//List nums = new ArrayList<Integer>(3);
//nums.add(new Integer(1));
//nums.add(new Integer(2));
//nums.add(0, nums.get(1));
//
//Object x = nums.get(0);
//Object y = nums.get(1);
//if (x==y)
//println(x + " is equal to " + y);
//else
//println(x + " is NOT equals ot " +y);


////4
//ArrayList cities = new ArrayList();
//cities.add("Atlanta");
//cities.add("Boston");
//for (int i=1; i<cities.size (); i++) {
//  cities.add(i, "+");
//}
//println(cities);


////5 and 6
//public interface InterfaceA { void methodA(); }
//public interface InterfaceB extends InterfaceA { void methodB(); }
//public class ClassA implements InterfaceA {
//  public void methodA() { }
//  public void methodB() { }
//}
//public class ClassB extends ClassA implements InterfaceB {
//  public ClassB() { }
//  // other methods not shown
//}
//
//InterfaceA obj = new ClassA();
//InterfaceB obj1 = new ClassA();
//InterfaceA obj2 = new ClassB();
//InterfaceB obj3 = new ClassB();
//ClassA obj4 = new ClassB();

//
////8
//public interface Comparable {
//  int compareTo(Object other);
//}
//public class SomeClass implements Comparable {
//  //public int compareTo(Object other){return 1;}
//  //public int compareTo(SomeClass other){return 1;}
//  //public boolean compareTo(Object other) {return false;}
//}


////9 and 10
//int[] nums = { 
//  7, 10, 10, 15, 15, 15, 15, 10, 10, 10, 15, 10, 10
//};
//int target = 10; //manually set
//int lenCount = 0; 
//int maxLen = 0; 
//for ( int val : nums ) 
//{ 
//  if (val == target) 
//  { 
//    lenCount++;
//  } else 
//  { 
//    if (lenCount > maxLen) 
//    { 
//      maxLen = lenCount;
//      lenCount = 0;
//    }
//  }
//} 
//if (lenCount > maxLen) 
//{ 
//  maxLen = lenCount;
//} 
//println( maxLen );


//11 - NOT finsihed reviewing

public interface FuelTank() {
  /** @return an integer value that ranges from 0 (empty) to 100 (full) 
   */
  int getFuelLevel();
}

public interface FuelRobot 
{
  /** @return the index of the current location of the robot */
  int getCurrentIndex(); 
  /** Determine whether the robot is currently facing to the right 
   * @return true if the robot is facing to the right (toward tanks 
   *  with larger indexes), false if the robot is facing to the lef * (toward tanks with smaller indexes) 
   */
  boolean isFacingRight(); 
  /** Changes the current direction of the robot */
  void changeDirection(); 
  /** Moves the robot in its current direction by 
   *  the number of locations specified. 
   * @param numLocs the number of locations to move. 
   *  A value of 1 moves the robot to the next location 
   *  in the current direction. 
   * Precondition: numLocs > 0 
   */
  void moveForward(int numLocs);
}

public class FuelDepot 
{
}
/** The robot used to move the filling mechanism */
private FuelRobot filler; 
/** The list of fuel tanks */
private List<FuelTank> tanks; 
/** Determines and returns the index of the next tank to be fill * @param threshold fuel tanks with a fuel level < threshold 
 * may be filled 
 * @return index of the location of the next tank to be filled 
 * Postcondition: the state of the robot has not changed 
 */
public int nextTankToFill(int threshold) 
{ /* to be implemented in part (a) */
  int ret = filler.getCurrentIndex();
  for (int i=0; i<tanks.size (); i++) {
    if (tanks.get(i)<threshold) {
      threshold = tanks.get(i);
      ret = i;
    }
  }
  return ret;
}
/** Moves the robot to location locIndex. 
 * @param locIndex the index of the location of the tank to move * Precondition: 0 ≤ locIndex < tanks.size() 
 * Postcondition: the current location of the robot is locIndex 
 */
public void moveToLocation(int locIndex) 
{ /* to be implemented in part (b) */
} 
// There may be instance variables, constructors, 
// and methods that are not shown. 

