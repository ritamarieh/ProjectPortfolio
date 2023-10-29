/**
 *  Driver program for Transpose class
 *  @author  Rita Herfi
 */
import java.util.Scanner;

public class TestTranspose {

	public static void main(String[] args) {
		//TestTranspose ID = new TestTranspose();
		Transpose app = new Transpose();
		Scanner scnr = new Scanner(System.in);
		//System.out.print(ID.getId());
		int x = scnr.nextInt(); //Get number of rows
		int y = scnr.nextInt(); //Get number of cols
	int[][] a = app.createPatterned2DArray(x,y);
		
		app.print2DArray(a);
	    app.print2DArrayTransposed(a);
	}
	
	public String getId() {
		return "Program 2c, Rita Herfi ";
	}

}
