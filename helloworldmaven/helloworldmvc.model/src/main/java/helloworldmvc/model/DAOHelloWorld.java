package helloworldmvc.model;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {
	
	
	private static String FileName = "hw.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	private DAOHelloWorld(){}
	
	public static DAOHelloWorld getInstance(){
		
		if(instance == null){
			instance = new DAOHelloWorld();
		}
		return instance;
	}
//	private static void setInstance(DAOHelloWorld instance) {}

	
	private void readFile(){
		
		 helloWorldMessage = "";
		 File f = new File (FileName);
		 try {
			 FileReader fr = new FileReader (f);
			 int c = fr.read();
			 while (c != -1) {
				 System.out.print ((char) c);
				 c = fr.read();
				 //helloWorldMessage += (char) c;
			}
		 } 
		 catch (IOException e) {
			 e.printStackTrace();
	         System.out.println ("Le fichier n'a pas été trouvé");
	        }
	}
	
	public String getHelloWorldMessage(){
		readFile();
		return helloWorldMessage;
		
	}


//	private void setHelloWorldMessage(String helloWorldMessage){
//		this.helloWorldMessage = helloWorldMessage;
//	}
	
}

