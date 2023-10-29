/**
 *  Transpose class for transposing a set of numbers in arrays
 *  @author  Rita Herfi
  */
public class Transpose {
	/**
	 * 
	 * @param rows
	 * @param cols
	 * creates an array to transpose as prompted by the user entered numbers
	 * This code is similar to to code from the 2D arrays lecture
	 * @returns a 2D array called arr
	 */
	public int[][] createPatterned2DArray(int rows, int cols) {
		int[][] arr = new int[rows][cols];
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = 10 + rows * (row+1) + col;
			}
		}
		return arr;
	}
	/**
	 * 
	 * @param a
	 * @return none
	 * goes through the created array and prints out each element followed by 2 space  
	 */
	public void print2DArray(int[][] a) {
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[row].length; col++) {
				System.out.format("%d  ", a[row][col]);
			}
			System.out.format("%n"); 
		}
		System.out.format("%n"); 
	}
	/** 
	 * 
	 * @param a
	 * goes through original array but per column not per row 
	 * so that it can transpose and print
	 */
	public void print2DArrayTransposed(int[][] a) {
		int i = 0; //subs for column
		for(int row = 0; row < a[i].length; row++) {
			for(int col = 0; col < a.length; col++) {
				System.out.format("%d  ", a[col][row]);
				if(i < col) {
				i++; //move columns but don't exceed array length
				}
			}
			
			System.out.format("%n"); 
		}
		System.out.format("%n"); 
	}
}
