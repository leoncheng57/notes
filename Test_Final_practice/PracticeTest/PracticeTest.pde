import java.util.*;
import java.io.*;

//2
int[] a = {
  0, 2, 4, 1, 3
};
for (int i =0; i<a.length; i++)
a[i]=a[(a[i]+3)%a.length];
println(Arrays.toString(a));


//3
List nums = new ArrayList<Integer>(3);
nums.add(new Integer(1));
nums.add(new Integer(2));
nums.add(0, nums.get(1));

Object x = nums.get(0);
Object y = nums.get(1);
if (x==y)
println(x + " is equal to " + y);
else
println(x + " is NOT equals ot " +y);

