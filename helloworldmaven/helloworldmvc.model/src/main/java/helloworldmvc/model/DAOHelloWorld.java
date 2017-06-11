package helloworldmvc.model;

public class DAOHelloWorld extends Model{
	
	
	private static String FileName = "hw.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	private DAOHelloWorld(){}
	
	public static DAOHelloWorld getInstance(){return instance;}
	private static void setInstance(DAOHelloWorld instance){}
	
	private void readFile(){}
	
	
	public String getHelloWorldMessage(){return helloWorldMessage ;}
	private void setHelloWorldMessage(String helloWorldMessage){}
	
	

}
