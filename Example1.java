// Write a Java program to sort a numeric array and a string array.
package arrayassignment;
import java.util.Arrays;
public class Example1 
{
	public static void main(String[] args) 
	{
		int a[]= {1,6,4,9,5,4,3};
		String s[]= {"Abhi","Jawan","Phone","Match","Kunal"};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(s));
		Arrays.sort(a);
		Arrays.sort(s);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(s));
	}

}
