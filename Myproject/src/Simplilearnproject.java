import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Simplilearnproject {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		System.out.println("Enter the path to create a directory: ");
	      Scanner sc = new Scanner(System.in);
	      String path = sc.next();
	      System.out.println("Enter the name of the desired a directory: ");
	      path = path+sc.next();
	      //Creating a File object
	      File file = new File(path);
	      //Creating the directory
	      boolean bool = file.mkdir();
	      if(bool){
	         System.out.println("Directory created successfully");
	      }else{
	         System.out.println("Sorry couldn’t create specified directory");
	      }
	      try {
          File file1 = new File("D://Simplilearnproject//login.txt");  // this is used to create the file
            
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {                   
                if(file.exists())
                {
                    System.out.println("File already exists.");	
                    System.out.println("File path:" + file.getAbsolutePath());
                    System.out.println("File name:  " + file.getName());
                    System.out.println("File class:  " + file.getClass());
                    System.out.println("File parent:  " + file.getParent());
                    System.out.println("File space allocated:  " + file.getUsableSpace());
                    System.out.println("File length: " + file.length());
                    System.out.println("File list:   " + file.list());
                    
                }
                else
                {
                	System.out.println("File doesnot exists.");
                }
                
                
                
                File directory = new File("E:\\Simplilearnproject"); 
                
                // store all names with same name 
                // with/without extension 
                String[] flist = directory.list(); 
                int flag = 0; 
                if (flist == null) { 
                    System.out.println("Empty directory."); 
                } 
                else { 
          
                    // Linear search in the array 
                    for (int i = 0; i < flist.length; i++) { 
                        String filename = flist[i]; 
                        if (filename.equalsIgnoreCase("java.txt")) { 
                            System.out.println(filename + " found"); 
                            flag = 1; 
                        } 
                    } 
                } 
          
                if (flag == 0) { 
                    System.out.println("File Not Found"); 
                } 
              
               //--------------Delete the file code below-------------//
               boolean b = file.delete();
                if(b==true)
                {
                	System.out.println("File deleted !!");
                }
                else
                {
                	System.out.println("File not deleted");
                }
                //------------end of the above code--------------------//
            
            }}
catch (IOException e) {  
          e.printStackTrace(); 
}
	}}
