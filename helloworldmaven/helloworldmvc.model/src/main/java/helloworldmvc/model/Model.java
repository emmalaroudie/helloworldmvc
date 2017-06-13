package helloworldmvc.model;
import helloworldmvc.contract.IModel;

public class Model implements IModel {
	
	public DAOHelloWorld dao = DAOHelloWorld.getInstance();

	
	public String getHelloWorld() {
		return dao.getHelloWorldMessage();
	}


}
