package elevenplus;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
public class Questions {
	
	File infile;
	FileReader fileReader;
	BufferedReader bufReader;
	String[] str;
	String[] singleQuestions;
	String[] multipleQuestions;
	int l=0;
	int temp=0;
	
	public Questions(){
		//System.out.println("sadasdas");
		try{
			infile = new File("questions.txt");
			fileReader = new FileReader(infile);
			bufReader = new BufferedReader(fileReader);
			str=new String[95];
			while(bufReader.ready()){
				str[temp]=bufReader.readLine();
				 System.out.println(str[temp]);
				 temp++;
			}
			
			bufReader.close();
			// This code must always be wrapped in a Try and Catch method
			// Otherwise Java will throw an error
			}catch(Exception e){
				
				
			}
		
			//Write a method to loop through the question file to gather the 
		    //Questions
	}
	
	public void returnQuestions(){
		
		try {
		while(bufReader.ready()){
				//quest[temps2] = 
				//str[temp]=bufReader.readLine();
				 System.out.println(str[temp]);
				 temp++;
				 //bufReader
				  
			}
			
		}catch (Exception e){
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}

	}

	
}
