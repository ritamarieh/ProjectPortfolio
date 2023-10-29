import java.io.*;
import java.util.Scanner;

/**
 *  Program 4a
 *   Reading and writing files, using try/catch clauses, convert file type by renaming extension.
 *  CS108-1
 *  10 June 2021
 *  @author  Rita Herfi
  */
// TODO import statements

public class WriteCSV {
    public static void main(String[] args) throws FileNotFoundException {

        //  Grading program needs hardcoded filename. Oh, well. "
        String inputFilename = "coords.txt";
        String outputFilename = changeFileExtToCsv(inputFilename);  
        String fileContent = "";
        // Open files
        File f = new File (inputFilename);
        Scanner input = new Scanner (f);//TODO:  call method to open input file
        PrintWriter output = new PrintWriter (outputFilename);//TODO:  call method to open output file

        // TODO:  Read input line, replace all spaces with commas, 
                //               and write output line
        
        while (input.hasNextLine()) {
        	fileContent = input.nextLine();
        	//outputFilename = inputFilename.replace(" ", ",");
        	fileContent = fileContent.replace( " ", ",");
        	output.println(fileContent);
        }

        // TODO: close streams
        input.close();
        output.close();

    }
    /**
     * Changes file extension to ".csv"
     * @param filename
     * @return
     */
    public static String changeFileExtToCsv(String filename) {
        return filename.substring(0,filename.lastIndexOf('.')) + ".csv";
    }
    /**
     * Open input for reading
     * @param filename
     * @return
     */
    public static Scanner openInput(String filename) {
        Scanner in = null;
        try {
            File infile = new File(filename);
            in = new Scanner(infile);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println(filename + " could not be found");
            System.exit(0);
        }
        return in;
    }
    /**
     * Open output for writing
     * @param filename
     * @return
     */
    public static PrintWriter openOutput(String filename) {
        //TODO:  Write method to open a PrintWriter ;  use openInput() as a guide
    	PrintWriter out = null;
        try {
            FileWriter outfile = new FileWriter(filename);
            out = new PrintWriter(outfile);
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println(filename + " could not be found");
            System.exit(0);
        }
        return out;
    }
    
    public String getIdentificationString() {
    	return "Program 4a, Rita Herfi";
    }
}