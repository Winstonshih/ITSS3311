package ITSS3311Projects;
import java.util.*;
public class Project4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] initialArray = {1.0,3.0,4.0};
		double[] newArray = insertNewElement(initialArray, 2.0, 1);
		System.out.println(Arrays.toString(newArray));
	}
	public static double[] insertNewElement(double[] array, double newElement, int index)
	{
		double[] updatedArray=new double[array.length+1];
		for(int i=0;i<index;i++)
		{
			updatedArray[i]=array[i];
		}
		for(int i=index;i<array.length;i++)
		{
			updatedArray[i+1]=array[i];
		}
		updatedArray[index]=newElement;
		return updatedArray;
	}
}
