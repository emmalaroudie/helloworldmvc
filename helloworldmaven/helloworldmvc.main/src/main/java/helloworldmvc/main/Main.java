package helloworldmvc.main;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) {

	View displayMessage = new View();
	Model getHelloWorld = new Model();
	Controller Controller = new Controller(displayMessage, getHelloWorld);
		Controller.run();
	
	}

}
