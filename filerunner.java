package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filerunner {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\koisu\\OneDrive\\Desktop\\java\\sachin.txt");
		
		  
		//Create the file using file class.
		if (file.createNewFile())
		{
		    System.out.println("File is created!");
		} else {
		    System.out.println("File already exists.");
		}
		 
		//Write Content
		
		
		FileWriter writer = new FileWriter(file);
		writer.write("sachin scored 100 centuries.");
		writer.write("sachin is a great batsman.I admire him as my idol."
				+ "He played in his team for 24 years."
				+ "He is the greatest batsman of all time.");
		
		//another way to write using filewriter class.
		String s="I am writing a file.";
		writer.write(s);
		writer.close();
		
		//read file
		Scanner sc = new Scanner(file); 
		  
	    while (sc.hasNextLine()) {
	      System.out.println(sc.nextLine()); 
		
			}
	    sc.close();
	   
	    //delete file
	    /*
	    if(file.delete()) 
        { 
            System.out.println("File deleted successfully"); 
        } 
        else
        { 
            System.out.println("Failed to delete the file"); 
        } 
        */

}}
