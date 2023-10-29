/**
 *  Program 8
 *  This program demonstrates writing multiple recursive methods.
 *  CS108-1
 *  24 June 2021
 *  @author  Rita Herfi
  */
import java.util.ArrayList;
public class Recursion {
	protected ArrayList <Integer> myArray;
	/** constructor
	 * takes in a 1-D array and adds all of the elements to the array list
	 * should be autoboxing the primitive int to create Integer objects in the array list
	 * @param arr
	 */
	public Recursion(int[] arr) {
		myArray = new ArrayList <Integer>();
		//populate array list using int array and for loop
		for(int i = 0; i < arr.length; i++) {
			
			myArray.add(arr[i]);
		}
	}
	/**
	 * takes in the array list and returns it in reverse order using recursion
	 * @param arr
	 * @return
	 */
	public ArrayList<Integer> reverseList(ArrayList <Integer> arr){
		if (arr.size() == 0) {
			return new ArrayList<>();
		}
		else {
			Integer temp = arr.remove(0); //stores var we are going to remove
			reverseList(arr); //calls method
			arr.add(temp); //adds first element to end of list
		}
		
		return arr;
		
	}
	/**
	 * uses the class' array list and returns it in reverse order using recursion
	 * @param arr
	 * @return
	 */
	public ArrayList<Integer> reverseList(){
		return reverseList(myArray);
	}
	/**
	 * takes in any array list of integers and returns all of the odd indexed 
	 * elements using the % operator
	 * @param arr
	 * @return
	 */
	public ArrayList<Integer> toOddList(ArrayList <Integer> arr){
		if ((arr.size() == 0) || (arr.size() == 1)) {
			return new ArrayList<>();
		}
		else {
			arr.remove(0); 
			Integer temp = arr.remove(0);
			toOddList(arr); 
			arr.add(temp);
		}
		ArrayList <Integer> odd = new ArrayList<>();
		for (int i = arr.size()-1; i > -1; --i) {
		odd.add(arr.get(i));
		
		}
		//odd.remove(odd.size()-1);
		return odd;
	}
	
	/**
	 * takes in the class' array list of integers and returns all of the odd indexed 
	 * elements using the % operator
	 * @param arr
	 * @return
	 */
	public ArrayList<Integer> toOddList(){
		return toOddList(myArray);
	}
	
	/**
	 * takes in any array list of integers and returns all of the even indexed 
	 * elements using the % operator in reverse order
	 * @param arr
	 * @return
	 */
	public ArrayList<Integer> toEvenRevList(ArrayList <Integer> arr){
		if ((arr.size() == 0) || (arr.size() == 1)) {
			return new ArrayList<>();
		}
		else {
			 
			Integer temp = arr.remove(0); //assign first num to temp
			arr.remove(0); //remove next num
			toEvenRevList(arr);  //repeated using recursion
			arr.add(temp); //append to arr list
		}
		return arr;
	}
	
	/**
	 * takes in the class' array list of integers and returns all of the even indexed 
	 * elements using the % operator in reverse order
	 * @param arr
	 * @return
	 */
	public ArrayList<Integer> toEvenRevList(){
		return toEvenRevList(myArray);
	}
	/**
	 * takes in an array list and returns the list's last integer using recursion 
	 * @param arr
	 * @return
	 */
	public int retPenultimate(ArrayList <Integer> arr){
		if (arr.size() == 1) { //if it is size 1 return remaining element
			return arr.get(0);
		}
		else {
		arr.remove(0); //remove until array is size 1
		return retPenultimate(arr);
		}
	}
	/**
	 * returns the class' array list
	 * @return
	 */
	public ArrayList<Integer> getList(){
		return myArray;
	}
}
