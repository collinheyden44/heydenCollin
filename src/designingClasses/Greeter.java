package designingClasses;

public class Greeter {
	
	private static int idNum = 1;
	private String name;
	private int myID;

	public Greeter() {
		myID = idNum;
		idNum++;
		name = "Bob Smith";
	}

	public Greeter(String myName) {
		name = myName;
		myID = idNum;
		idNum++;
	}

	public String displayInfo() {
		return "Greeter:  name:" + name + "  IDNum:" + myID;

	}
		
}
